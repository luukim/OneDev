// Generated from io/onedev/server/search/entity/codecomment/CodeCommentQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.codecomment;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeCommentQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CreatedByMe=1, CreatedBy=2, OnCommit=3, OrderBy=4, Is=5, Contains=6, IsSince=7, 
		IsUntil=8, IsGreaterThan=9, IsLessThan=10, And=11, Or=12, Not=13, Asc=14, 
		Desc=15, LParens=16, RParens=17, Quoted=18, WS=19, Identifier=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CreatedByMe", "CreatedBy", "OnCommit", "OrderBy", "Is", "Contains", 
			"IsSince", "IsUntil", "IsGreaterThan", "IsLessThan", "And", "Or", "Not", 
			"Asc", "Desc", "LParens", "RParens", "Quoted", "WS", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'is'", "'contains'", null, null, null, 
			null, "'and'", "'or'", "'not'", "'asc'", "'desc'", "'('", "')'", null, 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CreatedByMe", "CreatedBy", "OnCommit", "OrderBy", "Is", "Contains", 
			"IsSince", "IsUntil", "IsGreaterThan", "IsLessThan", "And", "Or", "Not", 
			"Asc", "Desc", "LParens", "RParens", "Quoted", "WS", "Identifier"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CodeCommentQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CodeCommentQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\2\3\2\6\2=\n\2\r\2\16\2>\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3M\n\3\r\3\16\3N\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\6\4X\n\4\r\4\16\4Y\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\6\b\u0081\n\b\r\b\16"+
		"\b\u0082\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t\u008f\n\t\r\t\16"+
		"\t\u0090\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\n\u009d\n\n\r\n\16"+
		"\n\u009e\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00aa\n\n\r\n\16\n\u00ab"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\6\13\u00b7\n\13\r\13\16\13\u00b8"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00c1\n\13\r\13\16\13\u00c2\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\6\23\u00e6\n\23\r\23\16\23\u00e7\3\23\3\23\3\24\3\24\3\25\6"+
		"\25\u00ef\n\25\r\25\16\25\u00f0\3\u00e7\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\4\4\2$$^^\t\2--//\61=C\\^^aac|\2\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\3+\3\2\2\2\5C\3\2\2\2\7S\3\2\2\2\tb\3\2\2\2\13p\3\2\2\2"+
		"\rs\3\2\2\2\17|\3\2\2\2\21\u008a\3\2\2\2\23\u0098\3\2\2\2\25\u00b2\3\2"+
		"\2\2\27\u00c9\3\2\2\2\31\u00cd\3\2\2\2\33\u00d0\3\2\2\2\35\u00d4\3\2\2"+
		"\2\37\u00d8\3\2\2\2!\u00dd\3\2\2\2#\u00df\3\2\2\2%\u00e1\3\2\2\2\'\u00eb"+
		"\3\2\2\2)\u00ee\3\2\2\2+,\7e\2\2,-\7t\2\2-.\7g\2\2./\7c\2\2/\60\7v\2\2"+
		"\60\61\7g\2\2\61\62\7f\2\2\62\64\3\2\2\2\63\65\5\'\24\2\64\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7d\2\29:\7{\2"+
		"\2:<\3\2\2\2;=\5\'\24\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2"+
		"\2\2@A\7o\2\2AB\7g\2\2B\4\3\2\2\2CD\7e\2\2DE\7t\2\2EF\7g\2\2FG\7c\2\2"+
		"GH\7v\2\2HI\7g\2\2IJ\7f\2\2JL\3\2\2\2KM\5\'\24\2LK\3\2\2\2MN\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7d\2\2QR\7{\2\2R\6\3\2\2\2ST\7q\2\2TU"+
		"\7p\2\2UW\3\2\2\2VX\5\'\24\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z"+
		"[\3\2\2\2[\\\7e\2\2\\]\7q\2\2]^\7o\2\2^_\7o\2\2_`\7k\2\2`a\7v\2\2a\b\3"+
		"\2\2\2bc\7q\2\2cd\7t\2\2de\7f\2\2ef\7g\2\2fg\7t\2\2gi\3\2\2\2hj\5\'\24"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7d\2\2no\7{\2\2"+
		"o\n\3\2\2\2pq\7k\2\2qr\7u\2\2r\f\3\2\2\2st\7e\2\2tu\7q\2\2uv\7p\2\2vw"+
		"\7v\2\2wx\7c\2\2xy\7k\2\2yz\7p\2\2z{\7u\2\2{\16\3\2\2\2|}\7k\2\2}~\7u"+
		"\2\2~\u0080\3\2\2\2\177\u0081\5\'\24\2\u0080\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7e\2\2"+
		"\u0088\u0089\7g\2\2\u0089\20\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7"+
		"u\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\'\24\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\7w\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7n\2\2\u0097\22\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7u\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5\'\24\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00aa\5\'\24\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2"+
		"\u00b1\24\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00b7\5\'\24\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7n"+
		"\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7u\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00c1\5\'\24\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\26\3\2\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7f\2\2\u00cc"+
		"\30\3\2\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf\32\3\2\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7v\2\2\u00d3\34\3\2\2\2\u00d4"+
		"\u00d5\7c\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7e\2\2\u00d7\36\3\2\2\2\u00d8"+
		"\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7e\2\2"+
		"\u00dc \3\2\2\2\u00dd\u00de\7*\2\2\u00de\"\3\2\2\2\u00df\u00e0\7+\2\2"+
		"\u00e0$\3\2\2\2\u00e1\u00e5\7$\2\2\u00e2\u00e3\7^\2\2\u00e3\u00e6\13\2"+
		"\2\2\u00e4\u00e6\n\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\7$\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec(\3\2"+
		"\2\2\u00ed\u00ef\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1*\3\2\2\2\21\2\66>NYk\u0082\u0090"+
		"\u009e\u00ab\u00b8\u00c2\u00e5\u00e7\u00f0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}