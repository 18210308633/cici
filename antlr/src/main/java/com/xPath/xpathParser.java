// Generated from E:/work_space/LeetCode/cici/antlr/java/xPath\xpath.g4 by ANTLR 4.5.3
package com.xPath;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FOR=3, RETURN=4, IN=5, LET=6, SOME=7, EVERY=8, SATISFIES=9, 
		IF=10, THEN=11, ELSE=12, CHILD=13, DESCENDANT=14, ATTRIBUTE=15, SELF=16, 
		DESCENDANT_OR_SELF=17, FOLLOWING_SIBLING=18, FOLLOWING=19, NAMESPACE=20, 
		Q_CHAR=21, LEFT_CURLY_BRACKET_CHAR=22, RIGHT_CURLY_BRACKET_CHAR=23, DOLLAR_SIGN_CHAR=24, 
		COMMA_CHAR=25, LEFT_PARENTHESIS_CHAR=26, RIGHT_PARENTHESIS_CHAR=27, COLON_CHAR=28, 
		NameStartChar=29, NameChar=30, UNDERSCORE_CHAR=31, HYPEN_MINUS_CHAR=32, 
		FULL_STOP_CHAR=33;
	public static final int
		RULE_xpath = 0, RULE_enclosedExpr = 1, RULE_expr = 2, RULE_exprSingle = 3, 
		RULE_forExpr = 4, RULE_simpleForClause = 5, RULE_simpleForBinding = 6, 
		RULE_letExpr = 7, RULE_simpleLetClause = 8, RULE_simpleLetBinding = 9, 
		RULE_quantifiedExpr = 10, RULE_ifExpr = 11, RULE_forwardAxis = 12, RULE_varName = 13, 
		RULE_eQName = 14, RULE_uRIQualifiedName = 15, RULE_bracedURILiteral = 16, 
		RULE_nCName = 17, RULE_nCNameChar = 18, RULE_nCNameStartChar = 19, RULE_qName = 20, 
		RULE_prefixedName = 21, RULE_unprefixedName = 22, RULE_prefix = 23, RULE_localPart = 24;
	public static final String[] ruleNames = {
		"xpath", "enclosedExpr", "expr", "exprSingle", "forExpr", "simpleForClause", 
		"simpleForBinding", "letExpr", "simpleLetClause", "simpleLetBinding", 
		"quantifiedExpr", "ifExpr", "forwardAxis", "varName", "eQName", "uRIQualifiedName", 
		"bracedURILiteral", "nCName", "nCNameChar", "nCNameStartChar", "qName", 
		"prefixedName", "unprefixedName", "prefix", "localPart"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'::'", "'for'", "'return'", "'in'", "'let'", "'some'", 
		"'every'", "'satisfies'", "'if'", "'then'", "'else'", "'child'", "'descendant'", 
		"'attribute'", "'self'", "'descendant-or-self'", "'following-sibling'", 
		"'following'", "'namespace'", "'Q'", "'{'", "'}'", "'$'", "','", "'('", 
		"')'", "':'", null, null, "'_'", "'-'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "FOR", "RETURN", "IN", "LET", "SOME", "EVERY", "SATISFIES", 
		"IF", "THEN", "ELSE", "CHILD", "DESCENDANT", "ATTRIBUTE", "SELF", "DESCENDANT_OR_SELF", 
		"FOLLOWING_SIBLING", "FOLLOWING", "NAMESPACE", "Q_CHAR", "LEFT_CURLY_BRACKET_CHAR", 
		"RIGHT_CURLY_BRACKET_CHAR", "DOLLAR_SIGN_CHAR", "COMMA_CHAR", "LEFT_PARENTHESIS_CHAR", 
		"RIGHT_PARENTHESIS_CHAR", "COLON_CHAR", "NameStartChar", "NameChar", "UNDERSCORE_CHAR", 
		"HYPEN_MINUS_CHAR", "FULL_STOP_CHAR"
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
	public String getGrammarFileName() { return "xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xpathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XpathContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public XpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterXpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitXpath(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xpath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			expr();
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

	public static class EnclosedExprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACKET_CHAR() { return getToken(xpathParser.LEFT_CURLY_BRACKET_CHAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACKET_CHAR() { return getToken(xpathParser.RIGHT_CURLY_BRACKET_CHAR, 0); }
		public EnclosedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterEnclosedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitEnclosedExpr(this);
		}
	}

	public final EnclosedExprContext enclosedExpr() throws RecognitionException {
		EnclosedExprContext _localctx = new EnclosedExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enclosedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LEFT_CURLY_BRACKET_CHAR);
			setState(53);
			expr();
			setState(54);
			match(RIGHT_CURLY_BRACKET_CHAR);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public List<TerminalNode> COMMA_CHAR() { return getTokens(xpathParser.COMMA_CHAR); }
		public TerminalNode COMMA_CHAR(int i) {
			return getToken(xpathParser.COMMA_CHAR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			exprSingle();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CHAR) {
				{
				{
				setState(57);
				match(COMMA_CHAR);
				setState(58);
				exprSingle();
				}
				}
				setState(63);
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

	public static class ExprSingleContext extends ParserRuleContext {
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public ExprSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterExprSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitExprSingle(this);
		}
	}

	public final ExprSingleContext exprSingle() throws RecognitionException {
		ExprSingleContext _localctx = new ExprSingleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprSingle);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				forExpr();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				letExpr();
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

	public static class ForExprContext extends ParserRuleContext {
		public SimpleForClauseContext simpleForClause() {
			return getRuleContext(SimpleForClauseContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(xpathParser.RETURN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitForExpr(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			simpleForClause();
			setState(69);
			match(RETURN);
			setState(70);
			exprSingle();
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

	public static class SimpleForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(xpathParser.FOR, 0); }
		public List<SimpleForBindingContext> simpleForBinding() {
			return getRuleContexts(SimpleForBindingContext.class);
		}
		public SimpleForBindingContext simpleForBinding(int i) {
			return getRuleContext(SimpleForBindingContext.class,i);
		}
		public List<TerminalNode> COMMA_CHAR() { return getTokens(xpathParser.COMMA_CHAR); }
		public TerminalNode COMMA_CHAR(int i) {
			return getToken(xpathParser.COMMA_CHAR, i);
		}
		public SimpleForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleForClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSimpleForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSimpleForClause(this);
		}
	}

	public final SimpleForClauseContext simpleForClause() throws RecognitionException {
		SimpleForClauseContext _localctx = new SimpleForClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleForClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(FOR);
			setState(73);
			simpleForBinding();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CHAR) {
				{
				{
				setState(74);
				match(COMMA_CHAR);
				setState(75);
				simpleForBinding();
				}
				}
				setState(80);
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

	public static class SimpleForBindingContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN_CHAR() { return getToken(xpathParser.DOLLAR_SIGN_CHAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode IN() { return getToken(xpathParser.IN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public SimpleForBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleForBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSimpleForBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSimpleForBinding(this);
		}
	}

	public final SimpleForBindingContext simpleForBinding() throws RecognitionException {
		SimpleForBindingContext _localctx = new SimpleForBindingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleForBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(DOLLAR_SIGN_CHAR);
			setState(82);
			varName();
			setState(83);
			match(IN);
			setState(84);
			exprSingle();
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

	public static class LetExprContext extends ParserRuleContext {
		public SimpleLetClauseContext simpleLetClause() {
			return getRuleContext(SimpleLetClauseContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(xpathParser.RETURN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitLetExpr(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			simpleLetClause();
			setState(87);
			match(RETURN);
			setState(88);
			exprSingle();
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

	public static class SimpleLetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(xpathParser.LET, 0); }
		public List<SimpleLetBindingContext> simpleLetBinding() {
			return getRuleContexts(SimpleLetBindingContext.class);
		}
		public SimpleLetBindingContext simpleLetBinding(int i) {
			return getRuleContext(SimpleLetBindingContext.class,i);
		}
		public List<TerminalNode> COMMA_CHAR() { return getTokens(xpathParser.COMMA_CHAR); }
		public TerminalNode COMMA_CHAR(int i) {
			return getToken(xpathParser.COMMA_CHAR, i);
		}
		public SimpleLetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSimpleLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSimpleLetClause(this);
		}
	}

	public final SimpleLetClauseContext simpleLetClause() throws RecognitionException {
		SimpleLetClauseContext _localctx = new SimpleLetClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleLetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LET);
			setState(91);
			simpleLetBinding();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CHAR) {
				{
				{
				setState(92);
				match(COMMA_CHAR);
				setState(93);
				simpleLetBinding();
				}
				}
				setState(98);
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

	public static class SimpleLetBindingContext extends ParserRuleContext {
		public TerminalNode DOLLAR_SIGN_CHAR() { return getToken(xpathParser.DOLLAR_SIGN_CHAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public SimpleLetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLetBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterSimpleLetBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitSimpleLetBinding(this);
		}
	}

	public final SimpleLetBindingContext simpleLetBinding() throws RecognitionException {
		SimpleLetBindingContext _localctx = new SimpleLetBindingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleLetBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(DOLLAR_SIGN_CHAR);
			setState(100);
			varName();
			setState(101);
			match(T__0);
			setState(102);
			exprSingle();
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

	public static class QuantifiedExprContext extends ParserRuleContext {
		public List<TerminalNode> DOLLAR_SIGN_CHAR() { return getTokens(xpathParser.DOLLAR_SIGN_CHAR); }
		public TerminalNode DOLLAR_SIGN_CHAR(int i) {
			return getToken(xpathParser.DOLLAR_SIGN_CHAR, i);
		}
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(xpathParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(xpathParser.IN, i);
		}
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(xpathParser.SATISFIES, 0); }
		public TerminalNode SOME() { return getToken(xpathParser.SOME, 0); }
		public TerminalNode EVERY() { return getToken(xpathParser.EVERY, 0); }
		public List<TerminalNode> COMMA_CHAR() { return getTokens(xpathParser.COMMA_CHAR); }
		public TerminalNode COMMA_CHAR(int i) {
			return getToken(xpathParser.COMMA_CHAR, i);
		}
		public QuantifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterQuantifiedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitQuantifiedExpr(this);
		}
	}

	public final QuantifiedExprContext quantifiedExpr() throws RecognitionException {
		QuantifiedExprContext _localctx = new QuantifiedExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quantifiedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==SOME || _la==EVERY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(105);
			match(DOLLAR_SIGN_CHAR);
			setState(106);
			varName();
			setState(107);
			match(IN);
			setState(108);
			exprSingle();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CHAR) {
				{
				{
				setState(109);
				match(COMMA_CHAR);
				setState(110);
				match(DOLLAR_SIGN_CHAR);
				setState(111);
				varName();
				setState(112);
				match(IN);
				setState(113);
				exprSingle();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(SATISFIES);
			setState(121);
			exprSingle();
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(xpathParser.IF, 0); }
		public TerminalNode LEFT_PARENTHESIS_CHAR() { return getToken(xpathParser.LEFT_PARENTHESIS_CHAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS_CHAR() { return getToken(xpathParser.RIGHT_PARENTHESIS_CHAR, 0); }
		public TerminalNode THEN() { return getToken(xpathParser.THEN, 0); }
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(xpathParser.ELSE, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			match(LEFT_PARENTHESIS_CHAR);
			setState(125);
			expr();
			setState(126);
			match(RIGHT_PARENTHESIS_CHAR);
			setState(127);
			match(THEN);
			setState(128);
			exprSingle();
			setState(129);
			match(ELSE);
			setState(130);
			exprSingle();
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

	public static class ForwardAxisContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(xpathParser.CHILD, 0); }
		public TerminalNode DESCENDANT() { return getToken(xpathParser.DESCENDANT, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(xpathParser.ATTRIBUTE, 0); }
		public TerminalNode SELF() { return getToken(xpathParser.SELF, 0); }
		public TerminalNode DESCENDANT_OR_SELF() { return getToken(xpathParser.DESCENDANT_OR_SELF, 0); }
		public TerminalNode FOLLOWING_SIBLING() { return getToken(xpathParser.FOLLOWING_SIBLING, 0); }
		public TerminalNode FOLLOWING() { return getToken(xpathParser.FOLLOWING, 0); }
		public TerminalNode NAMESPACE() { return getToken(xpathParser.NAMESPACE, 0); }
		public ForwardAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardAxis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterForwardAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitForwardAxis(this);
		}
	}

	public final ForwardAxisContext forwardAxis() throws RecognitionException {
		ForwardAxisContext _localctx = new ForwardAxisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forwardAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << DESCENDANT) | (1L << ATTRIBUTE) | (1L << SELF) | (1L << DESCENDANT_OR_SELF) | (1L << FOLLOWING_SIBLING) | (1L << FOLLOWING) | (1L << NAMESPACE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(133);
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

	public static class VarNameContext extends ParserRuleContext {
		public EQNameContext eQName() {
			return getRuleContext(EQNameContext.class,0);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			eQName();
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

	public static class EQNameContext extends ParserRuleContext {
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public URIQualifiedNameContext uRIQualifiedName() {
			return getRuleContext(URIQualifiedNameContext.class,0);
		}
		public EQNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eQName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterEQName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitEQName(this);
		}
	}

	public final EQNameContext eQName() throws RecognitionException {
		EQNameContext _localctx = new EQNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eQName);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case NameStartChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				qName();
				}
				break;
			case Q_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				uRIQualifiedName();
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

	public static class URIQualifiedNameContext extends ParserRuleContext {
		public BracedURILiteralContext bracedURILiteral() {
			return getRuleContext(BracedURILiteralContext.class,0);
		}
		public NCNameContext nCName() {
			return getRuleContext(NCNameContext.class,0);
		}
		public URIQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uRIQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterURIQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitURIQualifiedName(this);
		}
	}

	public final URIQualifiedNameContext uRIQualifiedName() throws RecognitionException {
		URIQualifiedNameContext _localctx = new URIQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_uRIQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			bracedURILiteral();
			setState(142);
			nCName();
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

	public static class BracedURILiteralContext extends ParserRuleContext {
		public TerminalNode Q_CHAR() { return getToken(xpathParser.Q_CHAR, 0); }
		public List<TerminalNode> LEFT_CURLY_BRACKET_CHAR() { return getTokens(xpathParser.LEFT_CURLY_BRACKET_CHAR); }
		public TerminalNode LEFT_CURLY_BRACKET_CHAR(int i) {
			return getToken(xpathParser.LEFT_CURLY_BRACKET_CHAR, i);
		}
		public List<TerminalNode> RIGHT_CURLY_BRACKET_CHAR() { return getTokens(xpathParser.RIGHT_CURLY_BRACKET_CHAR); }
		public TerminalNode RIGHT_CURLY_BRACKET_CHAR(int i) {
			return getToken(xpathParser.RIGHT_CURLY_BRACKET_CHAR, i);
		}
		public BracedURILiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedURILiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterBracedURILiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitBracedURILiteral(this);
		}
	}

	public final BracedURILiteralContext bracedURILiteral() throws RecognitionException {
		BracedURILiteralContext _localctx = new BracedURILiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bracedURILiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Q_CHAR);
			setState(145);
			match(LEFT_CURLY_BRACKET_CHAR);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << FOR) | (1L << RETURN) | (1L << IN) | (1L << LET) | (1L << SOME) | (1L << EVERY) | (1L << SATISFIES) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << CHILD) | (1L << DESCENDANT) | (1L << ATTRIBUTE) | (1L << SELF) | (1L << DESCENDANT_OR_SELF) | (1L << FOLLOWING_SIBLING) | (1L << FOLLOWING) | (1L << NAMESPACE) | (1L << Q_CHAR) | (1L << DOLLAR_SIGN_CHAR) | (1L << COMMA_CHAR) | (1L << LEFT_PARENTHESIS_CHAR) | (1L << RIGHT_PARENTHESIS_CHAR) | (1L << COLON_CHAR) | (1L << NameStartChar) | (1L << NameChar) | (1L << UNDERSCORE_CHAR) | (1L << HYPEN_MINUS_CHAR) | (1L << FULL_STOP_CHAR))) != 0)) {
				{
				{
				setState(146);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==LEFT_CURLY_BRACKET_CHAR || _la==RIGHT_CURLY_BRACKET_CHAR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RIGHT_CURLY_BRACKET_CHAR);
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

	public static class NCNameContext extends ParserRuleContext {
		public NCNameStartCharContext nCNameStartChar() {
			return getRuleContext(NCNameStartCharContext.class,0);
		}
		public NCNameCharContext nCNameChar() {
			return getRuleContext(NCNameCharContext.class,0);
		}
		public NCNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nCName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterNCName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitNCName(this);
		}
	}

	public final NCNameContext nCName() throws RecognitionException {
		NCNameContext _localctx = new NCNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nCName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			nCNameStartChar();
			setState(155);
			nCNameChar();
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

	public static class NCNameCharContext extends ParserRuleContext {
		public TerminalNode NameChar() { return getToken(xpathParser.NameChar, 0); }
		public TerminalNode COLON_CHAR() { return getToken(xpathParser.COLON_CHAR, 0); }
		public NCNameCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nCNameChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterNCNameChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitNCNameChar(this);
		}
	}

	public final NCNameCharContext nCNameChar() throws RecognitionException {
		NCNameCharContext _localctx = new NCNameCharContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nCNameChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(NameChar);
			setState(158);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==COLON_CHAR) ) {
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

	public static class NCNameStartCharContext extends ParserRuleContext {
		public TerminalNode NameStartChar() { return getToken(xpathParser.NameStartChar, 0); }
		public TerminalNode COLON_CHAR() { return getToken(xpathParser.COLON_CHAR, 0); }
		public NCNameStartCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nCNameStartChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterNCNameStartChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitNCNameStartChar(this);
		}
	}

	public final NCNameStartCharContext nCNameStartChar() throws RecognitionException {
		NCNameStartCharContext _localctx = new NCNameStartCharContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nCNameStartChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(NameStartChar);
			setState(161);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==COLON_CHAR) ) {
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

	public static class QNameContext extends ParserRuleContext {
		public PrefixedNameContext prefixedName() {
			return getRuleContext(PrefixedNameContext.class,0);
		}
		public UnprefixedNameContext unprefixedName() {
			return getRuleContext(UnprefixedNameContext.class,0);
		}
		public QNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterQName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitQName(this);
		}
	}

	public final QNameContext qName() throws RecognitionException {
		QNameContext _localctx = new QNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qName);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				prefixedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				unprefixedName();
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

	public static class PrefixedNameContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode COLON_CHAR() { return getToken(xpathParser.COLON_CHAR, 0); }
		public LocalPartContext localPart() {
			return getRuleContext(LocalPartContext.class,0);
		}
		public PrefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterPrefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitPrefixedName(this);
		}
	}

	public final PrefixedNameContext prefixedName() throws RecognitionException {
		PrefixedNameContext _localctx = new PrefixedNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_prefixedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			prefix();
			setState(168);
			match(COLON_CHAR);
			setState(169);
			localPart();
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

	public static class UnprefixedNameContext extends ParserRuleContext {
		public LocalPartContext localPart() {
			return getRuleContext(LocalPartContext.class,0);
		}
		public UnprefixedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unprefixedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterUnprefixedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitUnprefixedName(this);
		}
	}

	public final UnprefixedNameContext unprefixedName() throws RecognitionException {
		UnprefixedNameContext _localctx = new UnprefixedNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unprefixedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			localPart();
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

	public static class PrefixContext extends ParserRuleContext {
		public NCNameContext nCName() {
			return getRuleContext(NCNameContext.class,0);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			nCName();
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

	public static class LocalPartContext extends ParserRuleContext {
		public NCNameContext nCName() {
			return getRuleContext(NCNameContext.class,0);
		}
		public LocalPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).enterLocalPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xpathListener ) ((xpathListener)listener).exitLocalPart(this);
		}
	}

	public final LocalPartContext localPart() throws RecognitionException {
		LocalPartContext _localctx = new LocalPartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_localPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			nCName();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4"+
		"\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\na\n\n\f\n\16"+
		"\nd\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u008e\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u0096\n\22\f\22\16\22\u0099\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u00a8\n\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\t\n\3\2\17\26\3"+
		"\2\30\31\3\2\36\36\u00a2\2\64\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\bD\3\2\2"+
		"\2\nF\3\2\2\2\fJ\3\2\2\2\16S\3\2\2\2\20X\3\2\2\2\22\\\3\2\2\2\24e\3\2"+
		"\2\2\26j\3\2\2\2\30}\3\2\2\2\32\u0086\3\2\2\2\34\u0089\3\2\2\2\36\u008d"+
		"\3\2\2\2 \u008f\3\2\2\2\"\u0092\3\2\2\2$\u009c\3\2\2\2&\u009f\3\2\2\2"+
		"(\u00a2\3\2\2\2*\u00a7\3\2\2\2,\u00a9\3\2\2\2.\u00ad\3\2\2\2\60\u00af"+
		"\3\2\2\2\62\u00b1\3\2\2\2\64\65\5\6\4\2\65\3\3\2\2\2\66\67\7\30\2\2\67"+
		"8\5\6\4\289\7\31\2\29\5\3\2\2\2:?\5\b\5\2;<\7\33\2\2<>\5\b\5\2=;\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BE\5\n\6\2CE\5\20"+
		"\t\2DB\3\2\2\2DC\3\2\2\2E\t\3\2\2\2FG\5\f\7\2GH\7\6\2\2HI\5\b\5\2I\13"+
		"\3\2\2\2JK\7\5\2\2KP\5\16\b\2LM\7\33\2\2MO\5\16\b\2NL\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2ST\7\32\2\2TU\5\34\17\2UV\7"+
		"\7\2\2VW\5\b\5\2W\17\3\2\2\2XY\5\22\n\2YZ\7\6\2\2Z[\5\b\5\2[\21\3\2\2"+
		"\2\\]\7\b\2\2]b\5\24\13\2^_\7\33\2\2_a\5\24\13\2`^\3\2\2\2ad\3\2\2\2b"+
		"`\3\2\2\2bc\3\2\2\2c\23\3\2\2\2db\3\2\2\2ef\7\32\2\2fg\5\34\17\2gh\7\3"+
		"\2\2hi\5\b\5\2i\25\3\2\2\2jk\t\2\2\2kl\7\32\2\2lm\5\34\17\2mn\7\7\2\2"+
		"nw\5\b\5\2op\7\33\2\2pq\7\32\2\2qr\5\34\17\2rs\7\7\2\2st\5\b\5\2tv\3\2"+
		"\2\2uo\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\13"+
		"\2\2{|\5\b\5\2|\27\3\2\2\2}~\7\f\2\2~\177\7\34\2\2\177\u0080\5\6\4\2\u0080"+
		"\u0081\7\35\2\2\u0081\u0082\7\r\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7"+
		"\16\2\2\u0084\u0085\5\b\5\2\u0085\31\3\2\2\2\u0086\u0087\t\3\2\2\u0087"+
		"\u0088\7\4\2\2\u0088\33\3\2\2\2\u0089\u008a\5\36\20\2\u008a\35\3\2\2\2"+
		"\u008b\u008e\5*\26\2\u008c\u008e\5 \21\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\37\3\2\2\2\u008f\u0090\5\"\22\2\u0090\u0091\5$\23\2\u0091"+
		"!\3\2\2\2\u0092\u0093\7\27\2\2\u0093\u0097\7\30\2\2\u0094\u0096\n\4\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\31\2\2"+
		"\u009b#\3\2\2\2\u009c\u009d\5(\25\2\u009d\u009e\5&\24\2\u009e%\3\2\2\2"+
		"\u009f\u00a0\7 \2\2\u00a0\u00a1\n\5\2\2\u00a1\'\3\2\2\2\u00a2\u00a3\7"+
		"\37\2\2\u00a3\u00a4\n\5\2\2\u00a4)\3\2\2\2\u00a5\u00a8\5,\27\2\u00a6\u00a8"+
		"\5.\30\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8+\3\2\2\2\u00a9"+
		"\u00aa\5\60\31\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\5\62\32\2\u00ac-\3\2"+
		"\2\2\u00ad\u00ae\5\62\32\2\u00ae/\3\2\2\2\u00af\u00b0\5$\23\2\u00b0\61"+
		"\3\2\2\2\u00b1\u00b2\5$\23\2\u00b2\63\3\2\2\2\n?DPbw\u008d\u0097\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}