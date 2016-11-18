// Generated from E:/work_space/LeetCode/cici/antlr/java/xPath\xpath.g4 by ANTLR 4.5.3
package com.xPath;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "FOR", "RETURN", "IN", "LET", "SOME", "EVERY", "SATISFIES", 
		"IF", "THEN", "ELSE", "CHILD", "DESCENDANT", "ATTRIBUTE", "SELF", "DESCENDANT_OR_SELF", 
		"FOLLOWING_SIBLING", "FOLLOWING", "NAMESPACE", "Q_CHAR", "LEFT_CURLY_BRACKET_CHAR", 
		"RIGHT_CURLY_BRACKET_CHAR", "DOLLAR_SIGN_CHAR", "COMMA_CHAR", "LEFT_PARENTHESIS_CHAR", 
		"RIGHT_PARENTHESIS_CHAR", "COLON_CHAR", "NameStartChar", "NameChar", "UNDERSCORE_CHAR", 
		"HYPEN_MINUS_CHAR", "FULL_STOP_CHAR"
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


	public xpathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xpath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\5\36\u00ed\n\36\3\37\3\37\3\37\3\37\5\37\u00f3"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\4\16\3c|\u00c2\u00d8\u00da"+
		"\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\6\2\62;\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E"+
		"\3\2\2\2\5H\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13V\3\2\2\2\rY\3\2\2\2\17]\3"+
		"\2\2\2\21b\3\2\2\2\23h\3\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31z\3\2\2\2\33"+
		"\177\3\2\2\2\35\u0085\3\2\2\2\37\u0090\3\2\2\2!\u009a\3\2\2\2#\u009f\3"+
		"\2\2\2%\u00b2\3\2\2\2\'\u00c4\3\2\2\2)\u00ce\3\2\2\2+\u00d8\3\2\2\2-\u00da"+
		"\3\2\2\2/\u00dc\3\2\2\2\61\u00de\3\2\2\2\63\u00e0\3\2\2\2\65\u00e2\3\2"+
		"\2\2\67\u00e4\3\2\2\29\u00e6\3\2\2\2;\u00ec\3\2\2\2=\u00f2\3\2\2\2?\u00f4"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2EF\7<\2\2FG\7?\2\2G\4\3\2\2\2HI"+
		"\7<\2\2IJ\7<\2\2J\6\3\2\2\2KL\7h\2\2LM\7q\2\2MN\7t\2\2N\b\3\2\2\2OP\7"+
		"t\2\2PQ\7g\2\2QR\7v\2\2RS\7w\2\2ST\7t\2\2TU\7p\2\2U\n\3\2\2\2VW\7k\2\2"+
		"WX\7p\2\2X\f\3\2\2\2YZ\7n\2\2Z[\7g\2\2[\\\7v\2\2\\\16\3\2\2\2]^\7u\2\2"+
		"^_\7q\2\2_`\7o\2\2`a\7g\2\2a\20\3\2\2\2bc\7g\2\2cd\7x\2\2de\7g\2\2ef\7"+
		"t\2\2fg\7{\2\2g\22\3\2\2\2hi\7u\2\2ij\7c\2\2jk\7v\2\2kl\7k\2\2lm\7u\2"+
		"\2mn\7h\2\2no\7k\2\2op\7g\2\2pq\7u\2\2q\24\3\2\2\2rs\7k\2\2st\7h\2\2t"+
		"\26\3\2\2\2uv\7v\2\2vw\7j\2\2wx\7g\2\2xy\7p\2\2y\30\3\2\2\2z{\7g\2\2{"+
		"|\7n\2\2|}\7u\2\2}~\7g\2\2~\32\3\2\2\2\177\u0080\7e\2\2\u0080\u0081\7"+
		"j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084\7f\2\2\u0084\34"+
		"\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7g\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2"+
		"\u008c\u008d\7c\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\36\3\2"+
		"\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7v\2\2\u0093\u0094"+
		"\7t\2\2\u0094\u0095\7k\2\2\u0095\u0096\7d\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7v\2\2\u0098\u0099\7g\2\2\u0099 \3\2\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7h\2\2\u009e\"\3\2\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7e\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7/\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7u\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7h\2\2\u00b1$\3\2\2"+
		"\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\7u\2\2"+
		"\u00bd\u00be\7k\2\2\u00be\u00bf\7d\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3&\3\2\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc\u00cd\7i\2\2\u00cd(\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7c\2"+
		"\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4"+
		"\7r\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"*\3\2\2\2\u00d8\u00d9\7S\2\2\u00d9,\3\2\2\2\u00da\u00db\7}\2\2\u00db."+
		"\3\2\2\2\u00dc\u00dd\7\177\2\2\u00dd\60\3\2\2\2\u00de\u00df\7&\2\2\u00df"+
		"\62\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3"+
		"\66\3\2\2\2\u00e4\u00e5\7+\2\2\u00e58\3\2\2\2\u00e6\u00e7\7<\2\2\u00e7"+
		":\3\2\2\2\u00e8\u00ed\59\35\2\u00e9\u00ed\4C\\\2\u00ea\u00ed\5? \2\u00eb"+
		"\u00ed\t\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ed<\3\2\2\2\u00ee\u00f3\5;\36\2\u00ef\u00f3"+
		"\5A!\2\u00f0\u00f3\5C\"\2\u00f1\u00f3\t\3\2\2\u00f2\u00ee\3\2\2\2\u00f2"+
		"\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3>\3\2\2\2"+
		"\u00f4\u00f5\7a\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7B\3\2\2\2\u00f8"+
		"\u00f9\7\60\2\2\u00f9D\3\2\2\2\5\2\u00ec\u00f2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}