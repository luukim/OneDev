// Generated from io/onedev/server/util/patternset/InterpolativePatternSet.g4 by ANTLR 4.7.2
package io.onedev.server.util.patternset;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpolativePatternSetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Quoted=2, NQuoted=3, Excluded=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Variable", "Quoted", "NQuoted", "Excluded", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'-'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Quoted", "NQuoted", "Excluded", "WS"
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


	public InterpolativePatternSetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "InterpolativePatternSet.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3"+
		"\5\3\6\3\6\4\21\35\2\7\3\3\5\4\7\5\t\6\13\7\3\2\6\3\2BB\5\2$$BB^^\7\2"+
		"\"\"$$//BB^^\6\2\"\"$$BB^^\2>\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\25\3\2\2\2\7&\3\2\2\2\t\62\3\2\2\2"+
		"\13\64\3\2\2\2\r\17\7B\2\2\16\20\n\2\2\2\17\16\3\2\2\2\20\21\3\2\2\2\21"+
		"\22\3\2\2\2\21\17\3\2\2\2\22\23\3\2\2\2\23\24\7B\2\2\24\4\3\2\2\2\25\33"+
		"\7$\2\2\26\27\7B\2\2\27\34\7B\2\2\30\31\7^\2\2\31\34\n\2\2\2\32\34\n\3"+
		"\2\2\33\26\3\2\2\2\33\30\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2"+
		"\2\2\35\33\3\2\2\2\36\37\3\2\2\2\37 \7$\2\2 \6\3\2\2\2!\"\7B\2\2\"\'\7"+
		"B\2\2#\'\n\4\2\2$%\7^\2\2%\'\n\2\2\2&!\3\2\2\2&#\3\2\2\2&$\3\2\2\2\'/"+
		"\3\2\2\2()\7B\2\2).\7B\2\2*.\n\5\2\2+,\7^\2\2,.\n\2\2\2-(\3\2\2\2-*\3"+
		"\2\2\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\b\3\2\2\2\61/\3"+
		"\2\2\2\62\63\7/\2\2\63\n\3\2\2\2\64\65\7\"\2\2\65\f\3\2\2\2\t\2\21\33"+
		"\35&-/\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}