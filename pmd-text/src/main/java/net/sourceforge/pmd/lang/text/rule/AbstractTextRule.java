/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.text.rule;

import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.lang.Language;
import net.sourceforge.pmd.lang.LanguageRegistry;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.rule.AbstractRule;
import net.sourceforge.pmd.lang.rule.ImmutableLanguage;
import net.sourceforge.pmd.lang.text.TextLanguageModule;
import net.sourceforge.pmd.lang.text.ast.TextNode;

import java.util.List;

public class AbstractTextRule extends AbstractRule implements ImmutableLanguage {

	public AbstractTextRule() {
		super.setLanguage(LanguageRegistry.getLanguage(TextLanguageModule.NAME));
	}

	protected AbstractTextRule(Language language) {
		super.setLanguage(language);
	}

	public void apply(List<? extends Node> nodes, RuleContext ctx) {
		visitAll(nodes, ctx);
	}

	protected void visitAll(List<? extends Node> nodes, RuleContext ctx) {
		for(Object element : nodes) {
			TextNode node = (TextNode) element;
			List<String> fileStrings = node.fileStrings;
			visit(fileStrings, ctx);
		}
	}

	protected void visit(List<String> fileStrings, RuleContext ctx) {
		int i=1;
		for (String fileString : fileStrings) {
			visitLine(ctx,fileString,i++);
		}
	}

	protected void visitLine(RuleContext ctx,String line,int lineNumber) {}
}
