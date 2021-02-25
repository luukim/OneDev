// Generated from io/onedev/server/buildspec/job/action/notificationreceiver/NotificationReceiver.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.notificationreceiver;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NotificationReceiverLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Committers=2, CommittersSincePreviousSuccessful=3, Authors=4, 
		AuthorsSincePreviousSuccessful=5, Submitter=6, USER=7, GROUP=8, WS=9, 
		Value=10, Identifier=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Committers", "CommittersSincePreviousSuccessful", "Authors", 
			"AuthorsSincePreviousSuccessful", "Submitter", "USER", "GROUP", "WS", 
			"Value", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'committers'", "'committers-since-previous-successful'", 
			"'authors'", "'authors-since-previous-successful'", "'submitter'", "'user'", 
			"'group'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Committers", "CommittersSincePreviousSuccessful", "Authors", 
			"AuthorsSincePreviousSuccessful", "Submitter", "USER", "GROUP", "WS", 
			"Value", "Identifier"
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


	public NotificationReceiverLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NotificationReceiver.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u009d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\6\13\u0093\n\13\r\13\16\13\u0094\3\13\3\13\3\f\6\f\u009a"+
		"\n\f\r\f\16\f\u009b\3\u0094\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\4\4\2*+^^\t\2--//\61=C\\^^aac|\2\u009f\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5"+
		"\35\3\2\2\2\7(\3\2\2\2\tM\3\2\2\2\13U\3\2\2\2\rw\3\2\2\2\17\u0081\3\2"+
		"\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0099\3\2\2"+
		"\2\31\32\7c\2\2\32\33\7p\2\2\33\34\7f\2\2\34\4\3\2\2\2\35\36\7e\2\2\36"+
		"\37\7q\2\2\37 \7o\2\2 !\7o\2\2!\"\7k\2\2\"#\7v\2\2#$\7v\2\2$%\7g\2\2%"+
		"&\7t\2\2&\'\7u\2\2\'\6\3\2\2\2()\7e\2\2)*\7q\2\2*+\7o\2\2+,\7o\2\2,-\7"+
		"k\2\2-.\7v\2\2./\7v\2\2/\60\7g\2\2\60\61\7t\2\2\61\62\7u\2\2\62\63\7/"+
		"\2\2\63\64\7u\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7e\2\2\678\7g\2\289"+
		"\7/\2\29:\7r\2\2:;\7t\2\2;<\7g\2\2<=\7x\2\2=>\7k\2\2>?\7q\2\2?@\7w\2\2"+
		"@A\7u\2\2AB\7/\2\2BC\7u\2\2CD\7w\2\2DE\7e\2\2EF\7e\2\2FG\7g\2\2GH\7u\2"+
		"\2HI\7u\2\2IJ\7h\2\2JK\7w\2\2KL\7n\2\2L\b\3\2\2\2MN\7c\2\2NO\7w\2\2OP"+
		"\7v\2\2PQ\7j\2\2QR\7q\2\2RS\7t\2\2ST\7u\2\2T\n\3\2\2\2UV\7c\2\2VW\7w\2"+
		"\2WX\7v\2\2XY\7j\2\2YZ\7q\2\2Z[\7t\2\2[\\\7u\2\2\\]\7/\2\2]^\7u\2\2^_"+
		"\7k\2\2_`\7p\2\2`a\7e\2\2ab\7g\2\2bc\7/\2\2cd\7r\2\2de\7t\2\2ef\7g\2\2"+
		"fg\7x\2\2gh\7k\2\2hi\7q\2\2ij\7w\2\2jk\7u\2\2kl\7/\2\2lm\7u\2\2mn\7w\2"+
		"\2no\7e\2\2op\7e\2\2pq\7g\2\2qr\7u\2\2rs\7u\2\2st\7h\2\2tu\7w\2\2uv\7"+
		"n\2\2v\f\3\2\2\2wx\7u\2\2xy\7w\2\2yz\7d\2\2z{\7o\2\2{|\7k\2\2|}\7v\2\2"+
		"}~\7v\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\16\3\2\2\2\u0081\u0082\7"+
		"w\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084\u0085\7t\2\2\u0085\20"+
		"\3\2\2\2\u0086\u0087\7i\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7w\2\2\u008a\u008b\7r\2\2\u008b\22\3\2\2\2\u008c\u008d\7\"\2\2"+
		"\u008d\24\3\2\2\2\u008e\u0092\7*\2\2\u008f\u0090\7^\2\2\u0090\u0093\13"+
		"\2\2\2\u0091\u0093\n\2\2\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7+\2\2\u0097\26\3\2\2\2\u0098\u009a\t\3\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\30\3\2\2\2\6\2\u0092\u0094\u009b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}