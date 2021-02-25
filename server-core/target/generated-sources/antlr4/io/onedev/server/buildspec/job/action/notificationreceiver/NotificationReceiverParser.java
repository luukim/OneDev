// Generated from io/onedev/server/buildspec/job/action/notificationreceiver/NotificationReceiver.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.notificationreceiver;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NotificationReceiverParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Committers=2, CommittersSincePreviousSuccessful=3, Authors=4, 
		AuthorsSincePreviousSuccessful=5, Submitter=6, USER=7, GROUP=8, WS=9, 
		Value=10, Identifier=11;
	public static final int
		RULE_receiver = 0, RULE_criteria = 1, RULE_userCriteria = 2, RULE_groupCriteria = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"receiver", "criteria", "userCriteria", "groupCriteria"
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

	@Override
	public String getGrammarFileName() { return "NotificationReceiver.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotificationReceiverParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReceiverContext extends ParserRuleContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(NotificationReceiverParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(NotificationReceiverParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NotificationReceiverParser.WS, i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotificationReceiverVisitor ) return ((NotificationReceiverVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receiver);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(8);
				match(WS);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			criteria();
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(15);
						match(WS);
						}
						}
						setState(18); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(20);
					match(T__0);
					setState(22); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(21);
						match(WS);
						}
						}
						setState(24); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(26);
					criteria();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(32);
				match(WS);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaContext extends ParserRuleContext {
		public UserCriteriaContext userCriteria() {
			return getRuleContext(UserCriteriaContext.class,0);
		}
		public GroupCriteriaContext groupCriteria() {
			return getRuleContext(GroupCriteriaContext.class,0);
		}
		public TerminalNode Committers() { return getToken(NotificationReceiverParser.Committers, 0); }
		public TerminalNode Authors() { return getToken(NotificationReceiverParser.Authors, 0); }
		public TerminalNode Submitter() { return getToken(NotificationReceiverParser.Submitter, 0); }
		public TerminalNode AuthorsSincePreviousSuccessful() { return getToken(NotificationReceiverParser.AuthorsSincePreviousSuccessful, 0); }
		public TerminalNode CommittersSincePreviousSuccessful() { return getToken(NotificationReceiverParser.CommittersSincePreviousSuccessful, 0); }
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).exitCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotificationReceiverVisitor ) return ((NotificationReceiverVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_criteria);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				userCriteria();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				groupCriteria();
				}
				break;
			case Committers:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(Committers);
				}
				break;
			case Authors:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(Authors);
				}
				break;
			case Submitter:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(Submitter);
				}
				break;
			case AuthorsSincePreviousSuccessful:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(AuthorsSincePreviousSuccessful);
				}
				break;
			case CommittersSincePreviousSuccessful:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				match(CommittersSincePreviousSuccessful);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserCriteriaContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(NotificationReceiverParser.USER, 0); }
		public TerminalNode Value() { return getToken(NotificationReceiverParser.Value, 0); }
		public UserCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).enterUserCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).exitUserCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotificationReceiverVisitor ) return ((NotificationReceiverVisitor<? extends T>)visitor).visitUserCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserCriteriaContext userCriteria() throws RecognitionException {
		UserCriteriaContext _localctx = new UserCriteriaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_userCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(USER);
			setState(50);
			match(Value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupCriteriaContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(NotificationReceiverParser.GROUP, 0); }
		public TerminalNode Value() { return getToken(NotificationReceiverParser.Value, 0); }
		public GroupCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).enterGroupCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotificationReceiverListener ) ((NotificationReceiverListener)listener).exitGroupCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotificationReceiverVisitor ) return ((NotificationReceiverVisitor<? extends T>)visitor).visitGroupCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupCriteriaContext groupCriteria() throws RecognitionException {
		GroupCriteriaContext _localctx = new GroupCriteriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_groupCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(GROUP);
			setState(53);
			match(Value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\6\2\23\n\2\r"+
		"\2\16\2\24\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\7\2\36\n\2\f\2\16\2!\13"+
		"\2\3\2\7\2$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\62\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2@\2\r\3\2\2\2"+
		"\4\61\3\2\2\2\6\63\3\2\2\2\b\66\3\2\2\2\n\f\7\13\2\2\13\n\3\2\2\2\f\17"+
		"\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\37\5"+
		"\4\3\2\21\23\7\13\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25"+
		"\3\2\2\2\25\26\3\2\2\2\26\30\7\3\2\2\27\31\7\13\2\2\30\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\5\4\3\2\35\22"+
		"\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\""+
		"$\7\13\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2"+
		"\2\2()\7\2\2\3)\3\3\2\2\2*\62\5\6\4\2+\62\5\b\5\2,\62\7\4\2\2-\62\7\6"+
		"\2\2.\62\7\b\2\2/\62\7\7\2\2\60\62\7\5\2\2\61*\3\2\2\2\61+\3\2\2\2\61"+
		",\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2"+
		"\2\63\64\7\t\2\2\64\65\7\f\2\2\65\7\3\2\2\2\66\67\7\n\2\2\678\7\f\2\2"+
		"8\t\3\2\2\2\b\r\24\32\37%\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}