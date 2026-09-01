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
		FIM=8, PV=9, DOIS_PONTOS=10, VIRGULA=11, PONTO=12, ATRIB=13, NUMERO=14, 
		ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", "INICIO", 
			"FIM", "PV", "DOIS_PONTOS", "VIRGULA", "PONTO", "ATRIB", "NUMERO", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'inteiro'", "'booleano'", "'verdadeiro'", 
			"'falso'", "'inicio'", "'fim'", "';'", "':'", "','", "'.'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", 
			"INICIO", "FIM", "PV", "DOIS_PONTOS", "VIRGULA", "PONTO", "ATRIB", "NUMERO", 
			"ID", "WS"
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
		"\u0004\u0000\u0010y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0004\rh\b\r\u000b\r\f\ri\u0001\u000e\u0001"+
		"\u000e\u0005\u000en\b\u000e\n\u000e\f\u000eq\t\u000e\u0001\u000f\u0004"+
		"\u000ft\b\u000f\u000b\u000f\f\u000fu\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0004\u0001\u000009\u0002\u0000A"+
		"Zaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  {\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003"+
		"*\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00076\u0001"+
		"\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000"+
		"\u0000\rP\u0001\u0000\u0000\u0000\u000fW\u0001\u0000\u0000\u0000\u0011"+
		"[\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_\u0001"+
		"\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019c\u0001\u0000\u0000"+
		"\u0000\u001bg\u0001\u0000\u0000\u0000\u001dk\u0001\u0000\u0000\u0000\u001f"+
		"s\u0001\u0000\u0000\u0000!\"\u0005p\u0000\u0000\"#\u0005r\u0000\u0000"+
		"#$\u0005o\u0000\u0000$%\u0005g\u0000\u0000%&\u0005r\u0000\u0000&\'\u0005"+
		"a\u0000\u0000\'(\u0005m\u0000\u0000()\u0005a\u0000\u0000)\u0002\u0001"+
		"\u0000\u0000\u0000*+\u0005v\u0000\u0000+,\u0005a\u0000\u0000,-\u0005r"+
		"\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005i\u0000\u0000/0\u0005"+
		"n\u0000\u000001\u0005t\u0000\u000012\u0005e\u0000\u000023\u0005i\u0000"+
		"\u000034\u0005r\u0000\u000045\u0005o\u0000\u00005\u0006\u0001\u0000\u0000"+
		"\u000067\u0005b\u0000\u000078\u0005o\u0000\u000089\u0005o\u0000\u0000"+
		"9:\u0005l\u0000\u0000:;\u0005e\u0000\u0000;<\u0005a\u0000\u0000<=\u0005"+
		"n\u0000\u0000=>\u0005o\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005"+
		"v\u0000\u0000@A\u0005e\u0000\u0000AB\u0005r\u0000\u0000BC\u0005d\u0000"+
		"\u0000CD\u0005a\u0000\u0000DE\u0005d\u0000\u0000EF\u0005e\u0000\u0000"+
		"FG\u0005i\u0000\u0000GH\u0005r\u0000\u0000HI\u0005o\u0000\u0000I\n\u0001"+
		"\u0000\u0000\u0000JK\u0005f\u0000\u0000KL\u0005a\u0000\u0000LM\u0005l"+
		"\u0000\u0000MN\u0005s\u0000\u0000NO\u0005o\u0000\u0000O\f\u0001\u0000"+
		"\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005n\u0000\u0000RS\u0005i\u0000"+
		"\u0000ST\u0005c\u0000\u0000TU\u0005i\u0000\u0000UV\u0005o\u0000\u0000"+
		"V\u000e\u0001\u0000\u0000\u0000WX\u0005f\u0000\u0000XY\u0005i\u0000\u0000"+
		"YZ\u0005m\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[\\\u0005;\u0000\u0000"+
		"\\\u0012\u0001\u0000\u0000\u0000]^\u0005:\u0000\u0000^\u0014\u0001\u0000"+
		"\u0000\u0000_`\u0005,\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ab\u0005"+
		".\u0000\u0000b\u0018\u0001\u0000\u0000\u0000cd\u0005:\u0000\u0000de\u0005"+
		"=\u0000\u0000e\u001a\u0001\u0000\u0000\u0000fh\u0007\u0000\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\u001c\u0001\u0000\u0000\u0000ko\u0007"+
		"\u0001\u0000\u0000ln\u0007\u0002\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u001e\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0007"+
		"\u0003\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wx\u0006\u000f\u0000\u0000x \u0001\u0000\u0000\u0000\u0004\u0000"+
		"iou\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}