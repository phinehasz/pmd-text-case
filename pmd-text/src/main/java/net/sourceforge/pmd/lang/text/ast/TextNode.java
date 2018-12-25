/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.text.ast;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.ast.xpath.Attribute;
import net.sourceforge.pmd.lang.ast.xpath.AttributeNode;
import net.sourceforge.pmd.lang.dfa.DataFlowNode;
import org.jaxen.JaxenException;
import org.w3c.dom.Document;

import java.util.Iterator;
import java.util.List;

/**
 * This interface represents all Text.
 */
public class TextNode implements Node, AttributeNode {

	public List<String> fileStrings;

	public TextNode(List<String> fileStrings) {
		this.fileStrings = fileStrings;
	}

	@Override
	public void jjtOpen() {

	}

	@Override
	public void jjtClose() {

	}

	@Override
	public void jjtSetParent(Node parent) {

	}

	@Override
	public Node jjtGetParent() {
		return null;
	}

	@Override
	public void jjtAddChild(Node child, int index) {

	}

	@Override
	public void jjtSetChildIndex(int index) {

	}

	@Override
	public int jjtGetChildIndex() {
		return 0;
	}

	@Override
	public Node jjtGetChild(int index) {
		return null;
	}

	@Override
	public int jjtGetNumChildren() {
		return 0;
	}

	@Override
	public int jjtGetId() {
		return 0;
	}

	@Override
	public String getImage() {
		return null;
	}

	@Override
	public void setImage(String image) {

	}

	@Override
	public boolean hasImageEqualTo(String image) {
		return false;
	}

	@Override
	public int getBeginLine() {
		return 0;
	}

	@Override
	public int getBeginColumn() {
		return 0;
	}

	@Override
	public int getEndLine() {
		return 0;
	}

	@Override
	public int getEndColumn() {
		return 0;
	}

	@Override
	public DataFlowNode getDataFlowNode() {
		return null;
	}

	@Override
	public void setDataFlowNode(DataFlowNode dataFlowNode) {

	}

	@Override
	public boolean isFindBoundary() {
		return false;
	}

	@Override
	public Node getNthParent(int n) {
		return null;
	}

	@Override
	public <T> T getFirstParentOfType(Class<T> parentType) {
		return null;
	}

	@Override
	public <T> List<T> getParentsOfType(Class<T> parentType) {
		return null;
	}

	@Override
	public <T> List<T> findChildrenOfType(Class<T> childType) {
		return null;
	}

	@Override
	public <T> List<T> findDescendantsOfType(Class<T> targetType) {
		return null;
	}

	@Override
	public <T> void findDescendantsOfType(Class<T> targetType, List<T> results, boolean crossFindBoundaries) {

	}

	@Override
	public <T> T getFirstChildOfType(Class<T> childType) {
		return null;
	}

	@Override
	public <T> T getFirstDescendantOfType(Class<T> descendantType) {
		return null;
	}

	@Override
	public <T> boolean hasDescendantOfType(Class<T> type) {
		return false;
	}

	@Override
	public List<? extends Node> findChildNodesWithXPath(String xpathString) throws JaxenException {
		return null;
	}

	@Override
	public boolean hasDescendantMatchingXPath(String xpathString) {
		return false;
	}

	@Override
	public Document getAsDocument() {
		return null;
	}

	@Override
	public Object getUserData() {
		return null;
	}

	@Override
	public void setUserData(Object userData) {

	}

	@Override
	public Iterator<Attribute> getAttributeIterator() {
		return null;
	}
}
