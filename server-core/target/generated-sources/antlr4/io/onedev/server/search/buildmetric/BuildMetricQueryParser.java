// Generated from io/onedev/server/search/buildmetric/BuildMetricQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.buildmetric;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BuildMetricQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BuildIsSuccessful=1, BuildIsFailed=2, Is=3, IsEmpty=4, Since=5, Until=6, 
		And=7, Or=8, Not=9, LParens=10, RParens=11, Quoted=12, WS=13, Identifier=14;
	public static final int
		RULE_query = 0, RULE_criteria = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "criteria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'is'", null, "'since'", "'until'", "'and'", "'or'", 
			"'not'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BuildIsSuccessful", "BuildIsFailed", "Is", "IsEmpty", "Since", 
			"Until", "And", "Or", "Not", "LParens", "RParens", "Quoted", "WS", "Identifier"
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
	public String getGrammarFileName() { return "BuildMetricQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BuildMetricQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BuildMetricQueryParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
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
			setState(10);
			criteria(0);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(11);
				match(WS);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
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
		public TerminalNode BuildIsSuccessful() { return getToken(BuildMetricQueryParser.BuildIsSuccessful, 0); }
		public TerminalNode BuildIsFailed() { return getToken(BuildMetricQueryParser.BuildIsFailed, 0); }
		public OperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitOperatorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCriteriaContext extends CriteriaContext {
		public TerminalNode LParens() { return getToken(BuildMetricQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(BuildMetricQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public ParensCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterParensCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitParensCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitParensCriteria(this);
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
		public TerminalNode Or() { return getToken(BuildMetricQueryParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public OrCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterOrCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitOrCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitOrCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorValueCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public Token criteriaValue;
		public List<TerminalNode> Quoted() { return getTokens(BuildMetricQueryParser.Quoted); }
		public TerminalNode Quoted(int i) {
			return getToken(BuildMetricQueryParser.Quoted, i);
		}
		public TerminalNode Is() { return getToken(BuildMetricQueryParser.Is, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public FieldOperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterFieldOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitFieldOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitFieldOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOperatorCriteriaContext extends CriteriaContext {
		public Token criteriaField;
		public Token operator;
		public TerminalNode Quoted() { return getToken(BuildMetricQueryParser.Quoted, 0); }
		public TerminalNode IsEmpty() { return getToken(BuildMetricQueryParser.IsEmpty, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public FieldOperatorCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterFieldOperatorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitFieldOperatorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitFieldOperatorCriteria(this);
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
		public TerminalNode And() { return getToken(BuildMetricQueryParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public AndCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterAndCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitAndCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitAndCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorValueCriteriaContext extends CriteriaContext {
		public Token operator;
		public Token criteriaValue;
		public TerminalNode Quoted() { return getToken(BuildMetricQueryParser.Quoted, 0); }
		public TerminalNode Since() { return getToken(BuildMetricQueryParser.Since, 0); }
		public TerminalNode Until() { return getToken(BuildMetricQueryParser.Until, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public OperatorValueCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterOperatorValueCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitOperatorValueCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitOperatorValueCriteria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCriteriaContext extends CriteriaContext {
		public TerminalNode Not() { return getToken(BuildMetricQueryParser.Not, 0); }
		public TerminalNode LParens() { return getToken(BuildMetricQueryParser.LParens, 0); }
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
		public TerminalNode RParens() { return getToken(BuildMetricQueryParser.RParens, 0); }
		public List<TerminalNode> WS() { return getTokens(BuildMetricQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(BuildMetricQueryParser.WS, i);
		}
		public NotCriteriaContext(CriteriaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).enterNotCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuildMetricQueryListener ) ((BuildMetricQueryListener)listener).exitNotCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BuildMetricQueryVisitor ) return ((BuildMetricQueryVisitor<? extends T>)visitor).visitNotCriteria(this);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new OperatorCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(20);
				((OperatorCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BuildIsSuccessful || _la==BuildIsFailed) ) {
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
				setState(21);
				((FieldOperatorCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					match(WS);
					}
					}
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(27);
				((FieldOperatorCriteriaContext)_localctx).operator = match(IsEmpty);
				}
				break;
			case 3:
				{
				_localctx = new OperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				((OperatorValueCriteriaContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Since || _la==Until) ) {
					((OperatorValueCriteriaContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				((OperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 4:
				{
				_localctx = new FieldOperatorValueCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaField = match(Quoted);
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(36);
					match(WS);
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(41);
				((FieldOperatorValueCriteriaContext)_localctx).operator = match(Is);
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					match(WS);
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(47);
				((FieldOperatorValueCriteriaContext)_localctx).criteriaValue = match(Quoted);
				}
				break;
			case 5:
				{
				_localctx = new NotCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(Not);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(49);
					match(WS);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(LParens);
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
				criteria(0);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(63);
					match(WS);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(RParens);
				}
				break;
			case 6:
				{
				_localctx = new ParensCriteriaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(LParens);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(72);
					match(WS);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				criteria(0);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(79);
					match(WS);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(RParens);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AndCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(89);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(90);
							match(WS);
							}
							}
							setState(93); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(95);
						match(And);
						setState(97); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(96);
							match(WS);
							}
							}
							setState(99); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(101);
						criteria(5);
						}
						break;
					case 2:
						{
						_localctx = new OrCriteriaContext(new CriteriaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_criteria);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(103);
							match(WS);
							}
							}
							setState(106); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(108);
						match(Or);
						setState(110); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(109);
							match(WS);
							}
							}
							setState(112); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS );
						setState(114);
						criteria(4);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20{\4\2\t\2\4\3\t"+
		"\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\3\3\6\3!\n\3\r"+
		"\3\16\3\"\3\3\3\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\6\3.\n\3\r\3\16\3/\3"+
		"\3\3\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3"+
		"\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3"+
		"\3\3\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\5\3Z\n\3\3\3\3\3\6\3^\n\3\r\3"+
		"\16\3_\3\3\3\3\6\3d\n\3\r\3\16\3e\3\3\3\3\3\3\6\3k\n\3\r\3\16\3l\3\3\3"+
		"\3\6\3q\n\3\r\3\16\3r\3\3\7\3v\n\3\f\3\16\3y\13\3\3\3\2\3\4\4\2\4\2\4"+
		"\3\2\3\4\3\2\7\b\2\u008e\2\t\3\2\2\2\4Y\3\2\2\2\6\b\7\17\2\2\7\6\3\2\2"+
		"\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2\13\t\3\2\2\2\f\20"+
		"\5\4\3\2\r\17\7\17\2\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21"+
		"\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26"+
		"\b\3\1\2\26Z\t\2\2\2\27\31\7\16\2\2\30\32\7\17\2\2\31\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35Z\7\6\2\2\36 \t\3"+
		"\2\2\37!\7\17\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2"+
		"\2$Z\7\16\2\2%\'\7\16\2\2&(\7\17\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)"+
		"*\3\2\2\2*+\3\2\2\2+-\7\5\2\2,.\7\17\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2"+
		"/\60\3\2\2\2\60\61\3\2\2\2\61Z\7\16\2\2\62\66\7\13\2\2\63\65\7\17\2\2"+
		"\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66"+
		"\3\2\2\29=\7\f\2\2:<\7\17\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">@\3\2\2\2?=\3\2\2\2@D\5\4\3\2AC\7\17\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\r\2\2HZ\3\2\2\2IM\7\f\2\2JL\7\17"+
		"\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PT\5\4"+
		"\3\2QS\7\17\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3"+
		"\2\2\2WX\7\r\2\2XZ\3\2\2\2Y\25\3\2\2\2Y\27\3\2\2\2Y\36\3\2\2\2Y%\3\2\2"+
		"\2Y\62\3\2\2\2YI\3\2\2\2Zw\3\2\2\2[]\f\6\2\2\\^\7\17\2\2]\\\3\2\2\2^_"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\t\2\2bd\7\17\2\2cb\3\2\2\2"+
		"de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gv\5\4\3\7hj\f\5\2\2ik\7\17\2"+
		"\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\n\2\2oq\7\17"+
		"\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\5\4\3\6u[\3\2"+
		"\2\2uh\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\5\3\2\2\2yw\3\2\2\2\24\t"+
		"\20\33\")/\66=DMTY_elruw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}