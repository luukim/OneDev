// Generated from io/onedev/server/util/reviewrequirement/ReviewRequirement.g4 by ANTLR 4.7.2
package io.onedev.server.util.reviewrequirement;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReviewRequirementLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DIGIT=4, USER=5, GROUP=6, WS=7, Value=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DIGIT", "USER", "GROUP", "WS", "Value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "':'", "'all'", null, "'user'", "'group'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "DIGIT", "USER", "GROUP", "WS", "Value"
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


	public ReviewRequirementLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReviewRequirement.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n;\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5 \n\5\f\5\16\5#\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t\66\n\t\r\t"+
		"\16\t\67\3\t\3\t\3\67\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\3\2"+
		"\63;\3\2\62;\4\2*+^^\2=\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\27"+
		"\3\2\2\2\7\31\3\2\2\2\t\35\3\2\2\2\13$\3\2\2\2\r)\3\2\2\2\17/\3\2\2\2"+
		"\21\61\3\2\2\2\23\24\7c\2\2\24\25\7p\2\2\25\26\7f\2\2\26\4\3\2\2\2\27"+
		"\30\7<\2\2\30\6\3\2\2\2\31\32\7c\2\2\32\33\7n\2\2\33\34\7n\2\2\34\b\3"+
		"\2\2\2\35!\t\2\2\2\36 \t\3\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"\n\3\2\2\2#!\3\2\2\2$%\7w\2\2%&\7u\2\2&\'\7g\2\2\'(\7t\2\2("+
		"\f\3\2\2\2)*\7i\2\2*+\7t\2\2+,\7q\2\2,-\7w\2\2-.\7r\2\2.\16\3\2\2\2/\60"+
		"\7\"\2\2\60\20\3\2\2\2\61\65\7*\2\2\62\63\7^\2\2\63\66\13\2\2\2\64\66"+
		"\n\4\2\2\65\62\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\2\67\65\3"+
		"\2\2\289\3\2\2\29:\7+\2\2:\22\3\2\2\2\6\2!\65\67\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}