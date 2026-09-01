// Generated from MiniLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VAR=2, INTEIRO=3, BOOLEANO=4, VERDADEIRO=5, FALSO=6, INICIO=7, 
		FIM=8, MAIS=9, MENOS=10, MULT=11, DIV=12, ABRE_PAR=13, FECHA_PAR=14, PV=15, 
		DOIS_PONTOS=16, VIRGULA=17, PONTO=18, ATRIB=19, NUMERO=20, ID=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", "INICIO", 
			"FIM", "MAIS", "MENOS", "MULT", "DIV", "ABRE_PAR", "FECHA_PAR", "PV", 
			"DOIS_PONTOS", "VIRGULA", "PONTO", "ATRIB", "NUMERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'inteiro'", "'booleano'", "'verdadeiro'", 
			"'falso'", "'inicio'", "'fim'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"';'", "':'", "','", "'.'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", 
			"INICIO", "FIM", "MAIS", "MENOS", "MULT", "DIV", "ABRE_PAR", "FECHA_PAR", 
			"PV", "DOIS_PONTOS", "VIRGULA", "PONTO", "ATRIB", "NUMERO", "ID", "WS"
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


	public MiniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0080\b\u0013\u000b\u0013\f"+
		"\u0013\u0081\u0001\u0014\u0001\u0014\u0005\u0014\u0086\b\u0014\n\u0014"+
		"\f\u0014\u0089\t\u0014\u0001\u0015\u0004\u0015\u008c\b\u0015\u000b\u0015"+
		"\f\u0015\u008d\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0004\u0001\u0000"+
		"09\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0093\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u00036"+
		"\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000\u0007B\u0001\u0000"+
		"\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000"+
		"\r\\\u0001\u0000\u0000\u0000\u000fc\u0001\u0000\u0000\u0000\u0011g\u0001"+
		"\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000"+
		"\u0000\u0017m\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001b"+
		"q\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001fu\u0001"+
		"\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#y\u0001\u0000\u0000\u0000"+
		"%{\u0001\u0000\u0000\u0000\'\u007f\u0001\u0000\u0000\u0000)\u0083\u0001"+
		"\u0000\u0000\u0000+\u008b\u0001\u0000\u0000\u0000-.\u0005p\u0000\u0000"+
		"./\u0005r\u0000\u0000/0\u0005o\u0000\u000001\u0005g\u0000\u000012\u0005"+
		"r\u0000\u000023\u0005a\u0000\u000034\u0005m\u0000\u000045\u0005a\u0000"+
		"\u00005\u0002\u0001\u0000\u0000\u000067\u0005v\u0000\u000078\u0005a\u0000"+
		"\u000089\u0005r\u0000\u00009\u0004\u0001\u0000\u0000\u0000:;\u0005i\u0000"+
		"\u0000;<\u0005n\u0000\u0000<=\u0005t\u0000\u0000=>\u0005e\u0000\u0000"+
		">?\u0005i\u0000\u0000?@\u0005r\u0000\u0000@A\u0005o\u0000\u0000A\u0006"+
		"\u0001\u0000\u0000\u0000BC\u0005b\u0000\u0000CD\u0005o\u0000\u0000DE\u0005"+
		"o\u0000\u0000EF\u0005l\u0000\u0000FG\u0005e\u0000\u0000GH\u0005a\u0000"+
		"\u0000HI\u0005n\u0000\u0000IJ\u0005o\u0000\u0000J\b\u0001\u0000\u0000"+
		"\u0000KL\u0005v\u0000\u0000LM\u0005e\u0000\u0000MN\u0005r\u0000\u0000"+
		"NO\u0005d\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005d\u0000\u0000QR\u0005"+
		"e\u0000\u0000RS\u0005i\u0000\u0000ST\u0005r\u0000\u0000TU\u0005o\u0000"+
		"\u0000U\n\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000WX\u0005a\u0000"+
		"\u0000XY\u0005l\u0000\u0000YZ\u0005s\u0000\u0000Z[\u0005o\u0000\u0000"+
		"[\f\u0001\u0000\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000"+
		"^_\u0005i\u0000\u0000_`\u0005c\u0000\u0000`a\u0005i\u0000\u0000ab\u0005"+
		"o\u0000\u0000b\u000e\u0001\u0000\u0000\u0000cd\u0005f\u0000\u0000de\u0005"+
		"i\u0000\u0000ef\u0005m\u0000\u0000f\u0010\u0001\u0000\u0000\u0000gh\u0005"+
		"+\u0000\u0000h\u0012\u0001\u0000\u0000\u0000ij\u0005-\u0000\u0000j\u0014"+
		"\u0001\u0000\u0000\u0000kl\u0005*\u0000\u0000l\u0016\u0001\u0000\u0000"+
		"\u0000mn\u0005/\u0000\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005(\u0000"+
		"\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005)\u0000\u0000r\u001c\u0001"+
		"\u0000\u0000\u0000st\u0005;\u0000\u0000t\u001e\u0001\u0000\u0000\u0000"+
		"uv\u0005:\u0000\u0000v \u0001\u0000\u0000\u0000wx\u0005,\u0000\u0000x"+
		"\"\u0001\u0000\u0000\u0000yz\u0005.\u0000\u0000z$\u0001\u0000\u0000\u0000"+
		"{|\u0005:\u0000\u0000|}\u0005=\u0000\u0000}&\u0001\u0000\u0000\u0000~"+
		"\u0080\u0007\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082(\u0001\u0000\u0000\u0000\u0083\u0087\u0007"+
		"\u0001\u0000\u0000\u0084\u0086\u0007\u0002\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088*\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0003"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u0015"+
		"\u0000\u0000\u0090,\u0001\u0000\u0000\u0000\u0004\u0000\u0081\u0087\u008d"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}