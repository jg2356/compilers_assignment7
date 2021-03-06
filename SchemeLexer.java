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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, RATOR=17, 
		ARITHMETIC_OP=18, RELATIONAL_OP=19, BOOLEAN_OP=20, BOOLEAN=21, DOUBLE=22, 
		ID=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "RATOR", 
		"ARITHMETIC_OP", "RELATIONAL_OP", "BOOLEAN_OP", "BOOLEAN", "DOUBLE", "ID", 
		"WS", "DIGIT", "LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'def'", "'if'", "'print'", "'while'", "'begin'", 
		"'let'", "'fun'", "'defun'", "'call'", "'try'", "'raise'", "'quit'", "'['", 
		"']'"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22~\n\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u008f\n\26\3\27\5\27\u0092\n\27\3\27\6\27\u0095\n\27\r\27\16\27\u0096"+
		"\3\27\3\27\6\27\u009b\n\27\r\27\16\27\u009c\5\27\u009f\n\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00a5\n\30\f\30\16\30\u00a8\13\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\2\65\2\3\2\7\6\2,-//\61\61``\5\2##((~~\5\2\13\f\17\17\"\"\3\2\62;"+
		"\4\2C\\c|\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t?\3\2"+
		"\2\2\13B\3\2\2\2\rH\3\2\2\2\17N\3\2\2\2\21T\3\2\2\2\23X\3\2\2\2\25\\\3"+
		"\2\2\2\27b\3\2\2\2\31g\3\2\2\2\33k\3\2\2\2\35q\3\2\2\2\37v\3\2\2\2!x\3"+
		"\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u008e\3"+
		"\2\2\2-\u0091\3\2\2\2/\u00a0\3\2\2\2\61\u00a9\3\2\2\2\63\u00ad\3\2\2\2"+
		"\65\u00af\3\2\2\2\678\7*\2\28\4\3\2\2\29:\7+\2\2:\6\3\2\2\2;<\7f\2\2<"+
		"=\7g\2\2=>\7h\2\2>\b\3\2\2\2?@\7k\2\2@A\7h\2\2A\n\3\2\2\2BC\7r\2\2CD\7"+
		"t\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\f\3\2\2\2HI\7y\2\2IJ\7j\2\2JK\7k\2\2"+
		"KL\7n\2\2LM\7g\2\2M\16\3\2\2\2NO\7d\2\2OP\7g\2\2PQ\7i\2\2QR\7k\2\2RS\7"+
		"p\2\2S\20\3\2\2\2TU\7n\2\2UV\7g\2\2VW\7v\2\2W\22\3\2\2\2XY\7h\2\2YZ\7"+
		"w\2\2Z[\7p\2\2[\24\3\2\2\2\\]\7f\2\2]^\7g\2\2^_\7h\2\2_`\7w\2\2`a\7p\2"+
		"\2a\26\3\2\2\2bc\7e\2\2cd\7c\2\2de\7n\2\2ef\7n\2\2f\30\3\2\2\2gh\7v\2"+
		"\2hi\7t\2\2ij\7{\2\2j\32\3\2\2\2kl\7t\2\2lm\7c\2\2mn\7k\2\2no\7u\2\2o"+
		"p\7g\2\2p\34\3\2\2\2qr\7s\2\2rs\7w\2\2st\7k\2\2tu\7v\2\2u\36\3\2\2\2v"+
		"w\7]\2\2w \3\2\2\2xy\7_\2\2y\"\3\2\2\2z~\5%\23\2{~\5\'\24\2|~\5)\25\2"+
		"}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~$\3\2\2\2\177\u0080\t\2\2\2\u0080&\3\2"+
		"\2\2\u0081\u0082\4>@\2\u0082(\3\2\2\2\u0083\u0084\t\3\2\2\u0084*\3\2\2"+
		"\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u008f"+
		"\7g\2\2\u0089\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u008d\7u\2\2\u008d\u008f\7g\2\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2"+
		"\2\u008f,\3\2\2\2\u0090\u0092\7/\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5\63\32\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009e\3\2"+
		"\2\2\u0098\u009a\7\60\2\2\u0099\u009b\5\63\32\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u0098\3\2\2\2\u009e\u009f\3\2\2\2\u009f.\3\2\2\2\u00a0\u00a6"+
		"\5\65\33\2\u00a1\u00a5\5\65\33\2\u00a2\u00a5\5\63\32\2\u00a3\u00a5\7a"+
		"\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\60\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\b\31\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\t\6\2\2\u00b0\66\3\2\2\2\13\2}\u008e\u0091\u0096\u009c\u009e\u00a4"+
		"\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}