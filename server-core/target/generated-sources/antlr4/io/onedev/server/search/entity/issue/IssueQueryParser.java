// Generated from io/onedev/server/search/entity/issue/IssueQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.issue;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IssueQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OrderBy=1, SubmittedBy=2, FixedInCommit=3, FixedInCurrentCommit=4, FixedInBuild=5, 
		FixedInCurrentBuild=6, FixedInPullRequest=7, FixedInCurrentPullRequest=8, 
		IsCurrent=9, IsPrevious=10, FixedBetween=11, SubmittedByMe=12, Is=13, 
		IsMe=14, Contains=15, IsGreaterThan=16, IsLessThan=17, IsSince=18, IsUntil=19, 
		IsEmpty=20, Build=21, Branch=22, Tag=23, Commit=24, And=25, Or=26, Not=27, 
		Asc=28, Desc=29, LParens=30, RParens=31, Quoted=32, WS=33, Identifier=34;
	public static final int
		RULE_query = 0, RULE_criteria = 1, RULE_revisionCriteria = 2, RULE_order = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "criteria", "revisionCriteria", "order"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'is'", null, "'contains'", null, null, null, null, null, "'build'", 
			"'branch'", "'tag'", "'commit'", "'and'", "'or'", "'not'", "'asc'", "'desc'", 
			"'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OrderBy", "SubmittedBy", "FixedInCommit", "FixedInCurrentCommit", 
			"FixedInBuild", "FixedInCurrentBuild", "FixedInPullRequest", "FixedInCurrentPullRequest", 
			"IsCurrent", "IsPrevious", "FixedBetween", "SubmittedByMe", "Is", "IsMe", 
			"Contains", "IsGreaterThan", "IsLessThan", "IsSince", "IsUntil", "IsEmpty", 
			"Build", "Branch", "Tag", "Commit", "And", "Or", "Not", "Asc", "Desc", 
			"LParens", "RParens", "Quoted", "WS", "Identifier"
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
	public String getGrammarFileName() { return "IssueQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IssueQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IssueQueryParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public TerminalNode OrderBy() { return getToken(IssueQueryParser.OrderBy, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(IssueQueryParser.And); }
		public TerminalNode And(int i) {
			return getToken(IssueQueryParser.And, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			int _alt;
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
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
				criteria(0);
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(15);
						match(WS);
						}
						} 
					}
					setState(20);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(21);
					match(WS);
					setState(22);
					match(OrderBy);
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
					order();
					setState(43);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(30); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(29);
								match(WS);
								}
								}
								setState(32); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS );
							setState(34);
							match(And);
							setState(36); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(35);
								match(WS);
								}
								}
								setState(38); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS );
							setState(40);
							order();
							}
							} 
						}
						setState(45);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(46);
						match(WS);
						}
						}
						setState(51);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(54);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(56);
					match(WS);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(OrderBy);
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					match(WS);
					}
					}
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(68);
				order();
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(69);
							match(WS);
							}
							}
							setState(72); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(74);
						match(And);
						setState(76); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(75);
							match(WS);
							}
							}
							setState(78); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(80);
						order();
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(86);
					match(WS);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(94);
					match(WS);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
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
		public TerminalNode SubmittedByMe() { return getToken(IssueQueryParser.SubmittedByMe, 0); }
		public TerminalNode FixedInCurrentCommit() { return getToken(IssueQueryParser.FixedInCurrentCommit, 0); }
		public TerminalNode FixedInCurrentBuild() { return getToken(IssueQueryParser.FixedInCurrentBuild, 0); }
		public TerminalNode FixedInCurrentPullRequest() { return getToken(IssueQueryParser.FixedInCurrentPullRequest, 0); }
		public OperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitOperatorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCriteriaContext extends CriteriaContext {
		public TerminalNode LParens() { return getToken(IssueQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(IssueQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public ParensCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterParensCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitParensCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitParensCriteria(this);
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
		public TerminalNode Or() { return getToken(IssueQueryParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public OrCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterOrCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitOrCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitOrCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorValueCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public Token criteriaValue;
		public List<TerminalNode> Quoted() { return getTokens(IssueQueryParser.Quoted); }
		public TerminalNode Quoted(int i) {
			return getToken(IssueQueryParser.Quoted, i);
		}
		public TerminalNode Is() { return getToken(IssueQueryParser.Is, 0); }
		public TerminalNode IsGreaterThan() { return getToken(IssueQueryParser.IsGreaterThan, 0); }
		public TerminalNode IsLessThan() { return getToken(IssueQueryParser.IsLessThan, 0); }
		public TerminalNode IsUntil() { return getToken(IssueQueryParser.IsUntil, 0); }
		public TerminalNode IsSince() { return getToken(IssueQueryParser.IsSince, 0); }
		public TerminalNode Contains() { return getToken(IssueQueryParser.Contains, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public FieldOperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterFieldOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitFieldOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitFieldOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public TerminalNode Quoted() { return getToken(IssueQueryParser.Quoted, 0); }
		public TerminalNode IsMe() { return getToken(IssueQueryParser.IsMe, 0); }
		public TerminalNode IsEmpty() { return getToken(IssueQueryParser.IsEmpty, 0); }
		public TerminalNode IsCurrent() { return getToken(IssueQueryParser.IsCurrent, 0); }
		public TerminalNode IsPrevious() { return getToken(IssueQueryParser.IsPrevious, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public FieldOperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterFieldOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitFieldOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitFieldOperatorCriteria(this);
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
		public TerminalNode And() { return getToken(IssueQueryParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public AndCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterAndCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitAndCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitAndCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FixedBetweenCriteriaContext extends CriteriaContext {
		public TerminalNode FixedBetween() { return getToken(IssueQueryParser.FixedBetween, 0); }
		public List<RevisionCriteriaContext> revisionCriteria() {
			return getRuleContexts(RevisionCriteriaContext.class);
		}
		public RevisionCriteriaContext revisionCriteria(int i) {
			return getRuleContext(RevisionCriteriaContext.class,i);
		}
		public TerminalNode And() { return getToken(IssueQueryParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public FixedBetweenCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterFixedBetweenCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitFixedBetweenCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitFixedBetweenCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorValueCriteriaContext extends CriteriaContext {
		public Token operator;
		public Token criteriaValue;
		public TerminalNode Quoted() { return getToken(IssueQueryParser.Quoted, 0); }
		public TerminalNode SubmittedBy() { return getToken(IssueQueryParser.SubmittedBy, 0); }
		public TerminalNode FixedInCommit() { return getToken(IssueQueryParser.FixedInCommit, 0); }
		public TerminalNode FixedInBuild() { return getToken(IssueQueryParser.FixedInBuild, 0); }
		public TerminalNode FixedInPullRequest() { return getToken(IssueQueryParser.FixedInPullRequest, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public OperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCriteriaContext extends CriteriaContext {
		public TerminalNode Not() { return getToken(IssueQueryParser.Not, 0); }
		public TerminalNode LParens() { return getToken(IssueQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(IssueQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public NotCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterNotCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitNotCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitNotCriteria(this);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new OperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(104);
				((OperatorCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FixedInCurrentCommit) | (1L << FixedInCurrentBuild) | (1L << FixedInCurrentPullRequest) | (1L << SubmittedByMe))) != 0)) ) {
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
				_localctx = new OperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((OperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SubmittedBy) | (1L << FixedInCommit) | (1L << FixedInBuild) | (1L << FixedInPullRequest))) != 0)) ) {
					((OperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				((OperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 3:
				{
				_localctx = new FixedBetweenCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(FixedBetween);
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					match(WS);
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(118);
				revisionCriteria();
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					match(WS);
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(124);
				match(And);
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					match(WS);
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(130);
				revisionCriteria();
				}
				break;
			case 4:
				{
				_localctx = new FieldOperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((FieldOperatorCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					match(WS);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(138);
				((FieldOperatorCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IsCurrent) | (1L << IsPrevious) | (1L << IsMe) | (1L << IsEmpty))) != 0)) ) {
					((FieldOperatorCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new FieldOperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					match(WS);
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(145);
				((FieldOperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Is) | (1L << Contains) | (1L << IsGreaterThan) | (1L << IsLessThan) | (1L << IsSince) | (1L << IsUntil))) != 0)) ) {
					((FieldOperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					match(WS);
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(151);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 6:
				{
				_localctx = new NotCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(Not);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(153);
					match(WS);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(LParens);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(160);
					match(WS);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				criteria(0);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(167);
					match(WS);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(RParens);
				}
				break;
			case 7:
				{
				_localctx = new ParensCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(LParens);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(176);
					match(WS);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				criteria(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(183);
					match(WS);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(RParens);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new AndCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(194);
							match(WS);
							}
							}
							setState(197); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(199);
						match(And);
						setState(201); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(200);
							match(WS);
							}
							}
							setState(203); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(205);
						criteria(5);
						}
						break;
					case 2:
						{
						_localctx = new OrCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(207);
							match(WS);
							}
							}
							setState(210); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(212);
						match(Or);
						setState(214); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(213);
							match(WS);
							}
							}
							setState(216); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(218);
						criteria(4);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class RevisionCriteriaContext extends ParserRuleContext {
		public Token revisionType;
		public Token revisionValue;
		public TerminalNode Quoted() { return getToken(IssueQueryParser.Quoted, 0); }
		public TerminalNode Build() { return getToken(IssueQueryParser.Build, 0); }
		public TerminalNode Branch() { return getToken(IssueQueryParser.Branch, 0); }
		public TerminalNode Tag() { return getToken(IssueQueryParser.Tag, 0); }
		public TerminalNode Commit() { return getToken(IssueQueryParser.Commit, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public RevisionCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revisionCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterRevisionCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitRevisionCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitRevisionCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevisionCriteriaContext revisionCriteria() throws RecognitionException {
		RevisionCriteriaContext _localctx = new RevisionCriteriaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_revisionCriteria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((RevisionCriteriaContext)_localctx).revisionType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Build) | (1L << Branch) | (1L << Tag) | (1L << Commit))) != 0)) ) {
				((RevisionCriteriaContext)_localctx).revisionType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(WS);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(230);
			((RevisionCriteriaContext)_localctx).revisionValue = match(Quoted);
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

	public static class OrderContext extends ParserRuleContext {
		public Token orderField;
		public Token direction;
		public TerminalNode Quoted() { return getToken(IssueQueryParser.Quoted, 0); }
		public List<TerminalNode> WS() { return getTokens(IssueQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(IssueQueryParser.WS, i);
		}
		public TerminalNode Asc() { return getToken(IssueQueryParser.Asc, 0); }
		public TerminalNode Desc() { return getToken(IssueQueryParser.Desc, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IssueQueryListener ) ((IssueQueryListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IssueQueryVisitor ) return ((IssueQueryVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_order);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((OrderContext)_localctx).orderField = match(Quoted);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(WS);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(239);
					match(WS);
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(244);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\7\2\23\n"+
		"\2\f\2\16\2\26\13\2\3\2\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\6\2!\n"+
		"\2\r\2\16\2\"\3\2\3\2\6\2\'\n\2\r\2\16\2(\3\2\7\2,\n\2\f\2\16\2/\13\2"+
		"\3\2\7\2\62\n\2\f\2\16\2\65\13\2\5\2\67\n\2\3\2\3\2\3\2\7\2<\n\2\f\2\16"+
		"\2?\13\2\3\2\3\2\6\2C\n\2\r\2\16\2D\3\2\3\2\6\2I\n\2\r\2\16\2J\3\2\3\2"+
		"\6\2O\n\2\r\2\16\2P\3\2\7\2T\n\2\f\2\16\2W\13\2\3\2\7\2Z\n\2\f\2\16\2"+
		"]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\5\2h\n\2\3\3\3\3\3\3\3"+
		"\3\6\3n\n\3\r\3\16\3o\3\3\3\3\3\3\6\3u\n\3\r\3\16\3v\3\3\3\3\6\3{\n\3"+
		"\r\3\16\3|\3\3\3\3\6\3\u0081\n\3\r\3\16\3\u0082\3\3\3\3\3\3\3\3\6\3\u0089"+
		"\n\3\r\3\16\3\u008a\3\3\3\3\3\3\6\3\u0090\n\3\r\3\16\3\u0091\3\3\3\3\6"+
		"\3\u0096\n\3\r\3\16\3\u0097\3\3\3\3\3\3\7\3\u009d\n\3\f\3\16\3\u00a0\13"+
		"\3\3\3\3\3\7\3\u00a4\n\3\f\3\16\3\u00a7\13\3\3\3\3\3\7\3\u00ab\n\3\f\3"+
		"\16\3\u00ae\13\3\3\3\3\3\3\3\3\3\7\3\u00b4\n\3\f\3\16\3\u00b7\13\3\3\3"+
		"\3\3\7\3\u00bb\n\3\f\3\16\3\u00be\13\3\3\3\3\3\5\3\u00c2\n\3\3\3\3\3\6"+
		"\3\u00c6\n\3\r\3\16\3\u00c7\3\3\3\3\6\3\u00cc\n\3\r\3\16\3\u00cd\3\3\3"+
		"\3\3\3\6\3\u00d3\n\3\r\3\16\3\u00d4\3\3\3\3\6\3\u00d9\n\3\r\3\16\3\u00da"+
		"\3\3\7\3\u00de\n\3\f\3\16\3\u00e1\13\3\3\4\3\4\6\4\u00e5\n\4\r\4\16\4"+
		"\u00e6\3\4\3\4\3\5\3\5\7\5\u00ed\n\5\f\5\16\5\u00f0\13\5\3\5\6\5\u00f3"+
		"\n\5\r\5\16\5\u00f4\3\5\5\5\u00f8\n\5\3\5\2\3\4\6\2\4\6\b\2\b\6\2\6\6"+
		"\b\b\n\n\16\16\5\2\4\5\7\7\t\t\5\2\13\f\20\20\26\26\4\2\17\17\21\25\3"+
		"\2\27\32\3\2\36\37\2\u0122\2g\3\2\2\2\4\u00c1\3\2\2\2\6\u00e2\3\2\2\2"+
		"\b\u00ea\3\2\2\2\n\f\7#\2\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16"+
		"\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\24\5\4\3\2\21\23\7#\2\2\22\21\3"+
		"\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\66\3\2\2\2\26\24\3"+
		"\2\2\2\27\30\7#\2\2\30\32\7\3\2\2\31\33\7#\2\2\32\31\3\2\2\2\33\34\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36-\5\b\5\2\37!\7#\2\2"+
		" \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$&\7\33\2\2%\'"+
		"\7#\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*,\5\b\5\2+"+
		" \3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2\60\62\7"+
		"#\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3"+
		"\2\2\2\65\63\3\2\2\2\66\27\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\2\2\3"+
		"9h\3\2\2\2:<\7#\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@B\7\3\2\2AC\7#\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"EF\3\2\2\2FU\5\b\5\2GI\7#\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"KL\3\2\2\2LN\7\33\2\2MO\7#\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QR\3\2\2\2RT\5\b\5\2SH\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2\2"+
		"WU\3\2\2\2XZ\7#\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^_\7\2\2\3_h\3\2\2\2`b\7#\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fh\7\2\2\3g\r\3\2\2\2g=\3\2\2\2gc\3\2"+
		"\2\2h\3\3\2\2\2ij\b\3\1\2j\u00c2\t\2\2\2km\t\3\2\2ln\7#\2\2ml\3\2\2\2"+
		"no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2q\u00c2\7\"\2\2rt\7\r\2\2su\7"+
		"#\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\5\6\4\2y{\7"+
		"#\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\33\2"+
		"\2\177\u0081\7#\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\6\4\2\u0085"+
		"\u00c2\3\2\2\2\u0086\u0088\7\"\2\2\u0087\u0089\7#\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u00c2\t\4\2\2\u008d\u008f\7\"\2\2\u008e\u0090\7#"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\t\5\2\2\u0094\u0096\7#"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00c2\7\"\2\2\u009a\u009e\7\35"+
		"\2\2\u009b\u009d\7#\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a5\7 \2\2\u00a2\u00a4\7#\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00ac\5\4\3\2\u00a9\u00ab\7#\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7!\2\2\u00b0\u00c2\3\2"+
		"\2\2\u00b1\u00b5\7 \2\2\u00b2\u00b4\7#\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bc\5\4\3\2\u00b9\u00bb\7#\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7!\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1i\3\2\2\2\u00c1k\3\2\2\2\u00c1r\3\2\2\2\u00c1\u0086\3\2\2\2"+
		"\u00c1\u008d\3\2\2\2\u00c1\u009a\3\2\2\2\u00c1\u00b1\3\2\2\2\u00c2\u00df"+
		"\3\2\2\2\u00c3\u00c5\f\6\2\2\u00c4\u00c6\7#\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\7\33\2\2\u00ca\u00cc\7#\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00de\5\4\3\7\u00d0\u00d2\f\5\2\2\u00d1\u00d3\7#\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\34\2\2\u00d7\u00d9\7#\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5\4\3\6\u00dd\u00c3\3\2\2\2\u00dd"+
		"\u00d0\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\5\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\t\6\2\2\u00e3\u00e5"+
		"\7#\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\"\2\2\u00e9\7\3\2\2\2"+
		"\u00ea\u00ee\7\"\2\2\u00eb\u00ed\7#\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f7\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f3\7#\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\t\7\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\t\3\2\2\2"+
		")\r\24\34\"(-\63\66=DJPU[cgov|\u0082\u008a\u0091\u0097\u009e\u00a5\u00ac"+
		"\u00b5\u00bc\u00c1\u00c7\u00cd\u00d4\u00da\u00dd\u00df\u00e6\u00ee\u00f4"+
		"\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}