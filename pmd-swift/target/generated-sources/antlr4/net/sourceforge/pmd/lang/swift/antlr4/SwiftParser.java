// Generated from net\sourceforge\pmd\lang\swift\antlr4\Swift.g4 by ANTLR 4.5.2
package net.sourceforge.pmd.lang.swift.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		BooleanLiteral=132, NilLiteral=133, OperatorHead=134, OperatorCharacter=135, 
		DotOperatorHead=136, Identifier=137, ImplicitParameterName=138, BinaryLiteral=139, 
		OctalLiteral=140, DecimalLiteral=141, HexadecimalLiteral=142, FloatingPointLiteral=143, 
		VersionLiteral=144, StringLiteral=145, EscapedCharacter=146, WS=147, BlockComment=148, 
		LineComment=149;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_statements = 2, RULE_loopStatement = 3, 
		RULE_forStatement = 4, RULE_forInit = 5, RULE_forInStatement = 6, RULE_whileStatement = 7, 
		RULE_repeatWhileStatement = 8, RULE_branchStatement = 9, RULE_ifStatement = 10, 
		RULE_elseClause = 11, RULE_guardStatement = 12, RULE_switchStatement = 13, 
		RULE_switchCases = 14, RULE_switchCase = 15, RULE_caseLabel = 16, RULE_caseItemList = 17, 
		RULE_caseItem = 18, RULE_defaultLabel = 19, RULE_labeledStatement = 20, 
		RULE_statementLabel = 21, RULE_labelName = 22, RULE_controlTransferStatement = 23, 
		RULE_breakStatement = 24, RULE_continueStatement = 25, RULE_fallthroughStatement = 26, 
		RULE_returnStatement = 27, RULE_throwStatement = 28, RULE_deferStatement = 29, 
		RULE_doStatement = 30, RULE_catchClauses = 31, RULE_catchClause = 32, 
		RULE_conditionClause = 33, RULE_conditionList = 34, RULE_condition = 35, 
		RULE_caseCondition = 36, RULE_optionalBindingCondition = 37, RULE_optionalBindingHead = 38, 
		RULE_optionalBindingContinuationList = 39, RULE_optionalBindingContinuation = 40, 
		RULE_whereClause = 41, RULE_whereExpression = 42, RULE_availabilityCondition = 43, 
		RULE_availabilityArguments = 44, RULE_availabilityArgument = 45, RULE_platformName = 46, 
		RULE_platformVersion = 47, RULE_genericParameterClause = 48, RULE_genericParameterList = 49, 
		RULE_genericParameter = 50, RULE_requirementClause = 51, RULE_requirementList = 52, 
		RULE_requirement = 53, RULE_conformanceRequirement = 54, RULE_sameTypeRequirement = 55, 
		RULE_genericArgumentClause = 56, RULE_genericArgumentList = 57, RULE_genericArgument = 58, 
		RULE_declaration = 59, RULE_declarations = 60, RULE_declarationModifiers = 61, 
		RULE_declarationModifier = 62, RULE_accessLevelModifier = 63, RULE_accessLevelModifiers = 64, 
		RULE_codeBlock = 65, RULE_importDeclaration = 66, RULE_importKind = 67, 
		RULE_importPath = 68, RULE_importPathIdentifier = 69, RULE_constantDeclaration = 70, 
		RULE_patternInitializerList = 71, RULE_patternInitializer = 72, RULE_initializer = 73, 
		RULE_variableDeclaration = 74, RULE_variableDeclarationHead = 75, RULE_variableName = 76, 
		RULE_getterSetterBlock = 77, RULE_getterClause = 78, RULE_setterClause = 79, 
		RULE_setterName = 80, RULE_getterSetterKeywordBlock = 81, RULE_getterKeywordClause = 82, 
		RULE_setterKeywordClause = 83, RULE_willSetDidSetBlock = 84, RULE_willSetClause = 85, 
		RULE_didSetClause = 86, RULE_typealiasDeclaration = 87, RULE_typealiasHead = 88, 
		RULE_typealiasName = 89, RULE_typealiasAssignment = 90, RULE_functionDeclaration = 91, 
		RULE_functionHead = 92, RULE_functionName = 93, RULE_functionSignature = 94, 
		RULE_functionResult = 95, RULE_functionBody = 96, RULE_parameterClauses = 97, 
		RULE_parameterClause = 98, RULE_parameterList = 99, RULE_parameter = 100, 
		RULE_externalParameterName = 101, RULE_localParameterName = 102, RULE_defaultArgumentClause = 103, 
		RULE_enumDeclaration = 104, RULE_enumDef = 105, RULE_unionStyleEnum = 106, 
		RULE_unionStyleEnumMembers = 107, RULE_unionStyleEnumMember = 108, RULE_unionStyleEnumCaseClause = 109, 
		RULE_unionStyleEnumCaseList = 110, RULE_unionStyleEnumCase = 111, RULE_enumName = 112, 
		RULE_enumCaseName = 113, RULE_rawValueStyleEnum = 114, RULE_rawValueStyleEnumMembers = 115, 
		RULE_rawValueStyleEnumMember = 116, RULE_rawValueStyleEnumCaseClause = 117, 
		RULE_rawValueStyleEnumCaseList = 118, RULE_rawValueStyleEnumCase = 119, 
		RULE_rawValueAssignment = 120, RULE_structDeclaration = 121, RULE_structName = 122, 
		RULE_structBody = 123, RULE_classDeclaration = 124, RULE_className = 125, 
		RULE_classBody = 126, RULE_protocolDeclaration = 127, RULE_protocolName = 128, 
		RULE_protocolBody = 129, RULE_protocolMemberDeclaration = 130, RULE_protocolMemberDeclarations = 131, 
		RULE_protocolPropertyDeclaration = 132, RULE_protocolMethodDeclaration = 133, 
		RULE_protocolInitializerDeclaration = 134, RULE_protocolSubscriptDeclaration = 135, 
		RULE_protocolAssociatedTypeDeclaration = 136, RULE_initializerDeclaration = 137, 
		RULE_initializerHead = 138, RULE_initializerBody = 139, RULE_deinitializerDeclaration = 140, 
		RULE_extensionDeclaration = 141, RULE_extensionBody = 142, RULE_subscriptDeclaration = 143, 
		RULE_subscriptHead = 144, RULE_subscriptResult = 145, RULE_operatorDeclaration = 146, 
		RULE_prefixOperatorDeclaration = 147, RULE_postfixOperatorDeclaration = 148, 
		RULE_infixOperatorDeclaration = 149, RULE_infixOperatorAttributes = 150, 
		RULE_precedenceClause = 151, RULE_precedenceLevel = 152, RULE_associativityClause = 153, 
		RULE_associativity = 154, RULE_pattern = 155, RULE_wildcardPattern = 156, 
		RULE_identifierPattern = 157, RULE_valueBindingPattern = 158, RULE_tuplePattern = 159, 
		RULE_tuplePatternElementList = 160, RULE_tuplePatternElement = 161, RULE_enumCasePattern = 162, 
		RULE_typeCastingPattern = 163, RULE_isPattern = 164, RULE_asPattern = 165, 
		RULE_expressionPattern = 166, RULE_attribute = 167, RULE_attributeName = 168, 
		RULE_attributeArgumentClause = 169, RULE_attributes = 170, RULE_balancedTokens = 171, 
		RULE_balancedToken = 172, RULE_expressionList = 173, RULE_expression = 174, 
		RULE_prefixExpression = 175, RULE_inOutExpression = 176, RULE_tryOperator = 177, 
		RULE_binaryExpression = 178, RULE_assignmentOperator = 179, RULE_conditionalOperator = 180, 
		RULE_typeCastingOperator = 181, RULE_primaryExpression = 182, RULE_literalExpression = 183, 
		RULE_arrayLiteral = 184, RULE_arrayLiteralItems = 185, RULE_arrayLiteralItem = 186, 
		RULE_dictionaryLiteral = 187, RULE_dictionaryLiteralItems = 188, RULE_dictionaryLiteralItem = 189, 
		RULE_selfExpression = 190, RULE_superclassExpression = 191, RULE_superclassMethodExpression = 192, 
		RULE_superclassSubscriptExpression = 193, RULE_superclassInitializerExpression = 194, 
		RULE_closureExpression = 195, RULE_closureSignature = 196, RULE_captureList = 197, 
		RULE_captureListItems = 198, RULE_captureListItem = 199, RULE_captureSpecifier = 200, 
		RULE_implicitMemberExpression = 201, RULE_parenthesizedExpression = 202, 
		RULE_expressionElementList = 203, RULE_expressionElement = 204, RULE_wildcardExpression = 205, 
		RULE_postfixExpression = 206, RULE_operatorHead = 207, RULE_operatorCharacter = 208, 
		RULE_operator = 209, RULE_binaryOperator = 210, RULE_prefixOperator = 211, 
		RULE_postfixOperator = 212, RULE_sType = 213, RULE_arrayType = 214, RULE_dictionaryType = 215, 
		RULE_optionalType = 216, RULE_implicitlyUnwrappedOptionalType = 217, RULE_typeAnnotation = 218, 
		RULE_typeIdentifier = 219, RULE_typeName = 220, RULE_tupleType = 221, 
		RULE_tupleTypeBody = 222, RULE_tupleTypeElementList = 223, RULE_tupleTypeElement = 224, 
		RULE_elementName = 225, RULE_protocolCompositionType = 226, RULE_protocolIdentifierList = 227, 
		RULE_protocolIdentifier = 228, RULE_metatypeType = 229, RULE_typeInheritanceClause = 230, 
		RULE_typeInheritanceList = 231, RULE_classRequirement = 232, RULE_compilerControlStatement = 233, 
		RULE_buildConfigurationStatement = 234, RULE_buildConfigurationElseIfClauses = 235, 
		RULE_buildConfigurationElseIfClause = 236, RULE_buildConfigurationElseClause = 237, 
		RULE_buildConfiguration = 238, RULE_platformTestingFunction = 239, RULE_operatingSystem = 240, 
		RULE_architecture = 241, RULE_lineControlStatement = 242, RULE_lineNumber = 243, 
		RULE_fileName = 244, RULE_identifier = 245, RULE_keyword = 246, RULE_contextSensitiveKeyword = 247, 
		RULE_identifierList = 248, RULE_booleanLiteral = 249, RULE_literal = 250, 
		RULE_numericLiteral = 251, RULE_integerLiteral = 252;
	public static final String[] ruleNames = {
		"topLevel", "statement", "statements", "loopStatement", "forStatement", 
		"forInit", "forInStatement", "whileStatement", "repeatWhileStatement", 
		"branchStatement", "ifStatement", "elseClause", "guardStatement", "switchStatement", 
		"switchCases", "switchCase", "caseLabel", "caseItemList", "caseItem", 
		"defaultLabel", "labeledStatement", "statementLabel", "labelName", "controlTransferStatement", 
		"breakStatement", "continueStatement", "fallthroughStatement", "returnStatement", 
		"throwStatement", "deferStatement", "doStatement", "catchClauses", "catchClause", 
		"conditionClause", "conditionList", "condition", "caseCondition", "optionalBindingCondition", 
		"optionalBindingHead", "optionalBindingContinuationList", "optionalBindingContinuation", 
		"whereClause", "whereExpression", "availabilityCondition", "availabilityArguments", 
		"availabilityArgument", "platformName", "platformVersion", "genericParameterClause", 
		"genericParameterList", "genericParameter", "requirementClause", "requirementList", 
		"requirement", "conformanceRequirement", "sameTypeRequirement", "genericArgumentClause", 
		"genericArgumentList", "genericArgument", "declaration", "declarations", 
		"declarationModifiers", "declarationModifier", "accessLevelModifier", 
		"accessLevelModifiers", "codeBlock", "importDeclaration", "importKind", 
		"importPath", "importPathIdentifier", "constantDeclaration", "patternInitializerList", 
		"patternInitializer", "initializer", "variableDeclaration", "variableDeclarationHead", 
		"variableName", "getterSetterBlock", "getterClause", "setterClause", "setterName", 
		"getterSetterKeywordBlock", "getterKeywordClause", "setterKeywordClause", 
		"willSetDidSetBlock", "willSetClause", "didSetClause", "typealiasDeclaration", 
		"typealiasHead", "typealiasName", "typealiasAssignment", "functionDeclaration", 
		"functionHead", "functionName", "functionSignature", "functionResult", 
		"functionBody", "parameterClauses", "parameterClause", "parameterList", 
		"parameter", "externalParameterName", "localParameterName", "defaultArgumentClause", 
		"enumDeclaration", "enumDef", "unionStyleEnum", "unionStyleEnumMembers", 
		"unionStyleEnumMember", "unionStyleEnumCaseClause", "unionStyleEnumCaseList", 
		"unionStyleEnumCase", "enumName", "enumCaseName", "rawValueStyleEnum", 
		"rawValueStyleEnumMembers", "rawValueStyleEnumMember", "rawValueStyleEnumCaseClause", 
		"rawValueStyleEnumCaseList", "rawValueStyleEnumCase", "rawValueAssignment", 
		"structDeclaration", "structName", "structBody", "classDeclaration", "className", 
		"classBody", "protocolDeclaration", "protocolName", "protocolBody", "protocolMemberDeclaration", 
		"protocolMemberDeclarations", "protocolPropertyDeclaration", "protocolMethodDeclaration", 
		"protocolInitializerDeclaration", "protocolSubscriptDeclaration", "protocolAssociatedTypeDeclaration", 
		"initializerDeclaration", "initializerHead", "initializerBody", "deinitializerDeclaration", 
		"extensionDeclaration", "extensionBody", "subscriptDeclaration", "subscriptHead", 
		"subscriptResult", "operatorDeclaration", "prefixOperatorDeclaration", 
		"postfixOperatorDeclaration", "infixOperatorDeclaration", "infixOperatorAttributes", 
		"precedenceClause", "precedenceLevel", "associativityClause", "associativity", 
		"pattern", "wildcardPattern", "identifierPattern", "valueBindingPattern", 
		"tuplePattern", "tuplePatternElementList", "tuplePatternElement", "enumCasePattern", 
		"typeCastingPattern", "isPattern", "asPattern", "expressionPattern", "attribute", 
		"attributeName", "attributeArgumentClause", "attributes", "balancedTokens", 
		"balancedToken", "expressionList", "expression", "prefixExpression", "inOutExpression", 
		"tryOperator", "binaryExpression", "assignmentOperator", "conditionalOperator", 
		"typeCastingOperator", "primaryExpression", "literalExpression", "arrayLiteral", 
		"arrayLiteralItems", "arrayLiteralItem", "dictionaryLiteral", "dictionaryLiteralItems", 
		"dictionaryLiteralItem", "selfExpression", "superclassExpression", "superclassMethodExpression", 
		"superclassSubscriptExpression", "superclassInitializerExpression", "closureExpression", 
		"closureSignature", "captureList", "captureListItems", "captureListItem", 
		"captureSpecifier", "implicitMemberExpression", "parenthesizedExpression", 
		"expressionElementList", "expressionElement", "wildcardExpression", "postfixExpression", 
		"operatorHead", "operatorCharacter", "operator", "binaryOperator", "prefixOperator", 
		"postfixOperator", "sType", "arrayType", "dictionaryType", "optionalType", 
		"implicitlyUnwrappedOptionalType", "typeAnnotation", "typeIdentifier", 
		"typeName", "tupleType", "tupleTypeBody", "tupleTypeElementList", "tupleTypeElement", 
		"elementName", "protocolCompositionType", "protocolIdentifierList", "protocolIdentifier", 
		"metatypeType", "typeInheritanceClause", "typeInheritanceList", "classRequirement", 
		"compilerControlStatement", "buildConfigurationStatement", "buildConfigurationElseIfClauses", 
		"buildConfigurationElseIfClause", "buildConfigurationElseClause", "buildConfiguration", 
		"platformTestingFunction", "operatingSystem", "architecture", "lineControlStatement", 
		"lineNumber", "fileName", "identifier", "keyword", "contextSensitiveKeyword", 
		"identifierList", "booleanLiteral", "literal", "numericLiteral", "integerLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'for'", "'('", "')'", "'case'", "'in'", "'while'", 
		"'repeat'", "'if'", "'else'", "'guard'", "'switch'", "'{'", "'}'", "','", 
		"'default'", "'break'", "'continue'", "'fallthrough'", "'return'", "'throw'", 
		"'defer'", "'do'", "'catch'", "'let'", "'var'", "'where'", "'#available'", 
		"'*'", "'iOS'", "'iOSApplicationExtension'", "'OSX'", "'OSXApplicationExtension'", 
		"'watchOS'", "'watchOSApplicationExtension'", "'tvOS'", "'tvOSApplicationExtension'", 
		"'<'", "'>'", "'=='", "'class'", "'convenience'", "'dynamic'", "'final'", 
		"'infix'", "'lazy'", "'mutating'", "'nonmutating'", "'optional'", "'override'", 
		"'postfix'", "'prefix'", "'required'", "'static'", "'unowned'", "'safe'", 
		"'unsafe'", "'weak'", "'internal'", "'set'", "'private'", "'public'", 
		"'import'", "'typealias'", "'struct'", "'enum'", "'protocol'", "'func'", 
		"'.'", "'='", "'get'", "'willSet'", "'didSet'", "'throws'", "'rethrows'", 
		"'->'", "'...'", "'inout'", "'#'", "'_'", "'indirect'", "'init'", "'?'", 
		"'!'", "'deinit'", "'extension'", "'subscript'", "'operator'", "'precedence'", 
		"'associativity'", "'left'", "'right'", "'none'", "'is'", "'as'", "'@'", 
		"'['", "']'", "'-'", "'''", "'/'", "'\"'", "'&'", "'try'", "'__FILE__'", 
		"'__LINE__'", "'__COLUMN__'", "'__FUNCTION__'", "'self'", "'super'", "'unowned(safe)'", 
		"'unowned(unsafe)'", "'dynamicType'", "'&&'", "'||'", "'Type'", "'Protocol'", 
		"'Self'", "'#if'", "'#endif'", "'#elseif'", "'#else'", "'os'", "'arch'", 
		"'i386'", "'x86_64'", "'arm'", "'arm64'", "'#line'", "'OSXApplicationExtension-'", 
		null, "'nil'", null, null, "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BooleanLiteral", "NilLiteral", "OperatorHead", "OperatorCharacter", "DotOperatorHead", 
		"Identifier", "ImplicitParameterName", "BinaryLiteral", "OctalLiteral", 
		"DecimalLiteral", "HexadecimalLiteral", "FloatingPointLiteral", "VersionLiteral", 
		"StringLiteral", "EscapedCharacter", "WS", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Swift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopLevelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SwiftParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTopLevel(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topLevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(506);
					statement();
					}
					break;
				case 2:
					{
					setState(507);
					expression();
					}
					break;
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public BranchStatementContext branchStatement() {
			return getRuleContext(BranchStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public ControlTransferStatementContext controlTransferStatement() {
			return getRuleContext(ControlTransferStatementContext.class,0);
		}
		public DeferStatementContext deferStatement() {
			return getRuleContext(DeferStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				declaration();
				setState(517);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(516);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				loopStatement();
				setState(521);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(520);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				branchStatement();
				setState(525);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(524);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				labeledStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				controlTransferStatement();
				setState(530);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(529);
					match(T__0);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				deferStatement();
				setState(534);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(533);
					match(T__0);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(536);
				doStatement();
				setState(538);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(537);
					match(T__1);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(540);
				compilerControlStatement();
				setState(542);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(541);
					match(T__0);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(544);
				expression();
				setState(546);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(545);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(550);
				statement();
				}
				}
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatWhileStatementContext repeatWhileStatement() {
			return getRuleContext(RepeatWhileStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopStatement);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				forStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				forInStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				repeatWhileStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forStatement);
		int _la;
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(T__2);
				setState(563);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__96 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(562);
					forInit();
					}
				}

				setState(565);
				match(T__0);
				setState(567);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(566);
					expression();
					}
				}

				setState(569);
				match(T__0);
				setState(571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(570);
					expressionList();
					}
					break;
				}
				setState(573);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(T__2);
				setState(575);
				match(T__3);
				setState(577);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__96 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(576);
					forInit();
					}
				}

				setState(579);
				match(T__0);
				setState(581);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(580);
					expression();
					}
				}

				setState(583);
				match(T__0);
				setState(585);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(584);
					expressionList();
					}
				}

				setState(587);
				match(T__4);
				setState(588);
				codeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forInit);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForInStatement(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__2);
			setState(597);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(596);
				match(T__5);
				}
			}

			setState(599);
			pattern(0);
			setState(600);
			match(T__6);
			setState(601);
			expression();
			setState(603);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(602);
				whereClause();
				}
			}

			setState(605);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__7);
			setState(608);
			conditionClause();
			setState(609);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatWhileStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public RepeatWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRepeatWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRepeatWhileStatement(this);
		}
	}

	public final RepeatWhileStatementContext repeatWhileStatement() throws RecognitionException {
		RepeatWhileStatementContext _localctx = new RepeatWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repeatWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T__8);
			setState(612);
			codeBlock();
			setState(613);
			match(T__7);
			setState(614);
			conditionClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public GuardStatementContext guardStatement() {
			return getRuleContext(GuardStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BranchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBranchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBranchStatement(this);
		}
	}

	public final BranchStatementContext branchStatement() throws RecognitionException {
		BranchStatementContext _localctx = new BranchStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_branchStatement);
		try {
			setState(619);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				ifStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				guardStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(T__9);
			setState(622);
			conditionClause();
			setState(623);
			codeBlock();
			setState(625);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(624);
				elseClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseClause);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(T__10);
				setState(628);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(T__10);
				setState(630);
				ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardStatementContext extends ParserRuleContext {
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public GuardStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuardStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuardStatement(this);
		}
	}

	public final GuardStatementContext guardStatement() throws RecognitionException {
		GuardStatementContext _localctx = new GuardStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_guardStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(T__11);
			setState(634);
			conditionClause();
			setState(635);
			match(T__10);
			setState(636);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__12);
			setState(639);
			expression();
			setState(640);
			match(T__13);
			setState(642);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__16) {
				{
				setState(641);
				switchCases();
				}
			}

			setState(644);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCasesContext extends ParserRuleContext {
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitchCases(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			switchCase();
			setState(648);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__16) {
				{
				setState(647);
				switchCases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public CaseLabelContext caseLabel() {
			return getRuleContext(CaseLabelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DefaultLabelContext defaultLabel() {
			return getRuleContext(DefaultLabelContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchCase);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				caseLabel();
				setState(651);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				defaultLabel();
				setState(654);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				caseLabel();
				setState(657);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				defaultLabel();
				setState(660);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseLabelContext extends ParserRuleContext {
		public CaseItemListContext caseItemList() {
			return getRuleContext(CaseItemListContext.class,0);
		}
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseLabel(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(T__5);
			setState(665);
			caseItemList();
			setState(666);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseItemListContext extends ParserRuleContext {
		public List<CaseItemContext> caseItem() {
			return getRuleContexts(CaseItemContext.class);
		}
		public CaseItemContext caseItem(int i) {
			return getRuleContext(CaseItemContext.class,i);
		}
		public CaseItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseItemList(this);
		}
	}

	public final CaseItemListContext caseItemList() throws RecognitionException {
		CaseItemListContext _localctx = new CaseItemListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_caseItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			caseItem();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(669);
				match(T__15);
				setState(670);
				caseItem();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseItemContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CaseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseItem(this);
		}
	}

	public final CaseItemContext caseItem() throws RecognitionException {
		CaseItemContext _localctx = new CaseItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_caseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			pattern(0);
			setState(678);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(677);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultLabelContext extends ParserRuleContext {
		public DefaultLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefaultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefaultLabel(this);
		}
	}

	public final DefaultLabelContext defaultLabel() throws RecognitionException {
		DefaultLabelContext _localctx = new DefaultLabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(T__16);
			setState(681);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public StatementLabelContext statementLabel() {
			return getRuleContext(StatementLabelContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_labeledStatement);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				statementLabel();
				setState(684);
				loopStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				statementLabel();
				setState(687);
				switchStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementLabelContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public StatementLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatementLabel(this);
		}
	}

	public final StatementLabelContext statementLabel() throws RecognitionException {
		StatementLabelContext _localctx = new StatementLabelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			labelName();
			setState(692);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabelName(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlTransferStatementContext extends ParserRuleContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public FallthroughStatementContext fallthroughStatement() {
			return getRuleContext(FallthroughStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ControlTransferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlTransferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterControlTransferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitControlTransferStatement(this);
		}
	}

	public final ControlTransferStatementContext controlTransferStatement() throws RecognitionException {
		ControlTransferStatementContext _localctx = new ControlTransferStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_controlTransferStatement);
		try {
			setState(701);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				breakStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				continueStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				fallthroughStatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				returnStatement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(700);
				throwStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__17);
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(704);
				labelName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__18);
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(708);
				labelName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallthroughStatementContext extends ParserRuleContext {
		public FallthroughStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFallthroughStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFallthroughStatement(this);
		}
	}

	public final FallthroughStatementContext fallthroughStatement() throws RecognitionException {
		FallthroughStatementContext _localctx = new FallthroughStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fallthroughStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(T__20);
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(714);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(T__21);
			setState(718);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeferStatement(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__22);
			setState(721);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_doStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__23);
			setState(724);
			codeBlock();
			setState(726);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(725);
				catchClauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClausesContext extends ParserRuleContext {
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public CatchClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCatchClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCatchClauses(this);
		}
	}

	public final CatchClausesContext catchClauses() throws RecognitionException {
		CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_catchClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			catchClause();
			setState(730);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(729);
				catchClauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__24);
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(733);
				pattern(0);
				}
				break;
			}
			setState(737);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(736);
				whereClause();
				}
			}

			setState(739);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public AvailabilityConditionContext availabilityCondition() {
			return getRuleContext(AvailabilityConditionContext.class,0);
		}
		public ConditionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionClause(this);
		}
	}

	public final ConditionClauseContext conditionClause() throws RecognitionException {
		ConditionClauseContext _localctx = new ConditionClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionClause);
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				expression();
				setState(743);
				match(T__15);
				setState(744);
				conditionList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				conditionList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				availabilityCondition();
				setState(748);
				match(T__15);
				setState(749);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionListContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionList(this);
		}
	}

	public final ConditionListContext conditionList() throws RecognitionException {
		ConditionListContext _localctx = new ConditionListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			condition();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(754);
				match(T__15);
				setState(755);
				condition();
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public AvailabilityConditionContext availabilityCondition() {
			return getRuleContext(AvailabilityConditionContext.class,0);
		}
		public CaseConditionContext caseCondition() {
			return getRuleContext(CaseConditionContext.class,0);
		}
		public OptionalBindingConditionContext optionalBindingCondition() {
			return getRuleContext(OptionalBindingConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condition);
		try {
			setState(764);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				availabilityCondition();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				caseCondition();
				}
				break;
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				optionalBindingCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseConditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CaseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseCondition(this);
		}
	}

	public final CaseConditionContext caseCondition() throws RecognitionException {
		CaseConditionContext _localctx = new CaseConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_caseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(T__5);
			setState(767);
			pattern(0);
			setState(768);
			initializer();
			setState(770);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(769);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingConditionContext extends ParserRuleContext {
		public OptionalBindingHeadContext optionalBindingHead() {
			return getRuleContext(OptionalBindingHeadContext.class,0);
		}
		public OptionalBindingContinuationListContext optionalBindingContinuationList() {
			return getRuleContext(OptionalBindingContinuationListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OptionalBindingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingCondition(this);
		}
	}

	public final OptionalBindingConditionContext optionalBindingCondition() throws RecognitionException {
		OptionalBindingConditionContext _localctx = new OptionalBindingConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_optionalBindingCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			optionalBindingHead();
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(773);
				match(T__15);
				setState(774);
				optionalBindingContinuationList();
				}
				break;
			}
			setState(778);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(777);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingHeadContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptionalBindingHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingHead(this);
		}
	}

	public final OptionalBindingHeadContext optionalBindingHead() throws RecognitionException {
		OptionalBindingHeadContext _localctx = new OptionalBindingHeadContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_optionalBindingHead);
		try {
			setState(788);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				match(T__25);
				setState(781);
				pattern(0);
				setState(782);
				initializer();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(T__26);
				setState(785);
				pattern(0);
				setState(786);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingContinuationListContext extends ParserRuleContext {
		public List<OptionalBindingContinuationContext> optionalBindingContinuation() {
			return getRuleContexts(OptionalBindingContinuationContext.class);
		}
		public OptionalBindingContinuationContext optionalBindingContinuation(int i) {
			return getRuleContext(OptionalBindingContinuationContext.class,i);
		}
		public OptionalBindingContinuationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingContinuationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingContinuationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingContinuationList(this);
		}
	}

	public final OptionalBindingContinuationListContext optionalBindingContinuationList() throws RecognitionException {
		OptionalBindingContinuationListContext _localctx = new OptionalBindingContinuationListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_optionalBindingContinuationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			optionalBindingContinuation();
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(791);
					match(T__15);
					setState(792);
					optionalBindingContinuation();
					}
					} 
				}
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingContinuationContext extends ParserRuleContext {
		public OptionalBindingHeadContext optionalBindingHead() {
			return getRuleContext(OptionalBindingHeadContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptionalBindingContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingContinuation(this);
		}
	}

	public final OptionalBindingContinuationContext optionalBindingContinuation() throws RecognitionException {
		OptionalBindingContinuationContext _localctx = new OptionalBindingContinuationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_optionalBindingContinuation);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				optionalBindingHead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				pattern(0);
				setState(800);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__27);
			setState(805);
			whereExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhereExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhereExpression(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityConditionContext extends ParserRuleContext {
		public AvailabilityArgumentsContext availabilityArguments() {
			return getRuleContext(AvailabilityArgumentsContext.class,0);
		}
		public AvailabilityConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailabilityCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailabilityCondition(this);
		}
	}

	public final AvailabilityConditionContext availabilityCondition() throws RecognitionException {
		AvailabilityConditionContext _localctx = new AvailabilityConditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_availabilityCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__28);
			setState(810);
			match(T__3);
			setState(811);
			availabilityArguments();
			setState(812);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityArgumentsContext extends ParserRuleContext {
		public AvailabilityArgumentContext availabilityArgument() {
			return getRuleContext(AvailabilityArgumentContext.class,0);
		}
		public List<AvailabilityArgumentsContext> availabilityArguments() {
			return getRuleContexts(AvailabilityArgumentsContext.class);
		}
		public AvailabilityArgumentsContext availabilityArguments(int i) {
			return getRuleContext(AvailabilityArgumentsContext.class,i);
		}
		public AvailabilityArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailabilityArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailabilityArguments(this);
		}
	}

	public final AvailabilityArgumentsContext availabilityArguments() throws RecognitionException {
		AvailabilityArgumentsContext _localctx = new AvailabilityArgumentsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_availabilityArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			availabilityArgument();
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(815);
					match(T__15);
					setState(816);
					availabilityArguments();
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityArgumentContext extends ParserRuleContext {
		public PlatformNameContext platformName() {
			return getRuleContext(PlatformNameContext.class,0);
		}
		public PlatformVersionContext platformVersion() {
			return getRuleContext(PlatformVersionContext.class,0);
		}
		public AvailabilityArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailabilityArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailabilityArgument(this);
		}
	}

	public final AvailabilityArgumentContext availabilityArgument() throws RecognitionException {
		AvailabilityArgumentContext _localctx = new AvailabilityArgumentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_availabilityArgument);
		try {
			setState(826);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				platformName();
				setState(823);
				platformVersion();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlatformNameContext extends ParserRuleContext {
		public PlatformNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformName(this);
		}
	}

	public final PlatformNameContext platformName() throws RecognitionException {
		PlatformNameContext _localctx = new PlatformNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_platformName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlatformVersionContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SwiftParser.VersionLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(SwiftParser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SwiftParser.FloatingPointLiteral, 0); }
		public PlatformVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformVersion(this);
		}
	}

	public final PlatformVersionContext platformVersion() throws RecognitionException {
		PlatformVersionContext _localctx = new PlatformVersionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_platformVersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (DecimalLiteral - 141)) | (1L << (FloatingPointLiteral - 141)) | (1L << (VersionLiteral - 141)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterClauseContext extends ParserRuleContext {
		public GenericParameterListContext genericParameterList() {
			return getRuleContext(GenericParameterListContext.class,0);
		}
		public RequirementClauseContext requirementClause() {
			return getRuleContext(RequirementClauseContext.class,0);
		}
		public GenericParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericParameterClause(this);
		}
	}

	public final GenericParameterClauseContext genericParameterClause() throws RecognitionException {
		GenericParameterClauseContext _localctx = new GenericParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_genericParameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(T__38);
			setState(833);
			genericParameterList();
			setState(835);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(834);
				requirementClause();
				}
			}

			setState(837);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterListContext extends ParserRuleContext {
		public List<GenericParameterContext> genericParameter() {
			return getRuleContexts(GenericParameterContext.class);
		}
		public GenericParameterContext genericParameter(int i) {
			return getRuleContext(GenericParameterContext.class,i);
		}
		public GenericParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericParameterList(this);
		}
	}

	public final GenericParameterListContext genericParameterList() throws RecognitionException {
		GenericParameterListContext _localctx = new GenericParameterListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_genericParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			genericParameter();
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(840);
				match(T__15);
				setState(841);
				genericParameter();
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public GenericParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericParameter(this);
		}
	}

	public final GenericParameterContext genericParameter() throws RecognitionException {
		GenericParameterContext _localctx = new GenericParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_genericParameter);
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				typeName();
				setState(849);
				match(T__1);
				setState(850);
				typeIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				typeName();
				setState(853);
				match(T__1);
				setState(854);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementClauseContext extends ParserRuleContext {
		public RequirementListContext requirementList() {
			return getRuleContext(RequirementListContext.class,0);
		}
		public RequirementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirementClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirementClause(this);
		}
	}

	public final RequirementClauseContext requirementClause() throws RecognitionException {
		RequirementClauseContext _localctx = new RequirementClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_requirementClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__27);
			setState(859);
			requirementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementListContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public RequirementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirementList(this);
		}
	}

	public final RequirementListContext requirementList() throws RecognitionException {
		RequirementListContext _localctx = new RequirementListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			requirement();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(862);
				match(T__15);
				setState(863);
				requirement();
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public ConformanceRequirementContext conformanceRequirement() {
			return getRuleContext(ConformanceRequirementContext.class,0);
		}
		public SameTypeRequirementContext sameTypeRequirement() {
			return getRuleContext(SameTypeRequirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_requirement);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				conformanceRequirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				sameTypeRequirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConformanceRequirementContext extends ParserRuleContext {
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public ConformanceRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformanceRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConformanceRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConformanceRequirement(this);
		}
	}

	public final ConformanceRequirementContext conformanceRequirement() throws RecognitionException {
		ConformanceRequirementContext _localctx = new ConformanceRequirementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_conformanceRequirement);
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				typeIdentifier();
				setState(874);
				match(T__1);
				setState(875);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				typeIdentifier();
				setState(878);
				match(T__1);
				setState(879);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SameTypeRequirementContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public SameTypeRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameTypeRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSameTypeRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSameTypeRequirement(this);
		}
	}

	public final SameTypeRequirementContext sameTypeRequirement() throws RecognitionException {
		SameTypeRequirementContext _localctx = new SameTypeRequirementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sameTypeRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			typeIdentifier();
			setState(884);
			match(T__40);
			setState(885);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentClauseContext extends ParserRuleContext {
		public GenericArgumentListContext genericArgumentList() {
			return getRuleContext(GenericArgumentListContext.class,0);
		}
		public GenericArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericArgumentClause(this);
		}
	}

	public final GenericArgumentClauseContext genericArgumentClause() throws RecognitionException {
		GenericArgumentClauseContext _localctx = new GenericArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_genericArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(T__38);
			setState(888);
			genericArgumentList();
			setState(889);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentListContext extends ParserRuleContext {
		public List<GenericArgumentContext> genericArgument() {
			return getRuleContexts(GenericArgumentContext.class);
		}
		public GenericArgumentContext genericArgument(int i) {
			return getRuleContext(GenericArgumentContext.class,i);
		}
		public GenericArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericArgumentList(this);
		}
	}

	public final GenericArgumentListContext genericArgumentList() throws RecognitionException {
		GenericArgumentListContext _localctx = new GenericArgumentListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_genericArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			genericArgument();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(892);
				match(T__15);
				setState(893);
				genericArgument();
				}
				}
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public GenericArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericArgument(this);
		}
	}

	public final GenericArgumentContext genericArgument() throws RecognitionException {
		GenericArgumentContext _localctx = new GenericArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_genericArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TypealiasDeclarationContext typealiasDeclaration() {
			return getRuleContext(TypealiasDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public InitializerDeclarationContext initializerDeclaration() {
			return getRuleContext(InitializerDeclarationContext.class,0);
		}
		public DeinitializerDeclarationContext deinitializerDeclaration() {
			return getRuleContext(DeinitializerDeclarationContext.class,0);
		}
		public ExtensionDeclarationContext extensionDeclaration() {
			return getRuleContext(ExtensionDeclarationContext.class,0);
		}
		public SubscriptDeclarationContext subscriptDeclaration() {
			return getRuleContext(SubscriptDeclarationContext.class,0);
		}
		public OperatorDeclarationContext operatorDeclaration() {
			return getRuleContext(OperatorDeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declaration);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				importDeclaration();
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(902);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				constantDeclaration();
				setState(907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(906);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				variableDeclaration();
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(910);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(913);
				typealiasDeclaration();
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(914);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(917);
				functionDeclaration();
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(918);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(921);
				enumDeclaration();
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(922);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(925);
				structDeclaration();
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(926);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(929);
				classDeclaration();
				setState(931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(930);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(933);
				protocolDeclaration();
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(934);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(937);
				initializerDeclaration();
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(938);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(941);
				deinitializerDeclaration();
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(942);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(945);
				extensionDeclaration();
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(946);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(949);
				subscriptDeclaration();
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(950);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(953);
				operatorDeclaration();
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(954);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(957);
				compilerControlStatement();
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(958);
					match(T__0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			declaration();
			setState(965);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__41 - 26)) | (1L << (T__42 - 26)) | (1L << (T__43 - 26)) | (1L << (T__44 - 26)) | (1L << (T__45 - 26)) | (1L << (T__46 - 26)) | (1L << (T__47 - 26)) | (1L << (T__48 - 26)) | (1L << (T__49 - 26)) | (1L << (T__50 - 26)) | (1L << (T__51 - 26)) | (1L << (T__52 - 26)) | (1L << (T__53 - 26)) | (1L << (T__54 - 26)) | (1L << (T__55 - 26)) | (1L << (T__58 - 26)) | (1L << (T__59 - 26)) | (1L << (T__61 - 26)) | (1L << (T__62 - 26)) | (1L << (T__63 - 26)) | (1L << (T__64 - 26)) | (1L << (T__65 - 26)) | (1L << (T__66 - 26)) | (1L << (T__67 - 26)) | (1L << (T__68 - 26)) | (1L << (T__81 - 26)) | (1L << (T__82 - 26)) | (1L << (T__85 - 26)) | (1L << (T__86 - 26)) | (1L << (T__87 - 26)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__119 - 97)) | (1L << (T__129 - 97)))) != 0)) {
				{
				setState(964);
				declarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationModifiersContext extends ParserRuleContext {
		public DeclarationModifierContext declarationModifier() {
			return getRuleContext(DeclarationModifierContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public DeclarationModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarationModifiers(this);
		}
	}

	public final DeclarationModifiersContext declarationModifiers() throws RecognitionException {
		DeclarationModifiersContext _localctx = new DeclarationModifiersContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declarationModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			declarationModifier();
			setState(969);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(968);
				declarationModifiers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationModifierContext extends ParserRuleContext {
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public DeclarationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarationModifier(this);
		}
	}

	public final DeclarationModifierContext declarationModifier() throws RecognitionException {
		DeclarationModifierContext _localctx = new DeclarationModifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declarationModifier);
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(T__41);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				match(T__42);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				match(T__43);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(974);
				match(T__44);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(975);
				match(T__45);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(976);
				match(T__46);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(977);
				match(T__47);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(978);
				match(T__48);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(979);
				match(T__49);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(980);
				match(T__50);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(981);
				match(T__51);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(982);
				match(T__52);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(983);
				match(T__53);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(984);
				match(T__54);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(985);
				match(T__55);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(986);
				match(T__55);
				setState(987);
				match(T__3);
				setState(988);
				match(T__56);
				setState(989);
				match(T__4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(990);
				match(T__55);
				setState(991);
				match(T__3);
				setState(992);
				match(T__57);
				setState(993);
				match(T__4);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(994);
				match(T__58);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(995);
				accessLevelModifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelModifierContext extends ParserRuleContext {
		public AccessLevelModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevelModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccessLevelModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccessLevelModifier(this);
		}
	}

	public final AccessLevelModifierContext accessLevelModifier() throws RecognitionException {
		AccessLevelModifierContext _localctx = new AccessLevelModifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_accessLevelModifier);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				match(T__59);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(T__59);
				setState(1000);
				match(T__3);
				setState(1001);
				match(T__60);
				setState(1002);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				match(T__61);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1004);
				match(T__61);
				setState(1005);
				match(T__3);
				setState(1006);
				match(T__60);
				setState(1007);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1008);
				match(T__62);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1009);
				match(T__62);
				setState(1010);
				match(T__3);
				setState(1011);
				match(T__60);
				setState(1012);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelModifiersContext extends ParserRuleContext {
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public AccessLevelModifiersContext accessLevelModifiers() {
			return getRuleContext(AccessLevelModifiersContext.class,0);
		}
		public AccessLevelModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevelModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccessLevelModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccessLevelModifiers(this);
		}
	}

	public final AccessLevelModifiersContext accessLevelModifiers() throws RecognitionException {
		AccessLevelModifiersContext _localctx = new AccessLevelModifiersContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_accessLevelModifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			accessLevelModifier();
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1016);
				accessLevelModifiers();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(T__13);
			setState(1021);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(1020);
				statements();
				}
			}

			setState(1023);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ImportKindContext importKind() {
			return getRuleContext(ImportKindContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1025);
				attributes();
				}
			}

			setState(1028);
			match(T__63);
			setState(1030);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__41 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (T__67 - 27)) | (1L << (T__68 - 27)))) != 0)) {
				{
				setState(1029);
				importKind();
				}
			}

			setState(1032);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportKindContext extends ParserRuleContext {
		public ImportKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportKind(this);
		}
	}

	public final ImportKindContext importKind() throws RecognitionException {
		ImportKindContext _localctx = new ImportKindContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_importKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__41 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (T__67 - 27)) | (1L << (T__68 - 27)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public ImportPathIdentifierContext importPathIdentifier() {
			return getRuleContext(ImportPathIdentifierContext.class,0);
		}
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_importPath);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				importPathIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				importPathIdentifier();
				setState(1038);
				match(T__69);
				setState(1039);
				importPath();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ImportPathIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPathIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportPathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportPathIdentifier(this);
		}
	}

	public final ImportPathIdentifierContext importPathIdentifier() throws RecognitionException {
		ImportPathIdentifierContext _localctx = new ImportPathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_importPathIdentifier);
		try {
			setState(1045);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__116:
			case T__117:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__130:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				identifier();
				}
				break;
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__77:
			case T__83:
			case T__84:
			case T__99:
			case T__101:
			case T__103:
			case T__114:
			case T__115:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public PatternInitializerListContext patternInitializerList() {
			return getRuleContext(PatternInitializerListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1047);
				attributes();
				}
			}

			setState(1051);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1050);
				declarationModifiers();
				}
			}

			setState(1053);
			match(T__25);
			setState(1054);
			patternInitializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternInitializerListContext extends ParserRuleContext {
		public List<PatternInitializerContext> patternInitializer() {
			return getRuleContexts(PatternInitializerContext.class);
		}
		public PatternInitializerContext patternInitializer(int i) {
			return getRuleContext(PatternInitializerContext.class,i);
		}
		public PatternInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPatternInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPatternInitializerList(this);
		}
	}

	public final PatternInitializerListContext patternInitializerList() throws RecognitionException {
		PatternInitializerListContext _localctx = new PatternInitializerListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_patternInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			patternInitializer();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1057);
				match(T__15);
				setState(1058);
				patternInitializer();
				}
				}
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternInitializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public PatternInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPatternInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPatternInitializer(this);
		}
	}

	public final PatternInitializerContext patternInitializer() throws RecognitionException {
		PatternInitializerContext _localctx = new PatternInitializerContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_patternInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			pattern(0);
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1065);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(T__70);
			setState(1069);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationHeadContext variableDeclarationHead() {
			return getRuleContext(VariableDeclarationHeadContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterSetterBlockContext getterSetterBlock() {
			return getRuleContext(GetterSetterBlockContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WillSetDidSetBlockContext willSetDidSetBlock() {
			return getRuleContext(WillSetDidSetBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PatternInitializerListContext patternInitializerList() {
			return getRuleContext(PatternInitializerListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_variableDeclaration);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				variableDeclarationHead();
				setState(1072);
				variableName();
				setState(1073);
				typeAnnotation();
				setState(1074);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				variableDeclarationHead();
				setState(1077);
				variableName();
				setState(1078);
				typeAnnotation();
				setState(1079);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				variableDeclarationHead();
				setState(1082);
				variableName();
				setState(1083);
				initializer();
				setState(1084);
				willSetDidSetBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				variableDeclarationHead();
				setState(1087);
				variableName();
				setState(1088);
				typeAnnotation();
				setState(1090);
				_la = _input.LA(1);
				if (_la==T__70) {
					{
					setState(1089);
					initializer();
					}
				}

				setState(1092);
				willSetDidSetBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1094);
				variableDeclarationHead();
				setState(1095);
				variableName();
				setState(1096);
				typeAnnotation();
				setState(1097);
				codeBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1099);
				variableDeclarationHead();
				setState(1100);
				patternInitializerList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public VariableDeclarationHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariableDeclarationHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariableDeclarationHead(this);
		}
	}

	public final VariableDeclarationHeadContext variableDeclarationHead() throws RecognitionException {
		VariableDeclarationHeadContext _localctx = new VariableDeclarationHeadContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_variableDeclarationHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1104);
				attributes();
				}
			}

			setState(1108);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1107);
				declarationModifiers();
				}
			}

			setState(1110);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterBlockContext extends ParserRuleContext {
		public GetterClauseContext getterClause() {
			return getRuleContext(GetterClauseContext.class,0);
		}
		public SetterClauseContext setterClause() {
			return getRuleContext(SetterClauseContext.class,0);
		}
		public GetterSetterBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterSetterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterSetterBlock(this);
		}
	}

	public final GetterSetterBlockContext getterSetterBlock() throws RecognitionException {
		GetterSetterBlockContext _localctx = new GetterSetterBlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_getterSetterBlock);
		int _la;
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				match(T__13);
				setState(1115);
				getterClause();
				setState(1117);
				_la = _input.LA(1);
				if (_la==T__60 || _la==T__96) {
					{
					setState(1116);
					setterClause();
					}
				}

				setState(1119);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				match(T__13);
				setState(1122);
				setterClause();
				setState(1123);
				getterClause();
				setState(1124);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public GetterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterClause(this);
		}
	}

	public final GetterClauseContext getterClause() throws RecognitionException {
		GetterClauseContext _localctx = new GetterClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_getterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1128);
				attributes();
				}
			}

			setState(1131);
			match(T__71);
			setState(1132);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public SetterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetterClause(this);
		}
	}

	public final SetterClauseContext setterClause() throws RecognitionException {
		SetterClauseContext _localctx = new SetterClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1134);
				attributes();
				}
			}

			setState(1137);
			match(T__60);
			setState(1139);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1138);
				setterName();
				}
			}

			setState(1141);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetterName(this);
		}
	}

	public final SetterNameContext setterName() throws RecognitionException {
		SetterNameContext _localctx = new SetterNameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_setterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(T__3);
			setState(1144);
			identifier();
			setState(1145);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterKeywordBlockContext extends ParserRuleContext {
		public GetterKeywordClauseContext getterKeywordClause() {
			return getRuleContext(GetterKeywordClauseContext.class,0);
		}
		public SetterKeywordClauseContext setterKeywordClause() {
			return getRuleContext(SetterKeywordClauseContext.class,0);
		}
		public GetterSetterKeywordBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterKeywordBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterSetterKeywordBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterSetterKeywordBlock(this);
		}
	}

	public final GetterSetterKeywordBlockContext getterSetterKeywordBlock() throws RecognitionException {
		GetterSetterKeywordBlockContext _localctx = new GetterSetterKeywordBlockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_getterSetterKeywordBlock);
		int _la;
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(T__13);
				setState(1148);
				getterKeywordClause();
				setState(1150);
				_la = _input.LA(1);
				if (_la==T__60 || _la==T__96) {
					{
					setState(1149);
					setterKeywordClause();
					}
				}

				setState(1152);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				match(T__13);
				setState(1155);
				setterKeywordClause();
				setState(1156);
				getterKeywordClause();
				setState(1157);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterKeywordClauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public GetterKeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterKeywordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterKeywordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterKeywordClause(this);
		}
	}

	public final GetterKeywordClauseContext getterKeywordClause() throws RecognitionException {
		GetterKeywordClauseContext _localctx = new GetterKeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_getterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1161);
				attributes();
				}
			}

			setState(1164);
			match(T__71);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterKeywordClauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterKeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterKeywordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetterKeywordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetterKeywordClause(this);
		}
	}

	public final SetterKeywordClauseContext setterKeywordClause() throws RecognitionException {
		SetterKeywordClauseContext _localctx = new SetterKeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_setterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1166);
				attributes();
				}
			}

			setState(1169);
			match(T__60);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSetDidSetBlockContext extends ParserRuleContext {
		public WillSetClauseContext willSetClause() {
			return getRuleContext(WillSetClauseContext.class,0);
		}
		public DidSetClauseContext didSetClause() {
			return getRuleContext(DidSetClauseContext.class,0);
		}
		public WillSetDidSetBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSetDidSetBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSetDidSetBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSetDidSetBlock(this);
		}
	}

	public final WillSetDidSetBlockContext willSetDidSetBlock() throws RecognitionException {
		WillSetDidSetBlockContext _localctx = new WillSetDidSetBlockContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_willSetDidSetBlock);
		int _la;
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				match(T__13);
				setState(1172);
				willSetClause();
				setState(1174);
				_la = _input.LA(1);
				if (_la==T__73 || _la==T__96) {
					{
					setState(1173);
					didSetClause();
					}
				}

				setState(1176);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(T__13);
				setState(1179);
				didSetClause();
				setState(1181);
				_la = _input.LA(1);
				if (_la==T__72 || _la==T__96) {
					{
					setState(1180);
					willSetClause();
					}
				}

				setState(1183);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSetClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public WillSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSetClause(this);
		}
	}

	public final WillSetClauseContext willSetClause() throws RecognitionException {
		WillSetClauseContext _localctx = new WillSetClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_willSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1187);
				attributes();
				}
			}

			setState(1190);
			match(T__72);
			setState(1192);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1191);
				setterName();
				}
			}

			setState(1194);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSetClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public DidSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDidSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDidSetClause(this);
		}
	}

	public final DidSetClauseContext didSetClause() throws RecognitionException {
		DidSetClauseContext _localctx = new DidSetClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_didSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1196);
				attributes();
				}
			}

			setState(1199);
			match(T__73);
			setState(1201);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1200);
				setterName();
				}
			}

			setState(1203);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasDeclarationContext extends ParserRuleContext {
		public TypealiasHeadContext typealiasHead() {
			return getRuleContext(TypealiasHeadContext.class,0);
		}
		public TypealiasAssignmentContext typealiasAssignment() {
			return getRuleContext(TypealiasAssignmentContext.class,0);
		}
		public TypealiasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasDeclaration(this);
		}
	}

	public final TypealiasDeclarationContext typealiasDeclaration() throws RecognitionException {
		TypealiasDeclarationContext _localctx = new TypealiasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typealiasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			typealiasHead();
			setState(1206);
			typealiasAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasHeadContext extends ParserRuleContext {
		public TypealiasNameContext typealiasName() {
			return getRuleContext(TypealiasNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypealiasHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasHead(this);
		}
	}

	public final TypealiasHeadContext typealiasHead() throws RecognitionException {
		TypealiasHeadContext _localctx = new TypealiasHeadContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typealiasHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1208);
				attributes();
				}
			}

			setState(1212);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1211);
				accessLevelModifier();
				}
			}

			setState(1214);
			match(T__64);
			setState(1215);
			typealiasName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypealiasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasName(this);
		}
	}

	public final TypealiasNameContext typealiasName() throws RecognitionException {
		TypealiasNameContext _localctx = new TypealiasNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typealiasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasAssignmentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public TypealiasAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasAssignment(this);
		}
	}

	public final TypealiasAssignmentContext typealiasAssignment() throws RecognitionException {
		TypealiasAssignmentContext _localctx = new TypealiasAssignmentContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_typealiasAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(T__70);
			setState(1220);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionDeclaration);
		int _la;
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				functionHead();
				setState(1223);
				functionName();
				setState(1225);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1224);
					genericParameterClause();
					}
				}

				setState(1227);
				functionSignature();
				setState(1228);
				functionBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				functionHead();
				setState(1231);
				functionName();
				setState(1233);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1232);
					genericParameterClause();
					}
				}

				setState(1235);
				functionSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public FunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionHead(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1239);
				attributes();
				}
			}

			setState(1243);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1242);
				declarationModifiers();
				}
			}

			setState(1245);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_functionName);
		try {
			setState(1249);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__116:
			case T__117:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__130:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				identifier();
				}
				break;
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__77:
			case T__83:
			case T__84:
			case T__99:
			case T__101:
			case T__103:
			case T__114:
			case T__115:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public ParameterClausesContext parameterClauses() {
			return getRuleContext(ParameterClausesContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionSignature(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			parameterClauses();
			setState(1253);
			_la = _input.LA(1);
			if (_la==T__74 || _la==T__75) {
				{
				setState(1252);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1256);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(1255);
				functionResult();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionResultContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public FunctionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionResult(this);
		}
	}

	public final FunctionResultContext functionResult() throws RecognitionException {
		FunctionResultContext _localctx = new FunctionResultContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_functionResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(T__76);
			setState(1260);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1259);
				attributes();
				}
			}

			setState(1262);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterClausesContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public ParameterClausesContext parameterClauses() {
			return getRuleContext(ParameterClausesContext.class,0);
		}
		public ParameterClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameterClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameterClauses(this);
		}
	}

	public final ParameterClausesContext parameterClauses() throws RecognitionException {
		ParameterClausesContext _localctx = new ParameterClausesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_parameterClauses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			parameterClause();
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1267);
				parameterClauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterClauseContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameterClause(this);
		}
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_parameterClause);
		int _la;
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				match(T__3);
				setState(1271);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				match(T__3);
				setState(1273);
				parameterList();
				setState(1275);
				_la = _input.LA(1);
				if (_la==T__77) {
					{
					setState(1274);
					match(T__77);
					}
				}

				setState(1277);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			parameter();
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1282);
				match(T__15);
				setState(1283);
				parameter();
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public LocalParameterNameContext localParameterName() {
			return getRuleContext(LocalParameterNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExternalParameterNameContext externalParameterName() {
			return getRuleContext(ExternalParameterNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public DefaultArgumentClauseContext defaultArgumentClause() {
			return getRuleContext(DefaultArgumentClauseContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_parameter);
		int _la;
		try {
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				_la = _input.LA(1);
				if (_la==T__96) {
					{
					setState(1289);
					attributes();
					}
				}

				setState(1293);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(1292);
					match(T__78);
					}
				}

				setState(1296);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(1295);
					match(T__25);
					}
				}

				setState(1299);
				_la = _input.LA(1);
				if (_la==T__79) {
					{
					setState(1298);
					match(T__79);
					}
				}

				setState(1302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1301);
					externalParameterName();
					}
					break;
				}
				setState(1304);
				localParameterName();
				setState(1306);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1305);
					typeAnnotation();
					}
				}

				setState(1309);
				_la = _input.LA(1);
				if (_la==T__70) {
					{
					setState(1308);
					defaultArgumentClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(1311);
					match(T__78);
					}
				}

				setState(1314);
				match(T__26);
				setState(1316);
				_la = _input.LA(1);
				if (_la==T__79) {
					{
					setState(1315);
					match(T__79);
					}
				}

				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1318);
					externalParameterName();
					}
					break;
				}
				setState(1321);
				localParameterName();
				setState(1323);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1322);
					typeAnnotation();
					}
				}

				setState(1326);
				_la = _input.LA(1);
				if (_la==T__70) {
					{
					setState(1325);
					defaultArgumentClause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				_la = _input.LA(1);
				if (_la==T__96) {
					{
					setState(1328);
					attributes();
					}
				}

				setState(1331);
				sType(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1332);
					externalParameterName();
					}
					break;
				}
				setState(1335);
				localParameterName();
				setState(1336);
				typeAnnotation();
				setState(1337);
				match(T__77);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExternalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExternalParameterName(this);
		}
	}

	public final ExternalParameterNameContext externalParameterName() throws RecognitionException {
		ExternalParameterNameContext _localctx = new ExternalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_externalParameterName);
		try {
			setState(1343);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__116:
			case T__117:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__130:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				identifier();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocalParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLocalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLocalParameterName(this);
		}
	}

	public final LocalParameterNameContext localParameterName() throws RecognitionException {
		LocalParameterNameContext _localctx = new LocalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_localParameterName);
		try {
			setState(1347);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__116:
			case T__117:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__130:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				identifier();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultArgumentClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefaultArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefaultArgumentClause(this);
		}
	}

	public final DefaultArgumentClauseContext defaultArgumentClause() throws RecognitionException {
		DefaultArgumentClauseContext _localctx = new DefaultArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_defaultArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(T__70);
			setState(1350);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1352);
				attributes();
				}
			}

			setState(1356);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1355);
				accessLevelModifier();
				}
			}

			setState(1358);
			enumDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefContext extends ParserRuleContext {
		public UnionStyleEnumContext unionStyleEnum() {
			return getRuleContext(UnionStyleEnumContext.class,0);
		}
		public RawValueStyleEnumContext rawValueStyleEnum() {
			return getRuleContext(RawValueStyleEnumContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumDef(this);
		}
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumDef);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				unionStyleEnum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				rawValueStyleEnum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public UnionStyleEnumMembersContext unionStyleEnumMembers() {
			return getRuleContext(UnionStyleEnumMembersContext.class,0);
		}
		public UnionStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnum(this);
		}
	}

	public final UnionStyleEnumContext unionStyleEnum() throws RecognitionException {
		UnionStyleEnumContext _localctx = new UnionStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(1364);
				match(T__81);
				}
			}

			setState(1367);
			match(T__66);
			setState(1368);
			enumName();
			setState(1370);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1369);
				genericParameterClause();
				}
			}

			setState(1373);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1372);
				typeInheritanceClause();
				}
			}

			setState(1375);
			match(T__13);
			setState(1377);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__41 - 6)) | (1L << (T__42 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__48 - 6)) | (1L << (T__49 - 6)) | (1L << (T__50 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__53 - 6)) | (1L << (T__54 - 6)) | (1L << (T__55 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__85 - 82)) | (1L << (T__86 - 82)) | (1L << (T__87 - 82)) | (1L << (T__96 - 82)) | (1L << (T__119 - 82)) | (1L << (T__129 - 82)))) != 0)) {
				{
				setState(1376);
				unionStyleEnumMembers();
				}
			}

			setState(1379);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumMembersContext extends ParserRuleContext {
		public UnionStyleEnumMemberContext unionStyleEnumMember() {
			return getRuleContext(UnionStyleEnumMemberContext.class,0);
		}
		public UnionStyleEnumMembersContext unionStyleEnumMembers() {
			return getRuleContext(UnionStyleEnumMembersContext.class,0);
		}
		public UnionStyleEnumMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumMembers(this);
		}
	}

	public final UnionStyleEnumMembersContext unionStyleEnumMembers() throws RecognitionException {
		UnionStyleEnumMembersContext _localctx = new UnionStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_unionStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			unionStyleEnumMember();
			setState(1383);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__41 - 6)) | (1L << (T__42 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__48 - 6)) | (1L << (T__49 - 6)) | (1L << (T__50 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__53 - 6)) | (1L << (T__54 - 6)) | (1L << (T__55 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__85 - 82)) | (1L << (T__86 - 82)) | (1L << (T__87 - 82)) | (1L << (T__96 - 82)) | (1L << (T__119 - 82)) | (1L << (T__129 - 82)))) != 0)) {
				{
				setState(1382);
				unionStyleEnumMembers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public UnionStyleEnumCaseClauseContext unionStyleEnumCaseClause() {
			return getRuleContext(UnionStyleEnumCaseClauseContext.class,0);
		}
		public UnionStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumMember(this);
		}
	}

	public final UnionStyleEnumMemberContext unionStyleEnumMember() throws RecognitionException {
		UnionStyleEnumMemberContext _localctx = new UnionStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_unionStyleEnumMember);
		int _la;
		try {
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				unionStyleEnumCaseClause();
				setState(1388);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1387);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseClauseContext extends ParserRuleContext {
		public UnionStyleEnumCaseListContext unionStyleEnumCaseList() {
			return getRuleContext(UnionStyleEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public UnionStyleEnumCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumCaseClause(this);
		}
	}

	public final UnionStyleEnumCaseClauseContext unionStyleEnumCaseClause() throws RecognitionException {
		UnionStyleEnumCaseClauseContext _localctx = new UnionStyleEnumCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_unionStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1392);
				attributes();
				}
			}

			setState(1396);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(1395);
				match(T__81);
				}
			}

			setState(1398);
			match(T__5);
			setState(1399);
			unionStyleEnumCaseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseListContext extends ParserRuleContext {
		public List<UnionStyleEnumCaseContext> unionStyleEnumCase() {
			return getRuleContexts(UnionStyleEnumCaseContext.class);
		}
		public UnionStyleEnumCaseContext unionStyleEnumCase(int i) {
			return getRuleContext(UnionStyleEnumCaseContext.class,i);
		}
		public UnionStyleEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumCaseList(this);
		}
	}

	public final UnionStyleEnumCaseListContext unionStyleEnumCaseList() throws RecognitionException {
		UnionStyleEnumCaseListContext _localctx = new UnionStyleEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_unionStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			unionStyleEnumCase();
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1402);
				match(T__15);
				setState(1403);
				unionStyleEnumCase();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public UnionStyleEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumCase(this);
		}
	}

	public final UnionStyleEnumCaseContext unionStyleEnumCase() throws RecognitionException {
		UnionStyleEnumCaseContext _localctx = new UnionStyleEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_unionStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			enumCaseName();
			setState(1411);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(1410);
				tupleType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumCaseNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumCaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumCaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumCaseName(this);
		}
	}

	public final EnumCaseNameContext enumCaseName() throws RecognitionException {
		EnumCaseNameContext _localctx = new EnumCaseNameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_enumCaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public RawValueStyleEnumMembersContext rawValueStyleEnumMembers() {
			return getRuleContext(RawValueStyleEnumMembersContext.class,0);
		}
		public RawValueStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnum(this);
		}
	}

	public final RawValueStyleEnumContext rawValueStyleEnum() throws RecognitionException {
		RawValueStyleEnumContext _localctx = new RawValueStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(T__66);
			setState(1418);
			enumName();
			setState(1420);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1419);
				genericParameterClause();
				}
			}

			setState(1423);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1422);
				typeInheritanceClause();
				}
			}

			setState(1425);
			match(T__13);
			setState(1427);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__41 - 6)) | (1L << (T__42 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__48 - 6)) | (1L << (T__49 - 6)) | (1L << (T__50 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__53 - 6)) | (1L << (T__54 - 6)) | (1L << (T__55 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__85 - 82)) | (1L << (T__86 - 82)) | (1L << (T__87 - 82)) | (1L << (T__96 - 82)) | (1L << (T__119 - 82)) | (1L << (T__129 - 82)))) != 0)) {
				{
				setState(1426);
				rawValueStyleEnumMembers();
				}
			}

			setState(1429);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumMembersContext extends ParserRuleContext {
		public RawValueStyleEnumMemberContext rawValueStyleEnumMember() {
			return getRuleContext(RawValueStyleEnumMemberContext.class,0);
		}
		public RawValueStyleEnumMembersContext rawValueStyleEnumMembers() {
			return getRuleContext(RawValueStyleEnumMembersContext.class,0);
		}
		public RawValueStyleEnumMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumMembers(this);
		}
	}

	public final RawValueStyleEnumMembersContext rawValueStyleEnumMembers() throws RecognitionException {
		RawValueStyleEnumMembersContext _localctx = new RawValueStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			rawValueStyleEnumMember();
			setState(1433);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__25 - 6)) | (1L << (T__26 - 6)) | (1L << (T__41 - 6)) | (1L << (T__42 - 6)) | (1L << (T__43 - 6)) | (1L << (T__44 - 6)) | (1L << (T__45 - 6)) | (1L << (T__46 - 6)) | (1L << (T__47 - 6)) | (1L << (T__48 - 6)) | (1L << (T__49 - 6)) | (1L << (T__50 - 6)) | (1L << (T__51 - 6)) | (1L << (T__52 - 6)) | (1L << (T__53 - 6)) | (1L << (T__54 - 6)) | (1L << (T__55 - 6)) | (1L << (T__58 - 6)) | (1L << (T__59 - 6)) | (1L << (T__61 - 6)) | (1L << (T__62 - 6)) | (1L << (T__63 - 6)) | (1L << (T__64 - 6)) | (1L << (T__65 - 6)) | (1L << (T__66 - 6)) | (1L << (T__67 - 6)) | (1L << (T__68 - 6)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__85 - 82)) | (1L << (T__86 - 82)) | (1L << (T__87 - 82)) | (1L << (T__96 - 82)) | (1L << (T__119 - 82)) | (1L << (T__129 - 82)))) != 0)) {
				{
				setState(1432);
				rawValueStyleEnumMembers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public RawValueStyleEnumCaseClauseContext rawValueStyleEnumCaseClause() {
			return getRuleContext(RawValueStyleEnumCaseClauseContext.class,0);
		}
		public RawValueStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumMember(this);
		}
	}

	public final RawValueStyleEnumMemberContext rawValueStyleEnumMember() throws RecognitionException {
		RawValueStyleEnumMemberContext _localctx = new RawValueStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_rawValueStyleEnumMember);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				rawValueStyleEnumCaseClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseClauseContext extends ParserRuleContext {
		public RawValueStyleEnumCaseListContext rawValueStyleEnumCaseList() {
			return getRuleContext(RawValueStyleEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public RawValueStyleEnumCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumCaseClause(this);
		}
	}

	public final RawValueStyleEnumCaseClauseContext rawValueStyleEnumCaseClause() throws RecognitionException {
		RawValueStyleEnumCaseClauseContext _localctx = new RawValueStyleEnumCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_rawValueStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1439);
				attributes();
				}
			}

			setState(1442);
			match(T__5);
			setState(1443);
			rawValueStyleEnumCaseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseListContext extends ParserRuleContext {
		public List<RawValueStyleEnumCaseContext> rawValueStyleEnumCase() {
			return getRuleContexts(RawValueStyleEnumCaseContext.class);
		}
		public RawValueStyleEnumCaseContext rawValueStyleEnumCase(int i) {
			return getRuleContext(RawValueStyleEnumCaseContext.class,i);
		}
		public RawValueStyleEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumCaseList(this);
		}
	}

	public final RawValueStyleEnumCaseListContext rawValueStyleEnumCaseList() throws RecognitionException {
		RawValueStyleEnumCaseListContext _localctx = new RawValueStyleEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_rawValueStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			rawValueStyleEnumCase();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1446);
				match(T__15);
				setState(1447);
				rawValueStyleEnumCase();
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public RawValueAssignmentContext rawValueAssignment() {
			return getRuleContext(RawValueAssignmentContext.class,0);
		}
		public RawValueStyleEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumCase(this);
		}
	}

	public final RawValueStyleEnumCaseContext rawValueStyleEnumCase() throws RecognitionException {
		RawValueStyleEnumCaseContext _localctx = new RawValueStyleEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_rawValueStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			enumCaseName();
			setState(1455);
			_la = _input.LA(1);
			if (_la==T__70) {
				{
				setState(1454);
				rawValueAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueAssignmentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RawValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueAssignment(this);
		}
	}

	public final RawValueAssignmentContext rawValueAssignment() throws RecognitionException {
		RawValueAssignmentContext _localctx = new RawValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_rawValueAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(T__70);
			setState(1458);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructNameContext structName() {
			return getRuleContext(StructNameContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1460);
				attributes();
				}
			}

			setState(1464);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1463);
				accessLevelModifier();
				}
			}

			setState(1466);
			match(T__65);
			setState(1467);
			structName();
			setState(1469);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1468);
				genericParameterClause();
				}
			}

			setState(1472);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1471);
				typeInheritanceClause();
				}
			}

			setState(1474);
			structBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructName(this);
		}
	}

	public final StructNameContext structName() throws RecognitionException {
		StructNameContext _localctx = new StructNameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(T__13);
			setState(1480);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__41 - 26)) | (1L << (T__42 - 26)) | (1L << (T__43 - 26)) | (1L << (T__44 - 26)) | (1L << (T__45 - 26)) | (1L << (T__46 - 26)) | (1L << (T__47 - 26)) | (1L << (T__48 - 26)) | (1L << (T__49 - 26)) | (1L << (T__50 - 26)) | (1L << (T__51 - 26)) | (1L << (T__52 - 26)) | (1L << (T__53 - 26)) | (1L << (T__54 - 26)) | (1L << (T__55 - 26)) | (1L << (T__58 - 26)) | (1L << (T__59 - 26)) | (1L << (T__61 - 26)) | (1L << (T__62 - 26)) | (1L << (T__63 - 26)) | (1L << (T__64 - 26)) | (1L << (T__65 - 26)) | (1L << (T__66 - 26)) | (1L << (T__67 - 26)) | (1L << (T__68 - 26)) | (1L << (T__81 - 26)) | (1L << (T__82 - 26)) | (1L << (T__85 - 26)) | (1L << (T__86 - 26)) | (1L << (T__87 - 26)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__119 - 97)) | (1L << (T__129 - 97)))) != 0)) {
				{
				setState(1479);
				declarations();
				}
			}

			setState(1482);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<DeclarationModifierContext> declarationModifier() {
			return getRuleContexts(DeclarationModifierContext.class);
		}
		public DeclarationModifierContext declarationModifier(int i) {
			return getRuleContext(DeclarationModifierContext.class,i);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1484);
				attributes();
				}
			}

			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					declarationModifier();
					}
					} 
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1493);
			match(T__41);
			setState(1494);
			className();
			setState(1496);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1495);
				genericParameterClause();
				}
			}

			setState(1499);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1498);
				typeInheritanceClause();
				}
			}

			setState(1501);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(T__13);
			setState(1507);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__41 - 26)) | (1L << (T__42 - 26)) | (1L << (T__43 - 26)) | (1L << (T__44 - 26)) | (1L << (T__45 - 26)) | (1L << (T__46 - 26)) | (1L << (T__47 - 26)) | (1L << (T__48 - 26)) | (1L << (T__49 - 26)) | (1L << (T__50 - 26)) | (1L << (T__51 - 26)) | (1L << (T__52 - 26)) | (1L << (T__53 - 26)) | (1L << (T__54 - 26)) | (1L << (T__55 - 26)) | (1L << (T__58 - 26)) | (1L << (T__59 - 26)) | (1L << (T__61 - 26)) | (1L << (T__62 - 26)) | (1L << (T__63 - 26)) | (1L << (T__64 - 26)) | (1L << (T__65 - 26)) | (1L << (T__66 - 26)) | (1L << (T__67 - 26)) | (1L << (T__68 - 26)) | (1L << (T__81 - 26)) | (1L << (T__82 - 26)) | (1L << (T__85 - 26)) | (1L << (T__86 - 26)) | (1L << (T__87 - 26)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__119 - 97)) | (1L << (T__129 - 97)))) != 0)) {
				{
				setState(1506);
				declarations();
				}
			}

			setState(1509);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public ProtocolBodyContext protocolBody() {
			return getRuleContext(ProtocolBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolDeclaration(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1511);
				attributes();
				}
			}

			setState(1515);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1514);
				accessLevelModifier();
				}
			}

			setState(1517);
			match(T__67);
			setState(1518);
			protocolName();
			setState(1520);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1519);
				typeInheritanceClause();
				}
			}

			setState(1522);
			protocolBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolName(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_protocolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolBodyContext extends ParserRuleContext {
		public ProtocolMemberDeclarationsContext protocolMemberDeclarations() {
			return getRuleContext(ProtocolMemberDeclarationsContext.class,0);
		}
		public ProtocolBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolBody(this);
		}
	}

	public final ProtocolBodyContext protocolBody() throws RecognitionException {
		ProtocolBodyContext _localctx = new ProtocolBodyContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_protocolBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			match(T__13);
			setState(1528);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__68 - 65)) | (1L << (T__82 - 65)) | (1L << (T__87 - 65)) | (1L << (T__96 - 65)))) != 0)) {
				{
				setState(1527);
				protocolMemberDeclarations();
				}
			}

			setState(1530);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMemberDeclarationContext extends ParserRuleContext {
		public ProtocolPropertyDeclarationContext protocolPropertyDeclaration() {
			return getRuleContext(ProtocolPropertyDeclarationContext.class,0);
		}
		public ProtocolMethodDeclarationContext protocolMethodDeclaration() {
			return getRuleContext(ProtocolMethodDeclarationContext.class,0);
		}
		public ProtocolInitializerDeclarationContext protocolInitializerDeclaration() {
			return getRuleContext(ProtocolInitializerDeclarationContext.class,0);
		}
		public ProtocolSubscriptDeclarationContext protocolSubscriptDeclaration() {
			return getRuleContext(ProtocolSubscriptDeclarationContext.class,0);
		}
		public ProtocolAssociatedTypeDeclarationContext protocolAssociatedTypeDeclaration() {
			return getRuleContext(ProtocolAssociatedTypeDeclarationContext.class,0);
		}
		public ProtocolMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMemberDeclaration(this);
		}
	}

	public final ProtocolMemberDeclarationContext protocolMemberDeclaration() throws RecognitionException {
		ProtocolMemberDeclarationContext _localctx = new ProtocolMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_protocolMemberDeclaration);
		int _la;
		try {
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				protocolPropertyDeclaration();
				setState(1534);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1533);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				protocolMethodDeclaration();
				setState(1538);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1537);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1540);
				protocolInitializerDeclaration();
				setState(1542);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1541);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1544);
				protocolSubscriptDeclaration();
				setState(1546);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1545);
					match(T__0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1548);
				protocolAssociatedTypeDeclaration();
				setState(1550);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1549);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMemberDeclarationsContext extends ParserRuleContext {
		public ProtocolMemberDeclarationContext protocolMemberDeclaration() {
			return getRuleContext(ProtocolMemberDeclarationContext.class,0);
		}
		public ProtocolMemberDeclarationsContext protocolMemberDeclarations() {
			return getRuleContext(ProtocolMemberDeclarationsContext.class,0);
		}
		public ProtocolMemberDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMemberDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMemberDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMemberDeclarations(this);
		}
	}

	public final ProtocolMemberDeclarationsContext protocolMemberDeclarations() throws RecognitionException {
		ProtocolMemberDeclarationsContext _localctx = new ProtocolMemberDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_protocolMemberDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			protocolMemberDeclaration();
			setState(1556);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__68 - 65)) | (1L << (T__82 - 65)) | (1L << (T__87 - 65)) | (1L << (T__96 - 65)))) != 0)) {
				{
				setState(1555);
				protocolMemberDeclarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolPropertyDeclarationContext extends ParserRuleContext {
		public VariableDeclarationHeadContext variableDeclarationHead() {
			return getRuleContext(VariableDeclarationHeadContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public ProtocolPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolPropertyDeclaration(this);
		}
	}

	public final ProtocolPropertyDeclarationContext protocolPropertyDeclaration() throws RecognitionException {
		ProtocolPropertyDeclarationContext _localctx = new ProtocolPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_protocolPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			variableDeclarationHead();
			setState(1559);
			variableName();
			setState(1560);
			typeAnnotation();
			setState(1561);
			getterSetterKeywordBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMethodDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public ProtocolMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMethodDeclaration(this);
		}
	}

	public final ProtocolMethodDeclarationContext protocolMethodDeclaration() throws RecognitionException {
		ProtocolMethodDeclarationContext _localctx = new ProtocolMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_protocolMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			functionHead();
			setState(1564);
			functionName();
			setState(1566);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1565);
				genericParameterClause();
				}
			}

			setState(1568);
			functionSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolInitializerDeclarationContext extends ParserRuleContext {
		public InitializerHeadContext initializerHead() {
			return getRuleContext(InitializerHeadContext.class,0);
		}
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public ProtocolInitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolInitializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolInitializerDeclaration(this);
		}
	}

	public final ProtocolInitializerDeclarationContext protocolInitializerDeclaration() throws RecognitionException {
		ProtocolInitializerDeclarationContext _localctx = new ProtocolInitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_protocolInitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			initializerHead();
			setState(1572);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1571);
				genericParameterClause();
				}
			}

			setState(1574);
			parameterClause();
			setState(1576);
			_la = _input.LA(1);
			if (_la==T__74 || _la==T__75) {
				{
				setState(1575);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolSubscriptDeclarationContext extends ParserRuleContext {
		public SubscriptHeadContext subscriptHead() {
			return getRuleContext(SubscriptHeadContext.class,0);
		}
		public SubscriptResultContext subscriptResult() {
			return getRuleContext(SubscriptResultContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public ProtocolSubscriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolSubscriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolSubscriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolSubscriptDeclaration(this);
		}
	}

	public final ProtocolSubscriptDeclarationContext protocolSubscriptDeclaration() throws RecognitionException {
		ProtocolSubscriptDeclarationContext _localctx = new ProtocolSubscriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_protocolSubscriptDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			subscriptHead();
			setState(1579);
			subscriptResult();
			setState(1580);
			getterSetterKeywordBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolAssociatedTypeDeclarationContext extends ParserRuleContext {
		public TypealiasHeadContext typealiasHead() {
			return getRuleContext(TypealiasHeadContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public TypealiasAssignmentContext typealiasAssignment() {
			return getRuleContext(TypealiasAssignmentContext.class,0);
		}
		public ProtocolAssociatedTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolAssociatedTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolAssociatedTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolAssociatedTypeDeclaration(this);
		}
	}

	public final ProtocolAssociatedTypeDeclarationContext protocolAssociatedTypeDeclaration() throws RecognitionException {
		ProtocolAssociatedTypeDeclarationContext _localctx = new ProtocolAssociatedTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_protocolAssociatedTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			typealiasHead();
			setState(1584);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1583);
				typeInheritanceClause();
				}
			}

			setState(1587);
			_la = _input.LA(1);
			if (_la==T__70) {
				{
				setState(1586);
				typealiasAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerDeclarationContext extends ParserRuleContext {
		public InitializerHeadContext initializerHead() {
			return getRuleContext(InitializerHeadContext.class,0);
		}
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public InitializerBodyContext initializerBody() {
			return getRuleContext(InitializerBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public InitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerDeclaration(this);
		}
	}

	public final InitializerDeclarationContext initializerDeclaration() throws RecognitionException {
		InitializerDeclarationContext _localctx = new InitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			initializerHead();
			setState(1591);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1590);
				genericParameterClause();
				}
			}

			setState(1593);
			parameterClause();
			setState(1595);
			_la = _input.LA(1);
			if (_la==T__74 || _la==T__75) {
				{
				setState(1594);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1597);
			initializerBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public InitializerHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerHead(this);
		}
	}

	public final InitializerHeadContext initializerHead() throws RecognitionException {
		InitializerHeadContext _localctx = new InitializerHeadContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_initializerHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1599);
				attributes();
				}
			}

			setState(1603);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1602);
				declarationModifiers();
				}
			}

			setState(1605);
			match(T__82);
			setState(1607);
			_la = _input.LA(1);
			if (_la==T__83 || _la==T__84) {
				{
				setState(1606);
				_la = _input.LA(1);
				if ( !(_la==T__83 || _la==T__84) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerBodyContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public InitializerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerBody(this);
		}
	}

	public final InitializerBodyContext initializerBody() throws RecognitionException {
		InitializerBodyContext _localctx = new InitializerBodyContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_initializerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeinitializerDeclarationContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeinitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeinitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeinitializerDeclaration(this);
		}
	}

	public final DeinitializerDeclarationContext deinitializerDeclaration() throws RecognitionException {
		DeinitializerDeclarationContext _localctx = new DeinitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_deinitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1611);
				attributes();
				}
			}

			setState(1614);
			match(T__85);
			setState(1615);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionDeclarationContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ExtensionBodyContext extensionBody() {
			return getRuleContext(ExtensionBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public RequirementClauseContext requirementClause() {
			return getRuleContext(RequirementClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ExtensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtensionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtensionDeclaration(this);
		}
	}

	public final ExtensionDeclarationContext extensionDeclaration() throws RecognitionException {
		ExtensionDeclarationContext _localctx = new ExtensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1617);
				attributes();
				}
			}

			setState(1621);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1620);
				accessLevelModifier();
				}
			}

			setState(1623);
			match(T__86);
			setState(1624);
			typeIdentifier();
			setState(1626);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1625);
				requirementClause();
				}
			}

			setState(1629);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1628);
				typeInheritanceClause();
				}
			}

			setState(1631);
			extensionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ExtensionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtensionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtensionBody(this);
		}
	}

	public final ExtensionBodyContext extensionBody() throws RecognitionException {
		ExtensionBodyContext _localctx = new ExtensionBodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_extensionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(T__13);
			setState(1635);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__41 - 26)) | (1L << (T__42 - 26)) | (1L << (T__43 - 26)) | (1L << (T__44 - 26)) | (1L << (T__45 - 26)) | (1L << (T__46 - 26)) | (1L << (T__47 - 26)) | (1L << (T__48 - 26)) | (1L << (T__49 - 26)) | (1L << (T__50 - 26)) | (1L << (T__51 - 26)) | (1L << (T__52 - 26)) | (1L << (T__53 - 26)) | (1L << (T__54 - 26)) | (1L << (T__55 - 26)) | (1L << (T__58 - 26)) | (1L << (T__59 - 26)) | (1L << (T__61 - 26)) | (1L << (T__62 - 26)) | (1L << (T__63 - 26)) | (1L << (T__64 - 26)) | (1L << (T__65 - 26)) | (1L << (T__66 - 26)) | (1L << (T__67 - 26)) | (1L << (T__68 - 26)) | (1L << (T__81 - 26)) | (1L << (T__82 - 26)) | (1L << (T__85 - 26)) | (1L << (T__86 - 26)) | (1L << (T__87 - 26)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__119 - 97)) | (1L << (T__129 - 97)))) != 0)) {
				{
				setState(1634);
				declarations();
				}
			}

			setState(1637);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptDeclarationContext extends ParserRuleContext {
		public SubscriptHeadContext subscriptHead() {
			return getRuleContext(SubscriptHeadContext.class,0);
		}
		public SubscriptResultContext subscriptResult() {
			return getRuleContext(SubscriptResultContext.class,0);
		}
		public GetterSetterBlockContext getterSetterBlock() {
			return getRuleContext(GetterSetterBlockContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SubscriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptDeclaration(this);
		}
	}

	public final SubscriptDeclarationContext subscriptDeclaration() throws RecognitionException {
		SubscriptDeclarationContext _localctx = new SubscriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_subscriptDeclaration);
		try {
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				subscriptHead();
				setState(1640);
				subscriptResult();
				setState(1641);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1643);
				subscriptHead();
				setState(1644);
				subscriptResult();
				setState(1645);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1647);
				subscriptHead();
				setState(1648);
				subscriptResult();
				setState(1649);
				codeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptHeadContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public SubscriptHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptHead(this);
		}
	}

	public final SubscriptHeadContext subscriptHead() throws RecognitionException {
		SubscriptHeadContext _localctx = new SubscriptHeadContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_subscriptHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1653);
				attributes();
				}
			}

			setState(1657);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1656);
				declarationModifiers();
				}
			}

			setState(1659);
			match(T__87);
			setState(1660);
			parameterClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptResultContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SubscriptResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptResult(this);
		}
	}

	public final SubscriptResultContext subscriptResult() throws RecognitionException {
		SubscriptResultContext _localctx = new SubscriptResultContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_subscriptResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(T__76);
			setState(1664);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(1663);
				attributes();
				}
			}

			setState(1666);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorDeclarationContext extends ParserRuleContext {
		public PrefixOperatorDeclarationContext prefixOperatorDeclaration() {
			return getRuleContext(PrefixOperatorDeclarationContext.class,0);
		}
		public PostfixOperatorDeclarationContext postfixOperatorDeclaration() {
			return getRuleContext(PostfixOperatorDeclarationContext.class,0);
		}
		public InfixOperatorDeclarationContext infixOperatorDeclaration() {
			return getRuleContext(InfixOperatorDeclarationContext.class,0);
		}
		public OperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatorDeclaration(this);
		}
	}

	public final OperatorDeclarationContext operatorDeclaration() throws RecognitionException {
		OperatorDeclarationContext _localctx = new OperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_operatorDeclaration);
		try {
			setState(1671);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				prefixOperatorDeclaration();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				postfixOperatorDeclaration();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(1670);
				infixOperatorDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PrefixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefixOperatorDeclaration(this);
		}
	}

	public final PrefixOperatorDeclarationContext prefixOperatorDeclaration() throws RecognitionException {
		PrefixOperatorDeclarationContext _localctx = new PrefixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_prefixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(T__52);
			setState(1674);
			match(T__88);
			setState(1675);
			operator();
			setState(1676);
			match(T__13);
			setState(1677);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixOperatorDeclaration(this);
		}
	}

	public final PostfixOperatorDeclarationContext postfixOperatorDeclaration() throws RecognitionException {
		PostfixOperatorDeclarationContext _localctx = new PostfixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_postfixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(T__51);
			setState(1680);
			match(T__88);
			setState(1681);
			operator();
			setState(1682);
			match(T__13);
			setState(1683);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public InfixOperatorAttributesContext infixOperatorAttributes() {
			return getRuleContext(InfixOperatorAttributesContext.class,0);
		}
		public InfixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfixOperatorDeclaration(this);
		}
	}

	public final InfixOperatorDeclarationContext infixOperatorDeclaration() throws RecognitionException {
		InfixOperatorDeclarationContext _localctx = new InfixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_infixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(T__45);
			setState(1686);
			match(T__88);
			setState(1687);
			operator();
			setState(1688);
			match(T__13);
			setState(1689);
			infixOperatorAttributes();
			setState(1690);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperatorAttributesContext extends ParserRuleContext {
		public PrecedenceClauseContext precedenceClause() {
			return getRuleContext(PrecedenceClauseContext.class,0);
		}
		public AssociativityClauseContext associativityClause() {
			return getRuleContext(AssociativityClauseContext.class,0);
		}
		public InfixOperatorAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfixOperatorAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfixOperatorAttributes(this);
		}
	}

	public final InfixOperatorAttributesContext infixOperatorAttributes() throws RecognitionException {
		InfixOperatorAttributesContext _localctx = new InfixOperatorAttributesContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_infixOperatorAttributes);
		int _la;
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				_la = _input.LA(1);
				if (_la==T__89) {
					{
					setState(1692);
					precedenceClause();
					}
				}

				setState(1696);
				_la = _input.LA(1);
				if (_la==T__90) {
					{
					setState(1695);
					associativityClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				_la = _input.LA(1);
				if (_la==T__90) {
					{
					setState(1698);
					associativityClause();
					}
				}

				setState(1702);
				_la = _input.LA(1);
				if (_la==T__89) {
					{
					setState(1701);
					precedenceClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceClauseContext extends ParserRuleContext {
		public PrecedenceLevelContext precedenceLevel() {
			return getRuleContext(PrecedenceLevelContext.class,0);
		}
		public PrecedenceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceClause(this);
		}
	}

	public final PrecedenceClauseContext precedenceClause() throws RecognitionException {
		PrecedenceClauseContext _localctx = new PrecedenceClauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_precedenceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(T__89);
			setState(1707);
			precedenceLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceLevelContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public PrecedenceLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceLevel(this);
		}
	}

	public final PrecedenceLevelContext precedenceLevel() throws RecognitionException {
		PrecedenceLevelContext _localctx = new PrecedenceLevelContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_precedenceLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityClauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public AssociativityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativityClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativityClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativityClause(this);
		}
	}

	public final AssociativityClauseContext associativityClause() throws RecognitionException {
		AssociativityClauseContext _localctx = new AssociativityClauseContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_associativityClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(T__90);
			setState(1712);
			associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (T__91 - 92)) | (1L << (T__92 - 92)) | (1L << (T__93 - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public IdentifierPatternContext identifierPattern() {
			return getRuleContext(IdentifierPatternContext.class,0);
		}
		public ValueBindingPatternContext valueBindingPattern() {
			return getRuleContext(ValueBindingPatternContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public EnumCasePatternContext enumCasePattern() {
			return getRuleContext(EnumCasePatternContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ExpressionPatternContext expressionPattern() {
			return getRuleContext(ExpressionPatternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1717);
				wildcardPattern();
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1718);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1721);
				identifierPattern();
				setState(1723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1722);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1725);
				valueBindingPattern();
				}
				break;
			case 4:
				{
				setState(1726);
				tuplePattern();
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1727);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1730);
				enumCasePattern();
				}
				break;
			case 6:
				{
				setState(1731);
				match(T__94);
				setState(1732);
				sType(0);
				}
				break;
			case 7:
				{
				setState(1733);
				expressionPattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1736);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1737);
					match(T__95);
					setState(1738);
					sType(0);
					}
					} 
				}
				setState(1743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WildcardPatternContext extends ParserRuleContext {
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcardPattern(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(T__80);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPatternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifierPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifierPattern(this);
		}
	}

	public final IdentifierPatternContext identifierPattern() throws RecognitionException {
		IdentifierPatternContext _localctx = new IdentifierPatternContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_identifierPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueBindingPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ValueBindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueBindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterValueBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitValueBindingPattern(this);
		}
	}

	public final ValueBindingPatternContext valueBindingPattern() throws RecognitionException {
		ValueBindingPatternContext _localctx = new ValueBindingPatternContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_valueBindingPattern);
		try {
			setState(1752);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				match(T__26);
				setState(1749);
				pattern(0);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				match(T__25);
				setState(1751);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternContext extends ParserRuleContext {
		public TuplePatternElementListContext tuplePatternElementList() {
			return getRuleContext(TuplePatternElementListContext.class,0);
		}
		public TuplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuplePattern(this);
		}
	}

	public final TuplePatternContext tuplePattern() throws RecognitionException {
		TuplePatternContext _localctx = new TuplePatternContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(T__3);
			setState(1756);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1755);
				tuplePatternElementList();
				}
			}

			setState(1758);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternElementListContext extends ParserRuleContext {
		public List<TuplePatternElementContext> tuplePatternElement() {
			return getRuleContexts(TuplePatternElementContext.class);
		}
		public TuplePatternElementContext tuplePatternElement(int i) {
			return getRuleContext(TuplePatternElementContext.class,i);
		}
		public TuplePatternElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuplePatternElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuplePatternElementList(this);
		}
	}

	public final TuplePatternElementListContext tuplePatternElementList() throws RecognitionException {
		TuplePatternElementListContext _localctx = new TuplePatternElementListContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_tuplePatternElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			tuplePatternElement();
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1761);
				match(T__15);
				setState(1762);
				tuplePatternElement();
				}
				}
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternElementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TuplePatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuplePatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuplePatternElement(this);
		}
	}

	public final TuplePatternElementContext tuplePatternElement() throws RecognitionException {
		TuplePatternElementContext _localctx = new TuplePatternElementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tuplePatternElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			pattern(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumCasePatternContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public EnumCasePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCasePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumCasePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumCasePattern(this);
		}
	}

	public final EnumCasePatternContext enumCasePattern() throws RecognitionException {
		EnumCasePatternContext _localctx = new EnumCasePatternContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_enumCasePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1770);
				typeIdentifier();
				}
				break;
			}
			setState(1774);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(1773);
				match(T__69);
				}
			}

			setState(1776);
			enumCaseName();
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1777);
				tuplePattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastingPatternContext extends ParserRuleContext {
		public IsPatternContext isPattern() {
			return getRuleContext(IsPatternContext.class,0);
		}
		public AsPatternContext asPattern() {
			return getRuleContext(AsPatternContext.class,0);
		}
		public TypeCastingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeCastingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeCastingPattern(this);
		}
	}

	public final TypeCastingPatternContext typeCastingPattern() throws RecognitionException {
		TypeCastingPatternContext _localctx = new TypeCastingPatternContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_typeCastingPattern);
		try {
			setState(1782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				isPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1781);
				asPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsPatternContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public IsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIsPattern(this);
		}
	}

	public final IsPatternContext isPattern() throws RecognitionException {
		IsPatternContext _localctx = new IsPatternContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_isPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			match(T__94);
			setState(1785);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAsPattern(this);
		}
	}

	public final AsPatternContext asPattern() throws RecognitionException {
		AsPatternContext _localctx = new AsPatternContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_asPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			pattern(0);
			setState(1788);
			match(T__95);
			setState(1789);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPatternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionPattern(this);
		}
	}

	public final ExpressionPatternContext expressionPattern() throws RecognitionException {
		ExpressionPatternContext _localctx = new ExpressionPatternContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_expressionPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			match(T__96);
			setState(1794);
			attributeName();
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1795);
				attributeArgumentClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributeArgumentClause(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(T__3);
			setState(1802);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1801);
				balancedTokens();
				}
			}

			setState(1804);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1806);
				attribute();
				}
				}
				setState(1809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__96 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokensContext extends ParserRuleContext {
		public BalancedTokenContext balancedToken() {
			return getRuleContext(BalancedTokenContext.class,0);
		}
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public BalancedTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalancedTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalancedTokens(this);
		}
	}

	public final BalancedTokensContext balancedTokens() throws RecognitionException {
		BalancedTokensContext _localctx = new BalancedTokensContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_balancedTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			balancedToken();
			setState(1813);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1812);
				balancedTokens();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokenContext extends ParserRuleContext {
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BalancedTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalancedToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalancedToken(this);
		}
	}

	public final BalancedTokenContext balancedToken() throws RecognitionException {
		BalancedTokenContext _localctx = new BalancedTokenContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_balancedToken);
		int _la;
		try {
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1815);
				match(T__3);
				setState(1817);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(1816);
					balancedTokens();
					}
				}

				setState(1819);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1820);
				match(T__97);
				setState(1822);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(1821);
					balancedTokens();
					}
				}

				setState(1824);
				match(T__98);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1825);
				match(T__13);
				setState(1827);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(1826);
					balancedTokens();
					}
				}

				setState(1829);
				match(T__14);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1830);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1831);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1832);
				contextSensitiveKeyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1833);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1834);
				operator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1835);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1836);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1837);
				match(T__15);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1838);
				match(T__84);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1839);
				match(T__38);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1840);
				match(T__39);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1841);
				match(T__99);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1842);
				match(T__100);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1843);
				match(T__101);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1844);
				match(T__77);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1845);
				match(T__102);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			expression();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(1849);
				match(T__15);
				setState(1850);
				expression();
				}
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			_la = _input.LA(1);
			if (_la==T__104) {
				{
				setState(1856);
				tryOperator();
				}
			}

			setState(1859);
			prefixExpression();
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1860);
					binaryExpression();
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public InOutExpressionContext inOutExpression() {
			return getRuleContext(InOutExpressionContext.class,0);
		}
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefixExpression(this);
		}
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_prefixExpression);
		try {
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1866);
					prefixOperator();
					}
					break;
				}
				setState(1869);
				postfixExpression(0);
				setState(1871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1870);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				inOutExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOutExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InOutExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOutExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInOutExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInOutExpression(this);
		}
	}

	public final InOutExpressionContext inOutExpression() throws RecognitionException {
		InOutExpressionContext _localctx = new InOutExpressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_inOutExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(T__103);
			setState(1877);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryOperatorContext extends ParserRuleContext {
		public TryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTryOperator(this);
		}
	}

	public final TryOperatorContext tryOperator() throws RecognitionException {
		TryOperatorContext _localctx = new TryOperatorContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_tryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(T__104);
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1880);
				_la = _input.LA(1);
				if ( !(_la==T__83 || _la==T__84) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionContext extends ParserRuleContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public TypeCastingOperatorContext typeCastingOperator() {
			return getRuleContext(TypeCastingOperatorContext.class,0);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinaryExpression(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_binaryExpression);
		int _la;
		try {
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883);
				binaryOperator();
				setState(1884);
				prefixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				assignmentOperator();
				setState(1888);
				_la = _input.LA(1);
				if (_la==T__104) {
					{
					setState(1887);
					tryOperator();
					}
				}

				setState(1890);
				prefixExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
				conditionalOperator();
				setState(1894);
				_la = _input.LA(1);
				if (_la==T__104) {
					{
					setState(1893);
					tryOperator();
					}
				}

				setState(1896);
				prefixExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1898);
				typeCastingOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(T__70);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_conditionalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			match(T__83);
			setState(1905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1904);
				tryOperator();
				}
				break;
			}
			setState(1907);
			expression();
			setState(1908);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastingOperatorContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public TypeCastingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeCastingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeCastingOperator(this);
		}
	}

	public final TypeCastingOperatorContext typeCastingOperator() throws RecognitionException {
		TypeCastingOperatorContext _localctx = new TypeCastingOperatorContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_typeCastingOperator);
		try {
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
				match(T__94);
				setState(1911);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				match(T__95);
				setState(1913);
				match(T__83);
				setState(1914);
				sType(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1915);
				match(T__95);
				setState(1916);
				sType(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1917);
				match(T__95);
				setState(1918);
				match(T__84);
				setState(1919);
				sType(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public SelfExpressionContext selfExpression() {
			return getRuleContext(SelfExpressionContext.class,0);
		}
		public SuperclassExpressionContext superclassExpression() {
			return getRuleContext(SuperclassExpressionContext.class,0);
		}
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ImplicitMemberExpressionContext implicitMemberExpression() {
			return getRuleContext(ImplicitMemberExpressionContext.class,0);
		}
		public WildcardExpressionContext wildcardExpression() {
			return getRuleContext(WildcardExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryExpression);
		try {
			setState(1936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				switch (_input.LA(1)) {
				case T__30:
				case T__31:
				case T__32:
				case T__34:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__55:
				case T__58:
				case T__60:
				case T__71:
				case T__72:
				case T__73:
				case T__81:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__116:
				case T__117:
				case T__123:
				case T__124:
				case T__125:
				case T__126:
				case T__127:
				case T__128:
				case T__130:
				case Identifier:
					{
					setState(1922);
					identifier();
					}
					break;
				case T__29:
				case T__38:
				case T__39:
				case T__40:
				case T__70:
				case T__77:
				case T__83:
				case T__84:
				case T__99:
				case T__101:
				case T__103:
				case T__114:
				case T__115:
				case OperatorHead:
				case DotOperatorHead:
					{
					setState(1923);
					operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1926);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1929);
				literalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1930);
				selfExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1931);
				superclassExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1932);
				closureExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1933);
				parenthesizedExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1934);
				implicitMemberExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1935);
				wildcardExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public DictionaryLiteralContext dictionaryLiteral() {
			return getRuleContext(DictionaryLiteralContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteralExpression(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_literalExpression);
		try {
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1938);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
				arrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1940);
				dictionaryLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1941);
				match(T__105);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1942);
				match(T__106);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1943);
				match(T__107);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1944);
				match(T__108);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralItemsContext arrayLiteralItems() {
			return getRuleContext(ArrayLiteralItemsContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(T__97);
			setState(1949);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1948);
				arrayLiteralItems();
				}
			}

			setState(1951);
			match(T__98);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralItemsContext extends ParserRuleContext {
		public List<ArrayLiteralItemContext> arrayLiteralItem() {
			return getRuleContexts(ArrayLiteralItemContext.class);
		}
		public ArrayLiteralItemContext arrayLiteralItem(int i) {
			return getRuleContext(ArrayLiteralItemContext.class,i);
		}
		public ArrayLiteralItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayLiteralItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayLiteralItems(this);
		}
	}

	public final ArrayLiteralItemsContext arrayLiteralItems() throws RecognitionException {
		ArrayLiteralItemsContext _localctx = new ArrayLiteralItemsContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_arrayLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			arrayLiteralItem();
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1954);
					match(T__15);
					setState(1955);
					arrayLiteralItem();
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			setState(1962);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(1961);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayLiteralItem(this);
		}
	}

	public final ArrayLiteralItemContext arrayLiteralItem() throws RecognitionException {
		ArrayLiteralItemContext _localctx = new ArrayLiteralItemContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_arrayLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralContext extends ParserRuleContext {
		public DictionaryLiteralItemsContext dictionaryLiteralItems() {
			return getRuleContext(DictionaryLiteralItemsContext.class,0);
		}
		public DictionaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryLiteral(this);
		}
	}

	public final DictionaryLiteralContext dictionaryLiteral() throws RecognitionException {
		DictionaryLiteralContext _localctx = new DictionaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_dictionaryLiteral);
		try {
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1966);
				match(T__97);
				setState(1967);
				dictionaryLiteralItems();
				setState(1968);
				match(T__98);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1970);
				match(T__97);
				setState(1971);
				match(T__1);
				setState(1972);
				match(T__98);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralItemsContext extends ParserRuleContext {
		public List<DictionaryLiteralItemContext> dictionaryLiteralItem() {
			return getRuleContexts(DictionaryLiteralItemContext.class);
		}
		public DictionaryLiteralItemContext dictionaryLiteralItem(int i) {
			return getRuleContext(DictionaryLiteralItemContext.class,i);
		}
		public DictionaryLiteralItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteralItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryLiteralItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryLiteralItems(this);
		}
	}

	public final DictionaryLiteralItemsContext dictionaryLiteralItems() throws RecognitionException {
		DictionaryLiteralItemsContext _localctx = new DictionaryLiteralItemsContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_dictionaryLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			dictionaryLiteralItem();
			setState(1980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1976);
					match(T__15);
					setState(1977);
					dictionaryLiteralItem();
					}
					} 
				}
				setState(1982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			setState(1984);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(1983);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DictionaryLiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteralItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryLiteralItem(this);
		}
	}

	public final DictionaryLiteralItemContext dictionaryLiteralItem() throws RecognitionException {
		DictionaryLiteralItemContext _localctx = new DictionaryLiteralItemContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_dictionaryLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			expression();
			setState(1987);
			match(T__1);
			setState(1988);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelfExpression(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_selfExpression);
		try {
			setState(2002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1990);
				match(T__109);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1991);
				match(T__109);
				setState(1992);
				match(T__69);
				setState(1993);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1994);
				match(T__109);
				setState(1995);
				match(T__97);
				setState(1996);
				expressionList();
				setState(1997);
				match(T__98);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1999);
				match(T__109);
				setState(2000);
				match(T__69);
				setState(2001);
				match(T__82);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassExpressionContext extends ParserRuleContext {
		public SuperclassMethodExpressionContext superclassMethodExpression() {
			return getRuleContext(SuperclassMethodExpressionContext.class,0);
		}
		public SuperclassSubscriptExpressionContext superclassSubscriptExpression() {
			return getRuleContext(SuperclassSubscriptExpressionContext.class,0);
		}
		public SuperclassInitializerExpressionContext superclassInitializerExpression() {
			return getRuleContext(SuperclassInitializerExpressionContext.class,0);
		}
		public SuperclassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassExpression(this);
		}
	}

	public final SuperclassExpressionContext superclassExpression() throws RecognitionException {
		SuperclassExpressionContext _localctx = new SuperclassExpressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_superclassExpression);
		try {
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004);
				superclassMethodExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005);
				superclassSubscriptExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2006);
				superclassInitializerExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassMethodExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SuperclassMethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassMethodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassMethodExpression(this);
		}
	}

	public final SuperclassMethodExpressionContext superclassMethodExpression() throws RecognitionException {
		SuperclassMethodExpressionContext _localctx = new SuperclassMethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_superclassMethodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			match(T__110);
			setState(2010);
			match(T__69);
			setState(2011);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassSubscriptExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperclassSubscriptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassSubscriptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassSubscriptExpression(this);
		}
	}

	public final SuperclassSubscriptExpressionContext superclassSubscriptExpression() throws RecognitionException {
		SuperclassSubscriptExpressionContext _localctx = new SuperclassSubscriptExpressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_superclassSubscriptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			match(T__110);
			setState(2014);
			match(T__97);
			setState(2015);
			expressionList();
			setState(2016);
			match(T__98);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassInitializerExpressionContext extends ParserRuleContext {
		public SuperclassInitializerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassInitializerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassInitializerExpression(this);
		}
	}

	public final SuperclassInitializerExpressionContext superclassInitializerExpression() throws RecognitionException {
		SuperclassInitializerExpressionContext _localctx = new SuperclassInitializerExpressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_superclassInitializerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(T__110);
			setState(2019);
			match(T__69);
			setState(2020);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureExpressionContext extends ParserRuleContext {
		public ClosureSignatureContext closureSignature() {
			return getRuleContext(ClosureSignatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ClosureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureExpression(this);
		}
	}

	public final ClosureExpressionContext closureExpression() throws RecognitionException {
		ClosureExpressionContext _localctx = new ClosureExpressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			match(T__13);
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2023);
				closureSignature();
				}
				break;
			}
			setState(2027);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(2026);
				statements();
				}
			}

			setState(2029);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureSignatureContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public ClosureSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureSignature(this);
		}
	}

	public final ClosureSignatureContext closureSignature() throws RecognitionException {
		ClosureSignatureContext _localctx = new ClosureSignatureContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_closureSignature);
		int _la;
		try {
			setState(2060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				parameterClause();
				setState(2033);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2032);
					functionResult();
					}
				}

				setState(2035);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				identifierList();
				setState(2039);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2038);
					functionResult();
					}
				}

				setState(2041);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2043);
				captureList();
				setState(2044);
				parameterClause();
				setState(2046);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2045);
					functionResult();
					}
				}

				setState(2048);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2050);
				captureList();
				setState(2051);
				identifierList();
				setState(2053);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2052);
					functionResult();
					}
				}

				setState(2055);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2057);
				captureList();
				setState(2058);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListContext extends ParserRuleContext {
		public CaptureListItemsContext captureListItems() {
			return getRuleContext(CaptureListItemsContext.class,0);
		}
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureList(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_captureList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(T__97);
			setState(2063);
			captureListItems();
			setState(2064);
			match(T__98);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListItemsContext extends ParserRuleContext {
		public List<CaptureListItemContext> captureListItem() {
			return getRuleContexts(CaptureListItemContext.class);
		}
		public CaptureListItemContext captureListItem(int i) {
			return getRuleContext(CaptureListItemContext.class,i);
		}
		public CaptureListItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureListItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureListItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureListItems(this);
		}
	}

	public final CaptureListItemsContext captureListItems() throws RecognitionException {
		CaptureListItemsContext _localctx = new CaptureListItemsContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_captureListItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			captureListItem();
			setState(2069);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(2067);
				match(T__15);
				setState(2068);
				captureListItem();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaptureSpecifierContext captureSpecifier() {
			return getRuleContext(CaptureSpecifierContext.class,0);
		}
		public CaptureListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureListItem(this);
		}
	}

	public final CaptureListItemContext captureListItem() throws RecognitionException {
		CaptureListItemContext _localctx = new CaptureListItemContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_captureListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2071);
				captureSpecifier();
				}
				break;
			}
			setState(2074);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureSpecifierContext extends ParserRuleContext {
		public CaptureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureSpecifier(this);
		}
	}

	public final CaptureSpecifierContext captureSpecifier() throws RecognitionException {
		CaptureSpecifierContext _localctx = new CaptureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_captureSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (T__55 - 56)) | (1L << (T__58 - 56)) | (1L << (T__111 - 56)) | (1L << (T__112 - 56)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitMemberExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImplicitMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicitMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicitMemberExpression(this);
		}
	}

	public final ImplicitMemberExpressionContext implicitMemberExpression() throws RecognitionException {
		ImplicitMemberExpressionContext _localctx = new ImplicitMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_implicitMemberExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(T__69);
			setState(2079);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_parenthesizedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			match(T__3);
			setState(2083);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__97 - 70)) | (1L << (T__99 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__114 - 70)) | (1L << (T__115 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__123 - 70)) | (1L << (T__124 - 70)) | (1L << (T__125 - 70)) | (1L << (T__126 - 70)) | (1L << (T__127 - 70)) | (1L << (T__128 - 70)) | (1L << (T__130 - 70)) | (1L << (BooleanLiteral - 70)) | (1L << (NilLiteral - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(2082);
				expressionElementList();
				}
			}

			setState(2085);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementListContext extends ParserRuleContext {
		public List<ExpressionElementContext> expressionElement() {
			return getRuleContexts(ExpressionElementContext.class);
		}
		public ExpressionElementContext expressionElement(int i) {
			return getRuleContext(ExpressionElementContext.class,i);
		}
		public ExpressionElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionElementList(this);
		}
	}

	public final ExpressionElementListContext expressionElementList() throws RecognitionException {
		ExpressionElementListContext _localctx = new ExpressionElementListContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_expressionElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			expressionElement();
			setState(2092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(2088);
				match(T__15);
				setState(2089);
				expressionElement();
				}
				}
				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionElement(this);
		}
	}

	public final ExpressionElementContext expressionElement() throws RecognitionException {
		ExpressionElementContext _localctx = new ExpressionElementContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_expressionElement);
		try {
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2096);
				identifier();
				setState(2097);
				match(T__1);
				setState(2098);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardExpressionContext extends ParserRuleContext {
		public WildcardExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcardExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcardExpression(this);
		}
	}

	public final WildcardExpressionContext wildcardExpression() throws RecognitionException {
		WildcardExpressionContext _localctx = new WildcardExpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_wildcardExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			match(T__80);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplicitMemberExpression1Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DecimalLiteral() { return getToken(SwiftParser.DecimalLiteral, 0); }
		public ExplicitMemberExpression1Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicitMemberExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicitMemberExpression1(this);
		}
	}
	public static class DynamicTypeExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public DynamicTypeExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDynamicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDynamicTypeExpression(this);
		}
	}
	public static class PostfixOperationContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixOperatorContext postfixOperator() {
			return getRuleContext(PostfixOperatorContext.class,0);
		}
		public PostfixOperationContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixOperation(this);
		}
	}
	public static class FunctionCallWithClosureExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallWithClosureExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallWithClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallWithClosureExpression(this);
		}
	}
	public static class InitializerExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public InitializerExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerExpression(this);
		}
	}
	public static class SubscriptExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SubscriptExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptExpression(this);
		}
	}
	public static class ForcedValueExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ForcedValueExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForcedValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForcedValueExpression(this);
		}
	}
	public static class ExplicitMemberExpression2Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public ExplicitMemberExpression2Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicitMemberExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicitMemberExpression2(this);
		}
	}
	public static class FunctionCallExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallExpression(this);
		}
	}
	public static class PostfixSelfExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixSelfExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixSelfExpression(this);
		}
	}
	public static class PrimaryContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimary(this);
		}
	}
	public static class OptionalChainingExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public OptionalChainingExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalChainingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalChainingExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2105);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixOperationContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2107);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2108);
						postfixOperator();
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallWithClosureExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2109);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2111);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(2110);
							parenthesizedExpression();
							}
						}

						setState(2113);
						closureExpression();
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2115);
						parenthesizedExpression();
						}
						break;
					case 4:
						{
						_localctx = new InitializerExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2116);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2117);
						match(T__69);
						setState(2118);
						match(T__82);
						}
						break;
					case 5:
						{
						_localctx = new ExplicitMemberExpression1Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2119);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2120);
						match(T__69);
						setState(2121);
						match(DecimalLiteral);
						}
						break;
					case 6:
						{
						_localctx = new ExplicitMemberExpression2Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2122);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2123);
						match(T__69);
						setState(2124);
						identifier();
						setState(2126);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
						case 1:
							{
							setState(2125);
							genericArgumentClause();
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new PostfixSelfExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2129);
						match(T__69);
						setState(2130);
						match(T__109);
						}
						break;
					case 8:
						{
						_localctx = new DynamicTypeExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2132);
						match(T__69);
						setState(2133);
						match(T__113);
						}
						break;
					case 9:
						{
						_localctx = new SubscriptExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2134);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2135);
						match(T__97);
						setState(2136);
						expressionList();
						setState(2137);
						match(T__98);
						}
						break;
					case 10:
						{
						_localctx = new ForcedValueExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2139);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2140);
						match(T__84);
						}
						break;
					case 11:
						{
						_localctx = new OptionalChainingExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2141);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2142);
						match(T__83);
						}
						break;
					}
					} 
				}
				setState(2147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorHeadContext extends ParserRuleContext {
		public TerminalNode OperatorHead() { return getToken(SwiftParser.OperatorHead, 0); }
		public OperatorHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatorHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatorHead(this);
		}
	}

	public final OperatorHeadContext operatorHead() throws RecognitionException {
		OperatorHeadContext _localctx = new OperatorHeadContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_operatorHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__83 - 71)) | (1L << (T__84 - 71)) | (1L << (T__99 - 71)) | (1L << (T__101 - 71)) | (1L << (T__103 - 71)) | (1L << (T__114 - 71)) | (1L << (T__115 - 71)) | (1L << (OperatorHead - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorCharacterContext extends ParserRuleContext {
		public OperatorHeadContext operatorHead() {
			return getRuleContext(OperatorHeadContext.class,0);
		}
		public TerminalNode OperatorCharacter() { return getToken(SwiftParser.OperatorCharacter, 0); }
		public OperatorCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatorCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatorCharacter(this);
		}
	}

	public final OperatorCharacterContext operatorCharacter() throws RecognitionException {
		OperatorCharacterContext _localctx = new OperatorCharacterContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_operatorCharacter);
		try {
			setState(2152);
			switch (_input.LA(1)) {
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__83:
			case T__84:
			case T__99:
			case T__101:
			case T__103:
			case T__114:
			case T__115:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				operatorHead();
				}
				break;
			case OperatorCharacter:
				enterOuterAlt(_localctx, 2);
				{
				setState(2151);
				match(OperatorCharacter);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorHeadContext operatorHead() {
			return getRuleContext(OperatorHeadContext.class,0);
		}
		public List<OperatorCharacterContext> operatorCharacter() {
			return getRuleContexts(OperatorCharacterContext.class);
		}
		public OperatorCharacterContext operatorCharacter(int i) {
			return getRuleContext(OperatorCharacterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_operator);
		try {
			int _alt;
			setState(2169);
			switch (_input.LA(1)) {
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__83:
			case T__84:
			case T__99:
			case T__101:
			case T__103:
			case T__114:
			case T__115:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2154);
				operatorHead();
				setState(2158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2155);
						operatorCharacter();
						}
						} 
					}
					setState(2160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
				}
				}
				break;
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(2161);
				match(DotOperatorHead);
				setState(2165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2162);
						operatorCharacter();
						}
						} 
					}
					setState(2167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				}
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 3);
				{
				setState(2168);
				match(T__77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinaryOperator(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefixOperator(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_prefixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixOperator(this);
		}
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_postfixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class STypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DictionaryTypeContext dictionaryType() {
			return getRuleContext(DictionaryTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public List<STypeContext> sType() {
			return getRuleContexts(STypeContext.class);
		}
		public STypeContext sType(int i) {
			return getRuleContext(STypeContext.class,i);
		}
		public STypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSType(this);
		}
	}

	public final STypeContext sType() throws RecognitionException {
		return sType(0);
	}

	private STypeContext sType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		STypeContext _localctx = new STypeContext(_ctx, _parentState);
		STypeContext _prevctx = _localctx;
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_sType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2178);
				arrayType();
				}
				break;
			case 2:
				{
				setState(2179);
				dictionaryType();
				}
				break;
			case 3:
				{
				setState(2180);
				typeIdentifier();
				}
				break;
			case 4:
				{
				setState(2181);
				tupleType();
				}
				break;
			case 5:
				{
				setState(2182);
				protocolCompositionType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
					case 1:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2185);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2187);
						_la = _input.LA(1);
						if (_la==T__74) {
							{
							setState(2186);
							match(T__74);
							}
						}

						setState(2189);
						match(T__76);
						setState(2190);
						sType(10);
						}
						break;
					case 2:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2192);
						match(T__75);
						setState(2193);
						match(T__76);
						setState(2194);
						sType(9);
						}
						break;
					case 3:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2196);
						match(T__83);
						}
						break;
					case 4:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2198);
						match(T__84);
						}
						break;
					case 5:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2200);
						match(T__69);
						setState(2201);
						match(T__116);
						}
						break;
					case 6:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2202);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2203);
						match(T__69);
						setState(2204);
						match(T__117);
						}
						break;
					}
					} 
				}
				setState(2209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			match(T__97);
			setState(2211);
			sType(0);
			setState(2212);
			match(T__98);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryTypeContext extends ParserRuleContext {
		public List<STypeContext> sType() {
			return getRuleContexts(STypeContext.class);
		}
		public STypeContext sType(int i) {
			return getRuleContext(STypeContext.class,i);
		}
		public DictionaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryType(this);
		}
	}

	public final DictionaryTypeContext dictionaryType() throws RecognitionException {
		DictionaryTypeContext _localctx = new DictionaryTypeContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_dictionaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			match(T__97);
			setState(2215);
			sType(0);
			setState(2216);
			match(T__1);
			setState(2217);
			sType(0);
			setState(2218);
			match(T__98);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public OptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalType(this);
		}
	}

	public final OptionalTypeContext optionalType() throws RecognitionException {
		OptionalTypeContext _localctx = new OptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_optionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			sType(0);
			setState(2221);
			match(T__83);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitlyUnwrappedOptionalTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ImplicitlyUnwrappedOptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitlyUnwrappedOptionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicitlyUnwrappedOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicitlyUnwrappedOptionalType(this);
		}
	}

	public final ImplicitlyUnwrappedOptionalTypeContext implicitlyUnwrappedOptionalType() throws RecognitionException {
		ImplicitlyUnwrappedOptionalTypeContext _localctx = new ImplicitlyUnwrappedOptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_implicitlyUnwrappedOptionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			sType(0);
			setState(2224);
			match(T__84);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeAnnotation(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_typeAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			match(T__1);
			setState(2228);
			_la = _input.LA(1);
			if (_la==T__96) {
				{
				setState(2227);
				attributes();
				}
			}

			setState(2230);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_typeIdentifier);
		int _la;
		try {
			setState(2244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				typeName();
				setState(2234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2233);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2236);
				typeName();
				setState(2238);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(2237);
					genericArgumentClause();
					}
				}

				setState(2240);
				match(T__69);
				setState(2241);
				typeIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2243);
				match(T__118);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TupleTypeBodyContext tupleTypeBody() {
			return getRuleContext(TupleTypeBodyContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			match(T__3);
			setState(2250);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__71 - 68)) | (1L << (T__72 - 68)) | (1L << (T__73 - 68)) | (1L << (T__78 - 68)) | (1L << (T__81 - 68)) | (1L << (T__88 - 68)) | (1L << (T__89 - 68)) | (1L << (T__90 - 68)) | (1L << (T__91 - 68)) | (1L << (T__92 - 68)) | (1L << (T__93 - 68)) | (1L << (T__96 - 68)) | (1L << (T__97 - 68)) | (1L << (T__116 - 68)) | (1L << (T__117 - 68)) | (1L << (T__118 - 68)) | (1L << (T__123 - 68)) | (1L << (T__124 - 68)) | (1L << (T__125 - 68)) | (1L << (T__126 - 68)) | (1L << (T__127 - 68)) | (1L << (T__128 - 68)) | (1L << (T__130 - 68)))) != 0) || _la==Identifier) {
				{
				setState(2249);
				tupleTypeBody();
				}
			}

			setState(2252);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeBodyContext extends ParserRuleContext {
		public TupleTypeElementListContext tupleTypeElementList() {
			return getRuleContext(TupleTypeElementListContext.class,0);
		}
		public TupleTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleTypeBody(this);
		}
	}

	public final TupleTypeBodyContext tupleTypeBody() throws RecognitionException {
		TupleTypeBodyContext _localctx = new TupleTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_tupleTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			tupleTypeElementList();
			setState(2256);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(2255);
				match(T__77);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementListContext extends ParserRuleContext {
		public TupleTypeElementContext tupleTypeElement() {
			return getRuleContext(TupleTypeElementContext.class,0);
		}
		public TupleTypeElementListContext tupleTypeElementList() {
			return getRuleContext(TupleTypeElementListContext.class,0);
		}
		public TupleTypeElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleTypeElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleTypeElementList(this);
		}
	}

	public final TupleTypeElementListContext tupleTypeElementList() throws RecognitionException {
		TupleTypeElementListContext _localctx = new TupleTypeElementListContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_tupleTypeElementList);
		try {
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2258);
				tupleTypeElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2259);
				tupleTypeElement();
				setState(2260);
				match(T__15);
				setState(2261);
				tupleTypeElementList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TupleTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleTypeElement(this);
		}
	}

	public final TupleTypeElementContext tupleTypeElement() throws RecognitionException {
		TupleTypeElementContext _localctx = new TupleTypeElementContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_tupleTypeElement);
		int _la;
		try {
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2266);
				_la = _input.LA(1);
				if (_la==T__96) {
					{
					setState(2265);
					attributes();
					}
				}

				setState(2269);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(2268);
					match(T__78);
					}
				}

				setState(2271);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2273);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(2272);
					match(T__78);
					}
				}

				setState(2275);
				elementName();
				setState(2276);
				typeAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElementName(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolCompositionTypeContext extends ParserRuleContext {
		public ProtocolIdentifierListContext protocolIdentifierList() {
			return getRuleContext(ProtocolIdentifierListContext.class,0);
		}
		public ProtocolCompositionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolCompositionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolCompositionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolCompositionType(this);
		}
	}

	public final ProtocolCompositionTypeContext protocolCompositionType() throws RecognitionException {
		ProtocolCompositionTypeContext _localctx = new ProtocolCompositionTypeContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_protocolCompositionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			match(T__67);
			setState(2283);
			match(T__38);
			setState(2285);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__31 - 31)) | (1L << (T__32 - 31)) | (1L << (T__34 - 31)) | (1L << (T__42 - 31)) | (1L << (T__43 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__46 - 31)) | (1L << (T__47 - 31)) | (1L << (T__48 - 31)) | (1L << (T__49 - 31)) | (1L << (T__50 - 31)) | (1L << (T__51 - 31)) | (1L << (T__52 - 31)) | (1L << (T__53 - 31)) | (1L << (T__55 - 31)) | (1L << (T__58 - 31)) | (1L << (T__60 - 31)) | (1L << (T__71 - 31)) | (1L << (T__72 - 31)) | (1L << (T__73 - 31)) | (1L << (T__81 - 31)) | (1L << (T__88 - 31)) | (1L << (T__89 - 31)) | (1L << (T__90 - 31)) | (1L << (T__91 - 31)) | (1L << (T__92 - 31)) | (1L << (T__93 - 31)))) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (T__116 - 117)) | (1L << (T__117 - 117)) | (1L << (T__118 - 117)) | (1L << (T__123 - 117)) | (1L << (T__124 - 117)) | (1L << (T__125 - 117)) | (1L << (T__126 - 117)) | (1L << (T__127 - 117)) | (1L << (T__128 - 117)) | (1L << (T__130 - 117)) | (1L << (Identifier - 117)))) != 0)) {
				{
				setState(2284);
				protocolIdentifierList();
				}
			}

			setState(2287);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolIdentifierListContext extends ParserRuleContext {
		public ProtocolIdentifierContext protocolIdentifier() {
			return getRuleContext(ProtocolIdentifierContext.class,0);
		}
		public ProtocolIdentifierListContext protocolIdentifierList() {
			return getRuleContext(ProtocolIdentifierListContext.class,0);
		}
		public ProtocolIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolIdentifierList(this);
		}
	}

	public final ProtocolIdentifierListContext protocolIdentifierList() throws RecognitionException {
		ProtocolIdentifierListContext _localctx = new ProtocolIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_protocolIdentifierList);
		try {
			setState(2294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2289);
				protocolIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2290);
				protocolIdentifier();
				setState(2291);
				match(T__15);
				setState(2292);
				protocolIdentifierList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolIdentifierContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolIdentifier(this);
		}
	}

	public final ProtocolIdentifierContext protocolIdentifier() throws RecognitionException {
		ProtocolIdentifierContext _localctx = new ProtocolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_protocolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetatypeTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public MetatypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metatypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterMetatypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitMetatypeType(this);
		}
	}

	public final MetatypeTypeContext metatypeType() throws RecognitionException {
		MetatypeTypeContext _localctx = new MetatypeTypeContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_metatypeType);
		try {
			setState(2306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2298);
				sType(0);
				setState(2299);
				match(T__69);
				setState(2300);
				match(T__116);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2302);
				sType(0);
				setState(2303);
				match(T__69);
				setState(2304);
				match(T__117);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInheritanceClauseContext extends ParserRuleContext {
		public ClassRequirementContext classRequirement() {
			return getRuleContext(ClassRequirementContext.class,0);
		}
		public TypeInheritanceListContext typeInheritanceList() {
			return getRuleContext(TypeInheritanceListContext.class,0);
		}
		public TypeInheritanceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeInheritanceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeInheritanceClause(this);
		}
	}

	public final TypeInheritanceClauseContext typeInheritanceClause() throws RecognitionException {
		TypeInheritanceClauseContext _localctx = new TypeInheritanceClauseContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_typeInheritanceClause);
		try {
			setState(2317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2308);
				match(T__1);
				setState(2309);
				classRequirement();
				setState(2310);
				match(T__15);
				setState(2311);
				typeInheritanceList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2313);
				match(T__1);
				setState(2314);
				classRequirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2315);
				match(T__1);
				setState(2316);
				typeInheritanceList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInheritanceListContext extends ParserRuleContext {
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public TypeInheritanceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeInheritanceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeInheritanceList(this);
		}
	}

	public final TypeInheritanceListContext typeInheritanceList() throws RecognitionException {
		TypeInheritanceListContext _localctx = new TypeInheritanceListContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_typeInheritanceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			typeIdentifier();
			setState(2324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(2320);
				match(T__15);
				setState(2321);
				typeIdentifier();
				}
				}
				setState(2326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassRequirementContext extends ParserRuleContext {
		public ClassRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassRequirement(this);
		}
	}

	public final ClassRequirementContext classRequirement() throws RecognitionException {
		ClassRequirementContext _localctx = new ClassRequirementContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_classRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			match(T__41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilerControlStatementContext extends ParserRuleContext {
		public BuildConfigurationStatementContext buildConfigurationStatement() {
			return getRuleContext(BuildConfigurationStatementContext.class,0);
		}
		public LineControlStatementContext lineControlStatement() {
			return getRuleContext(LineControlStatementContext.class,0);
		}
		public CompilerControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCompilerControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCompilerControlStatement(this);
		}
	}

	public final CompilerControlStatementContext compilerControlStatement() throws RecognitionException {
		CompilerControlStatementContext _localctx = new CompilerControlStatementContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_compilerControlStatement);
		try {
			setState(2331);
			switch (_input.LA(1)) {
			case T__119:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				buildConfigurationStatement();
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 2);
				{
				setState(2330);
				lineControlStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationStatementContext extends ParserRuleContext {
		public BuildConfigurationContext buildConfiguration() {
			return getRuleContext(BuildConfigurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuildConfigurationElseIfClausesContext buildConfigurationElseIfClauses() {
			return getRuleContext(BuildConfigurationElseIfClausesContext.class,0);
		}
		public BuildConfigurationElseClauseContext buildConfigurationElseClause() {
			return getRuleContext(BuildConfigurationElseClauseContext.class,0);
		}
		public BuildConfigurationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationStatement(this);
		}
	}

	public final BuildConfigurationStatementContext buildConfigurationStatement() throws RecognitionException {
		BuildConfigurationStatementContext _localctx = new BuildConfigurationStatementContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_buildConfigurationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			match(T__119);
			setState(2334);
			buildConfiguration(0);
			setState(2336);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(2335);
				statements();
				}
			}

			setState(2339);
			_la = _input.LA(1);
			if (_la==T__121) {
				{
				setState(2338);
				buildConfigurationElseIfClauses();
				}
			}

			setState(2342);
			_la = _input.LA(1);
			if (_la==T__122) {
				{
				setState(2341);
				buildConfigurationElseClause();
				}
			}

			setState(2344);
			match(T__120);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationElseIfClausesContext extends ParserRuleContext {
		public List<BuildConfigurationElseIfClauseContext> buildConfigurationElseIfClause() {
			return getRuleContexts(BuildConfigurationElseIfClauseContext.class);
		}
		public BuildConfigurationElseIfClauseContext buildConfigurationElseIfClause(int i) {
			return getRuleContext(BuildConfigurationElseIfClauseContext.class,i);
		}
		public BuildConfigurationElseIfClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationElseIfClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationElseIfClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationElseIfClauses(this);
		}
	}

	public final BuildConfigurationElseIfClausesContext buildConfigurationElseIfClauses() throws RecognitionException {
		BuildConfigurationElseIfClausesContext _localctx = new BuildConfigurationElseIfClausesContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_buildConfigurationElseIfClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2346);
				buildConfigurationElseIfClause();
				}
				}
				setState(2349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__121 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationElseIfClauseContext extends ParserRuleContext {
		public BuildConfigurationContext buildConfiguration() {
			return getRuleContext(BuildConfigurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuildConfigurationElseIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationElseIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationElseIfClause(this);
		}
	}

	public final BuildConfigurationElseIfClauseContext buildConfigurationElseIfClause() throws RecognitionException {
		BuildConfigurationElseIfClauseContext _localctx = new BuildConfigurationElseIfClauseContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_buildConfigurationElseIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			match(T__121);
			setState(2352);
			buildConfiguration(0);
			setState(2354);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(2353);
				statements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationElseClauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuildConfigurationElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationElseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationElseClause(this);
		}
	}

	public final BuildConfigurationElseClauseContext buildConfigurationElseClause() throws RecognitionException {
		BuildConfigurationElseClauseContext _localctx = new BuildConfigurationElseClauseContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_buildConfigurationElseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(T__122);
			setState(2358);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__99 - 64)) | (1L << (T__101 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__119 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(2357);
				statements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationContext extends ParserRuleContext {
		public List<BuildConfigurationContext> buildConfiguration() {
			return getRuleContexts(BuildConfigurationContext.class);
		}
		public BuildConfigurationContext buildConfiguration(int i) {
			return getRuleContext(BuildConfigurationContext.class,i);
		}
		public PlatformTestingFunctionContext platformTestingFunction() {
			return getRuleContext(PlatformTestingFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BuildConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfiguration(this);
		}
	}

	public final BuildConfigurationContext buildConfiguration() throws RecognitionException {
		return buildConfiguration(0);
	}

	private BuildConfigurationContext buildConfiguration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BuildConfigurationContext _localctx = new BuildConfigurationContext(_ctx, _parentState);
		BuildConfigurationContext _prevctx = _localctx;
		int _startState = 476;
		enterRecursionRule(_localctx, 476, RULE_buildConfiguration, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2361);
				match(T__84);
				setState(2362);
				buildConfiguration(2);
				}
				break;
			case 2:
				{
				setState(2363);
				platformTestingFunction();
				}
				break;
			case 3:
				{
				setState(2364);
				identifier();
				}
				break;
			case 4:
				{
				setState(2365);
				booleanLiteral();
				}
				break;
			case 5:
				{
				setState(2366);
				match(T__3);
				setState(2367);
				buildConfiguration(0);
				setState(2368);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BuildConfigurationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_buildConfiguration);
					setState(2372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2373);
					_la = _input.LA(1);
					if ( !(_la==T__114 || _la==T__115) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2374);
					buildConfiguration(2);
					}
					} 
				}
				setState(2379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlatformTestingFunctionContext extends ParserRuleContext {
		public OperatingSystemContext operatingSystem() {
			return getRuleContext(OperatingSystemContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public PlatformTestingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformTestingFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformTestingFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformTestingFunction(this);
		}
	}

	public final PlatformTestingFunctionContext platformTestingFunction() throws RecognitionException {
		PlatformTestingFunctionContext _localctx = new PlatformTestingFunctionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_platformTestingFunction);
		try {
			setState(2390);
			switch (_input.LA(1)) {
			case T__123:
				enterOuterAlt(_localctx, 1);
				{
				setState(2380);
				match(T__123);
				setState(2381);
				match(T__3);
				setState(2382);
				operatingSystem();
				setState(2383);
				match(T__4);
				}
				break;
			case T__124:
				enterOuterAlt(_localctx, 2);
				{
				setState(2385);
				match(T__124);
				setState(2386);
				match(T__3);
				setState(2387);
				architecture();
				setState(2388);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatingSystemContext extends ParserRuleContext {
		public OperatingSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatingSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatingSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatingSystem(this);
		}
	}

	public final OperatingSystemContext operatingSystem() throws RecognitionException {
		OperatingSystemContext _localctx = new OperatingSystemContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_operatingSystem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchitectureContext extends ParserRuleContext {
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArchitecture(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (T__125 - 126)) | (1L << (T__126 - 126)) | (1L << (T__127 - 126)) | (1L << (T__128 - 126)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineControlStatementContext extends ParserRuleContext {
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public LineControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLineControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLineControlStatement(this);
		}
	}

	public final LineControlStatementContext lineControlStatement() throws RecognitionException {
		LineControlStatementContext _localctx = new LineControlStatementContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_lineControlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			match(T__129);
			setState(2400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2397);
				lineNumber();
				setState(2398);
				fileName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineNumberContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LineNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLineNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLineNumber(this);
		}
	}

	public final LineNumberContext lineNumber() throws RecognitionException {
		LineNumberContext _localctx = new LineNumberContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SwiftParser.StringLiteral, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2404);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SwiftParser.Identifier, 0); }
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_identifier);
		try {
			setState(2408);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				match(Identifier);
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__116:
			case T__117:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__130:
				enterOuterAlt(_localctx, 2);
				{
				setState(2407);
				contextSensitiveKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__41) | (1L << T__42) | (1L << T__54))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__82 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__113 - 64)) | (1L << (T__116 - 64)) | (1L << (T__118 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextSensitiveKeywordContext extends ParserRuleContext {
		public ContextSensitiveKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextSensitiveKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContextSensitiveKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContextSensitiveKeyword(this);
		}
	}

	public final ContextSensitiveKeywordContext contextSensitiveKeyword() throws RecognitionException {
		ContextSensitiveKeywordContext _localctx = new ContextSensitiveKeywordContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_contextSensitiveKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (T__81 - 72)) | (1L << (T__88 - 72)) | (1L << (T__89 - 72)) | (1L << (T__90 - 72)) | (1L << (T__91 - 72)) | (1L << (T__92 - 72)) | (1L << (T__93 - 72)) | (1L << (T__116 - 72)) | (1L << (T__117 - 72)) | (1L << (T__123 - 72)) | (1L << (T__124 - 72)) | (1L << (T__125 - 72)) | (1L << (T__126 - 72)) | (1L << (T__127 - 72)) | (1L << (T__128 - 72)) | (1L << (T__130 - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__116:
			case T__117:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__130:
			case Identifier:
				{
				setState(2414);
				identifier();
				}
				break;
			case T__80:
				{
				setState(2415);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(2418);
				match(T__15);
				setState(2421);
				switch (_input.LA(1)) {
				case T__30:
				case T__31:
				case T__32:
				case T__34:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__55:
				case T__58:
				case T__60:
				case T__71:
				case T__72:
				case T__73:
				case T__81:
				case T__88:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__116:
				case T__117:
				case T__123:
				case T__124:
				case T__125:
				case T__126:
				case T__127:
				case T__128:
				case T__130:
				case Identifier:
					{
					setState(2419);
					identifier();
					}
					break;
				case T__80:
					{
					setState(2420);
					match(T__80);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(2427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SwiftParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SwiftParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SwiftParser.BooleanLiteral, 0); }
		public TerminalNode NilLiteral() { return getToken(SwiftParser.NilLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_literal);
		try {
			setState(2434);
			switch (_input.LA(1)) {
			case T__99:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2430);
				numericLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2431);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2432);
				match(BooleanLiteral);
				}
				break;
			case NilLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2433);
				match(NilLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(SwiftParser.FloatingPointLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_numericLiteral);
		int _la;
		try {
			setState(2444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2437);
				_la = _input.LA(1);
				if (_la==T__99) {
					{
					setState(2436);
					match(T__99);
					}
				}

				setState(2439);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441);
				_la = _input.LA(1);
				if (_la==T__99) {
					{
					setState(2440);
					match(T__99);
					}
				}

				setState(2443);
				match(FloatingPointLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode BinaryLiteral() { return getToken(SwiftParser.BinaryLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(SwiftParser.OctalLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(SwiftParser.DecimalLiteral, 0); }
		public TerminalNode HexadecimalLiteral() { return getToken(SwiftParser.HexadecimalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (BinaryLiteral - 139)) | (1L << (OctalLiteral - 139)) | (1L << (DecimalLiteral - 139)) | (1L << (HexadecimalLiteral - 139)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 155:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 206:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 213:
			return sType_sempred((STypeContext)_localctx, predIndex);
		case 238:
			return buildConfiguration_sempred((BuildConfigurationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sType_sempred(STypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean buildConfiguration_sempred(BuildConfigurationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0097\u0993\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\3\2\3\2\7\2\u01ff\n\2\f\2\16\2\u0202\13\2\3\2\3\2\3\3\3\3\5\3\u0208\n"+
		"\3\3\3\3\3\5\3\u020c\n\3\3\3\3\3\5\3\u0210\n\3\3\3\3\3\3\3\5\3\u0215\n"+
		"\3\3\3\3\3\5\3\u0219\n\3\3\3\3\3\5\3\u021d\n\3\3\3\3\3\5\3\u0221\n\3\3"+
		"\3\3\3\5\3\u0225\n\3\5\3\u0227\n\3\3\4\6\4\u022a\n\4\r\4\16\4\u022b\3"+
		"\5\3\5\3\5\3\5\5\5\u0232\n\5\3\6\3\6\5\6\u0236\n\6\3\6\3\6\5\6\u023a\n"+
		"\6\3\6\3\6\5\6\u023e\n\6\3\6\3\6\3\6\3\6\5\6\u0244\n\6\3\6\3\6\5\6\u0248"+
		"\n\6\3\6\3\6\5\6\u024c\n\6\3\6\3\6\5\6\u0250\n\6\3\7\3\7\5\7\u0254\n\7"+
		"\3\b\3\b\5\b\u0258\n\b\3\b\3\b\3\b\3\b\5\b\u025e\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u026e\n\13\3\f\3\f\3\f"+
		"\3\f\5\f\u0274\n\f\3\r\3\r\3\r\3\r\5\r\u027a\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\5\17\u0285\n\17\3\17\3\17\3\20\3\20\5\20\u028b"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0299\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u02a2\n\23\f\23\16"+
		"\23\u02a5\13\23\3\24\3\24\5\24\u02a9\n\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u02b4\n\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u02c0\n\31\3\32\3\32\5\32\u02c4\n\32\3\33\3\33\5\33\u02c8"+
		"\n\33\3\34\3\34\3\35\3\35\5\35\u02ce\n\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \5 \u02d9\n \3!\3!\5!\u02dd\n!\3\"\3\"\5\"\u02e1\n\"\3\"\5\""+
		"\u02e4\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02f2\n#\3$\3$\3$"+
		"\7$\u02f7\n$\f$\16$\u02fa\13$\3%\3%\3%\5%\u02ff\n%\3&\3&\3&\3&\5&\u0305"+
		"\n&\3\'\3\'\3\'\5\'\u030a\n\'\3\'\5\'\u030d\n\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u0317\n(\3)\3)\3)\7)\u031c\n)\f)\16)\u031f\13)\3*\3*\3*\3*\5*\u0325"+
		"\n*\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\7.\u0334\n.\f.\16.\u0337\13"+
		".\3/\3/\3/\3/\5/\u033d\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\5\62\u0346"+
		"\n\62\3\62\3\62\3\63\3\63\3\63\7\63\u034d\n\63\f\63\16\63\u0350\13\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u035b\n\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\7\66\u0363\n\66\f\66\16\66\u0366\13\66\3\67\3\67"+
		"\5\67\u036a\n\67\38\38\38\38\38\38\38\38\58\u0374\n8\39\39\39\39\3:\3"+
		":\3:\3:\3;\3;\3;\7;\u0381\n;\f;\16;\u0384\13;\3<\3<\3=\3=\5=\u038a\n="+
		"\3=\3=\5=\u038e\n=\3=\3=\5=\u0392\n=\3=\3=\5=\u0396\n=\3=\3=\5=\u039a"+
		"\n=\3=\3=\5=\u039e\n=\3=\3=\5=\u03a2\n=\3=\3=\5=\u03a6\n=\3=\3=\5=\u03aa"+
		"\n=\3=\3=\5=\u03ae\n=\3=\3=\5=\u03b2\n=\3=\3=\5=\u03b6\n=\3=\3=\5=\u03ba"+
		"\n=\3=\3=\5=\u03be\n=\3=\3=\5=\u03c2\n=\5=\u03c4\n=\3>\3>\5>\u03c8\n>"+
		"\3?\3?\5?\u03cc\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03e7\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\5A\u03f8\nA\3B\3B\5B\u03fc\nB\3C\3C\5C\u0400\nC\3C\3C\3D"+
		"\5D\u0405\nD\3D\3D\5D\u0409\nD\3D\3D\3E\3E\3F\3F\3F\3F\3F\5F\u0414\nF"+
		"\3G\3G\5G\u0418\nG\3H\5H\u041b\nH\3H\5H\u041e\nH\3H\3H\3H\3I\3I\3I\7I"+
		"\u0426\nI\fI\16I\u0429\13I\3J\3J\5J\u042d\nJ\3K\3K\3K\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0445\nL\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\5L\u0451\nL\3M\5M\u0454\nM\3M\5M\u0457\nM\3M\3M\3N\3N\3"+
		"O\3O\3O\5O\u0460\nO\3O\3O\3O\3O\3O\3O\3O\5O\u0469\nO\3P\5P\u046c\nP\3"+
		"P\3P\3P\3Q\5Q\u0472\nQ\3Q\3Q\5Q\u0476\nQ\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\5"+
		"S\u0481\nS\3S\3S\3S\3S\3S\3S\3S\5S\u048a\nS\3T\5T\u048d\nT\3T\3T\3U\5"+
		"U\u0492\nU\3U\3U\3V\3V\3V\5V\u0499\nV\3V\3V\3V\3V\3V\5V\u04a0\nV\3V\3"+
		"V\5V\u04a4\nV\3W\5W\u04a7\nW\3W\3W\5W\u04ab\nW\3W\3W\3X\5X\u04b0\nX\3"+
		"X\3X\5X\u04b4\nX\3X\3X\3Y\3Y\3Y\3Z\5Z\u04bc\nZ\3Z\5Z\u04bf\nZ\3Z\3Z\3"+
		"Z\3[\3[\3\\\3\\\3\\\3]\3]\3]\5]\u04cc\n]\3]\3]\3]\3]\3]\3]\5]\u04d4\n"+
		"]\3]\3]\5]\u04d8\n]\3^\5^\u04db\n^\3^\5^\u04de\n^\3^\3^\3_\3_\5_\u04e4"+
		"\n_\3`\3`\5`\u04e8\n`\3`\5`\u04eb\n`\3a\3a\5a\u04ef\na\3a\3a\3b\3b\3c"+
		"\3c\5c\u04f7\nc\3d\3d\3d\3d\3d\5d\u04fe\nd\3d\3d\5d\u0502\nd\3e\3e\3e"+
		"\7e\u0507\ne\fe\16e\u050a\13e\3f\5f\u050d\nf\3f\5f\u0510\nf\3f\5f\u0513"+
		"\nf\3f\5f\u0516\nf\3f\5f\u0519\nf\3f\3f\5f\u051d\nf\3f\5f\u0520\nf\3f"+
		"\5f\u0523\nf\3f\3f\5f\u0527\nf\3f\5f\u052a\nf\3f\3f\5f\u052e\nf\3f\5f"+
		"\u0531\nf\3f\5f\u0534\nf\3f\3f\5f\u0538\nf\3f\3f\3f\3f\5f\u053e\nf\3g"+
		"\3g\5g\u0542\ng\3h\3h\5h\u0546\nh\3i\3i\3i\3j\5j\u054c\nj\3j\5j\u054f"+
		"\nj\3j\3j\3k\3k\5k\u0555\nk\3l\5l\u0558\nl\3l\3l\3l\5l\u055d\nl\3l\5l"+
		"\u0560\nl\3l\3l\5l\u0564\nl\3l\3l\3m\3m\5m\u056a\nm\3n\3n\3n\5n\u056f"+
		"\nn\5n\u0571\nn\3o\5o\u0574\no\3o\5o\u0577\no\3o\3o\3o\3p\3p\3p\7p\u057f"+
		"\np\fp\16p\u0582\13p\3q\3q\5q\u0586\nq\3r\3r\3s\3s\3t\3t\3t\5t\u058f\n"+
		"t\3t\5t\u0592\nt\3t\3t\5t\u0596\nt\3t\3t\3u\3u\5u\u059c\nu\3v\3v\5v\u05a0"+
		"\nv\3w\5w\u05a3\nw\3w\3w\3w\3x\3x\3x\7x\u05ab\nx\fx\16x\u05ae\13x\3y\3"+
		"y\5y\u05b2\ny\3z\3z\3z\3{\5{\u05b8\n{\3{\5{\u05bb\n{\3{\3{\3{\5{\u05c0"+
		"\n{\3{\5{\u05c3\n{\3{\3{\3|\3|\3}\3}\5}\u05cb\n}\3}\3}\3~\5~\u05d0\n~"+
		"\3~\7~\u05d3\n~\f~\16~\u05d6\13~\3~\3~\3~\5~\u05db\n~\3~\5~\u05de\n~\3"+
		"~\3~\3\177\3\177\3\u0080\3\u0080\5\u0080\u05e6\n\u0080\3\u0080\3\u0080"+
		"\3\u0081\5\u0081\u05eb\n\u0081\3\u0081\5\u0081\u05ee\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u05f3\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3"+
		"\u0083\3\u0083\5\u0083\u05fb\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084\5"+
		"\u0084\u0601\n\u0084\3\u0084\3\u0084\5\u0084\u0605\n\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0609\n\u0084\3\u0084\3\u0084\5\u0084\u060d\n\u0084\3\u0084\3"+
		"\u0084\5\u0084\u0611\n\u0084\5\u0084\u0613\n\u0084\3\u0085\3\u0085\5\u0085"+
		"\u0617\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0621\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088"+
		"\u0627\n\u0088\3\u0088\3\u0088\5\u0088\u062b\n\u0088\3\u0089\3\u0089\3"+
		"\u0089\3\u0089\3\u008a\3\u008a\5\u008a\u0633\n\u008a\3\u008a\5\u008a\u0636"+
		"\n\u008a\3\u008b\3\u008b\5\u008b\u063a\n\u008b\3\u008b\3\u008b\5\u008b"+
		"\u063e\n\u008b\3\u008b\3\u008b\3\u008c\5\u008c\u0643\n\u008c\3\u008c\5"+
		"\u008c\u0646\n\u008c\3\u008c\3\u008c\5\u008c\u064a\n\u008c\3\u008d\3\u008d"+
		"\3\u008e\5\u008e\u064f\n\u008e\3\u008e\3\u008e\3\u008e\3\u008f\5\u008f"+
		"\u0655\n\u008f\3\u008f\5\u008f\u0658\n\u008f\3\u008f\3\u008f\3\u008f\5"+
		"\u008f\u065d\n\u008f\3\u008f\5\u008f\u0660\n\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\5\u0090\u0666\n\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u0676\n\u0091\3\u0092\5\u0092\u0679\n\u0092\3\u0092\5\u0092\u067c"+
		"\n\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093\u0683\n\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u068a\n\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\5\u0098\u06a0\n\u0098\3\u0098\5\u0098\u06a3\n\u0098\3\u0098\5"+
		"\u0098\u06a6\n\u0098\3\u0098\5\u0098\u06a9\n\u0098\5\u0098\u06ab\n\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u06ba\n\u009d\3\u009d\3\u009d"+
		"\5\u009d\u06be\n\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u06c3\n\u009d\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u06c9\n\u009d\3\u009d\3\u009d\3"+
		"\u009d\7\u009d\u06ce\n\u009d\f\u009d\16\u009d\u06d1\13\u009d\3\u009e\3"+
		"\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u06db\n"+
		"\u00a0\3\u00a1\3\u00a1\5\u00a1\u06df\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a2\7\u00a2\u06e6\n\u00a2\f\u00a2\16\u00a2\u06e9\13\u00a2\3"+
		"\u00a3\3\u00a3\3\u00a4\5\u00a4\u06ee\n\u00a4\3\u00a4\5\u00a4\u06f1\n\u00a4"+
		"\3\u00a4\3\u00a4\5\u00a4\u06f5\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u06f9\n"+
		"\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0707\n\u00a9\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\5\u00ab\u070d\n\u00ab\3\u00ab\3\u00ab\3\u00ac\6\u00ac"+
		"\u0712\n\u00ac\r\u00ac\16\u00ac\u0713\3\u00ad\3\u00ad\5\u00ad\u0718\n"+
		"\u00ad\3\u00ae\3\u00ae\5\u00ae\u071c\n\u00ae\3\u00ae\3\u00ae\3\u00ae\5"+
		"\u00ae\u0721\n\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0726\n\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0739"+
		"\n\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u073e\n\u00af\f\u00af\16\u00af"+
		"\u0741\13\u00af\3\u00b0\5\u00b0\u0744\n\u00b0\3\u00b0\3\u00b0\7\u00b0"+
		"\u0748\n\u00b0\f\u00b0\16\u00b0\u074b\13\u00b0\3\u00b1\5\u00b1\u074e\n"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u0752\n\u00b1\3\u00b1\5\u00b1\u0755\n\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u075c\n\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0763\n\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\5\u00b4\u0769\n\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4"+
		"\u076e\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\5\u00b6\u0774\n\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0783\n\u00b7\3\u00b8\3\u00b8"+
		"\5\u00b8\u0787\n\u00b8\3\u00b8\5\u00b8\u078a\n\u00b8\3\u00b8\3\u00b8\3"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0793\n\u00b8\3\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u079c\n\u00b9\3"+
		"\u00ba\3\u00ba\5\u00ba\u07a0\n\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3"+
		"\u00bb\7\u00bb\u07a7\n\u00bb\f\u00bb\16\u00bb\u07aa\13\u00bb\3\u00bb\5"+
		"\u00bb\u07ad\n\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u07b8\n\u00bd\3\u00be\3\u00be\3\u00be\7"+
		"\u00be\u07bd\n\u00be\f\u00be\16\u00be\u07c0\13\u00be\3\u00be\5\u00be\u07c3"+
		"\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u07d5\n\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07da\n\u00c1\3\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\5\u00c5\u07eb\n\u00c5\3\u00c5"+
		"\5\u00c5\u07ee\n\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\5\u00c6\u07f4\n"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u07fa\n\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0801\n\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u0808\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u080f\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c8\3\u00c8\3\u00c8\5\u00c8\u0818\n\u00c8\3\u00c9\5\u00c9\u081b\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\5\u00cc\u0826\n\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\7\u00cd"+
		"\u082d\n\u00cd\f\u00cd\16\u00cd\u0830\13\u00cd\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0837\n\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0842\n\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0851\n\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0862\n\u00d0\f\u00d0\16\u00d0\u0865"+
		"\13\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\5\u00d2\u086b\n\u00d2\3\u00d3"+
		"\3\u00d3\7\u00d3\u086f\n\u00d3\f\u00d3\16\u00d3\u0872\13\u00d3\3\u00d3"+
		"\3\u00d3\7\u00d3\u0876\n\u00d3\f\u00d3\16\u00d3\u0879\13\u00d3\3\u00d3"+
		"\5\u00d3\u087c\n\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u088a\n\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u088e\n\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u08a0\n\u00d7\f\u00d7\16\u00d7\u08a3"+
		"\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\5\u00dc\u08b7\n\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\5\u00dd"+
		"\u08bd\n\u00dd\3\u00dd\3\u00dd\5\u00dd\u08c1\n\u00dd\3\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\5\u00dd\u08c7\n\u00dd\3\u00de\3\u00de\3\u00df\3\u00df\5"+
		"\u00df\u08cd\n\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\5\u00e0\u08d3\n\u00e0"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u08da\n\u00e1\3\u00e2"+
		"\5\u00e2\u08dd\n\u00e2\3\u00e2\5\u00e2\u08e0\n\u00e2\3\u00e2\3\u00e2\5"+
		"\u00e2\u08e4\n\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u08e9\n\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u08f0\n\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u08f9\n\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\5\u00e7\u0905\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0910\n\u00e8\3\u00e9\3\u00e9\3\u00e9"+
		"\7\u00e9\u0915\n\u00e9\f\u00e9\16\u00e9\u0918\13\u00e9\3\u00ea\3\u00ea"+
		"\3\u00eb\3\u00eb\5\u00eb\u091e\n\u00eb\3\u00ec\3\u00ec\3\u00ec\5\u00ec"+
		"\u0923\n\u00ec\3\u00ec\5\u00ec\u0926\n\u00ec\3\u00ec\5\u00ec\u0929\n\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ed\6\u00ed\u092e\n\u00ed\r\u00ed\16\u00ed\u092f"+
		"\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0935\n\u00ee\3\u00ef\3\u00ef\5\u00ef"+
		"\u0939\n\u00ef\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0945\n\u00f0\3\u00f0\3\u00f0\3\u00f0"+
		"\7\u00f0\u094a\n\u00f0\f\u00f0\16\u00f0\u094d\13\u00f0\3\u00f1\3\u00f1"+
		"\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\5\u00f1"+
		"\u0959\n\u00f1\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\5\u00f4\u0963\n\u00f4\3\u00f5\3\u00f5\3\u00f6\3\u00f6\3\u00f7"+
		"\3\u00f7\5\u00f7\u096b\n\u00f7\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa"+
		"\3\u00fa\5\u00fa\u0973\n\u00fa\3\u00fa\3\u00fa\3\u00fa\5\u00fa\u0978\n"+
		"\u00fa\7\u00fa\u097a\n\u00fa\f\u00fa\16\u00fa\u097d\13\u00fa\3\u00fb\3"+
		"\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc\u0985\n\u00fc\3\u00fd\5"+
		"\u00fd\u0988\n\u00fd\3\u00fd\3\u00fd\5\u00fd\u098c\n\u00fd\3\u00fd\5\u00fd"+
		"\u098f\n\u00fd\3\u00fe\3\u00fe\3\u00fe\2\6\u0138\u019e\u01ac\u01de\u00ff"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc"+
		"\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4"+
		"\u01f6\u01f8\u01fa\2\20\3\2!(\4\2\u008f\u008f\u0091\u0092\5\2\35\35,,"+
		"CG\3\2MN\3\2VW\3\2^`\5\2::==rs\13\2  )+IIVWffhhjjuv\u0088\u0088\3\2uv"+
		"\6\2!!##%%\'\'\3\2\u0080\u0083\22\2\5\5\b\r\17\17\23\27\32\32\34\36,-"+
		"99BGUUXZabpqttwwyy\16\2!#%%-8::==??JLTT[`wx~\u0083\u0085\u0085\3\2\u008d"+
		"\u0090\u0a50\2\u0200\3\2\2\2\4\u0226\3\2\2\2\6\u0229\3\2\2\2\b\u0231\3"+
		"\2\2\2\n\u024f\3\2\2\2\f\u0253\3\2\2\2\16\u0255\3\2\2\2\20\u0261\3\2\2"+
		"\2\22\u0265\3\2\2\2\24\u026d\3\2\2\2\26\u026f\3\2\2\2\30\u0279\3\2\2\2"+
		"\32\u027b\3\2\2\2\34\u0280\3\2\2\2\36\u0288\3\2\2\2 \u0298\3\2\2\2\"\u029a"+
		"\3\2\2\2$\u029e\3\2\2\2&\u02a6\3\2\2\2(\u02aa\3\2\2\2*\u02b3\3\2\2\2,"+
		"\u02b5\3\2\2\2.\u02b8\3\2\2\2\60\u02bf\3\2\2\2\62\u02c1\3\2\2\2\64\u02c5"+
		"\3\2\2\2\66\u02c9\3\2\2\28\u02cb\3\2\2\2:\u02cf\3\2\2\2<\u02d2\3\2\2\2"+
		">\u02d5\3\2\2\2@\u02da\3\2\2\2B\u02de\3\2\2\2D\u02f1\3\2\2\2F\u02f3\3"+
		"\2\2\2H\u02fe\3\2\2\2J\u0300\3\2\2\2L\u0306\3\2\2\2N\u0316\3\2\2\2P\u0318"+
		"\3\2\2\2R\u0324\3\2\2\2T\u0326\3\2\2\2V\u0329\3\2\2\2X\u032b\3\2\2\2Z"+
		"\u0330\3\2\2\2\\\u033c\3\2\2\2^\u033e\3\2\2\2`\u0340\3\2\2\2b\u0342\3"+
		"\2\2\2d\u0349\3\2\2\2f\u035a\3\2\2\2h\u035c\3\2\2\2j\u035f\3\2\2\2l\u0369"+
		"\3\2\2\2n\u0373\3\2\2\2p\u0375\3\2\2\2r\u0379\3\2\2\2t\u037d\3\2\2\2v"+
		"\u0385\3\2\2\2x\u03c3\3\2\2\2z\u03c5\3\2\2\2|\u03c9\3\2\2\2~\u03e6\3\2"+
		"\2\2\u0080\u03f7\3\2\2\2\u0082\u03f9\3\2\2\2\u0084\u03fd\3\2\2\2\u0086"+
		"\u0404\3\2\2\2\u0088\u040c\3\2\2\2\u008a\u0413\3\2\2\2\u008c\u0417\3\2"+
		"\2\2\u008e\u041a\3\2\2\2\u0090\u0422\3\2\2\2\u0092\u042a\3\2\2\2\u0094"+
		"\u042e\3\2\2\2\u0096\u0450\3\2\2\2\u0098\u0453\3\2\2\2\u009a\u045a\3\2"+
		"\2\2\u009c\u0468\3\2\2\2\u009e\u046b\3\2\2\2\u00a0\u0471\3\2\2\2\u00a2"+
		"\u0479\3\2\2\2\u00a4\u0489\3\2\2\2\u00a6\u048c\3\2\2\2\u00a8\u0491\3\2"+
		"\2\2\u00aa\u04a3\3\2\2\2\u00ac\u04a6\3\2\2\2\u00ae\u04af\3\2\2\2\u00b0"+
		"\u04b7\3\2\2\2\u00b2\u04bb\3\2\2\2\u00b4\u04c3\3\2\2\2\u00b6\u04c5\3\2"+
		"\2\2\u00b8\u04d7\3\2\2\2\u00ba\u04da\3\2\2\2\u00bc\u04e3\3\2\2\2\u00be"+
		"\u04e5\3\2\2\2\u00c0\u04ec\3\2\2\2\u00c2\u04f2\3\2\2\2\u00c4\u04f4\3\2"+
		"\2\2\u00c6\u0501\3\2\2\2\u00c8\u0503\3\2\2\2\u00ca\u053d\3\2\2\2\u00cc"+
		"\u0541\3\2\2\2\u00ce\u0545\3\2\2\2\u00d0\u0547\3\2\2\2\u00d2\u054b\3\2"+
		"\2\2\u00d4\u0554\3\2\2\2\u00d6\u0557\3\2\2\2\u00d8\u0567\3\2\2\2\u00da"+
		"\u0570\3\2\2\2\u00dc\u0573\3\2\2\2\u00de\u057b\3\2\2\2\u00e0\u0583\3\2"+
		"\2\2\u00e2\u0587\3\2\2\2\u00e4\u0589\3\2\2\2\u00e6\u058b\3\2\2\2\u00e8"+
		"\u0599\3\2\2\2\u00ea\u059f\3\2\2\2\u00ec\u05a2\3\2\2\2\u00ee\u05a7\3\2"+
		"\2\2\u00f0\u05af\3\2\2\2\u00f2\u05b3\3\2\2\2\u00f4\u05b7\3\2\2\2\u00f6"+
		"\u05c6\3\2\2\2\u00f8\u05c8\3\2\2\2\u00fa\u05cf\3\2\2\2\u00fc\u05e1\3\2"+
		"\2\2\u00fe\u05e3\3\2\2\2\u0100\u05ea\3\2\2\2\u0102\u05f6\3\2\2\2\u0104"+
		"\u05f8\3\2\2\2\u0106\u0612\3\2\2\2\u0108\u0614\3\2\2\2\u010a\u0618\3\2"+
		"\2\2\u010c\u061d\3\2\2\2\u010e\u0624\3\2\2\2\u0110\u062c\3\2\2\2\u0112"+
		"\u0630\3\2\2\2\u0114\u0637\3\2\2\2\u0116\u0642\3\2\2\2\u0118\u064b\3\2"+
		"\2\2\u011a\u064e\3\2\2\2\u011c\u0654\3\2\2\2\u011e\u0663\3\2\2\2\u0120"+
		"\u0675\3\2\2\2\u0122\u0678\3\2\2\2\u0124\u0680\3\2\2\2\u0126\u0689\3\2"+
		"\2\2\u0128\u068b\3\2\2\2\u012a\u0691\3\2\2\2\u012c\u0697\3\2\2\2\u012e"+
		"\u06aa\3\2\2\2\u0130\u06ac\3\2\2\2\u0132\u06af\3\2\2\2\u0134\u06b1\3\2"+
		"\2\2\u0136\u06b4\3\2\2\2\u0138\u06c8\3\2\2\2\u013a\u06d2\3\2\2\2\u013c"+
		"\u06d4\3\2\2\2\u013e\u06da\3\2\2\2\u0140\u06dc\3\2\2\2\u0142\u06e2\3\2"+
		"\2\2\u0144\u06ea\3\2\2\2\u0146\u06ed\3\2\2\2\u0148\u06f8\3\2\2\2\u014a"+
		"\u06fa\3\2\2\2\u014c\u06fd\3\2\2\2\u014e\u0701\3\2\2\2\u0150\u0703\3\2"+
		"\2\2\u0152\u0708\3\2\2\2\u0154\u070a\3\2\2\2\u0156\u0711\3\2\2\2\u0158"+
		"\u0715\3\2\2\2\u015a\u0738\3\2\2\2\u015c\u073a\3\2\2\2\u015e\u0743\3\2"+
		"\2\2\u0160\u0754\3\2\2\2\u0162\u0756\3\2\2\2\u0164\u0759\3\2\2\2\u0166"+
		"\u076d\3\2\2\2\u0168\u076f\3\2\2\2\u016a\u0771\3\2\2\2\u016c\u0782\3\2"+
		"\2\2\u016e\u0792\3\2\2\2\u0170\u079b\3\2\2\2\u0172\u079d\3\2\2\2\u0174"+
		"\u07a3\3\2\2\2\u0176\u07ae\3\2\2\2\u0178\u07b7\3\2\2\2\u017a\u07b9\3\2"+
		"\2\2\u017c\u07c4\3\2\2\2\u017e\u07d4\3\2\2\2\u0180\u07d9\3\2\2\2\u0182"+
		"\u07db\3\2\2\2\u0184\u07df\3\2\2\2\u0186\u07e4\3\2\2\2\u0188\u07e8\3\2"+
		"\2\2\u018a\u080e\3\2\2\2\u018c\u0810\3\2\2\2\u018e\u0814\3\2\2\2\u0190"+
		"\u081a\3\2\2\2\u0192\u081e\3\2\2\2\u0194\u0820\3\2\2\2\u0196\u0823\3\2"+
		"\2\2\u0198\u0829\3\2\2\2\u019a\u0836\3\2\2\2\u019c\u0838\3\2\2\2\u019e"+
		"\u083a\3\2\2\2\u01a0\u0866\3\2\2\2\u01a2\u086a\3\2\2\2\u01a4\u087b\3\2"+
		"\2\2\u01a6\u087d\3\2\2\2\u01a8\u087f\3\2\2\2\u01aa\u0881\3\2\2\2\u01ac"+
		"\u0889\3\2\2\2\u01ae\u08a4\3\2\2\2\u01b0\u08a8\3\2\2\2\u01b2\u08ae\3\2"+
		"\2\2\u01b4\u08b1\3\2\2\2\u01b6\u08b4\3\2\2\2\u01b8\u08c6\3\2\2\2\u01ba"+
		"\u08c8\3\2\2\2\u01bc\u08ca\3\2\2\2\u01be\u08d0\3\2\2\2\u01c0\u08d9\3\2"+
		"\2\2\u01c2\u08e8\3\2\2\2\u01c4\u08ea\3\2\2\2\u01c6\u08ec\3\2\2\2\u01c8"+
		"\u08f8\3\2\2\2\u01ca\u08fa\3\2\2\2\u01cc\u0904\3\2\2\2\u01ce\u090f\3\2"+
		"\2\2\u01d0\u0911\3\2\2\2\u01d2\u0919\3\2\2\2\u01d4\u091d\3\2\2\2\u01d6"+
		"\u091f\3\2\2\2\u01d8\u092d\3\2\2\2\u01da\u0931\3\2\2\2\u01dc\u0936\3\2"+
		"\2\2\u01de\u0944\3\2\2\2\u01e0\u0958\3\2\2\2\u01e2\u095a\3\2\2\2\u01e4"+
		"\u095c\3\2\2\2\u01e6\u095e\3\2\2\2\u01e8\u0964\3\2\2\2\u01ea\u0966\3\2"+
		"\2\2\u01ec\u096a\3\2\2\2\u01ee\u096c\3\2\2\2\u01f0\u096e\3\2\2\2\u01f2"+
		"\u0972\3\2\2\2\u01f4\u097e\3\2\2\2\u01f6\u0984\3\2\2\2\u01f8\u098e\3\2"+
		"\2\2\u01fa\u0990\3\2\2\2\u01fc\u01ff\5\4\3\2\u01fd\u01ff\5\u015e\u00b0"+
		"\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\7\2\2\3\u0204\3\3\2\2\2\u0205\u0207\5x=\2\u0206\u0208\7\3\2\2\u0207"+
		"\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0227\3\2\2\2\u0209\u020b\5\b"+
		"\5\2\u020a\u020c\7\3\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u0227\3\2\2\2\u020d\u020f\5\24\13\2\u020e\u0210\7\3\2\2\u020f\u020e\3"+
		"\2\2\2\u020f\u0210\3\2\2\2\u0210\u0227\3\2\2\2\u0211\u0227\5*\26\2\u0212"+
		"\u0214\5\60\31\2\u0213\u0215\7\3\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3"+
		"\2\2\2\u0215\u0227\3\2\2\2\u0216\u0218\5<\37\2\u0217\u0219\7\3\2\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0227\3\2\2\2\u021a\u021c\5>"+
		" \2\u021b\u021d\7\4\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u0227\3\2\2\2\u021e\u0220\5\u01d4\u00eb\2\u021f\u0221\7\3\2\2\u0220\u021f"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0227\3\2\2\2\u0222\u0224\5\u015e\u00b0"+
		"\2\u0223\u0225\7\3\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227"+
		"\3\2\2\2\u0226\u0205\3\2\2\2\u0226\u0209\3\2\2\2\u0226\u020d\3\2\2\2\u0226"+
		"\u0211\3\2\2\2\u0226\u0212\3\2\2\2\u0226\u0216\3\2\2\2\u0226\u021a\3\2"+
		"\2\2\u0226\u021e\3\2\2\2\u0226\u0222\3\2\2\2\u0227\5\3\2\2\2\u0228\u022a"+
		"\5\4\3\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\7\3\2\2\2\u022d\u0232\5\n\6\2\u022e\u0232\5\16\b"+
		"\2\u022f\u0232\5\20\t\2\u0230\u0232\5\22\n\2\u0231\u022d\3\2\2\2\u0231"+
		"\u022e\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\t\3\2\2\2"+
		"\u0233\u0235\7\5\2\2\u0234\u0236\5\f\7\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\7\3\2\2\u0238\u023a\5\u015e\u00b0"+
		"\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d"+
		"\7\3\2\2\u023c\u023e\5\u015c\u00af\2\u023d\u023c\3\2\2\2\u023d\u023e\3"+
		"\2\2\2\u023e\u023f\3\2\2\2\u023f\u0250\5\u0084C\2\u0240\u0241\7\5\2\2"+
		"\u0241\u0243\7\6\2\2\u0242\u0244\5\f\7\2\u0243\u0242\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\7\3\2\2\u0246\u0248\5\u015e\u00b0"+
		"\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b"+
		"\7\3\2\2\u024a\u024c\5\u015c\u00af\2\u024b\u024a\3\2\2\2\u024b\u024c\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\7\2\2\u024e\u0250\5\u0084C\2"+
		"\u024f\u0233\3\2\2\2\u024f\u0240\3\2\2\2\u0250\13\3\2\2\2\u0251\u0254"+
		"\5\u0096L\2\u0252\u0254\5\u015c\u00af\2\u0253\u0251\3\2\2\2\u0253\u0252"+
		"\3\2\2\2\u0254\r\3\2\2\2\u0255\u0257\7\5\2\2\u0256\u0258\7\b\2\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\5\u0138"+
		"\u009d\2\u025a\u025b\7\t\2\2\u025b\u025d\5\u015e\u00b0\2\u025c\u025e\5"+
		"T+\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\5\u0084C\2\u0260\17\3\2\2\2\u0261\u0262\7\n\2\2\u0262\u0263\5D"+
		"#\2\u0263\u0264\5\u0084C\2\u0264\21\3\2\2\2\u0265\u0266\7\13\2\2\u0266"+
		"\u0267\5\u0084C\2\u0267\u0268\7\n\2\2\u0268\u0269\5D#\2\u0269\23\3\2\2"+
		"\2\u026a\u026e\5\26\f\2\u026b\u026e\5\32\16\2\u026c\u026e\5\34\17\2\u026d"+
		"\u026a\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e\25\3\2\2"+
		"\2\u026f\u0270\7\f\2\2\u0270\u0271\5D#\2\u0271\u0273\5\u0084C\2\u0272"+
		"\u0274\5\30\r\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\27\3\2\2"+
		"\2\u0275\u0276\7\r\2\2\u0276\u027a\5\u0084C\2\u0277\u0278\7\r\2\2\u0278"+
		"\u027a\5\26\f\2\u0279\u0275\3\2\2\2\u0279\u0277\3\2\2\2\u027a\31\3\2\2"+
		"\2\u027b\u027c\7\16\2\2\u027c\u027d\5D#\2\u027d\u027e\7\r\2\2\u027e\u027f"+
		"\5\u0084C\2\u027f\33\3\2\2\2\u0280\u0281\7\17\2\2\u0281\u0282\5\u015e"+
		"\u00b0\2\u0282\u0284\7\20\2\2\u0283\u0285\5\36\20\2\u0284\u0283\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7\21\2\2\u0287"+
		"\35\3\2\2\2\u0288\u028a\5 \21\2\u0289\u028b\5\36\20\2\u028a\u0289\3\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028b\37\3\2\2\2\u028c\u028d\5\"\22\2\u028d\u028e"+
		"\5\6\4\2\u028e\u0299\3\2\2\2\u028f\u0290\5(\25\2\u0290\u0291\5\6\4\2\u0291"+
		"\u0299\3\2\2\2\u0292\u0293\5\"\22\2\u0293\u0294\7\3\2\2\u0294\u0299\3"+
		"\2\2\2\u0295\u0296\5(\25\2\u0296\u0297\7\3\2\2\u0297\u0299\3\2\2\2\u0298"+
		"\u028c\3\2\2\2\u0298\u028f\3\2\2\2\u0298\u0292\3\2\2\2\u0298\u0295\3\2"+
		"\2\2\u0299!\3\2\2\2\u029a\u029b\7\b\2\2\u029b\u029c\5$\23\2\u029c\u029d"+
		"\7\4\2\2\u029d#\3\2\2\2\u029e\u02a3\5&\24\2\u029f\u02a0\7\22\2\2\u02a0"+
		"\u02a2\5&\24\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4%\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a8"+
		"\5\u0138\u009d\2\u02a7\u02a9\5T+\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\'\3\2\2\2\u02aa\u02ab\7\23\2\2\u02ab\u02ac\7\4\2\2\u02ac)\3"+
		"\2\2\2\u02ad\u02ae\5,\27\2\u02ae\u02af\5\b\5\2\u02af\u02b4\3\2\2\2\u02b0"+
		"\u02b1\5,\27\2\u02b1\u02b2\5\34\17\2\u02b2\u02b4\3\2\2\2\u02b3\u02ad\3"+
		"\2\2\2\u02b3\u02b0\3\2\2\2\u02b4+\3\2\2\2\u02b5\u02b6\5.\30\2\u02b6\u02b7"+
		"\7\4\2\2\u02b7-\3\2\2\2\u02b8\u02b9\5\u01ec\u00f7\2\u02b9/\3\2\2\2\u02ba"+
		"\u02c0\5\62\32\2\u02bb\u02c0\5\64\33\2\u02bc\u02c0\5\66\34\2\u02bd\u02c0"+
		"\58\35\2\u02be\u02c0\5:\36\2\u02bf\u02ba\3\2\2\2\u02bf\u02bb\3\2\2\2\u02bf"+
		"\u02bc\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0\61\3\2\2"+
		"\2\u02c1\u02c3\7\24\2\2\u02c2\u02c4\5.\30\2\u02c3\u02c2\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\63\3\2\2\2\u02c5\u02c7\7\25\2\2\u02c6\u02c8\5.\30"+
		"\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\65\3\2\2\2\u02c9\u02ca"+
		"\7\26\2\2\u02ca\67\3\2\2\2\u02cb\u02cd\7\27\2\2\u02cc\u02ce\5\u015e\u00b0"+
		"\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce9\3\2\2\2\u02cf\u02d0"+
		"\7\30\2\2\u02d0\u02d1\5\u015e\u00b0\2\u02d1;\3\2\2\2\u02d2\u02d3\7\31"+
		"\2\2\u02d3\u02d4\5\u0084C\2\u02d4=\3\2\2\2\u02d5\u02d6\7\32\2\2\u02d6"+
		"\u02d8\5\u0084C\2\u02d7\u02d9\5@!\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3"+
		"\2\2\2\u02d9?\3\2\2\2\u02da\u02dc\5B\"\2\u02db\u02dd\5@!\2\u02dc\u02db"+
		"\3\2\2\2\u02dc\u02dd\3\2\2\2\u02ddA\3\2\2\2\u02de\u02e0\7\33\2\2\u02df"+
		"\u02e1\5\u0138\u009d\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3"+
		"\3\2\2\2\u02e2\u02e4\5T+\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\5\u0084C\2\u02e6C\3\2\2\2\u02e7\u02f2\5\u015e"+
		"\u00b0\2\u02e8\u02e9\5\u015e\u00b0\2\u02e9\u02ea\7\22\2\2\u02ea\u02eb"+
		"\5F$\2\u02eb\u02f2\3\2\2\2\u02ec\u02f2\5F$\2\u02ed\u02ee\5X-\2\u02ee\u02ef"+
		"\7\22\2\2\u02ef\u02f0\5\u015e\u00b0\2\u02f0\u02f2\3\2\2\2\u02f1\u02e7"+
		"\3\2\2\2\u02f1\u02e8\3\2\2\2\u02f1\u02ec\3\2\2\2\u02f1\u02ed\3\2\2\2\u02f2"+
		"E\3\2\2\2\u02f3\u02f8\5H%\2\u02f4\u02f5\7\22\2\2\u02f5\u02f7\5H%\2\u02f6"+
		"\u02f4\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9G\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02ff\5X-\2\u02fc\u02ff"+
		"\5J&\2\u02fd\u02ff\5L\'\2\u02fe\u02fb\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02ffI\3\2\2\2\u0300\u0301\7\b\2\2\u0301\u0302\5\u0138"+
		"\u009d\2\u0302\u0304\5\u0094K\2\u0303\u0305\5T+\2\u0304\u0303\3\2\2\2"+
		"\u0304\u0305\3\2\2\2\u0305K\3\2\2\2\u0306\u0309\5N(\2\u0307\u0308\7\22"+
		"\2\2\u0308\u030a\5P)\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c"+
		"\3\2\2\2\u030b\u030d\5T+\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d"+
		"M\3\2\2\2\u030e\u030f\7\34\2\2\u030f\u0310\5\u0138\u009d\2\u0310\u0311"+
		"\5\u0094K\2\u0311\u0317\3\2\2\2\u0312\u0313\7\35\2\2\u0313\u0314\5\u0138"+
		"\u009d\2\u0314\u0315\5\u0094K\2\u0315\u0317\3\2\2\2\u0316\u030e\3\2\2"+
		"\2\u0316\u0312\3\2\2\2\u0317O\3\2\2\2\u0318\u031d\5R*\2\u0319\u031a\7"+
		"\22\2\2\u031a\u031c\5R*\2\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031eQ\3\2\2\2\u031f\u031d\3\2\2\2"+
		"\u0320\u0325\5N(\2\u0321\u0322\5\u0138\u009d\2\u0322\u0323\5\u0094K\2"+
		"\u0323\u0325\3\2\2\2\u0324\u0320\3\2\2\2\u0324\u0321\3\2\2\2\u0325S\3"+
		"\2\2\2\u0326\u0327\7\36\2\2\u0327\u0328\5V,\2\u0328U\3\2\2\2\u0329\u032a"+
		"\5\u015e\u00b0\2\u032aW\3\2\2\2\u032b\u032c\7\37\2\2\u032c\u032d\7\6\2"+
		"\2\u032d\u032e\5Z.\2\u032e\u032f\7\7\2\2\u032fY\3\2\2\2\u0330\u0335\5"+
		"\\/\2\u0331\u0332\7\22\2\2\u0332\u0334\5Z.\2\u0333\u0331\3\2\2\2\u0334"+
		"\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336[\3\2\2\2"+
		"\u0337\u0335\3\2\2\2\u0338\u0339\5^\60\2\u0339\u033a\5`\61\2\u033a\u033d"+
		"\3\2\2\2\u033b\u033d\7 \2\2\u033c\u0338\3\2\2\2\u033c\u033b\3\2\2\2\u033d"+
		"]\3\2\2\2\u033e\u033f\t\2\2\2\u033f_\3\2\2\2\u0340\u0341\t\3\2\2\u0341"+
		"a\3\2\2\2\u0342\u0343\7)\2\2\u0343\u0345\5d\63\2\u0344\u0346\5h\65\2\u0345"+
		"\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\7*"+
		"\2\2\u0348c\3\2\2\2\u0349\u034e\5f\64\2\u034a\u034b\7\22\2\2\u034b\u034d"+
		"\5f\64\2\u034c\u034a\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034fe\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u035b\5\u01ba"+
		"\u00de\2\u0352\u0353\5\u01ba\u00de\2\u0353\u0354\7\4\2\2\u0354\u0355\5"+
		"\u01b8\u00dd\2\u0355\u035b\3\2\2\2\u0356\u0357\5\u01ba\u00de\2\u0357\u0358"+
		"\7\4\2\2\u0358\u0359\5\u01c6\u00e4\2\u0359\u035b\3\2\2\2\u035a\u0351\3"+
		"\2\2\2\u035a\u0352\3\2\2\2\u035a\u0356\3\2\2\2\u035bg\3\2\2\2\u035c\u035d"+
		"\7\36\2\2\u035d\u035e\5j\66\2\u035ei\3\2\2\2\u035f\u0364\5l\67\2\u0360"+
		"\u0361\7\22\2\2\u0361\u0363\5l\67\2\u0362\u0360\3\2\2\2\u0363\u0366\3"+
		"\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365k\3\2\2\2\u0366\u0364"+
		"\3\2\2\2\u0367\u036a\5n8\2\u0368\u036a\5p9\2\u0369\u0367\3\2\2\2\u0369"+
		"\u0368\3\2\2\2\u036am\3\2\2\2\u036b\u036c\5\u01b8\u00dd\2\u036c\u036d"+
		"\7\4\2\2\u036d\u036e\5\u01b8\u00dd\2\u036e\u0374\3\2\2\2\u036f\u0370\5"+
		"\u01b8\u00dd\2\u0370\u0371\7\4\2\2\u0371\u0372\5\u01c6\u00e4\2\u0372\u0374"+
		"\3\2\2\2\u0373\u036b\3\2\2\2\u0373\u036f\3\2\2\2\u0374o\3\2\2\2\u0375"+
		"\u0376\5\u01b8\u00dd\2\u0376\u0377\7+\2\2\u0377\u0378\5\u01ac\u00d7\2"+
		"\u0378q\3\2\2\2\u0379\u037a\7)\2\2\u037a\u037b\5t;\2\u037b\u037c\7*\2"+
		"\2\u037cs\3\2\2\2\u037d\u0382\5v<\2\u037e\u037f\7\22\2\2\u037f\u0381\5"+
		"v<\2\u0380\u037e\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383u\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0386\5\u01ac"+
		"\u00d7\2\u0386w\3\2\2\2\u0387\u0389\5\u0086D\2\u0388\u038a\7\3\2\2\u0389"+
		"\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u03c4\3\2\2\2\u038b\u038d\5\u008e"+
		"H\2\u038c\u038e\7\3\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u03c4\3\2\2\2\u038f\u0391\5\u0096L\2\u0390\u0392\7\3\2\2\u0391\u0390"+
		"\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u03c4\3\2\2\2\u0393\u0395\5\u00b0Y"+
		"\2\u0394\u0396\7\3\2\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u03c4"+
		"\3\2\2\2\u0397\u0399\5\u00b8]\2\u0398\u039a\7\3\2\2\u0399\u0398\3\2\2"+
		"\2\u0399\u039a\3\2\2\2\u039a\u03c4\3\2\2\2\u039b\u039d\5\u00d2j\2\u039c"+
		"\u039e\7\3\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03c4\3\2"+
		"\2\2\u039f\u03a1\5\u00f4{\2\u03a0\u03a2\7\3\2\2\u03a1\u03a0\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03c4\3\2\2\2\u03a3\u03a5\5\u00fa~\2\u03a4\u03a6"+
		"\7\3\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03c4\3\2\2\2\u03a7"+
		"\u03a9\5\u0100\u0081\2\u03a8\u03aa\7\3\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa"+
		"\3\2\2\2\u03aa\u03c4\3\2\2\2\u03ab\u03ad\5\u0114\u008b\2\u03ac\u03ae\7"+
		"\3\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03c4\3\2\2\2\u03af"+
		"\u03b1\5\u011a\u008e\2\u03b0\u03b2\7\3\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2"+
		"\3\2\2\2\u03b2\u03c4\3\2\2\2\u03b3\u03b5\5\u011c\u008f\2\u03b4\u03b6\7"+
		"\3\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03c4\3\2\2\2\u03b7"+
		"\u03b9\5\u0120\u0091\2\u03b8\u03ba\7\3\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03c4\3\2\2\2\u03bb\u03bd\5\u0126\u0094\2\u03bc\u03be\7"+
		"\3\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c4\3\2\2\2\u03bf"+
		"\u03c1\5\u01d4\u00eb\2\u03c0\u03c2\7\3\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2"+
		"\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u0387\3\2\2\2\u03c3\u038b\3\2\2\2\u03c3"+
		"\u038f\3\2\2\2\u03c3\u0393\3\2\2\2\u03c3\u0397\3\2\2\2\u03c3\u039b\3\2"+
		"\2\2\u03c3\u039f\3\2\2\2\u03c3\u03a3\3\2\2\2\u03c3\u03a7\3\2\2\2\u03c3"+
		"\u03ab\3\2\2\2\u03c3\u03af\3\2\2\2\u03c3\u03b3\3\2\2\2\u03c3\u03b7\3\2"+
		"\2\2\u03c3\u03bb\3\2\2\2\u03c3\u03bf\3\2\2\2\u03c4y\3\2\2\2\u03c5\u03c7"+
		"\5x=\2\u03c6\u03c8\5z>\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"{\3\2\2\2\u03c9\u03cb\5~@\2\u03ca\u03cc\5|?\2\u03cb\u03ca\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc}\3\2\2\2\u03cd\u03e7\7,\2\2\u03ce\u03e7\7-\2\2\u03cf"+
		"\u03e7\7.\2\2\u03d0\u03e7\7/\2\2\u03d1\u03e7\7\60\2\2\u03d2\u03e7\7\61"+
		"\2\2\u03d3\u03e7\7\62\2\2\u03d4\u03e7\7\63\2\2\u03d5\u03e7\7\64\2\2\u03d6"+
		"\u03e7\7\65\2\2\u03d7\u03e7\7\66\2\2\u03d8\u03e7\7\67\2\2\u03d9\u03e7"+
		"\78\2\2\u03da\u03e7\79\2\2\u03db\u03e7\7:\2\2\u03dc\u03dd\7:\2\2\u03dd"+
		"\u03de\7\6\2\2\u03de\u03df\7;\2\2\u03df\u03e7\7\7\2\2\u03e0\u03e1\7:\2"+
		"\2\u03e1\u03e2\7\6\2\2\u03e2\u03e3\7<\2\2\u03e3\u03e7\7\7\2\2\u03e4\u03e7"+
		"\7=\2\2\u03e5\u03e7\5\u0080A\2\u03e6\u03cd\3\2\2\2\u03e6\u03ce\3\2\2\2"+
		"\u03e6\u03cf\3\2\2\2\u03e6\u03d0\3\2\2\2\u03e6\u03d1\3\2\2\2\u03e6\u03d2"+
		"\3\2\2\2\u03e6\u03d3\3\2\2\2\u03e6\u03d4\3\2\2\2\u03e6\u03d5\3\2\2\2\u03e6"+
		"\u03d6\3\2\2\2\u03e6\u03d7\3\2\2\2\u03e6\u03d8\3\2\2\2\u03e6\u03d9\3\2"+
		"\2\2\u03e6\u03da\3\2\2\2\u03e6\u03db\3\2\2\2\u03e6\u03dc\3\2\2\2\u03e6"+
		"\u03e0\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\177\3\2\2"+
		"\2\u03e8\u03f8\7>\2\2\u03e9\u03ea\7>\2\2\u03ea\u03eb\7\6\2\2\u03eb\u03ec"+
		"\7?\2\2\u03ec\u03f8\7\7\2\2\u03ed\u03f8\7@\2\2\u03ee\u03ef\7@\2\2\u03ef"+
		"\u03f0\7\6\2\2\u03f0\u03f1\7?\2\2\u03f1\u03f8\7\7\2\2\u03f2\u03f8\7A\2"+
		"\2\u03f3\u03f4\7A\2\2\u03f4\u03f5\7\6\2\2\u03f5\u03f6\7?\2\2\u03f6\u03f8"+
		"\7\7\2\2\u03f7\u03e8\3\2\2\2\u03f7\u03e9\3\2\2\2\u03f7\u03ed\3\2\2\2\u03f7"+
		"\u03ee\3\2\2\2\u03f7\u03f2\3\2\2\2\u03f7\u03f3\3\2\2\2\u03f8\u0081\3\2"+
		"\2\2\u03f9\u03fb\5\u0080A\2\u03fa\u03fc\5\u0082B\2\u03fb\u03fa\3\2\2\2"+
		"\u03fb\u03fc\3\2\2\2\u03fc\u0083\3\2\2\2\u03fd\u03ff\7\20\2\2\u03fe\u0400"+
		"\5\6\4\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0402\7\21\2\2\u0402\u0085\3\2\2\2\u0403\u0405\5\u0156\u00ac\2\u0404"+
		"\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\7B"+
		"\2\2\u0407\u0409\5\u0088E\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040b\5\u008aF\2\u040b\u0087\3\2\2\2\u040c\u040d"+
		"\t\4\2\2\u040d\u0089\3\2\2\2\u040e\u0414\5\u008cG\2\u040f\u0410\5\u008c"+
		"G\2\u0410\u0411\7H\2\2\u0411\u0412\5\u008aF\2\u0412\u0414\3\2\2\2\u0413"+
		"\u040e\3\2\2\2\u0413\u040f\3\2\2\2\u0414\u008b\3\2\2\2\u0415\u0418\5\u01ec"+
		"\u00f7\2\u0416\u0418\5\u01a4\u00d3\2\u0417\u0415\3\2\2\2\u0417\u0416\3"+
		"\2\2\2\u0418\u008d\3\2\2\2\u0419\u041b\5\u0156\u00ac\2\u041a\u0419\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041e\5|?\2\u041d\u041c"+
		"\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\7\34\2\2"+
		"\u0420\u0421\5\u0090I\2\u0421\u008f\3\2\2\2\u0422\u0427\5\u0092J\2\u0423"+
		"\u0424\7\22\2\2\u0424\u0426\5\u0092J\2\u0425\u0423\3\2\2\2\u0426\u0429"+
		"\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0091\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u042a\u042c\5\u0138\u009d\2\u042b\u042d\5\u0094K\2\u042c"+
		"\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0093\3\2\2\2\u042e\u042f\7I"+
		"\2\2\u042f\u0430\5\u015e\u00b0\2\u0430\u0095\3\2\2\2\u0431\u0432\5\u0098"+
		"M\2\u0432\u0433\5\u009aN\2\u0433\u0434\5\u01b6\u00dc\2\u0434\u0435\5\u009c"+
		"O\2\u0435\u0451\3\2\2\2\u0436\u0437\5\u0098M\2\u0437\u0438\5\u009aN\2"+
		"\u0438\u0439\5\u01b6\u00dc\2\u0439\u043a\5\u00a4S\2\u043a\u0451\3\2\2"+
		"\2\u043b\u043c\5\u0098M\2\u043c\u043d\5\u009aN\2\u043d\u043e\5\u0094K"+
		"\2\u043e\u043f\5\u00aaV\2\u043f\u0451\3\2\2\2\u0440\u0441\5\u0098M\2\u0441"+
		"\u0442\5\u009aN\2\u0442\u0444\5\u01b6\u00dc\2\u0443\u0445\5\u0094K\2\u0444"+
		"\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\5\u00aa"+
		"V\2\u0447\u0451\3\2\2\2\u0448\u0449\5\u0098M\2\u0449\u044a\5\u009aN\2"+
		"\u044a\u044b\5\u01b6\u00dc\2\u044b\u044c\5\u0084C\2\u044c\u0451\3\2\2"+
		"\2\u044d\u044e\5\u0098M\2\u044e\u044f\5\u0090I\2\u044f\u0451\3\2\2\2\u0450"+
		"\u0431\3\2\2\2\u0450\u0436\3\2\2\2\u0450\u043b\3\2\2\2\u0450\u0440\3\2"+
		"\2\2\u0450\u0448\3\2\2\2\u0450\u044d\3\2\2\2\u0451\u0097\3\2\2\2\u0452"+
		"\u0454\5\u0156\u00ac\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456"+
		"\3\2\2\2\u0455\u0457\5|?\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458\u0459\7\35\2\2\u0459\u0099\3\2\2\2\u045a\u045b\5"+
		"\u01ec\u00f7\2\u045b\u009b\3\2\2\2\u045c\u045d\7\20\2\2\u045d\u045f\5"+
		"\u009eP\2\u045e\u0460\5\u00a0Q\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2"+
		"\2\u0460\u0461\3\2\2\2\u0461\u0462\7\21\2\2\u0462\u0469\3\2\2\2\u0463"+
		"\u0464\7\20\2\2\u0464\u0465\5\u00a0Q\2\u0465\u0466\5\u009eP\2\u0466\u0467"+
		"\7\21\2\2\u0467\u0469\3\2\2\2\u0468\u045c\3\2\2\2\u0468\u0463\3\2\2\2"+
		"\u0469\u009d\3\2\2\2\u046a\u046c\5\u0156\u00ac\2\u046b\u046a\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\7J\2\2\u046e\u046f\5\u0084"+
		"C\2\u046f\u009f\3\2\2\2\u0470\u0472\5\u0156\u00ac\2\u0471\u0470\3\2\2"+
		"\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\7?\2\2\u0474\u0476"+
		"\5\u00a2R\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2"+
		"\2\u0477\u0478\5\u0084C\2\u0478\u00a1\3\2\2\2\u0479\u047a\7\6\2\2\u047a"+
		"\u047b\5\u01ec\u00f7\2\u047b\u047c\7\7\2\2\u047c\u00a3\3\2\2\2\u047d\u047e"+
		"\7\20\2\2\u047e\u0480\5\u00a6T\2\u047f\u0481\5\u00a8U\2\u0480\u047f\3"+
		"\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\7\21\2\2\u0483"+
		"\u048a\3\2\2\2\u0484\u0485\7\20\2\2\u0485\u0486\5\u00a8U\2\u0486\u0487"+
		"\5\u00a6T\2\u0487\u0488\7\21\2\2\u0488\u048a\3\2\2\2\u0489\u047d\3\2\2"+
		"\2\u0489\u0484\3\2\2\2\u048a\u00a5\3\2\2\2\u048b\u048d\5\u0156\u00ac\2"+
		"\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f"+
		"\7J\2\2\u048f\u00a7\3\2\2\2\u0490\u0492\5\u0156\u00ac\2\u0491\u0490\3"+
		"\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\7?\2\2\u0494"+
		"\u00a9\3\2\2\2\u0495\u0496\7\20\2\2\u0496\u0498\5\u00acW\2\u0497\u0499"+
		"\5\u00aeX\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2"+
		"\2\u049a\u049b\7\21\2\2\u049b\u04a4\3\2\2\2\u049c\u049d\7\20\2\2\u049d"+
		"\u049f\5\u00aeX\2\u049e\u04a0\5\u00acW\2\u049f\u049e\3\2\2\2\u049f\u04a0"+
		"\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\7\21\2\2\u04a2\u04a4\3\2\2\2"+
		"\u04a3\u0495\3\2\2\2\u04a3\u049c\3\2\2\2\u04a4\u00ab\3\2\2\2\u04a5\u04a7"+
		"\5\u0156\u00ac\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\3"+
		"\2\2\2\u04a8\u04aa\7K\2\2\u04a9\u04ab\5\u00a2R\2\u04aa\u04a9\3\2\2\2\u04aa"+
		"\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\5\u0084C\2\u04ad\u00ad"+
		"\3\2\2\2\u04ae\u04b0\5\u0156\u00ac\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3"+
		"\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\7L\2\2\u04b2\u04b4\5\u00a2R\2\u04b3"+
		"\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\5\u0084"+
		"C\2\u04b6\u00af\3\2\2\2\u04b7\u04b8\5\u00b2Z\2\u04b8\u04b9\5\u00b6\\\2"+
		"\u04b9\u00b1\3\2\2\2\u04ba\u04bc\5\u0156\u00ac\2\u04bb\u04ba\3\2\2\2\u04bb"+
		"\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bf\5\u0080A\2\u04be\u04bd"+
		"\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\7C\2\2\u04c1"+
		"\u04c2\5\u00b4[\2\u04c2\u00b3\3\2\2\2\u04c3\u04c4\5\u01ec\u00f7\2\u04c4"+
		"\u00b5\3\2\2\2\u04c5\u04c6\7I\2\2\u04c6\u04c7\5\u01ac\u00d7\2\u04c7\u00b7"+
		"\3\2\2\2\u04c8\u04c9\5\u00ba^\2\u04c9\u04cb\5\u00bc_\2\u04ca\u04cc\5b"+
		"\62\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"\u04ce\5\u00be`\2\u04ce\u04cf\5\u00c2b\2\u04cf\u04d8\3\2\2\2\u04d0\u04d1"+
		"\5\u00ba^\2\u04d1\u04d3\5\u00bc_\2\u04d2\u04d4\5b\62\2\u04d3\u04d2\3\2"+
		"\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\5\u00be`\2\u04d6"+
		"\u04d8\3\2\2\2\u04d7\u04c8\3\2\2\2\u04d7\u04d0\3\2\2\2\u04d8\u00b9\3\2"+
		"\2\2\u04d9\u04db\5\u0156\u00ac\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2"+
		"\2\u04db\u04dd\3\2\2\2\u04dc\u04de\5|?\2\u04dd\u04dc\3\2\2\2\u04dd\u04de"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\7G\2\2\u04e0\u00bb\3\2\2\2\u04e1"+
		"\u04e4\5\u01ec\u00f7\2\u04e2\u04e4\5\u01a4\u00d3\2\u04e3\u04e1\3\2\2\2"+
		"\u04e3\u04e2\3\2\2\2\u04e4\u00bd\3\2\2\2\u04e5\u04e7\5\u00c4c\2\u04e6"+
		"\u04e8\t\5\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea\3\2"+
		"\2\2\u04e9\u04eb\5\u00c0a\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u00bf\3\2\2\2\u04ec\u04ee\7O\2\2\u04ed\u04ef\5\u0156\u00ac\2\u04ee\u04ed"+
		"\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\5\u01ac\u00d7"+
		"\2\u04f1\u00c1\3\2\2\2\u04f2\u04f3\5\u0084C\2\u04f3\u00c3\3\2\2\2\u04f4"+
		"\u04f6\5\u00c6d\2\u04f5\u04f7\5\u00c4c\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7"+
		"\3\2\2\2\u04f7\u00c5\3\2\2\2\u04f8\u04f9\7\6\2\2\u04f9\u0502\7\7\2\2\u04fa"+
		"\u04fb\7\6\2\2\u04fb\u04fd\5\u00c8e\2\u04fc\u04fe\7P\2\2\u04fd\u04fc\3"+
		"\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\7\7\2\2\u0500"+
		"\u0502\3\2\2\2\u0501\u04f8\3\2\2\2\u0501\u04fa\3\2\2\2\u0502\u00c7\3\2"+
		"\2\2\u0503\u0508\5\u00caf\2\u0504\u0505\7\22\2\2\u0505\u0507\5\u00caf"+
		"\2\u0506\u0504\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u00c9\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u050d\5\u0156\u00ac"+
		"\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u0510"+
		"\7Q\2\2\u050f\u050e\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511"+
		"\u0513\7\34\2\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3"+
		"\2\2\2\u0514\u0516\7R\2\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516"+
		"\u0518\3\2\2\2\u0517\u0519\5\u00ccg\2\u0518\u0517\3\2\2\2\u0518\u0519"+
		"\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c\5\u00ceh\2\u051b\u051d\5\u01b6"+
		"\u00dc\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u0520\5\u00d0i\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u053e"+
		"\3\2\2\2\u0521\u0523\7Q\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u0526\7\35\2\2\u0525\u0527\7R\2\2\u0526\u0525\3\2"+
		"\2\2\u0526\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u052a\5\u00ccg\2\u0529"+
		"\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\5\u00ce"+
		"h\2\u052c\u052e\5\u01b6\u00dc\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2"+
		"\2\u052e\u0530\3\2\2\2\u052f\u0531\5\u00d0i\2\u0530\u052f\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u053e\3\2\2\2\u0532\u0534\5\u0156\u00ac\2\u0533\u0532"+
		"\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u053e\5\u01ac\u00d7"+
		"\2\u0536\u0538\5\u00ccg\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\3\2\2\2\u0539\u053a\5\u00ceh\2\u053a\u053b\5\u01b6\u00dc\2\u053b"+
		"\u053c\7P\2\2\u053c\u053e\3\2\2\2\u053d\u050c\3\2\2\2\u053d\u0522\3\2"+
		"\2\2\u053d\u0533\3\2\2\2\u053d\u0537\3\2\2\2\u053e\u00cb\3\2\2\2\u053f"+
		"\u0542\5\u01ec\u00f7\2\u0540\u0542\7S\2\2\u0541\u053f\3\2\2\2\u0541\u0540"+
		"\3\2\2\2\u0542\u00cd\3\2\2\2\u0543\u0546\5\u01ec\u00f7\2\u0544\u0546\7"+
		"S\2\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2\2\2\u0546\u00cf\3\2\2\2\u0547"+
		"\u0548\7I\2\2\u0548\u0549\5\u015e\u00b0\2\u0549\u00d1\3\2\2\2\u054a\u054c"+
		"\5\u0156\u00ac\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054e\3"+
		"\2\2\2\u054d\u054f\5\u0080A\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2"+
		"\u054f\u0550\3\2\2\2\u0550\u0551\5\u00d4k\2\u0551\u00d3\3\2\2\2\u0552"+
		"\u0555\5\u00d6l\2\u0553\u0555\5\u00e6t\2\u0554\u0552\3\2\2\2\u0554\u0553"+
		"\3\2\2\2\u0555\u00d5\3\2\2\2\u0556\u0558\7T\2\2\u0557\u0556\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\7E\2\2\u055a\u055c\5\u00e2"+
		"r\2\u055b\u055d\5b\62\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u055f\3\2\2\2\u055e\u0560\5\u01ce\u00e8\2\u055f\u055e\3\2\2\2\u055f\u0560"+
		"\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\7\20\2\2\u0562\u0564\5\u00d8"+
		"m\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u0566\7\21\2\2\u0566\u00d7\3\2\2\2\u0567\u0569\5\u00dan\2\u0568\u056a"+
		"\5\u00d8m\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u00d9\3\2\2"+
		"\2\u056b\u0571\5x=\2\u056c\u056e\5\u00dco\2\u056d\u056f\7\3\2\2\u056e"+
		"\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0571\3\2\2\2\u0570\u056b\3\2"+
		"\2\2\u0570\u056c\3\2\2\2\u0571\u00db\3\2\2\2\u0572\u0574\5\u0156\u00ac"+
		"\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575\u0577"+
		"\7T\2\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u0579\7\b\2\2\u0579\u057a\5\u00dep\2\u057a\u00dd\3\2\2\2\u057b\u0580"+
		"\5\u00e0q\2\u057c\u057d\7\22\2\2\u057d\u057f\5\u00e0q\2\u057e\u057c\3"+
		"\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u00df\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0585\5\u00e4s\2\u0584\u0586"+
		"\5\u01bc\u00df\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u00e1\3"+
		"\2\2\2\u0587\u0588\5\u01ec\u00f7\2\u0588\u00e3\3\2\2\2\u0589\u058a\5\u01ec"+
		"\u00f7\2\u058a\u00e5\3\2\2\2\u058b\u058c\7E\2\2\u058c\u058e\5\u00e2r\2"+
		"\u058d\u058f\5b\62\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0591"+
		"\3\2\2\2\u0590\u0592\5\u01ce\u00e8\2\u0591\u0590\3\2\2\2\u0591\u0592\3"+
		"\2\2\2\u0592\u0593\3\2\2\2\u0593\u0595\7\20\2\2\u0594\u0596\5\u00e8u\2"+
		"\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598"+
		"\7\21\2\2\u0598\u00e7\3\2\2\2\u0599\u059b\5\u00eav\2\u059a\u059c\5\u00e8"+
		"u\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u00e9\3\2\2\2\u059d"+
		"\u05a0\5x=\2\u059e\u05a0\5\u00ecw\2\u059f\u059d\3\2\2\2\u059f\u059e\3"+
		"\2\2\2\u05a0\u00eb\3\2\2\2\u05a1\u05a3\5\u0156\u00ac\2\u05a2\u05a1\3\2"+
		"\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\7\b\2\2\u05a5"+
		"\u05a6\5\u00eex\2\u05a6\u00ed\3\2\2\2\u05a7\u05ac\5\u00f0y\2\u05a8\u05a9"+
		"\7\22\2\2\u05a9\u05ab\5\u00f0y\2\u05aa\u05a8\3\2\2\2\u05ab\u05ae\3\2\2"+
		"\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u00ef\3\2\2\2\u05ae\u05ac"+
		"\3\2\2\2\u05af\u05b1\5\u00e4s\2\u05b0\u05b2\5\u00f2z\2\u05b1\u05b0\3\2"+
		"\2\2\u05b1\u05b2\3\2\2\2\u05b2\u00f1\3\2\2\2\u05b3\u05b4\7I\2\2\u05b4"+
		"\u05b5\5\u01f6\u00fc\2\u05b5\u00f3\3\2\2\2\u05b6\u05b8\5\u0156\u00ac\2"+
		"\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb"+
		"\5\u0080A\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2"+
		"\2\u05bc\u05bd\7D\2\2\u05bd\u05bf\5\u00f6|\2\u05be\u05c0\5b\62\2\u05bf"+
		"\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05c3\5\u01ce"+
		"\u00e8\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c5\5\u00f8}\2\u05c5\u00f5\3\2\2\2\u05c6\u05c7\5\u01ec\u00f7\2\u05c7"+
		"\u00f7\3\2\2\2\u05c8\u05ca\7\20\2\2\u05c9\u05cb\5z>\2\u05ca\u05c9\3\2"+
		"\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\7\21\2\2\u05cd"+
		"\u00f9\3\2\2\2\u05ce\u05d0\5\u0156\u00ac\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0"+
		"\3\2\2\2\u05d0\u05d4\3\2\2\2\u05d1\u05d3\5~@\2\u05d2\u05d1\3\2\2\2\u05d3"+
		"\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2"+
		"\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d8\7,\2\2\u05d8\u05da\5\u00fc\177\2"+
		"\u05d9\u05db\5b\62\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd"+
		"\3\2\2\2\u05dc\u05de\5\u01ce\u00e8\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3"+
		"\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\5\u00fe\u0080\2\u05e0\u00fb\3\2"+
		"\2\2\u05e1\u05e2\5\u01ec\u00f7\2\u05e2\u00fd\3\2\2\2\u05e3\u05e5\7\20"+
		"\2\2\u05e4\u05e6\5z>\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\7\21\2\2\u05e8\u00ff\3\2\2\2\u05e9\u05eb\5\u0156"+
		"\u00ac\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec"+
		"\u05ee\5\u0080A\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef"+
		"\3\2\2\2\u05ef\u05f0\7F\2\2\u05f0\u05f2\5\u0102\u0082\2\u05f1\u05f3\5"+
		"\u01ce\u00e8\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2"+
		"\2\2\u05f4\u05f5\5\u0104\u0083\2\u05f5\u0101\3\2\2\2\u05f6\u05f7\5\u01ec"+
		"\u00f7\2\u05f7\u0103\3\2\2\2\u05f8\u05fa\7\20\2\2\u05f9\u05fb\5\u0108"+
		"\u0085\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc"+
		"\u05fd\7\21\2\2\u05fd\u0105\3\2\2\2\u05fe\u0600\5\u010a\u0086\2\u05ff"+
		"\u0601\7\3\2\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0613\3\2"+
		"\2\2\u0602\u0604\5\u010c\u0087\2\u0603\u0605\7\3\2\2\u0604\u0603\3\2\2"+
		"\2\u0604\u0605\3\2\2\2\u0605\u0613\3\2\2\2\u0606\u0608\5\u010e\u0088\2"+
		"\u0607\u0609\7\3\2\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u0613"+
		"\3\2\2\2\u060a\u060c\5\u0110\u0089\2\u060b\u060d\7\3\2\2\u060c\u060b\3"+
		"\2\2\2\u060c\u060d\3\2\2\2\u060d\u0613\3\2\2\2\u060e\u0610\5\u0112\u008a"+
		"\2\u060f\u0611\7\3\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613"+
		"\3\2\2\2\u0612\u05fe\3\2\2\2\u0612\u0602\3\2\2\2\u0612\u0606\3\2\2\2\u0612"+
		"\u060a\3\2\2\2\u0612\u060e\3\2\2\2\u0613\u0107\3\2\2\2\u0614\u0616\5\u0106"+
		"\u0084\2\u0615\u0617\5\u0108\u0085\2\u0616\u0615\3\2\2\2\u0616\u0617\3"+
		"\2\2\2\u0617\u0109\3\2\2\2\u0618\u0619\5\u0098M\2\u0619\u061a\5\u009a"+
		"N\2\u061a\u061b\5\u01b6\u00dc\2\u061b\u061c\5\u00a4S\2\u061c\u010b\3\2"+
		"\2\2\u061d\u061e\5\u00ba^\2\u061e\u0620\5\u00bc_\2\u061f\u0621\5b\62\2"+
		"\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623"+
		"\5\u00be`\2\u0623\u010d\3\2\2\2\u0624\u0626\5\u0116\u008c\2\u0625\u0627"+
		"\5b\62\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628"+
		"\u062a\5\u00c6d\2\u0629\u062b\t\5\2\2\u062a\u0629\3\2\2\2\u062a\u062b"+
		"\3\2\2\2\u062b\u010f\3\2\2\2\u062c\u062d\5\u0122\u0092\2\u062d\u062e\5"+
		"\u0124\u0093\2\u062e\u062f\5\u00a4S\2\u062f\u0111\3\2\2\2\u0630\u0632"+
		"\5\u00b2Z\2\u0631\u0633\5\u01ce\u00e8\2\u0632\u0631\3\2\2\2\u0632\u0633"+
		"\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\5\u00b6\\\2\u0635\u0634\3\2\2"+
		"\2\u0635\u0636\3\2\2\2\u0636\u0113\3\2\2\2\u0637\u0639\5\u0116\u008c\2"+
		"\u0638\u063a\5b\62\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b"+
		"\3\2\2\2\u063b\u063d\5\u00c6d\2\u063c\u063e\t\5\2\2\u063d\u063c\3\2\2"+
		"\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\5\u0118\u008d\2"+
		"\u0640\u0115\3\2\2\2\u0641\u0643\5\u0156\u00ac\2\u0642\u0641\3\2\2\2\u0642"+
		"\u0643\3\2\2\2\u0643\u0645\3\2\2\2\u0644\u0646\5|?\2\u0645\u0644\3\2\2"+
		"\2\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0649\7U\2\2\u0648\u064a"+
		"\t\6\2\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u0117\3\2\2\2\u064b"+
		"\u064c\5\u0084C\2\u064c\u0119\3\2\2\2\u064d\u064f\5\u0156\u00ac\2\u064e"+
		"\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\7X"+
		"\2\2\u0651\u0652\5\u0084C\2\u0652\u011b\3\2\2\2\u0653\u0655\5\u0156\u00ac"+
		"\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0658"+
		"\5\u0080A\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u0659\3\2\2"+
		"\2\u0659\u065a\7Y\2\2\u065a\u065c\5\u01b8\u00dd\2\u065b\u065d\5h\65\2"+
		"\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065f\3\2\2\2\u065e\u0660"+
		"\5\u01ce\u00e8\2\u065f\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661\3"+
		"\2\2\2\u0661\u0662\5\u011e\u0090\2\u0662\u011d\3\2\2\2\u0663\u0665\7\20"+
		"\2\2\u0664\u0666\5z>\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667"+
		"\3\2\2\2\u0667\u0668\7\21\2\2\u0668\u011f\3\2\2\2\u0669\u066a\5\u0122"+
		"\u0092\2\u066a\u066b\5\u0124\u0093\2\u066b\u066c\5\u009cO\2\u066c\u0676"+
		"\3\2\2\2\u066d\u066e\5\u0122\u0092\2\u066e\u066f\5\u0124\u0093\2\u066f"+
		"\u0670\5\u00a4S\2\u0670\u0676\3\2\2\2\u0671\u0672\5\u0122\u0092\2\u0672"+
		"\u0673\5\u0124\u0093\2\u0673\u0674\5\u0084C\2\u0674\u0676\3\2\2\2\u0675"+
		"\u0669\3\2\2\2\u0675\u066d\3\2\2\2\u0675\u0671\3\2\2\2\u0676\u0121\3\2"+
		"\2\2\u0677\u0679\5\u0156\u00ac\2\u0678\u0677\3\2\2\2\u0678\u0679\3\2\2"+
		"\2\u0679\u067b\3\2\2\2\u067a\u067c\5|?\2\u067b\u067a\3\2\2\2\u067b\u067c"+
		"\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\7Z\2\2\u067e\u067f\5\u00c6d\2"+
		"\u067f\u0123\3\2\2\2\u0680\u0682\7O\2\2\u0681\u0683\5\u0156\u00ac\2\u0682"+
		"\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\5\u01ac"+
		"\u00d7\2\u0685\u0125\3\2\2\2\u0686\u068a\5\u0128\u0095\2\u0687\u068a\5"+
		"\u012a\u0096\2\u0688\u068a\5\u012c\u0097\2\u0689\u0686\3\2\2\2\u0689\u0687"+
		"\3\2\2\2\u0689\u0688\3\2\2\2\u068a\u0127\3\2\2\2\u068b\u068c\7\67\2\2"+
		"\u068c\u068d\7[\2\2\u068d\u068e\5\u01a4\u00d3\2\u068e\u068f\7\20\2\2\u068f"+
		"\u0690\7\21\2\2\u0690\u0129\3\2\2\2\u0691\u0692\7\66\2\2\u0692\u0693\7"+
		"[\2\2\u0693\u0694\5\u01a4\u00d3\2\u0694\u0695\7\20\2\2\u0695\u0696\7\21"+
		"\2\2\u0696\u012b\3\2\2\2\u0697\u0698\7\60\2\2\u0698\u0699\7[\2\2\u0699"+
		"\u069a\5\u01a4\u00d3\2\u069a\u069b\7\20\2\2\u069b\u069c\5\u012e\u0098"+
		"\2\u069c\u069d\7\21\2\2\u069d\u012d\3\2\2\2\u069e\u06a0\5\u0130\u0099"+
		"\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u06a3"+
		"\5\u0134\u009b\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06ab\3"+
		"\2\2\2\u06a4\u06a6\5\u0134\u009b\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2"+
		"\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a9\5\u0130\u0099\2\u06a8\u06a7\3\2\2"+
		"\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2\2\2\u06aa\u069f\3\2\2\2\u06aa\u06a5"+
		"\3\2\2\2\u06ab\u012f\3\2\2\2\u06ac\u06ad\7\\\2\2\u06ad\u06ae\5\u0132\u009a"+
		"\2\u06ae\u0131\3\2\2\2\u06af\u06b0\5\u01fa\u00fe\2\u06b0\u0133\3\2\2\2"+
		"\u06b1\u06b2\7]\2\2\u06b2\u06b3\5\u0136\u009c\2\u06b3\u0135\3\2\2\2\u06b4"+
		"\u06b5\t\7\2\2\u06b5\u0137\3\2\2\2\u06b6\u06b7\b\u009d\1\2\u06b7\u06b9"+
		"\5\u013a\u009e\2\u06b8\u06ba\5\u01b6\u00dc\2\u06b9\u06b8\3\2\2\2\u06b9"+
		"\u06ba\3\2\2\2\u06ba\u06c9\3\2\2\2\u06bb\u06bd\5\u013c\u009f\2\u06bc\u06be"+
		"\5\u01b6\u00dc\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c9\3"+
		"\2\2\2\u06bf\u06c9\5\u013e\u00a0\2\u06c0\u06c2\5\u0140\u00a1\2\u06c1\u06c3"+
		"\5\u01b6\u00dc\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c9\3"+
		"\2\2\2\u06c4\u06c9\5\u0146\u00a4\2\u06c5\u06c6\7a\2\2\u06c6\u06c9\5\u01ac"+
		"\u00d7\2\u06c7\u06c9\5\u014e\u00a8\2\u06c8\u06b6\3\2\2\2\u06c8\u06bb\3"+
		"\2\2\2\u06c8\u06bf\3\2\2\2\u06c8\u06c0\3\2\2\2\u06c8\u06c4\3\2\2\2\u06c8"+
		"\u06c5\3\2\2\2\u06c8\u06c7\3\2\2\2\u06c9\u06cf\3\2\2\2\u06ca\u06cb\f\4"+
		"\2\2\u06cb\u06cc\7b\2\2\u06cc\u06ce\5\u01ac\u00d7\2\u06cd\u06ca\3\2\2"+
		"\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u0139"+
		"\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06d3\7S\2\2\u06d3\u013b\3\2\2\2\u06d4"+
		"\u06d5\5\u01ec\u00f7\2\u06d5\u013d\3\2\2\2\u06d6\u06d7\7\35\2\2\u06d7"+
		"\u06db\5\u0138\u009d\2\u06d8\u06d9\7\34\2\2\u06d9\u06db\5\u0138\u009d"+
		"\2\u06da\u06d6\3\2\2\2\u06da\u06d8\3\2\2\2\u06db\u013f\3\2\2\2\u06dc\u06de"+
		"\7\6\2\2\u06dd\u06df\5\u0142\u00a2\2\u06de\u06dd\3\2\2\2\u06de\u06df\3"+
		"\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\7\7\2\2\u06e1\u0141\3\2\2\2\u06e2"+
		"\u06e7\5\u0144\u00a3\2\u06e3\u06e4\7\22\2\2\u06e4\u06e6\5\u0144\u00a3"+
		"\2\u06e5\u06e3\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7\u06e8"+
		"\3\2\2\2\u06e8\u0143\3\2\2\2\u06e9\u06e7\3\2\2\2\u06ea\u06eb\5\u0138\u009d"+
		"\2\u06eb\u0145\3\2\2\2\u06ec\u06ee\5\u01b8\u00dd\2\u06ed\u06ec\3\2\2\2"+
		"\u06ed\u06ee\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06f1\7H\2\2\u06f0\u06ef"+
		"\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f4\5\u00e4s"+
		"\2\u06f3\u06f5\5\u0140\u00a1\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2"+
		"\u06f5\u0147\3\2\2\2\u06f6\u06f9\5\u014a\u00a6\2\u06f7\u06f9\5\u014c\u00a7"+
		"\2\u06f8\u06f6\3\2\2\2\u06f8\u06f7\3\2\2\2\u06f9\u0149\3\2\2\2\u06fa\u06fb"+
		"\7a\2\2\u06fb\u06fc\5\u01ac\u00d7\2\u06fc\u014b\3\2\2\2\u06fd\u06fe\5"+
		"\u0138\u009d\2\u06fe\u06ff\7b\2\2\u06ff\u0700\5\u01ac\u00d7\2\u0700\u014d"+
		"\3\2\2\2\u0701\u0702\5\u015e\u00b0\2\u0702\u014f\3\2\2\2\u0703\u0704\7"+
		"c\2\2\u0704\u0706\5\u0152\u00aa\2\u0705\u0707\5\u0154\u00ab\2\u0706\u0705"+
		"\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0151\3\2\2\2\u0708\u0709\5\u01ec\u00f7"+
		"\2\u0709\u0153\3\2\2\2\u070a\u070c\7\6\2\2\u070b\u070d\5\u0158\u00ad\2"+
		"\u070c\u070b\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f"+
		"\7\7\2\2\u070f\u0155\3\2\2\2\u0710\u0712\5\u0150\u00a9\2\u0711\u0710\3"+
		"\2\2\2\u0712\u0713\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714"+
		"\u0157\3\2\2\2\u0715\u0717\5\u015a\u00ae\2\u0716\u0718\5\u0158\u00ad\2"+
		"\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0159\3\2\2\2\u0719\u071b"+
		"\7\6\2\2\u071a\u071c\5\u0158\u00ad\2\u071b\u071a\3\2\2\2\u071b\u071c\3"+
		"\2\2\2\u071c\u071d\3\2\2\2\u071d\u0739\7\7\2\2\u071e\u0720\7d\2\2\u071f"+
		"\u0721\5\u0158\u00ad\2\u0720\u071f\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722"+
		"\3\2\2\2\u0722\u0739\7e\2\2\u0723\u0725\7\20\2\2\u0724\u0726\5\u0158\u00ad"+
		"\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0739"+
		"\7\21\2\2\u0728\u0739\5\u01ec\u00f7\2\u0729\u0739\5\u015e\u00b0\2\u072a"+
		"\u0739\5\u01f0\u00f9\2\u072b\u0739\5\u01f6\u00fc\2\u072c\u0739\5\u01a4"+
		"\u00d3\2\u072d\u0739\7\4\2\2\u072e\u0739\7\3\2\2\u072f\u0739\7\22\2\2"+
		"\u0730\u0739\7W\2\2\u0731\u0739\7)\2\2\u0732\u0739\7*\2\2\u0733\u0739"+
		"\7f\2\2\u0734\u0739\7g\2\2\u0735\u0739\7h\2\2\u0736\u0739\7P\2\2\u0737"+
		"\u0739\7i\2\2\u0738\u0719\3\2\2\2\u0738\u071e\3\2\2\2\u0738\u0723\3\2"+
		"\2\2\u0738\u0728\3\2\2\2\u0738\u0729\3\2\2\2\u0738\u072a\3\2\2\2\u0738"+
		"\u072b\3\2\2\2\u0738\u072c\3\2\2\2\u0738\u072d\3\2\2\2\u0738\u072e\3\2"+
		"\2\2\u0738\u072f\3\2\2\2\u0738\u0730\3\2\2\2\u0738\u0731\3\2\2\2\u0738"+
		"\u0732\3\2\2\2\u0738\u0733\3\2\2\2\u0738\u0734\3\2\2\2\u0738\u0735\3\2"+
		"\2\2\u0738\u0736\3\2\2\2\u0738\u0737\3\2\2\2\u0739\u015b\3\2\2\2\u073a"+
		"\u073f\5\u015e\u00b0\2\u073b\u073c\7\22\2\2\u073c\u073e\5\u015e\u00b0"+
		"\2\u073d\u073b\3\2\2\2\u073e\u0741\3\2\2\2\u073f\u073d\3\2\2\2\u073f\u0740"+
		"\3\2\2\2\u0740\u015d\3\2\2\2\u0741\u073f\3\2\2\2\u0742\u0744\5\u0164\u00b3"+
		"\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0749"+
		"\5\u0160\u00b1\2\u0746\u0748\5\u0166\u00b4\2\u0747\u0746\3\2\2\2\u0748"+
		"\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u015f\3\2"+
		"\2\2\u074b\u0749\3\2\2\2\u074c\u074e\5\u01a8\u00d5\2\u074d\u074c\3\2\2"+
		"\2\u074d\u074e\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0751\5\u019e\u00d0\2"+
		"\u0750\u0752\7\3\2\2\u0751\u0750\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0755"+
		"\3\2\2\2\u0753\u0755\5\u0162\u00b2\2\u0754\u074d\3\2\2\2\u0754\u0753\3"+
		"\2\2\2\u0755\u0161\3\2\2\2\u0756\u0757\7j\2\2\u0757\u0758\5\u01ec\u00f7"+
		"\2\u0758\u0163\3\2\2\2\u0759\u075b\7k\2\2\u075a\u075c\t\6\2\2\u075b\u075a"+
		"\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u0165\3\2\2\2\u075d\u075e\5\u01a6\u00d4"+
		"\2\u075e\u075f\5\u0160\u00b1\2\u075f\u076e\3\2\2\2\u0760\u0762\5\u0168"+
		"\u00b5\2\u0761\u0763\5\u0164\u00b3\2\u0762\u0761\3\2\2\2\u0762\u0763\3"+
		"\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\5\u0160\u00b1\2\u0765\u076e\3\2"+
		"\2\2\u0766\u0768\5\u016a\u00b6\2\u0767\u0769\5\u0164\u00b3\2\u0768\u0767"+
		"\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\5\u0160\u00b1"+
		"\2\u076b\u076e\3\2\2\2\u076c\u076e\5\u016c\u00b7\2\u076d\u075d\3\2\2\2"+
		"\u076d\u0760\3\2\2\2\u076d\u0766\3\2\2\2\u076d\u076c\3\2\2\2\u076e\u0167"+
		"\3\2\2\2\u076f\u0770\7I\2\2\u0770\u0169\3\2\2\2\u0771\u0773\7V\2\2\u0772"+
		"\u0774\5\u0164\u00b3\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0776\5\u015e\u00b0\2\u0776\u0777\7\4\2\2\u0777\u016b\3"+
		"\2\2\2\u0778\u0779\7a\2\2\u0779\u0783\5\u01ac\u00d7\2\u077a\u077b\7b\2"+
		"\2\u077b\u077c\7V\2\2\u077c\u0783\5\u01ac\u00d7\2\u077d\u077e\7b\2\2\u077e"+
		"\u0783\5\u01ac\u00d7\2\u077f\u0780\7b\2\2\u0780\u0781\7W\2\2\u0781\u0783"+
		"\5\u01ac\u00d7\2\u0782\u0778\3\2\2\2\u0782\u077a\3\2\2\2\u0782\u077d\3"+
		"\2\2\2\u0782\u077f\3\2\2\2\u0783\u016d\3\2\2\2\u0784\u0787\5\u01ec\u00f7"+
		"\2\u0785\u0787\5\u01a4\u00d3\2\u0786\u0784\3\2\2\2\u0786\u0785\3\2\2\2"+
		"\u0787\u0789\3\2\2\2\u0788\u078a\5r:\2\u0789\u0788\3\2\2\2\u0789\u078a"+
		"\3\2\2\2\u078a\u0793\3\2\2\2\u078b\u0793\5\u0170\u00b9\2\u078c\u0793\5"+
		"\u017e\u00c0\2\u078d\u0793\5\u0180\u00c1\2\u078e\u0793\5\u0188\u00c5\2"+
		"\u078f\u0793\5\u0196\u00cc\2\u0790\u0793\5\u0194\u00cb\2\u0791\u0793\5"+
		"\u019c\u00cf\2\u0792\u0786\3\2\2\2\u0792\u078b\3\2\2\2\u0792\u078c\3\2"+
		"\2\2\u0792\u078d\3\2\2\2\u0792\u078e\3\2\2\2\u0792\u078f\3\2\2\2\u0792"+
		"\u0790\3\2\2\2\u0792\u0791\3\2\2\2\u0793\u016f\3\2\2\2\u0794\u079c\5\u01f6"+
		"\u00fc\2\u0795\u079c\5\u0172\u00ba\2\u0796\u079c\5\u0178\u00bd\2\u0797"+
		"\u079c\7l\2\2\u0798\u079c\7m\2\2\u0799\u079c\7n\2\2\u079a\u079c\7o\2\2"+
		"\u079b\u0794\3\2\2\2\u079b\u0795\3\2\2\2\u079b\u0796\3\2\2\2\u079b\u0797"+
		"\3\2\2\2\u079b\u0798\3\2\2\2\u079b\u0799\3\2\2\2\u079b\u079a\3\2\2\2\u079c"+
		"\u0171\3\2\2\2\u079d\u079f\7d\2\2\u079e\u07a0\5\u0174\u00bb\2\u079f\u079e"+
		"\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07a2\7e\2\2\u07a2"+
		"\u0173\3\2\2\2\u07a3\u07a8\5\u0176\u00bc\2\u07a4\u07a5\7\22\2\2\u07a5"+
		"\u07a7\5\u0176\u00bc\2\u07a6\u07a4\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6"+
		"\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07ac\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab"+
		"\u07ad\7\22\2\2\u07ac\u07ab\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u0175\3"+
		"\2\2\2\u07ae\u07af\5\u015e\u00b0\2\u07af\u0177\3\2\2\2\u07b0\u07b1\7d"+
		"\2\2\u07b1\u07b2\5\u017a\u00be\2\u07b2\u07b3\7e\2\2\u07b3\u07b8\3\2\2"+
		"\2\u07b4\u07b5\7d\2\2\u07b5\u07b6\7\4\2\2\u07b6\u07b8\7e\2\2\u07b7\u07b0"+
		"\3\2\2\2\u07b7\u07b4\3\2\2\2\u07b8\u0179\3\2\2\2\u07b9\u07be\5\u017c\u00bf"+
		"\2\u07ba\u07bb\7\22\2\2\u07bb\u07bd\5\u017c\u00bf\2\u07bc\u07ba\3\2\2"+
		"\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c2"+
		"\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1\u07c3\7\22\2\2\u07c2\u07c1\3\2\2\2"+
		"\u07c2\u07c3\3\2\2\2\u07c3\u017b\3\2\2\2\u07c4\u07c5\5\u015e\u00b0\2\u07c5"+
		"\u07c6\7\4\2\2\u07c6\u07c7\5\u015e\u00b0\2\u07c7\u017d\3\2\2\2\u07c8\u07d5"+
		"\7p\2\2\u07c9\u07ca\7p\2\2\u07ca\u07cb\7H\2\2\u07cb\u07d5\5\u01ec\u00f7"+
		"\2\u07cc\u07cd\7p\2\2\u07cd\u07ce\7d\2\2\u07ce\u07cf\5\u015c\u00af\2\u07cf"+
		"\u07d0\7e\2\2\u07d0\u07d5\3\2\2\2\u07d1\u07d2\7p\2\2\u07d2\u07d3\7H\2"+
		"\2\u07d3\u07d5\7U\2\2\u07d4\u07c8\3\2\2\2\u07d4\u07c9\3\2\2\2\u07d4\u07cc"+
		"\3\2\2\2\u07d4\u07d1\3\2\2\2\u07d5\u017f\3\2\2\2\u07d6\u07da\5\u0182\u00c2"+
		"\2\u07d7\u07da\5\u0184\u00c3\2\u07d8\u07da\5\u0186\u00c4\2\u07d9\u07d6"+
		"\3\2\2\2\u07d9\u07d7\3\2\2\2\u07d9\u07d8\3\2\2\2\u07da\u0181\3\2\2\2\u07db"+
		"\u07dc\7q\2\2\u07dc\u07dd\7H\2\2\u07dd\u07de\5\u01ec\u00f7\2\u07de\u0183"+
		"\3\2\2\2\u07df\u07e0\7q\2\2\u07e0\u07e1\7d\2\2\u07e1\u07e2\5\u015c\u00af"+
		"\2\u07e2\u07e3\7e\2\2\u07e3\u0185\3\2\2\2\u07e4\u07e5\7q\2\2\u07e5\u07e6"+
		"\7H\2\2\u07e6\u07e7\7U\2\2\u07e7\u0187\3\2\2\2\u07e8\u07ea\7\20\2\2\u07e9"+
		"\u07eb\5\u018a\u00c6\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ed"+
		"\3\2\2\2\u07ec\u07ee\5\6\4\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u07f0\7\21\2\2\u07f0\u0189\3\2\2\2\u07f1\u07f3\5"+
		"\u00c6d\2\u07f2\u07f4\5\u00c0a\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2"+
		"\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\7\t\2\2\u07f6\u080f\3\2\2\2\u07f7\u07f9"+
		"\5\u01f2\u00fa\2\u07f8\u07fa\5\u00c0a\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa"+
		"\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc\7\t\2\2\u07fc\u080f\3\2\2\2\u07fd"+
		"\u07fe\5\u018c\u00c7\2\u07fe\u0800\5\u00c6d\2\u07ff\u0801\5\u00c0a\2\u0800"+
		"\u07ff\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\7\t"+
		"\2\2\u0803\u080f\3\2\2\2\u0804\u0805\5\u018c\u00c7\2\u0805\u0807\5\u01f2"+
		"\u00fa\2\u0806\u0808\5\u00c0a\2\u0807\u0806\3\2\2\2\u0807\u0808\3\2\2"+
		"\2\u0808\u0809\3\2\2\2\u0809\u080a\7\t\2\2\u080a\u080f\3\2\2\2\u080b\u080c"+
		"\5\u018c\u00c7\2\u080c\u080d\7\t\2\2\u080d\u080f\3\2\2\2\u080e\u07f1\3"+
		"\2\2\2\u080e\u07f7\3\2\2\2\u080e\u07fd\3\2\2\2\u080e\u0804\3\2\2\2\u080e"+
		"\u080b\3\2\2\2\u080f\u018b\3\2\2\2\u0810\u0811\7d\2\2\u0811\u0812\5\u018e"+
		"\u00c8\2\u0812\u0813\7e\2\2\u0813\u018d\3\2\2\2\u0814\u0817\5\u0190\u00c9"+
		"\2\u0815\u0816\7\22\2\2\u0816\u0818\5\u0190\u00c9\2\u0817\u0815\3\2\2"+
		"\2\u0817\u0818\3\2\2\2\u0818\u018f\3\2\2\2\u0819\u081b\5\u0192\u00ca\2"+
		"\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081d"+
		"\5\u015e\u00b0\2\u081d\u0191\3\2\2\2\u081e\u081f\t\b\2\2\u081f\u0193\3"+
		"\2\2\2\u0820\u0821\7H\2\2\u0821\u0822\5\u01ec\u00f7\2\u0822\u0195\3\2"+
		"\2\2\u0823\u0825\7\6\2\2\u0824\u0826\5\u0198\u00cd\2\u0825\u0824\3\2\2"+
		"\2\u0825\u0826\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\7\7\2\2\u0828\u0197"+
		"\3\2\2\2\u0829\u082e\5\u019a\u00ce\2\u082a\u082b\7\22\2\2\u082b\u082d"+
		"\5\u019a\u00ce\2\u082c\u082a\3\2\2\2\u082d\u0830\3\2\2\2\u082e\u082c\3"+
		"\2\2\2\u082e\u082f\3\2\2\2\u082f\u0199\3\2\2\2\u0830\u082e\3\2\2\2\u0831"+
		"\u0837\5\u015e\u00b0\2\u0832\u0833\5\u01ec\u00f7\2\u0833\u0834\7\4\2\2"+
		"\u0834\u0835\5\u015e\u00b0\2\u0835\u0837\3\2\2\2\u0836\u0831\3\2\2\2\u0836"+
		"\u0832\3\2\2\2\u0837\u019b\3\2\2\2\u0838\u0839\7S\2\2\u0839\u019d\3\2"+
		"\2\2\u083a\u083b\b\u00d0\1\2\u083b\u083c\5\u016e\u00b8\2\u083c\u0863\3"+
		"\2\2\2\u083d\u083e\f\r\2\2\u083e\u0862\5\u01aa\u00d6\2\u083f\u0841\f\f"+
		"\2\2\u0840\u0842\5\u0196\u00cc\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2"+
		"\2\u0842\u0843\3\2\2\2\u0843\u0862\5\u0188\u00c5\2\u0844\u0845\f\13\2"+
		"\2\u0845\u0862\5\u0196\u00cc\2\u0846\u0847\f\n\2\2\u0847\u0848\7H\2\2"+
		"\u0848\u0862\7U\2\2\u0849\u084a\f\t\2\2\u084a\u084b\7H\2\2\u084b\u0862"+
		"\7\u008f\2\2\u084c\u084d\f\b\2\2\u084d\u084e\7H\2\2\u084e\u0850\5\u01ec"+
		"\u00f7\2\u084f\u0851\5r:\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851"+
		"\u0862\3\2\2\2\u0852\u0853\f\7\2\2\u0853\u0854\7H\2\2\u0854\u0862\7p\2"+
		"\2\u0855\u0856\f\6\2\2\u0856\u0857\7H\2\2\u0857\u0862\7t\2\2\u0858\u0859"+
		"\f\5\2\2\u0859\u085a\7d\2\2\u085a\u085b\5\u015c\u00af\2\u085b\u085c\7"+
		"e\2\2\u085c\u0862\3\2\2\2\u085d\u085e\f\4\2\2\u085e\u0862\7W\2\2\u085f"+
		"\u0860\f\3\2\2\u0860\u0862\7V\2\2\u0861\u083d\3\2\2\2\u0861\u083f\3\2"+
		"\2\2\u0861\u0844\3\2\2\2\u0861\u0846\3\2\2\2\u0861\u0849\3\2\2\2\u0861"+
		"\u084c\3\2\2\2\u0861\u0852\3\2\2\2\u0861\u0855\3\2\2\2\u0861\u0858\3\2"+
		"\2\2\u0861\u085d\3\2\2\2\u0861\u085f\3\2\2\2\u0862\u0865\3\2\2\2\u0863"+
		"\u0861\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u019f\3\2\2\2\u0865\u0863\3\2"+
		"\2\2\u0866\u0867\t\t\2\2\u0867\u01a1\3\2\2\2\u0868\u086b\5\u01a0\u00d1"+
		"\2\u0869\u086b\7\u0089\2\2\u086a\u0868\3\2\2\2\u086a\u0869\3\2\2\2\u086b"+
		"\u01a3\3\2\2\2\u086c\u0870\5\u01a0\u00d1\2\u086d\u086f\5\u01a2\u00d2\2"+
		"\u086e\u086d\3\2\2\2\u086f\u0872\3\2\2\2\u0870\u086e\3\2\2\2\u0870\u0871"+
		"\3\2\2\2\u0871\u087c\3\2\2\2\u0872\u0870\3\2\2\2\u0873\u0877\7\u008a\2"+
		"\2\u0874\u0876\5\u01a2\u00d2\2\u0875\u0874\3\2\2\2\u0876\u0879\3\2\2\2"+
		"\u0877\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087c\3\2\2\2\u0879\u0877"+
		"\3\2\2\2\u087a\u087c\7P\2\2\u087b\u086c\3\2\2\2\u087b\u0873\3\2\2\2\u087b"+
		"\u087a\3\2\2\2\u087c\u01a5\3\2\2\2\u087d\u087e\5\u01a4\u00d3\2\u087e\u01a7"+
		"\3\2\2\2\u087f\u0880\5\u01a4\u00d3\2\u0880\u01a9\3\2\2\2\u0881\u0882\5"+
		"\u01a4\u00d3\2\u0882\u01ab\3\2\2\2\u0883\u0884\b\u00d7\1\2\u0884\u088a"+
		"\5\u01ae\u00d8\2\u0885\u088a\5\u01b0\u00d9\2\u0886\u088a\5\u01b8\u00dd"+
		"\2\u0887\u088a\5\u01bc\u00df\2\u0888\u088a\5\u01c6\u00e4\2\u0889\u0883"+
		"\3\2\2\2\u0889\u0885\3\2\2\2\u0889\u0886\3\2\2\2\u0889\u0887\3\2\2\2\u0889"+
		"\u0888\3\2\2\2\u088a\u08a1\3\2\2\2\u088b\u088d\f\13\2\2\u088c\u088e\7"+
		"M\2\2\u088d\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f"+
		"\u0890\7O\2\2\u0890\u08a0\5\u01ac\u00d7\f\u0891\u0892\f\n\2\2\u0892\u0893"+
		"\7N\2\2\u0893\u0894\7O\2\2\u0894\u08a0\5\u01ac\u00d7\13\u0895\u0896\f"+
		"\7\2\2\u0896\u08a0\7V\2\2\u0897\u0898\f\6\2\2\u0898\u08a0\7W\2\2\u0899"+
		"\u089a\f\4\2\2\u089a\u089b\7H\2\2\u089b\u08a0\7w\2\2\u089c\u089d\f\3\2"+
		"\2\u089d\u089e\7H\2\2\u089e\u08a0\7x\2\2\u089f\u088b\3\2\2\2\u089f\u0891"+
		"\3\2\2\2\u089f\u0895\3\2\2\2\u089f\u0897\3\2\2\2\u089f\u0899\3\2\2\2\u089f"+
		"\u089c\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u089f\3\2\2\2\u08a1\u08a2\3\2"+
		"\2\2\u08a2\u01ad\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a4\u08a5\7d\2\2\u08a5"+
		"\u08a6\5\u01ac\u00d7\2\u08a6\u08a7\7e\2\2\u08a7\u01af\3\2\2\2\u08a8\u08a9"+
		"\7d\2\2\u08a9\u08aa\5\u01ac\u00d7\2\u08aa\u08ab\7\4\2\2\u08ab\u08ac\5"+
		"\u01ac\u00d7\2\u08ac\u08ad\7e\2\2\u08ad\u01b1\3\2\2\2\u08ae\u08af\5\u01ac"+
		"\u00d7\2\u08af\u08b0\7V\2\2\u08b0\u01b3\3\2\2\2\u08b1\u08b2\5\u01ac\u00d7"+
		"\2\u08b2\u08b3\7W\2\2\u08b3\u01b5\3\2\2\2\u08b4\u08b6\7\4\2\2\u08b5\u08b7"+
		"\5\u0156\u00ac\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3"+
		"\2\2\2\u08b8\u08b9\5\u01ac\u00d7\2\u08b9\u01b7\3\2\2\2\u08ba\u08bc\5\u01ba"+
		"\u00de\2\u08bb\u08bd\5r:\2\u08bc\u08bb\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd"+
		"\u08c7\3\2\2\2\u08be\u08c0\5\u01ba\u00de\2\u08bf\u08c1\5r:\2\u08c0\u08bf"+
		"\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c3\7H\2\2\u08c3"+
		"\u08c4\5\u01b8\u00dd\2\u08c4\u08c7\3\2\2\2\u08c5\u08c7\7y\2\2\u08c6\u08ba"+
		"\3\2\2\2\u08c6\u08be\3\2\2\2\u08c6\u08c5\3\2\2\2\u08c7\u01b9\3\2\2\2\u08c8"+
		"\u08c9\5\u01ec\u00f7\2\u08c9\u01bb\3\2\2\2\u08ca\u08cc\7\6\2\2\u08cb\u08cd"+
		"\5\u01be\u00e0\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08ce\3"+
		"\2\2\2\u08ce\u08cf\7\7\2\2\u08cf\u01bd\3\2\2\2\u08d0\u08d2\5\u01c0\u00e1"+
		"\2\u08d1\u08d3\7P\2\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u01bf"+
		"\3\2\2\2\u08d4\u08da\5\u01c2\u00e2\2\u08d5\u08d6\5\u01c2\u00e2\2\u08d6"+
		"\u08d7\7\22\2\2\u08d7\u08d8\5\u01c0\u00e1\2\u08d8\u08da\3\2\2\2\u08d9"+
		"\u08d4\3\2\2\2\u08d9\u08d5\3\2\2\2\u08da\u01c1\3\2\2\2\u08db\u08dd\5\u0156"+
		"\u00ac\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08df\3\2\2\2\u08de"+
		"\u08e0\7Q\2\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e1\3\2"+
		"\2\2\u08e1\u08e9\5\u01ac\u00d7\2\u08e2\u08e4\7Q\2\2\u08e3\u08e2\3\2\2"+
		"\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\5\u01c4\u00e3\2"+
		"\u08e6\u08e7\5\u01b6\u00dc\2\u08e7\u08e9\3\2\2\2\u08e8\u08dc\3\2\2\2\u08e8"+
		"\u08e3\3\2\2\2\u08e9\u01c3\3\2\2\2\u08ea\u08eb\5\u01ec\u00f7\2\u08eb\u01c5"+
		"\3\2\2\2\u08ec\u08ed\7F\2\2\u08ed\u08ef\7)\2\2\u08ee\u08f0\5\u01c8\u00e5"+
		"\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2"+
		"\7*\2\2\u08f2\u01c7\3\2\2\2\u08f3\u08f9\5\u01ca\u00e6\2\u08f4\u08f5\5"+
		"\u01ca\u00e6\2\u08f5\u08f6\7\22\2\2\u08f6\u08f7\5\u01c8\u00e5\2\u08f7"+
		"\u08f9\3\2\2\2\u08f8\u08f3\3\2\2\2\u08f8\u08f4\3\2\2\2\u08f9\u01c9\3\2"+
		"\2\2\u08fa\u08fb\5\u01b8\u00dd\2\u08fb\u01cb\3\2\2\2\u08fc\u08fd\5\u01ac"+
		"\u00d7\2\u08fd\u08fe\7H\2\2\u08fe\u08ff\7w\2\2\u08ff\u0905\3\2\2\2\u0900"+
		"\u0901\5\u01ac\u00d7\2\u0901\u0902\7H\2\2\u0902\u0903\7x\2\2\u0903\u0905"+
		"\3\2\2\2\u0904\u08fc\3\2\2\2\u0904\u0900\3\2\2\2\u0905\u01cd\3\2\2\2\u0906"+
		"\u0907\7\4\2\2\u0907\u0908\5\u01d2\u00ea\2\u0908\u0909\7\22\2\2\u0909"+
		"\u090a\5\u01d0\u00e9\2\u090a\u0910\3\2\2\2\u090b\u090c\7\4\2\2\u090c\u0910"+
		"\5\u01d2\u00ea\2\u090d\u090e\7\4\2\2\u090e\u0910\5\u01d0\u00e9\2\u090f"+
		"\u0906\3\2\2\2\u090f\u090b\3\2\2\2\u090f\u090d\3\2\2\2\u0910\u01cf\3\2"+
		"\2\2\u0911\u0916\5\u01b8\u00dd\2\u0912\u0913\7\22\2\2\u0913\u0915\5\u01b8"+
		"\u00dd\2\u0914\u0912\3\2\2\2\u0915\u0918\3\2\2\2\u0916\u0914\3\2\2\2\u0916"+
		"\u0917\3\2\2\2\u0917\u01d1\3\2\2\2\u0918\u0916\3\2\2\2\u0919\u091a\7,"+
		"\2\2\u091a\u01d3\3\2\2\2\u091b\u091e\5\u01d6\u00ec\2\u091c\u091e\5\u01e6"+
		"\u00f4\2\u091d\u091b\3\2\2\2\u091d\u091c\3\2\2\2\u091e\u01d5\3\2\2\2\u091f"+
		"\u0920\7z\2\2\u0920\u0922\5\u01de\u00f0\2\u0921\u0923\5\6\4\2\u0922\u0921"+
		"\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0925\3\2\2\2\u0924\u0926\5\u01d8\u00ed"+
		"\2\u0925\u0924\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0928\3\2\2\2\u0927\u0929"+
		"\5\u01dc\u00ef\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092a\3"+
		"\2\2\2\u092a\u092b\7{\2\2\u092b\u01d7\3\2\2\2\u092c\u092e\5\u01da\u00ee"+
		"\2\u092d\u092c\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u092d\3\2\2\2\u092f\u0930"+
		"\3\2\2\2\u0930\u01d9\3\2\2\2\u0931\u0932\7|\2\2\u0932\u0934\5\u01de\u00f0"+
		"\2\u0933\u0935\5\6\4\2\u0934\u0933\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u01db"+
		"\3\2\2\2\u0936\u0938\7}\2\2\u0937\u0939\5\6\4\2\u0938\u0937\3\2\2\2\u0938"+
		"\u0939\3\2\2\2\u0939\u01dd\3\2\2\2\u093a\u093b\b\u00f0\1\2\u093b\u093c"+
		"\7W\2\2\u093c\u0945\5\u01de\u00f0\4\u093d\u0945\5\u01e0\u00f1\2\u093e"+
		"\u0945\5\u01ec\u00f7\2\u093f\u0945\5\u01f4\u00fb\2\u0940\u0941\7\6\2\2"+
		"\u0941\u0942\5\u01de\u00f0\2\u0942\u0943\7\7\2\2\u0943\u0945\3\2\2\2\u0944"+
		"\u093a\3\2\2\2\u0944\u093d\3\2\2\2\u0944\u093e\3\2\2\2\u0944\u093f\3\2"+
		"\2\2\u0944\u0940\3\2\2\2\u0945\u094b\3\2\2\2\u0946\u0947\f\3\2\2\u0947"+
		"\u0948\t\n\2\2\u0948\u094a\5\u01de\u00f0\4\u0949\u0946\3\2\2\2\u094a\u094d"+
		"\3\2\2\2\u094b\u0949\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u01df\3\2\2\2\u094d"+
		"\u094b\3\2\2\2\u094e\u094f\7~\2\2\u094f\u0950\7\6\2\2\u0950\u0951\5\u01e2"+
		"\u00f2\2\u0951\u0952\7\7\2\2\u0952\u0959\3\2\2\2\u0953\u0954\7\177\2\2"+
		"\u0954\u0955\7\6\2\2\u0955\u0956\5\u01e4\u00f3\2\u0956\u0957\7\7\2\2\u0957"+
		"\u0959\3\2\2\2\u0958\u094e\3\2\2\2\u0958\u0953\3\2\2\2\u0959\u01e1\3\2"+
		"\2\2\u095a\u095b\t\13\2\2\u095b\u01e3\3\2\2\2\u095c\u095d\t\f\2\2\u095d"+
		"\u01e5\3\2\2\2\u095e\u0962\7\u0084\2\2\u095f\u0960\5\u01e8\u00f5\2\u0960"+
		"\u0961\5\u01ea\u00f6\2\u0961\u0963\3\2\2\2\u0962\u095f\3\2\2\2\u0962\u0963"+
		"\3\2\2\2\u0963\u01e7\3\2\2\2\u0964\u0965\5\u01fa\u00fe\2\u0965\u01e9\3"+
		"\2\2\2\u0966\u0967\7\u0093\2\2\u0967\u01eb\3\2\2\2\u0968\u096b\7\u008b"+
		"\2\2\u0969\u096b\5\u01f0\u00f9\2\u096a\u0968\3\2\2\2\u096a\u0969\3\2\2"+
		"\2\u096b\u01ed\3\2\2\2\u096c\u096d\t\r\2\2\u096d\u01ef\3\2\2\2\u096e\u096f"+
		"\t\16\2\2\u096f\u01f1\3\2\2\2\u0970\u0973\5\u01ec\u00f7\2\u0971\u0973"+
		"\7S\2\2\u0972\u0970\3\2\2\2\u0972\u0971\3\2\2\2\u0973\u097b\3\2\2\2\u0974"+
		"\u0977\7\22\2\2\u0975\u0978\5\u01ec\u00f7\2\u0976\u0978\7S\2\2\u0977\u0975"+
		"\3\2\2\2\u0977\u0976\3\2\2\2\u0978\u097a\3\2\2\2\u0979\u0974\3\2\2\2\u097a"+
		"\u097d\3\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u01f3\3\2"+
		"\2\2\u097d\u097b\3\2\2\2\u097e\u097f\7\u0086\2\2\u097f\u01f5\3\2\2\2\u0980"+
		"\u0985\5\u01f8\u00fd\2\u0981\u0985\7\u0093\2\2\u0982\u0985\7\u0086\2\2"+
		"\u0983\u0985\7\u0087\2\2\u0984\u0980\3\2\2\2\u0984\u0981\3\2\2\2\u0984"+
		"\u0982\3\2\2\2\u0984\u0983\3\2\2\2\u0985\u01f7\3\2\2\2\u0986\u0988\7f"+
		"\2\2\u0987\u0986\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989"+
		"\u098f\5\u01fa\u00fe\2\u098a\u098c\7f\2\2\u098b\u098a\3\2\2\2\u098b\u098c"+
		"\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098f\7\u0091\2\2\u098e\u0987\3\2\2"+
		"\2\u098e\u098b\3\2\2\2\u098f\u01f9\3\2\2\2\u0990\u0991\t\17\2\2\u0991"+
		"\u01fb\3\2\2\2\u013a\u01fe\u0200\u0207\u020b\u020f\u0214\u0218\u021c\u0220"+
		"\u0224\u0226\u022b\u0231\u0235\u0239\u023d\u0243\u0247\u024b\u024f\u0253"+
		"\u0257\u025d\u026d\u0273\u0279\u0284\u028a\u0298\u02a3\u02a8\u02b3\u02bf"+
		"\u02c3\u02c7\u02cd\u02d8\u02dc\u02e0\u02e3\u02f1\u02f8\u02fe\u0304\u0309"+
		"\u030c\u0316\u031d\u0324\u0335\u033c\u0345\u034e\u035a\u0364\u0369\u0373"+
		"\u0382\u0389\u038d\u0391\u0395\u0399\u039d\u03a1\u03a5\u03a9\u03ad\u03b1"+
		"\u03b5\u03b9\u03bd\u03c1\u03c3\u03c7\u03cb\u03e6\u03f7\u03fb\u03ff\u0404"+
		"\u0408\u0413\u0417\u041a\u041d\u0427\u042c\u0444\u0450\u0453\u0456\u045f"+
		"\u0468\u046b\u0471\u0475\u0480\u0489\u048c\u0491\u0498\u049f\u04a3\u04a6"+
		"\u04aa\u04af\u04b3\u04bb\u04be\u04cb\u04d3\u04d7\u04da\u04dd\u04e3\u04e7"+
		"\u04ea\u04ee\u04f6\u04fd\u0501\u0508\u050c\u050f\u0512\u0515\u0518\u051c"+
		"\u051f\u0522\u0526\u0529\u052d\u0530\u0533\u0537\u053d\u0541\u0545\u054b"+
		"\u054e\u0554\u0557\u055c\u055f\u0563\u0569\u056e\u0570\u0573\u0576\u0580"+
		"\u0585\u058e\u0591\u0595\u059b\u059f\u05a2\u05ac\u05b1\u05b7\u05ba\u05bf"+
		"\u05c2\u05ca\u05cf\u05d4\u05da\u05dd\u05e5\u05ea\u05ed\u05f2\u05fa\u0600"+
		"\u0604\u0608\u060c\u0610\u0612\u0616\u0620\u0626\u062a\u0632\u0635\u0639"+
		"\u063d\u0642\u0645\u0649\u064e\u0654\u0657\u065c\u065f\u0665\u0675\u0678"+
		"\u067b\u0682\u0689\u069f\u06a2\u06a5\u06a8\u06aa\u06b9\u06bd\u06c2\u06c8"+
		"\u06cf\u06da\u06de\u06e7\u06ed\u06f0\u06f4\u06f8\u0706\u070c\u0713\u0717"+
		"\u071b\u0720\u0725\u0738\u073f\u0743\u0749\u074d\u0751\u0754\u075b\u0762"+
		"\u0768\u076d\u0773\u0782\u0786\u0789\u0792\u079b\u079f\u07a8\u07ac\u07b7"+
		"\u07be\u07c2\u07d4\u07d9\u07ea\u07ed\u07f3\u07f9\u0800\u0807\u080e\u0817"+
		"\u081a\u0825\u082e\u0836\u0841\u0850\u0861\u0863\u086a\u0870\u0877\u087b"+
		"\u0889\u088d\u089f\u08a1\u08b6\u08bc\u08c0\u08c6\u08cc\u08d2\u08d9\u08dc"+
		"\u08df\u08e3\u08e8\u08ef\u08f8\u0904\u090f\u0916\u091d\u0922\u0925\u0928"+
		"\u092f\u0934\u0938\u0944\u094b\u0958\u0962\u096a\u0972\u0977\u097b\u0984"+
		"\u0987\u098b\u098e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}