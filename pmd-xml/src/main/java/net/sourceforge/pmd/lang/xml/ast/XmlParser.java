/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.xml.ast;

import net.sourceforge.pmd.lang.ast.ParseException;
import net.sourceforge.pmd.lang.ast.RootNode;
import net.sourceforge.pmd.lang.xml.XmlParserOptions;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Proxy;
import java.util.*;

public class XmlParser {
    protected final XmlParserOptions parserOptions;
    protected Map<Node, XmlNode> nodeCache = new HashMap<>();

    public XmlParser(XmlParserOptions parserOptions) {
        this.parserOptions = parserOptions;
    }

    protected Document parseDocument(Reader reader) throws ParseException {
        nodeCache.clear();
        try {
            String xmlData = IOUtils.toString(reader);
            Properties p = new Properties();
			Velocity.init(p);
			StringWriter writer = new StringWriter();
			Velocity.evaluate(new VelocityContext(),writer,"pmdLog",reader);
			xmlData = writer.toString();
			System.out.println(xmlData);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(parserOptions.isNamespaceAware());
            dbf.setValidating(parserOptions.isValidating());
            dbf.setIgnoringComments(parserOptions.isIgnoringComments());
            dbf.setIgnoringElementContentWhitespace(parserOptions.isIgnoringElementContentWhitespace());
            dbf.setExpandEntityReferences(parserOptions.isExpandEntityReferences());
            dbf.setCoalescing(parserOptions.isCoalescing());
            dbf.setXIncludeAware(parserOptions.isXincludeAware());
            dbf.setFeature("http://xml.org/sax/features/external-general-entities", false);
            dbf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            documentBuilder.setEntityResolver(parserOptions.getEntityResolver());
            Document document = documentBuilder.parse(new InputSource(new StringReader(xmlData)));
            DOMLineNumbers lineNumbers = new DOMLineNumbers(document, xmlData);
            lineNumbers.determine();
            return document;
        } catch (ParserConfigurationException e) {
            throw new ParseException(e);
        } catch (SAXException e) {
            throw new ParseException(e);
        } catch (IOException e) {
            throw new ParseException(e);
        }
    }

    public XmlNode parse(Reader reader) {
        Document document = parseDocument(reader);
        return createProxy(document);
    }

    public XmlNode createProxy(Node node) {
        XmlNode proxy = nodeCache.get(node);
        if (proxy != null) {
            return proxy;
        }

        // TODO Change Parser interface to take ClassLoader?
        LinkedHashSet<Class<?>> interfaces = new LinkedHashSet<>();
        interfaces.add(XmlNode.class);
        if (node instanceof Document) {
            interfaces.add(RootNode.class);
        }
        addAllInterfaces(interfaces, node.getClass());

        proxy = (XmlNode) Proxy.newProxyInstance(XmlParser.class.getClassLoader(),
                interfaces.toArray(new Class[interfaces.size()]), new XmlNodeInvocationHandler(this, node));
        nodeCache.put(node, proxy);
        return proxy;
    }

    public void addAllInterfaces(Set<Class<?>> interfaces, Class<?> clazz) {
        interfaces.addAll(Arrays.asList(clazz.getInterfaces()));
        if (clazz.getSuperclass() != null) {
            addAllInterfaces(interfaces, clazz.getSuperclass());
        }
    }

}
