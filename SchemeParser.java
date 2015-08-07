// Generated from Scheme.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, RATOR=17, 
		ARITHMETIC_OP=18, RELATIONAL_OP=19, BOOLEAN_OP=20, BOOLEAN=21, DOUBLE=22, 
		ID=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_bind = 2;
	public static final String[] ruleNames = {
		"prog", "expr", "bind"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'def'", "'if'", "'print'", "'while'", "'begin'", 
		"'let'", "'fun'", "'defun'", "'call'", "'try'", "'catch'", "'raise'", 
		"'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "RATOR", "ARITHMETIC_OP", "RELATIONAL_OP", 
		"BOOLEAN_OP", "BOOLEAN", "DOUBLE", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "Scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				expr();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0) );
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SchemeParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDefExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SchemeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SchemeParser.ID, i);
		}
		public TryCatchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitTryCatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetExprContext extends ExprContext {
		public BindContext bind() {
			return getRuleContext(BindContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public TerminalNode RATOR() { return getToken(SchemeParser.RATOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefFuncExprContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(SchemeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SchemeParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefFuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDefFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(SchemeParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SchemeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SchemeParser.ID, i);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RaiseExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SchemeParser.ID, 0); }
		public RaiseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitRaiseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(SchemeParser.BOOLEAN, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SchemeParser.ID, 0); }
		public RefExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitRefExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(DOUBLE);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new OpExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(T__0);
				setState(14);
				match(RATOR);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0)) {
					{
					{
					setState(15);
					expr();
					}
					}
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(21);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new DefExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(T__0);
				setState(23);
				match(T__2);
				setState(24);
				match(ID);
				setState(25);
				expr();
				setState(26);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				match(T__0);
				setState(29);
				match(T__3);
				setState(30);
				expr();
				setState(31);
				expr();
				setState(32);
				expr();
				setState(33);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				match(T__0);
				setState(36);
				match(T__4);
				setState(37);
				expr();
				setState(38);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new WhileExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(T__5);
				setState(42);
				expr();
				setState(43);
				expr();
				setState(44);
				match(T__1);
				}
				break;
			case 8:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				match(T__0);
				setState(47);
				match(T__6);
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					expr();
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0) );
				setState(53);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new LetExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				match(T__0);
				setState(56);
				match(T__7);
				setState(57);
				bind();
				setState(58);
				expr();
				setState(59);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new FuncExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
				match(T__0);
				setState(62);
				match(T__8);
				setState(64); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63);
						match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(66); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(68);
				expr();
				setState(69);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new DefFuncExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				match(T__0);
				setState(72);
				match(T__9);
				setState(73);
				match(ID);
				setState(75); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(74);
						match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(77); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(79);
				expr();
				setState(80);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(82);
				match(T__0);
				setState(83);
				match(T__10);
				setState(84);
				expr();
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					expr();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << DOUBLE) | (1L << ID))) != 0) );
				setState(90);
				match(T__1);
				}
				break;
			case 13:
				_localctx = new TryCatchExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				match(T__0);
				setState(93);
				match(T__11);
				setState(94);
				expr();
				setState(95);
				match(T__12);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(ID);
					setState(97);
					expr();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(102);
				match(T__1);
				}
				break;
			case 14:
				_localctx = new RaiseExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(104);
				match(T__0);
				setState(105);
				match(T__13);
				setState(106);
				match(ID);
				setState(107);
				match(T__1);
				}
				break;
			case 15:
				_localctx = new RefExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(108);
				match(ID);
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

	public static class BindContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SchemeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SchemeParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SchemeVisitor ) return ((SchemeVisitor<? extends T>)visitor).visitBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__14);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				match(ID);
				setState(113);
				expr();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(118);
			match(T__15);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\7\3\23\n\3\f"+
		"\3\16\3\26\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\64\n\3"+
		"\r\3\16\3\65\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3C\n\3\r\3"+
		"\16\3D\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3N\n\3\r\3\16\3O\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\6\3Y\n\3\r\3\16\3Z\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3e\n"+
		"\3\r\3\16\3f\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\6\4u\n\4"+
		"\r\4\16\4v\3\4\3\4\3\4\2\2\5\2\4\6\2\2\u008d\2\t\3\2\2\2\4o\3\2\2\2\6"+
		"q\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2"+
		"\2\f\3\3\2\2\2\rp\7\30\2\2\16p\7\27\2\2\17\20\7\3\2\2\20\24\7\23\2\2\21"+
		"\23\5\4\3\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25"+
		"\27\3\2\2\2\26\24\3\2\2\2\27p\7\4\2\2\30\31\7\3\2\2\31\32\7\5\2\2\32\33"+
		"\7\31\2\2\33\34\5\4\3\2\34\35\7\4\2\2\35p\3\2\2\2\36\37\7\3\2\2\37 \7"+
		"\6\2\2 !\5\4\3\2!\"\5\4\3\2\"#\5\4\3\2#$\7\4\2\2$p\3\2\2\2%&\7\3\2\2&"+
		"\'\7\7\2\2\'(\5\4\3\2()\7\4\2\2)p\3\2\2\2*+\7\3\2\2+,\7\b\2\2,-\5\4\3"+
		"\2-.\5\4\3\2./\7\4\2\2/p\3\2\2\2\60\61\7\3\2\2\61\63\7\t\2\2\62\64\5\4"+
		"\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
		"\2\2\678\7\4\2\28p\3\2\2\29:\7\3\2\2:;\7\n\2\2;<\5\6\4\2<=\5\4\3\2=>\7"+
		"\4\2\2>p\3\2\2\2?@\7\3\2\2@B\7\13\2\2AC\7\31\2\2BA\3\2\2\2CD\3\2\2\2D"+
		"B\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\4\3\2GH\7\4\2\2Hp\3\2\2\2IJ\7\3\2\2"+
		"JK\7\f\2\2KM\7\31\2\2LN\7\31\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PQ\3\2\2\2QR\5\4\3\2RS\7\4\2\2Sp\3\2\2\2TU\7\3\2\2UV\7\r\2\2VX\5\4\3"+
		"\2WY\5\4\3\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\4"+
		"\2\2]p\3\2\2\2^_\7\3\2\2_`\7\16\2\2`a\5\4\3\2ad\7\17\2\2bc\7\31\2\2ce"+
		"\5\4\3\2db\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\4\2\2i"+
		"p\3\2\2\2jk\7\3\2\2kl\7\20\2\2lm\7\31\2\2mp\7\4\2\2np\7\31\2\2o\r\3\2"+
		"\2\2o\16\3\2\2\2o\17\3\2\2\2o\30\3\2\2\2o\36\3\2\2\2o%\3\2\2\2o*\3\2\2"+
		"\2o\60\3\2\2\2o9\3\2\2\2o?\3\2\2\2oI\3\2\2\2oT\3\2\2\2o^\3\2\2\2oj\3\2"+
		"\2\2on\3\2\2\2p\5\3\2\2\2qt\7\21\2\2rs\7\31\2\2su\5\4\3\2tr\3\2\2\2uv"+
		"\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\22\2\2y\7\3\2\2\2\13\13\24"+
		"\65DOZfov";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}