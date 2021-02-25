// Generated from io/onedev/server/util/usermatch/UserMatch.g4 by ANTLR 4.7.2
package io.onedev.server.util.usermatch;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserMatchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Anyone=1, AND=2, OR=3, USER=4, GROUP=5, EXCEPT=6, WS=7, Value=8;
	public static final int
		RULE_userMatch = 0, RULE_criteria = 1, RULE_exceptCriteria = 2, RULE_userCriteria = 3, 
		RULE_groupCriteria = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"userMatch", "criteria", "exceptCriteria", "userCriteria", "groupCriteria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'anyone'", "'and'", "'or'", "'user'", "'group'", "'except'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Anyone", "AND", "OR", "USER", "GROUP", "EXCEPT", "WS", "Value"
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
	public String getGrammarFileName() { return "UserMatch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UserMatchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UserMatchContext extends ParserRuleContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(UserMatchParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(UserMatchParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(UserMatchParser.WS, i);
		}
		public List<TerminalNode> OR() { return getTokens(UserMatchParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(UserMatchParser.OR, i);
		}
		public TerminalNode EXCEPT() { return getToken(UserMatchParser.EXCEPT, 0); }
		public List<ExceptCriteriaContext> exceptCriteria() {
			return getRuleContexts(ExceptCriteriaContext.class);
		}
		public ExceptCriteriaContext exceptCriteria(int i) {
			return getRuleContext(ExceptCriteriaContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(UserMatchParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(UserMatchParser.AND, i);
		}
		public UserMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).enterUserMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).exitUserMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserMatchVisitor ) return ((UserMatchVisitor<? extends T>)visitor).visitUserMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserMatchContext userMatch() throws RecognitionException {
		UserMatchContext _localctx = new UserMatchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_userMatch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(10);
				match(WS);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			criteria();
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(17);
						match(WS);
						}
						}
						setState(20); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(22);
					match(OR);
					setState(24); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(23);
						match(WS);
						}
						}
						setState(26); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(28);
					criteria();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					match(WS);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(39);
				match(EXCEPT);
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(40);
					match(WS);
					}
					}
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(45);
				exceptCriteria();
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(47); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(46);
							match(WS);
							}
							}
							setState(49); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(51);
						match(AND);
						setState(53); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(52);
							match(WS);
							}
							}
							setState(55); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(57);
						exceptCriteria();
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(65);
				match(WS);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		public TerminalNode Anyone() { return getToken(UserMatchParser.Anyone, 0); }
		public UserCriteriaContext userCriteria() {
			return getRuleContext(UserCriteriaContext.class,0);
		}
		public GroupCriteriaContext groupCriteria() {
			return getRuleContext(GroupCriteriaContext.class,0);
		}
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).exitCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserMatchVisitor ) return ((UserMatchVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_criteria);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Anyone:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(Anyone);
				}
				break;
			case USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				userCriteria();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				groupCriteria();
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

	public static class ExceptCriteriaContext extends ParserRuleContext {
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public ExceptCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).enterExceptCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).exitExceptCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserMatchVisitor ) return ((UserMatchVisitor<? extends T>)visitor).visitExceptCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptCriteriaContext exceptCriteria() throws RecognitionException {
		ExceptCriteriaContext _localctx = new ExceptCriteriaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exceptCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			criteria();
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
		public TerminalNode USER() { return getToken(UserMatchParser.USER, 0); }
		public TerminalNode Value() { return getToken(UserMatchParser.Value, 0); }
		public UserCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).enterUserCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).exitUserCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserMatchVisitor ) return ((UserMatchVisitor<? extends T>)visitor).visitUserCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserCriteriaContext userCriteria() throws RecognitionException {
		UserCriteriaContext _localctx = new UserCriteriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_userCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(USER);
			setState(81);
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
		public TerminalNode GROUP() { return getToken(UserMatchParser.GROUP, 0); }
		public TerminalNode Value() { return getToken(UserMatchParser.Value, 0); }
		public GroupCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).enterGroupCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UserMatchListener ) ((UserMatchListener)listener).exitGroupCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UserMatchVisitor ) return ((UserMatchVisitor<? extends T>)visitor).visitGroupCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupCriteriaContext groupCriteria() throws RecognitionException {
		GroupCriteriaContext _localctx = new GroupCriteriaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_groupCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(GROUP);
			setState(84);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\nY\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\7\2 \n\2\f\2\16"+
		"\2#\13\2\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\6"+
		"\2\62\n\2\r\2\16\2\63\3\2\3\2\6\28\n\2\r\2\16\29\3\2\7\2=\n\2\f\2\16\2"+
		"@\13\2\5\2B\n\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\3\3\3\3\3\5\3O\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2`\2\17\3\2"+
		"\2\2\4N\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\nU\3\2\2\2\f\16\7\t\2\2\r\f\3\2"+
		"\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2"+
		"\2\2\22!\5\4\3\2\23\25\7\t\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2"+
		"\2\26\27\3\2\2\2\27\30\3\2\2\2\30\32\7\5\2\2\31\33\7\t\2\2\32\31\3\2\2"+
		"\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36 \5\4\3\2"+
		"\37\24\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"A\3\2\2\2#!\3\2\2\2$"+
		"&\7\t\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)+\7\b\2"+
		"\2*,\7\t\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/>\5\6\4"+
		"\2\60\62\7\t\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\65\3\2\2\2\65\67\7\4\2\2\668\7\t\2\2\67\66\3\2\2\289\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\5\6\4\2<\61\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A%\3\2\2\2AB\3\2\2\2BF\3\2\2\2CE\7\t\2\2"+
		"DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\2\2\3"+
		"J\3\3\2\2\2KO\7\3\2\2LO\5\b\5\2MO\5\n\6\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2"+
		"\2O\5\3\2\2\2PQ\5\4\3\2Q\7\3\2\2\2RS\7\6\2\2ST\7\n\2\2T\t\3\2\2\2UV\7"+
		"\7\2\2VW\7\n\2\2W\13\3\2\2\2\16\17\26\34!\'-\639>AFN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}