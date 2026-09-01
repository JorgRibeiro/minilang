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
		FIM=8, MAIS=9, MENOS=10, MULT=11, DIV=12, ABRE_PAR=13, FECHA_PAR=14, OPERADOR_RELACIONAL=15, 
		PV=16, DOIS_PONTOS=17, VIRGULA=18, PONTO=19, ATRIB=20, NUMERO=21, ID=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", "INICIO", 
			"FIM", "MAIS", "MENOS", "MULT", "DIV", "ABRE_PAR", "FECHA_PAR", "OPERADOR_RELACIONAL", 
			"PV", "DOIS_PONTOS", "VIRGULA", "PONTO", "ATRIB", "NUMERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'inteiro'", "'booleano'", "'verdadeiro'", 
			"'falso'", "'inicio'", "'fim'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			null, "';'", "':'", "','", "'.'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", 
			"INICIO", "FIM", "MAIS", "MENOS", "MULT", "DIV", "ABRE_PAR", "FECHA_PAR", 
			"OPERADOR_RELACIONAL", "PV", "DOIS_PONTOS", "VIRGULA", "PONTO", "ATRIB", 
			"NUMERO", "ID", "WS"
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
		"\u0004\u0000\u0017\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u007f\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u008d\b\u0014"+
		"\u000b\u0014\f\u0014\u008e\u0001\u0015\u0001\u0015\u0005\u0015\u0093\b"+
		"\u0015\n\u0015\f\u0015\u0096\t\u0015\u0001\u0016\u0004\u0016\u0099\b\u0016"+
		"\u000b\u0016\f\u0016\u009a\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001"+
		"\u0000\u0005\u0002\u0000<<>>\u0001\u000009\u0002\u0000AZaz\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  \u00a4\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00038\u0001"+
		"\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000"+
		"\u0000\tM\u0001\u0000\u0000\u0000\u000bX\u0001\u0000\u0000\u0000\r^\u0001"+
		"\u0000\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011i\u0001\u0000\u0000"+
		"\u0000\u0013k\u0001\u0000\u0000\u0000\u0015m\u0001\u0000\u0000\u0000\u0017"+
		"o\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000\u0000\u001bs\u0001"+
		"\u0000\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000"+
		"\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000\u0000"+
		"%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008c"+
		"\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0098\u0001\u0000"+
		"\u0000\u0000/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005o\u0000"+
		"\u000023\u0005g\u0000\u000034\u0005r\u0000\u000045\u0005a\u0000\u0000"+
		"56\u0005m\u0000\u000067\u0005a\u0000\u00007\u0002\u0001\u0000\u0000\u0000"+
		"89\u0005v\u0000\u00009:\u0005a\u0000\u0000:;\u0005r\u0000\u0000;\u0004"+
		"\u0001\u0000\u0000\u0000<=\u0005i\u0000\u0000=>\u0005n\u0000\u0000>?\u0005"+
		"t\u0000\u0000?@\u0005e\u0000\u0000@A\u0005i\u0000\u0000AB\u0005r\u0000"+
		"\u0000BC\u0005o\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DE\u0005b\u0000"+
		"\u0000EF\u0005o\u0000\u0000FG\u0005o\u0000\u0000GH\u0005l\u0000\u0000"+
		"HI\u0005e\u0000\u0000IJ\u0005a\u0000\u0000JK\u0005n\u0000\u0000KL\u0005"+
		"o\u0000\u0000L\b\u0001\u0000\u0000\u0000MN\u0005v\u0000\u0000NO\u0005"+
		"e\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005d\u0000\u0000QR\u0005a\u0000"+
		"\u0000RS\u0005d\u0000\u0000ST\u0005e\u0000\u0000TU\u0005i\u0000\u0000"+
		"UV\u0005r\u0000\u0000VW\u0005o\u0000\u0000W\n\u0001\u0000\u0000\u0000"+
		"XY\u0005f\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005"+
		"s\u0000\u0000\\]\u0005o\u0000\u0000]\f\u0001\u0000\u0000\u0000^_\u0005"+
		"i\u0000\u0000_`\u0005n\u0000\u0000`a\u0005i\u0000\u0000ab\u0005c\u0000"+
		"\u0000bc\u0005i\u0000\u0000cd\u0005o\u0000\u0000d\u000e\u0001\u0000\u0000"+
		"\u0000ef\u0005f\u0000\u0000fg\u0005i\u0000\u0000gh\u0005m\u0000\u0000"+
		"h\u0010\u0001\u0000\u0000\u0000ij\u0005+\u0000\u0000j\u0012\u0001\u0000"+
		"\u0000\u0000kl\u0005-\u0000\u0000l\u0014\u0001\u0000\u0000\u0000mn\u0005"+
		"*\u0000\u0000n\u0016\u0001\u0000\u0000\u0000op\u0005/\u0000\u0000p\u0018"+
		"\u0001\u0000\u0000\u0000qr\u0005(\u0000\u0000r\u001a\u0001\u0000\u0000"+
		"\u0000st\u0005)\u0000\u0000t\u001c\u0001\u0000\u0000\u0000uv\u0005=\u0000"+
		"\u0000v\u007f\u0005=\u0000\u0000wx\u0005!\u0000\u0000x\u007f\u0005=\u0000"+
		"\u0000yz\u0005>\u0000\u0000z\u007f\u0005=\u0000\u0000{|\u0005<\u0000\u0000"+
		"|\u007f\u0005=\u0000\u0000}\u007f\u0007\u0000\u0000\u0000~u\u0001\u0000"+
		"\u0000\u0000~w\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~{\u0001"+
		"\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u001e\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005;\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005:\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005,\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0087\u0005."+
		"\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005:\u0000\u0000"+
		"\u0089\u008a\u0005=\u0000\u0000\u008a(\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0007\u0001\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f*\u0001\u0000\u0000\u0000\u0090\u0094\u0007"+
		"\u0002\u0000\u0000\u0091\u0093\u0007\u0003\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095,\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0004"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0016"+
		"\u0000\u0000\u009d.\u0001\u0000\u0000\u0000\u0005\u0000~\u008e\u0094\u009a"+
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