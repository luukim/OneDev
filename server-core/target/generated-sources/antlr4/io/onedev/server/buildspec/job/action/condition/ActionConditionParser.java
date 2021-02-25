// Generated from io/onedev/server/buildspec/job/action/condition/ActionCondition.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.condition;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActionConditionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Always=1, Successful=2, Failed=3, Cancelled=4, TimedOut=5, PreviousIsSuccessful=6, 
		PreviousIsFailed=7, PreviousIsCancelled=8, PreviousIsTimedOut=9, OnBranch=10, 
		Contains=11, Is=12, IsEmpty=13, And=14, Or=15, Not=16, LParens=17, RParens=18, 
		Quoted=19, WS=20, Identifier=21;
	public static final int
		RULE_condition = 0, RULE_criteria = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"condition", "criteria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'always'", "'successful'", "'failed'", "'cancelled'", null, null, 
			null, null, null, null, "'contains'", "'is'", null, "'and'", "'or'", 
			"'not'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Always", "Successful", "Failed", "Cancelled", "TimedOut", "PreviousIsSuccessful", 
			"PreviousIsFailed", "PreviousIsCancelled", "PreviousIsTimedOut", "OnBranch", 
			"Contains", "Is", "IsEmpty", "And", "Or", "Not", "LParens", "RParens", 
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

	@Override
	public String getGrammarFileName() { return "ActionCondition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ActionConditionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ActionConditionParser.EOF, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode Always() { return getToken(ActionConditionParser.Always, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(4);
				match(WS);
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Successful:
			case Failed:
			case Cancelled:
			case TimedOut:
			case PreviousIsSuccessful:
			case PreviousIsFailed:
			case PreviousIsCancelled:
			case PreviousIsTimedOut:
			case OnBranch:
			case Not:
			case LParens:
			case Quoted:
				{
				setState(10);
				criteria(0);
				}
				break;
			case Always:
				{
				setState(11);
				match(Always);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(14);
				match(WS);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
	 
		public CriteriaContext() { }
		public void copyFrom(CriteriaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorCriteriaContext extends CriteriaContext {
		public Token operator;
		public TerminalNode Successful() { return getToken(ActionConditionParser.Successful, 0); }
		public TerminalNode Failed() { return getToken(ActionConditionParser.Failed, 0); }
		public TerminalNode Cancelled() { return getToken(ActionConditionParser.Cancelled, 0); }
		public TerminalNode TimedOut() { return getToken(ActionConditionParser.TimedOut, 0); }
		public TerminalNode PreviousIsSuccessful() { return getToken(ActionConditionParser.PreviousIsSuccessful, 0); }
		public TerminalNode PreviousIsFailed() { return getToken(ActionConditionParser.PreviousIsFailed, 0); }
		public TerminalNode PreviousIsCancelled() { return getToken(ActionConditionParser.PreviousIsCancelled, 0); }
		public TerminalNode PreviousIsTimedOut() { return getToken(ActionConditionParser.PreviousIsTimedOut, 0); }
		public OperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitOperatorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCriteriaContext extends CriteriaContext {
		public TerminalNode LParens() { return getToken(ActionConditionParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(ActionConditionParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public ParensCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterParensCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitParensCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitParensCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrCriteriaContext extends CriteriaContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode Or() { return getToken(ActionConditionParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public OrCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterOrCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitOrCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitOrCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorValueCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public Token criteriaValue;
		public List<TerminalNode> Quoted() { return getTokens(ActionConditionParser.Quoted); }
		public TerminalNode Quoted(int i) {
			return getToken(ActionConditionParser.Quoted, i);
		}
		public TerminalNode Contains() { return getToken(ActionConditionParser.Contains, 0); }
		public TerminalNode Is() { return getToken(ActionConditionParser.Is, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public FieldOperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterFieldOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitFieldOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitFieldOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public TerminalNode Quoted() { return getToken(ActionConditionParser.Quoted, 0); }
		public TerminalNode IsEmpty() { return getToken(ActionConditionParser.IsEmpty, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public FieldOperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterFieldOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitFieldOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitFieldOperatorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCriteriaContext extends CriteriaContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode And() { return getToken(ActionConditionParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public AndCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterAndCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitAndCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitAndCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorValueCriteriaContext extends CriteriaContext {
		public Token operator;
		public Token criteriaValue;
		public TerminalNode OnBranch() { return getToken(ActionConditionParser.OnBranch, 0); }
		public TerminalNode Quoted() { return getToken(ActionConditionParser.Quoted, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public OperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCriteriaContext extends CriteriaContext {
		public TerminalNode Not() { return getToken(ActionConditionParser.Not, 0); }
		public TerminalNode LParens() { return getToken(ActionConditionParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(ActionConditionParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(ActionConditionParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ActionConditionParser.WS, i);
		}
		public NotCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).enterNotCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionConditionListener ) ((ActionConditionListener)listener).exitNotCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionConditionVisitor ) return ((ActionConditionVisitor<? extends T>)visitor).visitNotCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		return criteria(0);
	}

	private CriteriaContext criteria(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CriteriaContext _localctx = new CriteriaContext(_ctx, _parentState);
		CriteriaContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_criteria, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new OperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				((OperatorCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Successful) | (1L << Failed) | (1L << Cancelled) | (1L << TimedOut) | (1L << PreviousIsSuccessful) | (1L << PreviousIsFailed) | (1L << PreviousIsCancelled) | (1L << PreviousIsTimedOut))) != 0)) ) {
					((OperatorCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new FieldOperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				((FieldOperatorCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(25);
					match(WS);
					}
					}
					setState(28); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(30);
				((FieldOperatorCriteriaContext)_localctx).operator = match(IsEmpty);
				}
				break;
			case 3:
				{
				_localctx = new OperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				((OperatorValueCriteriaContext)_localctx).operator = match(OnBranch);
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					match(WS);
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(37);
				((OperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 4:
				{
				_localctx = new FieldOperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					match(WS);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(44);
				((FieldOperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Contains || _la==Is) ) {
					((FieldOperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					match(WS);
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(50);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 5:
				{
				_localctx = new NotCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(Not);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(52);
					match(WS);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(LParens);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(59);
					match(WS);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				criteria(0);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(66);
					match(WS);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(RParens);
				}
				break;
			case 6:
				{
				_localctx = new ParensCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(LParens);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(75);
					match(WS);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				criteria(0);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(82);
					match(WS);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(RParens);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AndCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(93);
							match(WS);
							}
							}
							setState(96); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(98);
						match(And);
						setState(100); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(99);
							match(WS);
							}
							}
							setState(102); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(104);
						criteria(5);
						}
						break;
					case 2:
						{
						_localctx = new OrCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(106);
							match(WS);
							}
							}
							setState(109); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(111);
						match(Or);
						setState(113); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(112);
							match(WS);
							}
							}
							setState(115); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(117);
						criteria(4);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return criteria_sempred((CriteriaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean criteria_sempred(CriteriaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27~\4\2\t\2\4\3\t"+
		"\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\5\2\17\n\2\3\2\7\2\22\n\2\f"+
		"\2\16\2\25\13\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3"+
		"\3\3\6\3$\n\3\r\3\16\3%\3\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\6\3\61"+
		"\n\3\r\3\16\3\62\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\7\3?\n\3"+
		"\f\3\16\3B\13\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\7\3O\n"+
		"\3\f\3\16\3R\13\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\5\3]\n\3\3\3"+
		"\3\3\6\3a\n\3\r\3\16\3b\3\3\3\3\6\3g\n\3\r\3\16\3h\3\3\3\3\3\3\6\3n\n"+
		"\3\r\3\16\3o\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3\7\3y\n\3\f\3\16\3|\13\3\3"+
		"\3\2\3\4\4\2\4\2\4\3\2\4\13\3\2\r\16\2\u0092\2\t\3\2\2\2\4\\\3\2\2\2\6"+
		"\b\7\26\2\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\16\3\2"+
		"\2\2\13\t\3\2\2\2\f\17\5\4\3\2\r\17\7\3\2\2\16\f\3\2\2\2\16\r\3\2\2\2"+
		"\17\23\3\2\2\2\20\22\7\26\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2"+
		"\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2"+
		"\2\30\31\b\3\1\2\31]\t\2\2\2\32\34\7\25\2\2\33\35\7\26\2\2\34\33\3\2\2"+
		"\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 ]\7\17\2\2!#"+
		"\7\f\2\2\"$\7\26\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2"+
		"\2\']\7\25\2\2(*\7\25\2\2)+\7\26\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-.\3\2\2\2.\60\t\3\2\2/\61\7\26\2\2\60/\3\2\2\2\61\62\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64]\7\25\2\2\659\7\22\2\2\668"+
		"\7\26\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3"+
		"\2\2\2<@\7\23\2\2=?\7\26\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A"+
		"C\3\2\2\2B@\3\2\2\2CG\5\4\3\2DF\7\26\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\24\2\2K]\3\2\2\2LP\7\23\2\2MO\7\26"+
		"\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2SW\5\4"+
		"\3\2TV\7\26\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3"+
		"\2\2\2Z[\7\24\2\2[]\3\2\2\2\\\30\3\2\2\2\\\32\3\2\2\2\\!\3\2\2\2\\(\3"+
		"\2\2\2\\\65\3\2\2\2\\L\3\2\2\2]z\3\2\2\2^`\f\6\2\2_a\7\26\2\2`_\3\2\2"+
		"\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\7\20\2\2eg\7\26\2\2fe\3\2"+
		"\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jy\5\4\3\7km\f\5\2\2ln\7\26"+
		"\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\7\21\2\2rt\7"+
		"\26\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\4\3\6x^"+
		"\3\2\2\2xk\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|z\3\2\2\2"+
		"\25\t\16\23\36%,\629@GPW\\bhouxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}