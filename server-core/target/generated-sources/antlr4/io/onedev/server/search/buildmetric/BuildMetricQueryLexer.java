// Generated from io/onedev/server/search/buildmetric/BuildMetricQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.buildmetric;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BuildMetricQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BuildIsSuccessful=1, BuildIsFailed=2, Is=3, IsEmpty=4, Since=5, Until=6, 
		And=7, Or=8, Not=9, LParens=10, RParens=11, Quoted=12, WS=13, Identifier=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BuildIsSuccessful", "BuildIsFailed", "Is", "IsEmpty", "Since", "Until", 
			"And", "Or", "Not", "LParens", "RParens", "Quoted", "WS", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'is'", null, "'since'", "'until'", "'and'", "'or'", 
			"'not'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BuildIsSuccessful", "BuildIsFailed", "Is", "IsEmpty", "Since", 
			"Until", "And", "Or", "Not", "LParens", "RParens", "Quoted", "WS", "Identifier"
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


	public BuildMetricQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BuildMetricQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\3\2\3\2\6\2/\n\2\r\2\16\2\60\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3E\n"+
		"\3\r\3\16\3F\3\3\3\3\3\3\3\3\6\3M\n\3\r\3\16\3N\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5_\n\5\r\5\16\5`\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u0088"+
		"\n\r\r\r\16\r\u0089\3\r\3\r\3\16\3\16\3\17\6\17\u0091\n\17\r\17\16\17"+
		"\u0092\3\u0089\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\3\2\4\4\2$$^^\t\2--//\61=C\\^^aac|\2\u009b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5=\3\2\2\2\7W\3\2\2\2\tZ\3"+
		"\2\2\2\13h\3\2\2\2\rn\3\2\2\2\17t\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2\25\177"+
		"\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u008d\3\2\2\2\35\u0090\3"+
		"\2\2\2\37 \7d\2\2 !\7w\2\2!\"\7k\2\2\"#\7n\2\2#$\7f\2\2$&\3\2\2\2%\'\5"+
		"\33\16\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7k\2\2+"+
		",\7u\2\2,.\3\2\2\2-/\5\33\16\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\7u\2\2\63\64\7w\2\2\64\65\7e\2\2\65\66\7"+
		"e\2\2\66\67\7g\2\2\678\7u\2\289\7u\2\29:\7h\2\2:;\7w\2\2;<\7n\2\2<\4\3"+
		"\2\2\2=>\7d\2\2>?\7w\2\2?@\7k\2\2@A\7n\2\2AB\7f\2\2BD\3\2\2\2CE\5\33\16"+
		"\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7k\2\2IJ\7u\2\2"+
		"JL\3\2\2\2KM\5\33\16\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\7h\2\2QR\7c\2\2RS\7k\2\2ST\7n\2\2TU\7g\2\2UV\7f\2\2V\6\3\2\2\2WX"+
		"\7k\2\2XY\7u\2\2Y\b\3\2\2\2Z[\7k\2\2[\\\7u\2\2\\^\3\2\2\2]_\5\33\16\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7g\2\2cd\7o\2\2d"+
		"e\7r\2\2ef\7v\2\2fg\7{\2\2g\n\3\2\2\2hi\7u\2\2ij\7k\2\2jk\7p\2\2kl\7e"+
		"\2\2lm\7g\2\2m\f\3\2\2\2no\7w\2\2op\7p\2\2pq\7v\2\2qr\7k\2\2rs\7n\2\2"+
		"s\16\3\2\2\2tu\7c\2\2uv\7p\2\2vw\7f\2\2w\20\3\2\2\2xy\7q\2\2yz\7t\2\2"+
		"z\22\3\2\2\2{|\7p\2\2|}\7q\2\2}~\7v\2\2~\24\3\2\2\2\177\u0080\7*\2\2\u0080"+
		"\26\3\2\2\2\u0081\u0082\7+\2\2\u0082\30\3\2\2\2\u0083\u0087\7$\2\2\u0084"+
		"\u0085\7^\2\2\u0085\u0088\13\2\2\2\u0086\u0088\n\2\2\2\u0087\u0084\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7$\2\2\u008c\32\3\2\2\2"+
		"\u008d\u008e\7\"\2\2\u008e\34\3\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\36\3\2\2\2\13\2(\60FN`\u0087\u0089\u0092\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}