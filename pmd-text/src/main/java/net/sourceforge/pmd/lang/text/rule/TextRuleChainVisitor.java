/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.text.rule;

import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.rule.AbstractRuleChainVisitor;

import java.util.List;

public class TextRuleChainVisitor extends AbstractRuleChainVisitor {


	@Override
	protected void visit(Rule rule, Node node, RuleContext ctx) {

	}

	@Override
	protected void indexNodes(List<Node> nodes, RuleContext ctx) {

	}
}