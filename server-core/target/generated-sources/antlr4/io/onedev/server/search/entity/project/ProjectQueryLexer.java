// Generated from io/onedev/server/search/entity/project/ProjectQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.project;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjectQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OrderBy=1, Is=2, OwnedBy=3, OwnedByMe=4, OwnedByNone=5, IsSince=6, IsUntil=7, 
		Contains=8, ForksOf=9, And=10, Or=11, Not=12, Asc=13, Desc=14, LParens=15, 
		RParens=16, Quoted=17, WS=18, Identifier=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OrderBy", "Is", "OwnedBy", "OwnedByMe", "OwnedByNone", "IsSince", "IsUntil", 
			"Contains", "ForksOf", "And", "Or", "Not", "Asc", "Desc", "LParens", 
			"RParens", "Quoted", "WS", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'is'", null, null, null, null, null, "'contains'", null, 
			"'and'", "'or'", "'not'", "'asc'", "'desc'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OrderBy", "Is", "OwnedBy", "OwnedByMe", "OwnedByNone", "IsSince", 
			"IsUntil", "Contains", "ForksOf", "And", "Or", "Not", "Asc", "Desc", 
			"LParens", "RParens", "Quoted", "WS", "Identifier"
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


	public ProjectQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProjectQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\61\n\2\r\2\16"+
		"\2\62\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4B\n\4\r\4"+
		"\16\4C\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5P\n\5\r\5\16\5Q\3\5"+
		"\3\5\3\5\3\5\6\5X\n\5\r\5\16\5Y\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6f\n\6\r\6\16\6g\3\6\3\6\3\6\3\6\6\6n\n\6\r\6\16\6o\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\6\7{\n\7\r\7\16\7|\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\6\b\u0089\n\b\r\b\16\b\u008a\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00a3"+
		"\n\n\r\n\16\n\u00a4\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\6\22\u00c6\n\22\r\22\16\22\u00c7\3\22\3\22\3"+
		"\23\3\23\3\24\6\24\u00cf\n\24\r\24\16\24\u00d0\3\u00c7\2\25\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25\3\2\4\4\2$$^^\t\2--//\61=C\\^^aac|\2\u00dd\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\3)\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\tH\3\2\2\2\13^\3\2\2\2"+
		"\rv\3\2\2\2\17\u0084\3\2\2\2\21\u0092\3\2\2\2\23\u009b\3\2\2\2\25\u00a9"+
		"\3\2\2\2\27\u00ad\3\2\2\2\31\u00b0\3\2\2\2\33\u00b4\3\2\2\2\35\u00b8\3"+
		"\2\2\2\37\u00bd\3\2\2\2!\u00bf\3\2\2\2#\u00c1\3\2\2\2%\u00cb\3\2\2\2\'"+
		"\u00ce\3\2\2\2)*\7q\2\2*+\7t\2\2+,\7f\2\2,-\7g\2\2-.\7t\2\2.\60\3\2\2"+
		"\2/\61\5%\23\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\3\2\2\2\64\65\7d\2\2\65\66\7{\2\2\66\4\3\2\2\2\678\7k\2\289\7u\2\2"+
		"9\6\3\2\2\2:;\7q\2\2;<\7y\2\2<=\7p\2\2=>\7g\2\2>?\7f\2\2?A\3\2\2\2@B\5"+
		"%\23\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7d\2\2FG\7"+
		"{\2\2G\b\3\2\2\2HI\7q\2\2IJ\7y\2\2JK\7p\2\2KL\7g\2\2LM\7f\2\2MO\3\2\2"+
		"\2NP\5%\23\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7d\2"+
		"\2TU\7{\2\2UW\3\2\2\2VX\5%\23\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z[\3\2\2\2[\\\7o\2\2\\]\7g\2\2]\n\3\2\2\2^_\7q\2\2_`\7y\2\2`a\7p\2\2"+
		"ab\7g\2\2bc\7f\2\2ce\3\2\2\2df\5%\23\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2hi\3\2\2\2ij\7d\2\2jk\7{\2\2km\3\2\2\2ln\5%\23\2ml\3\2\2\2no"+
		"\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7p\2\2rs\7q\2\2st\7p\2\2tu\7"+
		"g\2\2u\f\3\2\2\2vw\7k\2\2wx\7u\2\2xz\3\2\2\2y{\5%\23\2zy\3\2\2\2{|\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7u\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7e\2\2\u0082\u0083\7g\2\2\u0083\16\3\2\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7u\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5%\23"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7w\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7k\2\2\u0090\u0091\7n\2\2\u0091\20\3\2\2\2\u0092"+
		"\u0093\7e\2\2\u0093\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2"+
		"\u0096\u0097\7c\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7u\2\2\u009a\22\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7m\2\2\u009f\u00a0\7u\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u00a3\5%\23\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7f\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\30\3\2\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\32\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7e\2\2\u00b7"+
		"\34\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7*\2\2\u00be \3\2\2\2\u00bf"+
		"\u00c0\7+\2\2\u00c0\"\3\2\2\2\u00c1\u00c5\7$\2\2\u00c2\u00c3\7^\2\2\u00c3"+
		"\u00c6\13\2\2\2\u00c4\u00c6\n\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7\"\2\2\u00cc"+
		"&\3\2\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1(\3\2\2\2\17\2\62CQYgo|"+
		"\u008a\u00a4\u00c5\u00c7\u00d0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}