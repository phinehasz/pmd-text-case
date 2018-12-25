/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.text.rule;

import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.RuleViolation;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.rule.AbstractRuleViolationFactory;
import net.sourceforge.pmd.lang.rule.ParametricRuleViolation;
import net.sourceforge.pmd.lang.rule.RuleViolationFactory;
import net.sourceforge.pmd.lang.xml.ast.XmlNode;

public final class TextRuleViolationFactory extends AbstractRuleViolationFactory {

    public static final RuleViolationFactory INSTANCE = new TextRuleViolationFactory();

    private TextRuleViolationFactory() {
    }

    @Override
    protected RuleViolation createRuleViolation(Rule rule, RuleContext ruleContext, Node node, String message) {
    	return new ParametricRuleViolation<>(rule, ruleContext, (XmlNode) node, message);
    }
    
    protected RuleViolation createRuleViolation(Rule rule, RuleContext ruleContext, Node node, String message, int beginLine, int endLine) {
		ParametricRuleViolation<XmlNode> violation = new ParametricRuleViolation<>(rule, ruleContext, (XmlNode) node, message);
		violation.setLines(beginLine,endLine);
		return violation;
	}
}
