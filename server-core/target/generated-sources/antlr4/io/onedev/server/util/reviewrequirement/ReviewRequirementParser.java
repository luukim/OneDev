// Generated from io/onedev/server/util/reviewrequirement/ReviewRequirement.g4 by ANTLR 4.7.2
package io.onedev.server.util.reviewrequirement;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReviewRequirementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DIGIT=4, USER=5, GROUP=6, WS=7, Value=8;
	public static final int
		RULE_requirement = 0, RULE_criteria = 1, RULE_userCriteria = 2, RULE_groupCriteria = 3, 
		RULE_count = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"requirement", "criteria", "userCriteria", "groupCriteria", "count"
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

	@Override
	public String getGrammarFileName() { return "ReviewRequirement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReviewRequirementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RequirementContext extends ParserRuleContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ReviewRequirementParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(ReviewRequirementParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ReviewRequirementParser.WS, i);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReviewRequirementVisitor ) return ((ReviewRequirementVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_requirement);
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
					match(T__0);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(34);
				match(WS);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).exitCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReviewRequirementVisitor ) return ((ReviewRequirementVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_criteria);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				userCriteria();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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

	public static class UserCriteriaContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(ReviewRequirementParser.USER, 0); }
		public TerminalNode Value() { return getToken(ReviewRequirementParser.Value, 0); }
		public UserCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).enterUserCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).exitUserCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReviewRequirementVisitor ) return ((ReviewRequirementVisitor<? extends T>)visitor).visitUserCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserCriteriaContext userCriteria() throws RecognitionException {
		UserCriteriaContext _localctx = new UserCriteriaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_userCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(USER);
			setState(47);
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
		public TerminalNode GROUP() { return getToken(ReviewRequirementParser.GROUP, 0); }
		public TerminalNode Value() { return getToken(ReviewRequirementParser.Value, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public GroupCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).enterGroupCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).exitGroupCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReviewRequirementVisitor ) return ((ReviewRequirementVisitor<? extends T>)visitor).visitGroupCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupCriteriaContext groupCriteria() throws RecognitionException {
		GroupCriteriaContext _localctx = new GroupCriteriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_groupCriteria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(GROUP);
			setState(50);
			match(Value);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(51);
				match(T__1);
				setState(52);
				count();
				}
			}

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

	public static class CountContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ReviewRequirementParser.DIGIT, 0); }
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReviewRequirementListener ) ((ReviewRequirementListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReviewRequirementVisitor ) return ((ReviewRequirementVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_count);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\7\2 \n\2\f\2\16"+
		"\2#\13\2\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\5\3/\n\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\5\6"+
		"\2=\2\17\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\63\3\2\2\2\n9\3\2\2\2\f\16"+
		"\7\t\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3"+
		"\2\2\2\21\17\3\2\2\2\22!\5\4\3\2\23\25\7\t\2\2\24\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\32\7\3\2\2\31\33\7\t"+
		"\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2"+
		"\2\2\36 \5\4\3\2\37\24\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\'\3"+
		"\2\2\2#!\3\2\2\2$&\7\t\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2("+
		"*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,/\5\6\4\2-/\5\b\5\2.,\3\2\2"+
		"\2.-\3\2\2\2/\5\3\2\2\2\60\61\7\7\2\2\61\62\7\n\2\2\62\7\3\2\2\2\63\64"+
		"\7\b\2\2\64\67\7\n\2\2\65\66\7\4\2\2\668\5\n\6\2\67\65\3\2\2\2\678\3\2"+
		"\2\28\t\3\2\2\29:\t\2\2\2:\13\3\2\2\2\t\17\26\34!\'.\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}