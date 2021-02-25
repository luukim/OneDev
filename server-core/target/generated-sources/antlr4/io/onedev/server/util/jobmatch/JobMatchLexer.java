// Generated from io/onedev/server/util/jobmatch/JobMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.jobmatch;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JobMatchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		All=1, OnBranch=2, Is=3, And=4, Or=5, Not=6, LParens=7, RParens=8, Quoted=9, 
		WS=10, Identifier=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"All", "OnBranch", "Is", "And", "Or", "Not", "LParens", "RParens", "Quoted", 
			"WS", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'all'", null, "'is'", "'and'", "'or'", "'not'", "'('", "')'", 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "All", "OnBranch", "Is", "And", "Or", "Not", "LParens", "RParens", 
			"Quoted", "WS", "Identifier"
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


	public JobMatchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JobMatch.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rO\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\"\n\3\r\3\16\3#\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\6\nC\n\n\r\n\16\nD\3\n\3\n\3"+
		"\13\3\13\3\f\6\fL\n\f\r\f\16\fM\3D\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\3\2\4\4\2$$^^\t\2--//\61=C\\^^aac|\2R\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5"+
		"\35\3\2\2\2\7,\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\r\66\3\2\2\2\17:\3\2\2"+
		"\2\21<\3\2\2\2\23>\3\2\2\2\25H\3\2\2\2\27K\3\2\2\2\31\32\7c\2\2\32\33"+
		"\7n\2\2\33\34\7n\2\2\34\4\3\2\2\2\35\36\7q\2\2\36\37\7p\2\2\37!\3\2\2"+
		"\2 \"\5\25\13\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7"+
		"d\2\2&\'\7t\2\2\'(\7c\2\2()\7p\2\2)*\7e\2\2*+\7j\2\2+\6\3\2\2\2,-\7k\2"+
		"\2-.\7u\2\2.\b\3\2\2\2/\60\7c\2\2\60\61\7p\2\2\61\62\7f\2\2\62\n\3\2\2"+
		"\2\63\64\7q\2\2\64\65\7t\2\2\65\f\3\2\2\2\66\67\7p\2\2\678\7q\2\289\7"+
		"v\2\29\16\3\2\2\2:;\7*\2\2;\20\3\2\2\2<=\7+\2\2=\22\3\2\2\2>B\7$\2\2?"+
		"@\7^\2\2@C\13\2\2\2AC\n\2\2\2B?\3\2\2\2BA\3\2\2\2CD\3\2\2\2DE\3\2\2\2"+
		"DB\3\2\2\2EF\3\2\2\2FG\7$\2\2G\24\3\2\2\2HI\7\"\2\2I\26\3\2\2\2JL\t\3"+
		"\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\30\3\2\2\2\7\2#BDM\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}