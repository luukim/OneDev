// Generated from io/onedev/server/search/commit/CommitQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.commit;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommitQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINCE=1, UNTIL=2, BRANCH=3, TAG=4, COMMIT=5, BUILD=6, BEFORE=7, AFTER=8, 
		COMMITTER=9, AUTHOR=10, PATH=11, MESSAGE=12, AuthoredByMe=13, CommittedByMe=14, 
		DefaultBranch=15, WS=16, Value=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINCE", "UNTIL", "BRANCH", "TAG", "COMMIT", "BUILD", "BEFORE", "AFTER", 
			"COMMITTER", "AUTHOR", "PATH", "MESSAGE", "AuthoredByMe", "CommittedByMe", 
			"DefaultBranch", "WS", "Value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'since'", "'until'", "'branch'", "'tag'", "'commit'", "'build'", 
			"'before'", "'after'", "'committer'", "'author'", "'path'", "'message'", 
			"'authored-by-me'", "'committed-by-me'", "'default-branch'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINCE", "UNTIL", "BRANCH", "TAG", "COMMIT", "BUILD", "BEFORE", 
			"AFTER", "COMMITTER", "AUTHOR", "PATH", "MESSAGE", "AuthoredByMe", "CommittedByMe", 
			"DefaultBranch", "WS", "Value"
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


	public CommitQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommitQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u00a9\n\22\r\22\16\22\u00aa\3\22\3"+
		"\22\3\u00aa\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\3\4\2*+^^\2\u00af\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3"+
		"\2\2\2\7\61\3\2\2\2\t8\3\2\2\2\13<\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21P"+
		"\3\2\2\2\23V\3\2\2\2\25`\3\2\2\2\27g\3\2\2\2\31l\3\2\2\2\33t\3\2\2\2\35"+
		"\u0083\3\2\2\2\37\u0093\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2%&\7u\2\2"+
		"&\'\7k\2\2\'(\7p\2\2()\7e\2\2)*\7g\2\2*\4\3\2\2\2+,\7w\2\2,-\7p\2\2-."+
		"\7v\2\2./\7k\2\2/\60\7n\2\2\60\6\3\2\2\2\61\62\7d\2\2\62\63\7t\2\2\63"+
		"\64\7c\2\2\64\65\7p\2\2\65\66\7e\2\2\66\67\7j\2\2\67\b\3\2\2\289\7v\2"+
		"\29:\7c\2\2:;\7i\2\2;\n\3\2\2\2<=\7e\2\2=>\7q\2\2>?\7o\2\2?@\7o\2\2@A"+
		"\7k\2\2AB\7v\2\2B\f\3\2\2\2CD\7d\2\2DE\7w\2\2EF\7k\2\2FG\7n\2\2GH\7f\2"+
		"\2H\16\3\2\2\2IJ\7d\2\2JK\7g\2\2KL\7h\2\2LM\7q\2\2MN\7t\2\2NO\7g\2\2O"+
		"\20\3\2\2\2PQ\7c\2\2QR\7h\2\2RS\7v\2\2ST\7g\2\2TU\7t\2\2U\22\3\2\2\2V"+
		"W\7e\2\2WX\7q\2\2XY\7o\2\2YZ\7o\2\2Z[\7k\2\2[\\\7v\2\2\\]\7v\2\2]^\7g"+
		"\2\2^_\7t\2\2_\24\3\2\2\2`a\7c\2\2ab\7w\2\2bc\7v\2\2cd\7j\2\2de\7q\2\2"+
		"ef\7t\2\2f\26\3\2\2\2gh\7r\2\2hi\7c\2\2ij\7v\2\2jk\7j\2\2k\30\3\2\2\2"+
		"lm\7o\2\2mn\7g\2\2no\7u\2\2op\7u\2\2pq\7c\2\2qr\7i\2\2rs\7g\2\2s\32\3"+
		"\2\2\2tu\7c\2\2uv\7w\2\2vw\7v\2\2wx\7j\2\2xy\7q\2\2yz\7t\2\2z{\7g\2\2"+
		"{|\7f\2\2|}\7/\2\2}~\7d\2\2~\177\7{\2\2\177\u0080\7/\2\2\u0080\u0081\7"+
		"o\2\2\u0081\u0082\7g\2\2\u0082\34\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7o\2\2\u0086\u0087\7o\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7f\2\2"+
		"\u008c\u008d\7/\2\2\u008d\u008e\7d\2\2\u008e\u008f\7{\2\2\u008f\u0090"+
		"\7/\2\2\u0090\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092\36\3\2\2\2\u0093\u0094"+
		"\7f\2\2\u0094\u0095\7g\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7w\2\2\u0098\u0099\7n\2\2\u0099\u009a\7v\2\2\u009a\u009b\7/\2\2"+
		"\u009b\u009c\7d\2\2\u009c\u009d\7t\2\2\u009d\u009e\7c\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7j\2\2\u00a1 \3\2\2\2\u00a2\u00a3"+
		"\7\"\2\2\u00a3\"\3\2\2\2\u00a4\u00a8\7*\2\2\u00a5\u00a6\7^\2\2\u00a6\u00a9"+
		"\13\2\2\2\u00a7\u00a9\n\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad$\3\2\2\2\5\2\u00a8\u00aa\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}