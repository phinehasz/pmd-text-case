/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.text;

import net.sourceforge.pmd.lang.AbstractLanguageVersionHandler;
import net.sourceforge.pmd.lang.Parser;
import net.sourceforge.pmd.lang.ParserOptions;
import net.sourceforge.pmd.lang.rule.RuleViolationFactory;
import net.sourceforge.pmd.lang.text.rule.TextRuleViolationFactory;

public class TextHandler extends AbstractLanguageVersionHandler {

	public RuleViolationFactory getRuleViolationFactory() {
		return TextRuleViolationFactory.INSTANCE;
	}

	@Override
	public ParserOptions getDefaultParserOptions() {
		return new ParserOptions();
	}

	public Parser getParser(ParserOptions parserOptions) {
		return new TextParser(parserOptions);
	}

}