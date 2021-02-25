// Generated from io/onedev/server/search/entity/project/ProjectQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.entity.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjectQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OrderBy=1, Is=2, OwnedBy=3, OwnedByMe=4, OwnedByNone=5, IsSince=6, IsUntil=7, 
		Contains=8, ForksOf=9, And=10, Or=11, Not=12, Asc=13, Desc=14, LParens=15, 
		RParens=16, Quoted=17, WS=18, Identifier=19;
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
			null, null, "'is'", null, null, null, null, null, "'contains'", null, 
			"'and'", "'or'", "'not'", "'asc'", "'desc'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OrderBy", "Is", "OwnedBy", "OwnedByMe", "OwnedByNone", "IsSince", 
			"IsUntil", "Contains", "ForksOf", "And", "Or", "Not", "Asc", "Desc", 
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
	public String getGrammarFileName() { return "ProjectQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProjectQueryParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public TerminalNode OrderBy() { return getToken(ProjectQueryParser.OrderBy, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(ProjectQueryParser.And); }
		public TerminalNode And(int i) {
			return getToken(ProjectQueryParser.And, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitQuery(this);
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
		public TerminalNode OwnedByMe() { return getToken(ProjectQueryParser.OwnedByMe, 0); }
		public TerminalNode OwnedByNone() { return getToken(ProjectQueryParser.OwnedByNone, 0); }
		public OperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitOperatorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCriteriaContext extends CriteriaContext {
		public TerminalNode LParens() { return getToken(ProjectQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(ProjectQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public ParensCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterParensCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitParensCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitParensCriteria(this);
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
		public TerminalNode Or() { return getToken(ProjectQueryParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public OrCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterOrCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitOrCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitOrCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorValueCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public Token criteriaValue;
		public List<TerminalNode> Quoted() { return getTokens(ProjectQueryParser.Quoted); }
		public TerminalNode Quoted(int i) {
			return getToken(ProjectQueryParser.Quoted, i);
		}
		public TerminalNode Is() { return getToken(ProjectQueryParser.Is, 0); }
		public TerminalNode Contains() { return getToken(ProjectQueryParser.Contains, 0); }
		public TerminalNode IsUntil() { return getToken(ProjectQueryParser.IsUntil, 0); }
		public TerminalNode IsSince() { return getToken(ProjectQueryParser.IsSince, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public FieldOperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterFieldOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitFieldOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitFieldOperatorValueCriteria(this);
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
		public TerminalNode And() { return getToken(ProjectQueryParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public AndCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterAndCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitAndCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitAndCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorValueCriteriaContext extends CriteriaContext {
		public Token operator;
		public Token criteriaValue;
		public TerminalNode Quoted() { return getToken(ProjectQueryParser.Quoted, 0); }
		public TerminalNode OwnedBy() { return getToken(ProjectQueryParser.OwnedBy, 0); }
		public TerminalNode ForksOf() { return getToken(ProjectQueryParser.ForksOf, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public OperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCriteriaContext extends CriteriaContext {
		public TerminalNode Not() { return getToken(ProjectQueryParser.Not, 0); }
		public TerminalNode LParens() { return getToken(ProjectQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(ProjectQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public NotCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterNotCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitNotCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitNotCriteria(this);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OwnedByMe:
			case OwnedByNone:
				{
				_localctx = new OperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102);
				((OperatorCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OwnedByMe || _la==OwnedByNone) ) {
					((OperatorCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case OwnedBy:
			case ForksOf:
				{
				_localctx = new OperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				((OperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OwnedBy || _la==ForksOf) ) {
					((OperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				((OperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case Quoted:
				{
				_localctx = new FieldOperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaField = match(Quoted);
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
				((FieldOperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Is) | (1L << IsSince) | (1L << IsUntil) | (1L << Contains))) != 0)) ) {
					((FieldOperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					match(WS);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(122);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case Not:
				{
				_localctx = new NotCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(Not);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(124);
					match(WS);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(LParens);
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
				criteria(0);
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
				match(RParens);
				}
				break;
			case LParens:
				{
				_localctx = new ParensCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(LParens);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(147);
					match(WS);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				criteria(0);
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
				match(RParens);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new AndCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(165);
							match(WS);
							}
							}
							setState(168); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(170);
						match(And);
						setState(172); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(171);
							match(WS);
							}
							}
							setState(174); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(176);
						criteria(5);
						}
						break;
					case 2:
						{
						_localctx = new OrCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						match(Or);
						setState(185); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(184);
							match(WS);
							}
							}
							setState(187); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(189);
						criteria(4);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode Quoted() { return getToken(ProjectQueryParser.Quoted, 0); }
		public List<TerminalNode> WS() { return getTokens(ProjectQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjectQueryParser.WS, i);
		}
		public TerminalNode Asc() { return getToken(ProjectQueryParser.Asc, 0); }
		public TerminalNode Desc() { return getToken(ProjectQueryParser.Desc, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectQueryListener ) ((ProjectQueryListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectQueryVisitor ) return ((ProjectQueryVisitor<? extends T>)visitor).visitOrder(this);
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
			setState(195);
			((OrderContext)_localctx).orderField = match(Quoted);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(WS);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(WS);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(207);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\7\2\21\n\2\f\2"+
		"\16\2\24\13\2\3\2\3\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\6\2\37\n\2\r"+
		"\2\16\2 \3\2\3\2\6\2%\n\2\r\2\16\2&\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7"+
		"\2\60\n\2\f\2\16\2\63\13\2\5\2\65\n\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13"+
		"\2\3\2\3\2\6\2A\n\2\r\2\16\2B\3\2\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\6\2M"+
		"\n\2\r\2\16\2N\3\2\7\2R\n\2\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2"+
		"\3\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\5\2f\n\2\3\3\3\3\3\3\3\3\6\3"+
		"l\n\3\r\3\16\3m\3\3\3\3\3\3\6\3s\n\3\r\3\16\3t\3\3\3\3\6\3y\n\3\r\3\16"+
		"\3z\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3\3\3\7\3\u0087\n"+
		"\3\f\3\16\3\u008a\13\3\3\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3\3\3\3"+
		"\3\3\3\3\3\7\3\u0097\n\3\f\3\16\3\u009a\13\3\3\3\3\3\7\3\u009e\n\3\f\3"+
		"\16\3\u00a1\13\3\3\3\3\3\5\3\u00a5\n\3\3\3\3\3\6\3\u00a9\n\3\r\3\16\3"+
		"\u00aa\3\3\3\3\6\3\u00af\n\3\r\3\16\3\u00b0\3\3\3\3\3\3\6\3\u00b6\n\3"+
		"\r\3\16\3\u00b7\3\3\3\3\6\3\u00bc\n\3\r\3\16\3\u00bd\3\3\7\3\u00c1\n\3"+
		"\f\3\16\3\u00c4\13\3\3\4\3\4\7\4\u00c8\n\4\f\4\16\4\u00cb\13\4\3\4\6\4"+
		"\u00ce\n\4\r\4\16\4\u00cf\3\4\5\4\u00d3\n\4\3\4\2\3\4\5\2\4\6\2\6\3\2"+
		"\6\7\4\2\5\5\13\13\4\2\4\4\b\n\3\2\17\20\2\u00f7\2e\3\2\2\2\4\u00a4\3"+
		"\2\2\2\6\u00c5\3\2\2\2\b\n\7\24\2\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2"+
		"\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2\2\2\16\22\5\4\3\2\17\21\7\24\2\2"+
		"\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\64\3\2\2\2"+
		"\24\22\3\2\2\2\25\26\7\24\2\2\26\30\7\3\2\2\27\31\7\24\2\2\30\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34+\5\6\4\2"+
		"\35\37\7\24\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2"+
		"\2\2\"$\7\f\2\2#%\7\24\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'"+
		"(\3\2\2\2(*\5\6\4\2)\36\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2"+
		"\2\2-+\3\2\2\2.\60\7\24\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64\25\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\7\2\2\3\67f\3\2\2\28:\7\24\2\298\3\2\2\2:=\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\7\3\2\2?A\7\24\2\2@?\3\2\2\2AB"+
		"\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DS\5\6\4\2EG\7\24\2\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\7\f\2\2KM\7\24\2\2LK\3\2\2"+
		"\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\5\6\4\2QF\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\7\24\2\2WV\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\2\2\3]f\3\2\2\2^`\7"+
		"\24\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2df"+
		"\7\2\2\3e\13\3\2\2\2e;\3\2\2\2ea\3\2\2\2f\3\3\2\2\2gh\b\3\1\2h\u00a5\t"+
		"\2\2\2ik\t\3\2\2jl\7\24\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no"+
		"\3\2\2\2o\u00a5\7\23\2\2pr\7\23\2\2qs\7\24\2\2rq\3\2\2\2st\3\2\2\2tr\3"+
		"\2\2\2tu\3\2\2\2uv\3\2\2\2vx\t\4\2\2wy\7\24\2\2xw\3\2\2\2yz\3\2\2\2zx"+
		"\3\2\2\2z{\3\2\2\2{|\3\2\2\2|\u00a5\7\23\2\2}\u0081\7\16\2\2~\u0080\7"+
		"\24\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\7\21\2\2"+
		"\u0085\u0087\7\24\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008f\5\4\3\2\u008c\u008e\7\24\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\22\2\2\u0093\u00a5\3\2\2\2\u0094\u0098\7"+
		"\21\2\2\u0095\u0097\7\24\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009f\5\4\3\2\u009c\u009e\7\24\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"g\3\2\2\2\u00a4i\3\2\2\2\u00a4p\3\2\2\2\u00a4}\3\2\2\2\u00a4\u0094\3\2"+
		"\2\2\u00a5\u00c2\3\2\2\2\u00a6\u00a8\f\6\2\2\u00a7\u00a9\7\24\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7\f\2\2\u00ad\u00af\7\24\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c1\5\4\3\7\u00b3\u00b5\f\5\2\2\u00b4"+
		"\u00b6\7\24\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\r\2\2\u00ba"+
		"\u00bc\7\24\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\5\4\3\6\u00c0"+
		"\u00a6\3\2\2\2\u00c0\u00b3\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9"+
		"\7\23\2\2\u00c6\u00c8\7\24\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d2\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00ce\7\24\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\t\5\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\7\3\2\2\2$\13\22"+
		"\32 &+\61\64;BHNSYaemtz\u0081\u0088\u008f\u0098\u009f\u00a4\u00aa\u00b0"+
		"\u00b7\u00bd\u00c0\u00c2\u00c9\u00cf\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}