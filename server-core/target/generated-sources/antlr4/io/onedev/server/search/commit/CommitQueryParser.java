// Generated from io/onedev/server/search/commit/CommitQuery.g4 by ANTLR 4.7.2
package io.onedev.server.search.commit;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommitQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINCE=1, UNTIL=2, BRANCH=3, TAG=4, COMMIT=5, BUILD=6, BEFORE=7, AFTER=8, 
		COMMITTER=9, AUTHOR=10, PATH=11, MESSAGE=12, AuthoredByMe=13, CommittedByMe=14, 
		DefaultBranch=15, WS=16, Value=17;
	public static final int
		RULE_query = 0, RULE_criteria = 1, RULE_revisionCriteria = 2, RULE_beforeCriteria = 3, 
		RULE_afterCriteria = 4, RULE_committerCriteria = 5, RULE_authorCriteria = 6, 
		RULE_pathCriteria = 7, RULE_messageCriteria = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "criteria", "revisionCriteria", "beforeCriteria", "afterCriteria", 
			"committerCriteria", "authorCriteria", "pathCriteria", "messageCriteria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'since'", "'until'", "'branch'", "'tag'", "'commit'", "'build'", 
			"'before'", "'after'", "'committer'", "'author'", "'path'", "'message'", 
			"'authored-by-me'", "'committed-by-me'", "'default-branch'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINCE", "UNTIL", "BRANCH", "TAG", "COMMIT", "BUILD", "BEFORE", 
			"AFTER", "COMMITTER", "AUTHOR", "PATH", "MESSAGE", "AuthoredByMe", "CommittedByMe", 
			"DefaultBranch", "WS", "Value"
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
	public String getGrammarFileName() { return "CommitQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommitQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CommitQueryParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(CommitQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CommitQueryParser.WS, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(18);
				match(WS);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			criteria();
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					criteria();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(36);
				match(WS);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
		public RevisionCriteriaContext revisionCriteria() {
			return getRuleContext(RevisionCriteriaContext.class,0);
		}
		public BeforeCriteriaContext beforeCriteria() {
			return getRuleContext(BeforeCriteriaContext.class,0);
		}
		public AfterCriteriaContext afterCriteria() {
			return getRuleContext(AfterCriteriaContext.class,0);
		}
		public CommitterCriteriaContext committerCriteria() {
			return getRuleContext(CommitterCriteriaContext.class,0);
		}
		public AuthorCriteriaContext authorCriteria() {
			return getRuleContext(AuthorCriteriaContext.class,0);
		}
		public PathCriteriaContext pathCriteria() {
			return getRuleContext(PathCriteriaContext.class,0);
		}
		public MessageCriteriaContext messageCriteria() {
			return getRuleContext(MessageCriteriaContext.class,0);
		}
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_criteria);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINCE:
			case UNTIL:
			case BRANCH:
			case TAG:
			case COMMIT:
			case BUILD:
			case DefaultBranch:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				revisionCriteria();
				}
				break;
			case BEFORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				beforeCriteria();
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				afterCriteria();
				}
				break;
			case COMMITTER:
			case CommittedByMe:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				committerCriteria();
				}
				break;
			case AUTHOR:
			case AuthoredByMe:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				authorCriteria();
				}
				break;
			case PATH:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				pathCriteria();
				}
				break;
			case MESSAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				messageCriteria();
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

	public static class RevisionCriteriaContext extends ParserRuleContext {
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public TerminalNode DefaultBranch() { return getToken(CommitQueryParser.DefaultBranch, 0); }
		public TerminalNode BRANCH() { return getToken(CommitQueryParser.BRANCH, 0); }
		public TerminalNode TAG() { return getToken(CommitQueryParser.TAG, 0); }
		public TerminalNode COMMIT() { return getToken(CommitQueryParser.COMMIT, 0); }
		public TerminalNode BUILD() { return getToken(CommitQueryParser.BUILD, 0); }
		public TerminalNode UNTIL() { return getToken(CommitQueryParser.UNTIL, 0); }
		public TerminalNode SINCE() { return getToken(CommitQueryParser.SINCE, 0); }
		public List<TerminalNode> WS() { return getTokens(CommitQueryParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CommitQueryParser.WS, i);
		}
		public RevisionCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revisionCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterRevisionCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitRevisionCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitRevisionCriteria(this);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINCE || _la==UNTIL) {
				{
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==SINCE || _la==UNTIL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					match(WS);
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				}
			}

			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRANCH:
			case TAG:
			case COMMIT:
			case BUILD:
				{
				setState(61);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRANCH) | (1L << TAG) | (1L << COMMIT) | (1L << BUILD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
				match(Value);
				}
				break;
			case DefaultBranch:
				{
				setState(63);
				match(DefaultBranch);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BeforeCriteriaContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(CommitQueryParser.BEFORE, 0); }
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public BeforeCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beforeCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterBeforeCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitBeforeCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitBeforeCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeforeCriteriaContext beforeCriteria() throws RecognitionException {
		BeforeCriteriaContext _localctx = new BeforeCriteriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_beforeCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(BEFORE);
			setState(67);
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

	public static class AfterCriteriaContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(CommitQueryParser.AFTER, 0); }
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public AfterCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterAfterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitAfterCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitAfterCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfterCriteriaContext afterCriteria() throws RecognitionException {
		AfterCriteriaContext _localctx = new AfterCriteriaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_afterCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(AFTER);
			setState(70);
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

	public static class CommitterCriteriaContext extends ParserRuleContext {
		public TerminalNode COMMITTER() { return getToken(CommitQueryParser.COMMITTER, 0); }
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public TerminalNode CommittedByMe() { return getToken(CommitQueryParser.CommittedByMe, 0); }
		public CommitterCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_committerCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterCommitterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitCommitterCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitCommitterCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitterCriteriaContext committerCriteria() throws RecognitionException {
		CommitterCriteriaContext _localctx = new CommitterCriteriaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_committerCriteria);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMITTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(COMMITTER);
				setState(73);
				match(Value);
				}
				break;
			case CommittedByMe:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(CommittedByMe);
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

	public static class AuthorCriteriaContext extends ParserRuleContext {
		public TerminalNode AUTHOR() { return getToken(CommitQueryParser.AUTHOR, 0); }
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public TerminalNode AuthoredByMe() { return getToken(CommitQueryParser.AuthoredByMe, 0); }
		public AuthorCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterAuthorCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitAuthorCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitAuthorCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorCriteriaContext authorCriteria() throws RecognitionException {
		AuthorCriteriaContext _localctx = new AuthorCriteriaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_authorCriteria);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTHOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(AUTHOR);
				setState(78);
				match(Value);
				}
				break;
			case AuthoredByMe:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(AuthoredByMe);
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

	public static class PathCriteriaContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(CommitQueryParser.PATH, 0); }
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public PathCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterPathCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitPathCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitPathCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathCriteriaContext pathCriteria() throws RecognitionException {
		PathCriteriaContext _localctx = new PathCriteriaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pathCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PATH);
			setState(83);
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

	public static class MessageCriteriaContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(CommitQueryParser.MESSAGE, 0); }
		public TerminalNode Value() { return getToken(CommitQueryParser.Value, 0); }
		public MessageCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).enterMessageCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommitQueryListener ) ((CommitQueryListener)listener).exitMessageCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommitQueryVisitor ) return ((CommitQueryVisitor<? extends T>)visitor).visitMessageCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageCriteriaContext messageCriteria() throws RecognitionException {
		MessageCriteriaContext _localctx = new MessageCriteriaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_messageCriteria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(MESSAGE);
			setState(86);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\4\3\4\6\4:\n\4\r\4\16\4;\5\4>\n\4\3\4\3\4\3\4\5\4"+
		"C\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\5\bS\n"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\3\4"+
		"\3\2\5\b\2`\2\27\3\2\2\2\4\65\3\2\2\2\6=\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2"+
		"\fM\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22W\3\2\2\2\24\26\7\22\2\2\25\24\3"+
		"\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3"+
		"\2\2\2\32#\5\4\3\2\33\35\7\22\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3"+
		"\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 \"\5\4\3\2!\34\3\2\2\2\"%\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\7\22\2\2\'&\3\2\2\2(+\3\2\2\2)"+
		"\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2.\66\5\6"+
		"\4\2/\66\5\b\5\2\60\66\5\n\6\2\61\66\5\f\7\2\62\66\5\16\b\2\63\66\5\20"+
		"\t\2\64\66\5\22\n\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2"+
		"\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\679\t\2\2\2"+
		"8:\7\22\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=\67\3\2"+
		"\2\2=>\3\2\2\2>B\3\2\2\2?@\t\3\2\2@C\7\23\2\2AC\7\21\2\2B?\3\2\2\2BA\3"+
		"\2\2\2C\7\3\2\2\2DE\7\t\2\2EF\7\23\2\2F\t\3\2\2\2GH\7\n\2\2HI\7\23\2\2"+
		"I\13\3\2\2\2JK\7\13\2\2KN\7\23\2\2LN\7\20\2\2MJ\3\2\2\2ML\3\2\2\2N\r\3"+
		"\2\2\2OP\7\f\2\2PS\7\23\2\2QS\7\17\2\2RO\3\2\2\2RQ\3\2\2\2S\17\3\2\2\2"+
		"TU\7\r\2\2UV\7\23\2\2V\21\3\2\2\2WX\7\16\2\2XY\7\23\2\2Y\23\3\2\2\2\f"+
		"\27\36#)\65;=BMR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}