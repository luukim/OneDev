// Generated from io/onedev/server/buildspec/job/log/instruction/LogInstruction.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.log.instruction;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogInstructionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PREFIX=4, Identifier=5, WS=6, Value=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PREFIX", "Identifier", "WS", "Value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'='", "'##onedev'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PREFIX", "Identifier", "WS", "Value"
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


	public LogInstructionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogInstruction.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6#\n\6\f\6\16\6&\13\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\60\n\b\f\b\16\b\63\13\b\3\b\3\b\3"+
		"\61\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\5\2C\\aac|\6\2\62;C\\aac|"+
		"\4\2))^^\28\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2\2\t\27"+
		"\3\2\2\2\13 \3\2\2\2\r\'\3\2\2\2\17+\3\2\2\2\21\22\7]\2\2\22\4\3\2\2\2"+
		"\23\24\7_\2\2\24\6\3\2\2\2\25\26\7?\2\2\26\b\3\2\2\2\27\30\7%\2\2\30\31"+
		"\7%\2\2\31\32\7q\2\2\32\33\7p\2\2\33\34\7g\2\2\34\35\7f\2\2\35\36\7g\2"+
		"\2\36\37\7x\2\2\37\n\3\2\2\2 $\t\2\2\2!#\t\3\2\2\"!\3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%\f\3\2\2\2&$\3\2\2\2\'(\7\"\2\2()\3\2\2\2)*\b\7"+
		"\2\2*\16\3\2\2\2+\61\7)\2\2,-\7^\2\2-\60\13\2\2\2.\60\n\4\2\2/,\3\2\2"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61\62\3\2\2\2\61/\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\65\7)\2\2\65\20\3\2\2\2\6\2$/\61\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}