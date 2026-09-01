// Generated from MiniLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VAR=2, INTEIRO=3, BOOLEANO=4, INICIO=5, FIM=6, PV=7, DOIS_PONTOS=8, 
		VIRGULA=9, PONTO=10, ID=11, WS=12;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_declaracaoVariaveis = 2, RULE_declaracaoVariavel = 3, 
		RULE_listaIdentificadores = 4, RULE_tipo = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "declaracaoVariaveis", "declaracaoVariavel", "listaIdentificadores", 
			"tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'inteiro'", "'booleano'", "'inicio'", "'fim'", 
			"';'", "':'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "INICIO", "FIM", "PV", 
			"DOIS_PONTOS", "VIRGULA", "PONTO", "ID", "WS"
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
	public String getGrammarFileName() { return "MiniLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(MiniLangParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode PV() { return getToken(MiniLangParser.PV, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(MiniLangParser.PONTO, 0); }
		public TerminalNode EOF() { return getToken(MiniLangParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(PROGRAMA);
			setState(13);
			match(ID);
			setState(14);
			match(PV);
			setState(15);
			bloco();
			setState(16);
			match(PONTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(MiniLangParser.INICIO, 0); }
		public TerminalNode FIM() { return getToken(MiniLangParser.FIM, 0); }
		public DeclaracaoVariaveisContext declaracaoVariaveis() {
			return getRuleContext(DeclaracaoVariaveisContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(19);
				declaracaoVariaveis();
				}
			}

			setState(22);
			match(INICIO);
			setState(23);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariaveisContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniLangParser.VAR, 0); }
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public DeclaracaoVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariaveis; }
	}

	public final DeclaracaoVariaveisContext declaracaoVariaveis() throws RecognitionException {
		DeclaracaoVariaveisContext _localctx = new DeclaracaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(VAR);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				declaracaoVariavel();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MiniLangParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PV() { return getToken(MiniLangParser.PV, 0); }
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			listaIdentificadores();
			setState(32);
			match(DOIS_PONTOS);
			setState(33);
			tipo();
			setState(34);
			match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdentificadoresContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniLangParser.ID, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MiniLangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MiniLangParser.VIRGULA, i);
		}
		public ListaIdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentificadores; }
	}

	public final ListaIdentificadoresContext listaIdentificadores() throws RecognitionException {
		ListaIdentificadoresContext _localctx = new ListaIdentificadoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaIdentificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(37);
				match(VIRGULA);
				setState(38);
				match(ID);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(MiniLangParser.INTEIRO, 0); }
		public TerminalNode BOOLEANO() { return getToken(MiniLangParser.BOOLEANO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==INTEIRO || _la==BOOLEANO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\f/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002\u001c"+
		"\b\u0002\u000b\u0002\f\u0002\u001d\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"(\b\u0004\n\u0004\f\u0004+\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000"+
		"\u0003\u0004+\u0000\f\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000"+
		"\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000"+
		"\u0000\u0000\b$\u0001\u0000\u0000\u0000\n,\u0001\u0000\u0000\u0000\f\r"+
		"\u0005\u0001\u0000\u0000\r\u000e\u0005\u000b\u0000\u0000\u000e\u000f\u0005"+
		"\u0007\u0000\u0000\u000f\u0010\u0003\u0002\u0001\u0000\u0010\u0011\u0005"+
		"\n\u0000\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014\u0013\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0005\u0000\u0000\u0017\u0018\u0005\u0006"+
		"\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001b\u0005\u0002"+
		"\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000"+
		"\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0005\b\u0000\u0000!\"\u0003"+
		"\n\u0005\u0000\"#\u0005\u0007\u0000\u0000#\u0007\u0001\u0000\u0000\u0000"+
		"$)\u0005\u000b\u0000\u0000%&\u0005\t\u0000\u0000&(\u0005\u000b\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*\t\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0007\u0000\u0000\u0000-\u000b\u0001\u0000\u0000\u0000"+
		"\u0003\u0014\u001d)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}