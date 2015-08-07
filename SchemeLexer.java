// Generated from Scheme.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, RATOR=16, ARITHMETIC_OP=17, 
		RELATIONAL_OP=18, BOOLEAN_OP=19, BOOLEAN=20, DOUBLE=21, ID=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "RATOR", "ARITHMETIC_OP", 
		"RELATIONAL_OP", "BOOLEAN_OP", "BOOLEAN", "DOUBLE", "ID", "WS", "DIGIT", 
		"LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'def'", "'if'", "'print'", "'while'", "'begin'", 
		"'let'", "'fun'", "'defun'", "'call'", "'try'", "'raise'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "RATOR", "ARITHMETIC_OP", "RELATIONAL_OP", "BOOLEAN_OP", 
		"BOOLEAN", "DOUBLE", "ID", "WS"
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


	public SchemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scheme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\5\21w\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0088\n\25\3\26\5\26\u008b\n\26\3"+
		"\26\6\26\u008e\n\26\r\26\16\26\u008f\3\26\3\26\6\26\u0094\n\26\r\26\16"+
		"\26\u0095\5\26\u0098\n\26\3\27\3\27\3\27\3\27\7\27\u009e\n\27\f\27\16"+
		"\27\u00a1\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\3\2\7\6\2,-//\61\61``\5\2##(("+
		"~~\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2"+
		"\2\79\3\2\2\2\t=\3\2\2\2\13@\3\2\2\2\rF\3\2\2\2\17L\3\2\2\2\21R\3\2\2"+
		"\2\23V\3\2\2\2\25Z\3\2\2\2\27`\3\2\2\2\31e\3\2\2\2\33i\3\2\2\2\35o\3\2"+
		"\2\2\37q\3\2\2\2!v\3\2\2\2#x\3\2\2\2%z\3\2\2\2\'|\3\2\2\2)\u0087\3\2\2"+
		"\2+\u008a\3\2\2\2-\u0099\3\2\2\2/\u00a2\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\66\7*\2\2\66\4\3\2\2\2\678\7+\2\28\6\3\2\2\29:\7f\2\2:;\7"+
		"g\2\2;<\7h\2\2<\b\3\2\2\2=>\7k\2\2>?\7h\2\2?\n\3\2\2\2@A\7r\2\2AB\7t\2"+
		"\2BC\7k\2\2CD\7p\2\2DE\7v\2\2E\f\3\2\2\2FG\7y\2\2GH\7j\2\2HI\7k\2\2IJ"+
		"\7n\2\2JK\7g\2\2K\16\3\2\2\2LM\7d\2\2MN\7g\2\2NO\7i\2\2OP\7k\2\2PQ\7p"+
		"\2\2Q\20\3\2\2\2RS\7n\2\2ST\7g\2\2TU\7v\2\2U\22\3\2\2\2VW\7h\2\2WX\7w"+
		"\2\2XY\7p\2\2Y\24\3\2\2\2Z[\7f\2\2[\\\7g\2\2\\]\7h\2\2]^\7w\2\2^_\7p\2"+
		"\2_\26\3\2\2\2`a\7e\2\2ab\7c\2\2bc\7n\2\2cd\7n\2\2d\30\3\2\2\2ef\7v\2"+
		"\2fg\7t\2\2gh\7{\2\2h\32\3\2\2\2ij\7t\2\2jk\7c\2\2kl\7k\2\2lm\7u\2\2m"+
		"n\7g\2\2n\34\3\2\2\2op\7]\2\2p\36\3\2\2\2qr\7_\2\2r \3\2\2\2sw\5#\22\2"+
		"tw\5%\23\2uw\5\'\24\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\"\3\2\2\2xy\t\2\2"+
		"\2y$\3\2\2\2z{\4>@\2{&\3\2\2\2|}\t\3\2\2}(\3\2\2\2~\177\7v\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7w\2\2\u0081\u0088\7g\2\2\u0082\u0083\7h\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0088\7g\2\2"+
		"\u0087~\3\2\2\2\u0087\u0082\3\2\2\2\u0088*\3\2\2\2\u0089\u008b\7/\2\2"+
		"\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e"+
		"\5\61\31\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u0093\7\60\2\2\u0092\u0094"+
		"\5\61\31\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098,\3\2\2\2\u0099\u009f\5\63\32\2\u009a\u009e\5\63\32\2\u009b"+
		"\u009e\5\61\31\2\u009c\u009e\7a\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0.\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\t\4\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\30\2\2\u00a5\60\3\2\2\2\u00a6\u00a7"+
		"\t\5\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\t\6\2\2\u00a9\64\3\2\2\2\13\2v\u0087"+
		"\u008a\u008f\u0095\u0097\u009d\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}