package net.sourceforge.pmd.lang.text;

import net.sourceforge.pmd.lang.BaseLanguageModule;
import net.sourceforge.pmd.lang.text.rule.TextRuleChainVisitor;

public class TextLanguageModule extends BaseLanguageModule {

	public static final String NAME = "TEXT";
	public static final String TERSE_NAME = "text";

	public TextLanguageModule() {
		super(NAME, null, TERSE_NAME, TextRuleChainVisitor.class, "txt","json","properties","yaml");
		addVersion("1.0", new TextHandler(), true);
	}

}