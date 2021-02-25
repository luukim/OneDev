// Generated from io/onedev/server/search/entity/build/BuildQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.build;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BuildQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Successful=1, Failed=2, Cancelled=3, TimedOut=4, Running=5, Waiting=6, 
		Pending=7, SubmittedByMe=8, SubmittedBy=9, CancelledByMe=10, CancelledBy=11, 
		DependsOn=12, DependenciesOf=13, FixedIssue=14, OrderBy=15, Is=16, IsEmpty=17, 
		IsGreaterThan=18, IsLessThan=19, IsSince=20, IsUntil=21, And=22, Or=23, 
		Not=24, Asc=25, Desc=26, LParens=27, RParens=28, Quoted=29, WS=30, Identifier=31;
	public static final int
		RULE_query = 0, RULE_criteria = 1, RULE_order = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "criteria", "order"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'successful'", "'failed'", "'cancelled'", null, "'running'", "'waiting'", 
			"'pending'", null, null, null, null, null, null, null, "'order by'", 
			"'is'", null, null, null, "'is since'", "'is until'", "'and'", "'or'", 
			"'not'", "'asc'", "'desc'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Successful", "Failed", "Cancelled", "TimedOut", "Running", "Waiting", 
			"Pending", "SubmittedByMe", "SubmittedBy", "CancelledByMe", "CancelledBy", 
			"DependsOn", "DependenciesOf", "FixedIssue", "OrderBy", "Is", "IsEmpty", 
			"IsGreaterThan", "IsLessThan", "IsSince", "IsUntil", "And", "Or", "Not", 
			"Asc", "Desc", "LParens", "RParens", "Quoted", "WS", "Identifier"
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
	public String getGrammarFileName() { return "BuildQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BuildQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BuildQueryParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public TerminalNode OrderBy() { return getToken(BuildQueryParser.OrderBy, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(BuildQueryParser.And); }
		public TerminalNode And(int i) {
			return getToken(BuildQueryParser.And, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(6);
					match(WS);
					}
					}
					setState(11);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(12);
				criteria(0);
				setState(16);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(13);
						match(WS);
						}
						} 
					}
					setState(18);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(19);
					match(WS);
					setState(20);
					match(OrderBy);
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
					order();
					setState(41);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(28); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(27);
								match(WS);
								}
								}
								setState(30); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS );
							setState(32);
							match(And);
							setState(34); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(33);
								match(WS);
								}
								}
								setState(36); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS );
							setState(38);
							order();
							}
							} 
						}
						setState(43);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(44);
						match(WS);
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(52);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(54);
					match(WS);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(OrderBy);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					match(WS);
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(66);
				order();
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(68); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(67);
							match(WS);
							}
							}
							setState(70); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(72);
						match(And);
						setState(74); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(73);
							match(WS);
							}
							}
							setState(76); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(78);
						order();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(84);
					match(WS);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(92);
					match(WS);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(EOF);
				}
				break;
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
		public TerminalNode Successful() { return getToken(BuildQueryParser.Successful, 0); }
		public TerminalNode Failed() { return getToken(BuildQueryParser.Failed, 0); }
		public TerminalNode Cancelled() { return getToken(BuildQueryParser.Cancelled, 0); }
		public TerminalNode Running() { return getToken(BuildQueryParser.Running, 0); }
		public TerminalNode Waiting() { return getToken(BuildQueryParser.Waiting, 0); }
		public TerminalNode Pending() { return getToken(BuildQueryParser.Pending, 0); }
		public TerminalNode TimedOut() { return getToken(BuildQueryParser.TimedOut, 0); }
		public TerminalNode SubmittedByMe() { return getToken(BuildQueryParser.SubmittedByMe, 0); }
		public TerminalNode CancelledByMe() { return getToken(BuildQueryParser.CancelledByMe, 0); }
		public OperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitOperatorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCriteriaContext extends CriteriaContext {
		public TerminalNode LParens() { return getToken(BuildQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(BuildQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public ParensCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterParensCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitParensCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitParensCriteria(this);
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
		public TerminalNode Or() { return getToken(BuildQueryParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public OrCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterOrCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitOrCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitOrCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorValueCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public Token criteriaValue;
		public List<TerminalNode> Quoted() { return getTokens(BuildQueryParser.Quoted); }
		public TerminalNode Quoted(int i) {
			return getToken(BuildQueryParser.Quoted, i);
		}
		public TerminalNode Is() { return getToken(BuildQueryParser.Is, 0); }
		public TerminalNode IsGreaterThan() { return getToken(BuildQueryParser.IsGreaterThan, 0); }
		public TerminalNode IsLessThan() { return getToken(BuildQueryParser.IsLessThan, 0); }
		public TerminalNode IsUntil() { return getToken(BuildQueryParser.IsUntil, 0); }
		public TerminalNode IsSince() { return getToken(BuildQueryParser.IsSince, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public FieldOperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterFieldOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitFieldOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitFieldOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public TerminalNode Quoted() { return getToken(BuildQueryParser.Quoted, 0); }
		public TerminalNode IsEmpty() { return getToken(BuildQueryParser.IsEmpty, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public FieldOperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterFieldOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitFieldOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitFieldOperatorCriteria(this);
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
		public TerminalNode And() { return getToken(BuildQueryParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public AndCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterAndCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitAndCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitAndCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorValueCriteriaContext extends CriteriaContext {
		public Token operator;
		public Token criteriaValue;
		public TerminalNode Quoted() { return getToken(BuildQueryParser.Quoted, 0); }
		public TerminalNode FixedIssue() { return getToken(BuildQueryParser.FixedIssue, 0); }
		public TerminalNode SubmittedBy() { return getToken(BuildQueryParser.SubmittedBy, 0); }
		public TerminalNode CancelledBy() { return getToken(BuildQueryParser.CancelledBy, 0); }
		public TerminalNode DependsOn() { return getToken(BuildQueryParser.DependsOn, 0); }
		public TerminalNode DependenciesOf() { return getToken(BuildQueryParser.DependenciesOf, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public OperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCriteriaContext extends CriteriaContext {
		public TerminalNode Not() { return getToken(BuildQueryParser.Not, 0); }
		public TerminalNode LParens() { return getToken(BuildQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(BuildQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public NotCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterNotCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitNotCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitNotCriteria(this);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new OperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102);
				((OperatorCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Successful) | (1L << Failed) | (1L << Cancelled) | (1L << TimedOut) | (1L << Running) | (1L << Waiting) | (1L << Pending) | (1L << SubmittedByMe) | (1L << CancelledByMe))) != 0)) ) {
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
				setState(103);
				((FieldOperatorCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					match(WS);
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(109);
				((FieldOperatorCriteriaContext)_localctx).operator = match(IsEmpty);
				}
				break;
			case 3:
				{
				_localctx = new OperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				((OperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SubmittedBy) | (1L << CancelledBy) | (1L << DependsOn) | (1L << DependenciesOf) | (1L << FixedIssue))) != 0)) ) {
					((OperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					match(WS);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(116);
				((OperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 4:
				{
				_localctx = new FieldOperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					match(WS);
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(123);
				((FieldOperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Is) | (1L << IsGreaterThan) | (1L << IsLessThan) | (1L << IsSince) | (1L << IsUntil))) != 0)) ) {
					((FieldOperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(WS);
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(129);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 5:
				{
				_localctx = new NotCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(Not);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(131);
					match(WS);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(LParens);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(138);
					match(WS);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				criteria(0);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(145);
					match(WS);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(RParens);
				}
				break;
			case 6:
				{
				_localctx = new ParensCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(LParens);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(154);
					match(WS);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				criteria(0);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(161);
					match(WS);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(RParens);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new AndCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(171);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(172);
							match(WS);
							}
							}
							setState(175); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(177);
						match(And);
						setState(179); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(178);
							match(WS);
							}
							}
							setState(181); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(183);
						criteria(5);
						}
						break;
					case 2:
						{
						_localctx = new OrCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(185);
							match(WS);
							}
							}
							setState(188); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(190);
						match(Or);
						setState(192); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(191);
							match(WS);
							}
							}
							setState(194); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(196);
						criteria(4);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class OrderContext extends ParserRuleContext {
		public Token orderField;
		public Token direction;
		public TerminalNode Quoted() { return getToken(BuildQueryParser.Quoted, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildQueryParser.WS, i);
		}
		public TerminalNode Asc() { return getToken(BuildQueryParser.Asc, 0); }
		public TerminalNode Desc() { return getToken(BuildQueryParser.Desc, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildQueryListener ) ((BuildQueryListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildQueryVisitor ) return ((BuildQueryVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_order);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((OrderContext)_localctx).orderField = match(Quoted);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(WS);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					match(WS);
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(214);
				((OrderContext)_localctx).direction = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Asc || _la==Desc) ) {
					((OrderContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\7\2\21\n\2\f\2\16"+
		"\2\24\13\2\3\2\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\6\2\37\n\2\r\2\16"+
		"\2 \3\2\3\2\6\2%\n\2\r\2\16\2&\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60"+
		"\n\2\f\2\16\2\63\13\2\5\2\65\n\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3"+
		"\2\3\2\6\2A\n\2\r\2\16\2B\3\2\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\6\2M\n\2"+
		"\r\2\16\2N\3\2\7\2R\n\2\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2"+
		"\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\5\2f\n\2\3\3\3\3\3\3\3\3\6\3l\n\3"+
		"\r\3\16\3m\3\3\3\3\3\3\6\3s\n\3\r\3\16\3t\3\3\3\3\3\3\6\3z\n\3\r\3\16"+
		"\3{\3\3\3\3\6\3\u0080\n\3\r\3\16\3\u0081\3\3\3\3\3\3\7\3\u0087\n\3\f\3"+
		"\16\3\u008a\13\3\3\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3\3\3\3\3\7\3"+
		"\u0095\n\3\f\3\16\3\u0098\13\3\3\3\3\3\3\3\3\3\7\3\u009e\n\3\f\3\16\3"+
		"\u00a1\13\3\3\3\3\3\7\3\u00a5\n\3\f\3\16\3\u00a8\13\3\3\3\3\3\5\3\u00ac"+
		"\n\3\3\3\3\3\6\3\u00b0\n\3\r\3\16\3\u00b1\3\3\3\3\6\3\u00b6\n\3\r\3\16"+
		"\3\u00b7\3\3\3\3\3\3\6\3\u00bd\n\3\r\3\16\3\u00be\3\3\3\3\6\3\u00c3\n"+
		"\3\r\3\16\3\u00c4\3\3\7\3\u00c8\n\3\f\3\16\3\u00cb\13\3\3\4\3\4\7\4\u00cf"+
		"\n\4\f\4\16\4\u00d2\13\4\3\4\6\4\u00d5\n\4\r\4\16\4\u00d6\3\4\5\4\u00da"+
		"\n\4\3\4\2\3\4\5\2\4\6\2\6\4\2\3\n\f\f\4\2\13\13\r\20\4\2\22\22\24\27"+
		"\3\2\33\34\2\u0100\2e\3\2\2\2\4\u00ab\3\2\2\2\6\u00cc\3\2\2\2\b\n\7 \2"+
		"\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13"+
		"\3\2\2\2\16\22\5\4\3\2\17\21\7 \2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20"+
		"\3\2\2\2\22\23\3\2\2\2\23\64\3\2\2\2\24\22\3\2\2\2\25\26\7 \2\2\26\30"+
		"\7\21\2\2\27\31\7 \2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\34\3\2\2\2\34+\5\6\4\2\35\37\7 \2\2\36\35\3\2\2\2\37 \3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"$\7\30\2\2#%\7 \2\2$#\3\2\2\2%"+
		"&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2(*\5\6\4\2)\36\3\2\2\2*-\3\2"+
		"\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\7 \2\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64\25"+
		"\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\2\2\3\67f\3\2\2\28:\7 \2"+
		"\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\7\21"+
		"\2\2?A\7 \2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DS\5\6"+
		"\4\2EG\7 \2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\7\30"+
		"\2\2KM\7 \2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\5\6"+
		"\4\2QF\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\7 "+
		"\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7"+
		"\2\2\3]f\3\2\2\2^`\7 \2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3"+
		"\2\2\2ca\3\2\2\2df\7\2\2\3e\13\3\2\2\2e;\3\2\2\2ea\3\2\2\2f\3\3\2\2\2"+
		"gh\b\3\1\2h\u00ac\t\2\2\2ik\7\37\2\2jl\7 \2\2kj\3\2\2\2lm\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2no\3\2\2\2o\u00ac\7\23\2\2pr\t\3\2\2qs\7 \2\2rq\3\2\2"+
		"\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2v\u00ac\7\37\2\2wy\7\37\2\2"+
		"xz\7 \2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\t\4\2"+
		"\2~\u0080\7 \2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u00ac\7\37\2\2\u0084\u0088\7"+
		"\32\2\2\u0085\u0087\7 \2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008f\7\35\2\2\u008c\u008e\7 \2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0096\5\4\3\2\u0093\u0095\7 \2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\36\2\2\u009a"+
		"\u00ac\3\2\2\2\u009b\u009f\7\35\2\2\u009c\u009e\7 \2\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a6\5\4\3\2\u00a3\u00a5\7 "+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\36"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00abg\3\2\2\2\u00abi\3\2\2\2\u00abp\3\2\2\2"+
		"\u00abw\3\2\2\2\u00ab\u0084\3\2\2\2\u00ab\u009b\3\2\2\2\u00ac\u00c9\3"+
		"\2\2\2\u00ad\u00af\f\6\2\2\u00ae\u00b0\7 \2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\7\30\2\2\u00b4\u00b6\7 \2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00c8\5\4\3\7\u00ba\u00bc\f\5\2\2\u00bb\u00bd\7 \2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7\31\2\2\u00c1\u00c3\7 \2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\5\4\3\6\u00c7\u00ad\3\2\2\2\u00c7"+
		"\u00ba\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\7\37\2\2\u00cd\u00cf"+
		"\7 \2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d9\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7 "+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d4\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\7\3\2\2\2%\13\22\32 &+\61\64;BHNSYaemt"+
		"{\u0081\u0088\u008f\u0096\u009f\u00a6\u00ab\u00b1\u00b7\u00be\u00c4\u00c7"+
		"\u00c9\u00d0\u00d6\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}