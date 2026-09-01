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
		PROGRAMA=1, VAR=2, INTEIRO=3, BOOLEANO=4, VERDADEIRO=5, FALSO=6, INICIO=7, 
		FIM=8, ESCREVA=9, SE=10, ENTAO=11, SENAO=12, FIMSE=13, ENQUANTO=14, FACA=15, 
		FIMENQUANTO=16, BREAK=17, CONTINUE=18, PROCEDIMENTO=19, FUNCAO=20, MAIS=21, 
		MENOS=22, MULT=23, DIV=24, ABRE_PAR=25, FECHA_PAR=26, OPERADOR_RELACIONAL=27, 
		PV=28, DOIS_PONTOS=29, VIRGULA=30, PONTO=31, ATRIB=32, NUMERO=33, ID=34, 
		WS=35;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_declaracaoVariaveis = 2, RULE_declaracaoVariavel = 3, 
		RULE_listaIdentificadores = 4, RULE_tipo = 5, RULE_declaracaoSubrotina = 6, 
		RULE_declaracaoProcedimento = 7, RULE_declaracaoFuncao = 8, RULE_listaParametros = 9, 
		RULE_parametro = 10, RULE_corpoSubrotina = 11, RULE_comando = 12, RULE_comandoIdentificador = 13, 
		RULE_continuacaoIdentificador = 14, RULE_listaArgumentos = 15, RULE_escrita = 16, 
		RULE_condicional = 17, RULE_expressao = 18, RULE_expressaoAritmetica = 19, 
		RULE_termo = 20, RULE_fator = 21, RULE_enquanto = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "declaracaoVariaveis", "declaracaoVariavel", "listaIdentificadores", 
			"tipo", "declaracaoSubrotina", "declaracaoProcedimento", "declaracaoFuncao", 
			"listaParametros", "parametro", "corpoSubrotina", "comando", "comandoIdentificador", 
			"continuacaoIdentificador", "listaArgumentos", "escrita", "condicional", 
			"expressao", "expressaoAritmetica", "termo", "fator", "enquanto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'inteiro'", "'booleano'", "'verdadeiro'", 
			"'falso'", "'inicio'", "'fim'", "'escreva'", "'se'", "'entao'", "'senao'", 
			"'fimse'", "'enquanto'", "'faca'", "'fimenquanto'", "'break'", "'continue'", 
			"'procedimento'", "'funcao'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			null, "';'", "':'", "','", "'.'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", 
			"INICIO", "FIM", "ESCREVA", "SE", "ENTAO", "SENAO", "FIMSE", "ENQUANTO", 
			"FACA", "FIMENQUANTO", "BREAK", "CONTINUE", "PROCEDIMENTO", "FUNCAO", 
			"MAIS", "MENOS", "MULT", "DIV", "ABRE_PAR", "FECHA_PAR", "OPERADOR_RELACIONAL", 
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
			setState(46);
			match(PROGRAMA);
			setState(47);
			match(ID);
			setState(48);
			match(PV);
			setState(49);
			bloco();
			setState(50);
			match(PONTO);
			setState(51);
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
		public List<DeclaracaoSubrotinaContext> declaracaoSubrotina() {
			return getRuleContexts(DeclaracaoSubrotinaContext.class);
		}
		public DeclaracaoSubrotinaContext declaracaoSubrotina(int i) {
			return getRuleContext(DeclaracaoSubrotinaContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(53);
				declaracaoVariaveis();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDIMENTO || _la==FUNCAO) {
				{
				{
				setState(56);
				declaracaoSubrotina();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(INICIO);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180280320L) != 0)) {
				{
				{
				setState(63);
				comando();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(71);
			match(VAR);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				declaracaoVariavel();
				}
				}
				setState(75); 
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
			setState(77);
			listaIdentificadores();
			setState(78);
			match(DOIS_PONTOS);
			setState(79);
			tipo();
			setState(80);
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
			setState(82);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(83);
				match(VIRGULA);
				setState(84);
				match(ID);
				}
				}
				setState(89);
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
			setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoSubrotinaContext extends ParserRuleContext {
		public DeclaracaoProcedimentoContext declaracaoProcedimento() {
			return getRuleContext(DeclaracaoProcedimentoContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public DeclaracaoSubrotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoSubrotina; }
	}

	public final DeclaracaoSubrotinaContext declaracaoSubrotina() throws RecognitionException {
		DeclaracaoSubrotinaContext _localctx = new DeclaracaoSubrotinaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracaoSubrotina);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				declaracaoProcedimento();
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				declaracaoFuncao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoProcedimentoContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(MiniLangParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode ABRE_PAR() { return getToken(MiniLangParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(MiniLangParser.FECHA_PAR, 0); }
		public List<TerminalNode> PV() { return getTokens(MiniLangParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(MiniLangParser.PV, i);
		}
		public CorpoSubrotinaContext corpoSubrotina() {
			return getRuleContext(CorpoSubrotinaContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public DeclaracaoProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoProcedimento; }
	}

	public final DeclaracaoProcedimentoContext declaracaoProcedimento() throws RecognitionException {
		DeclaracaoProcedimentoContext _localctx = new DeclaracaoProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracaoProcedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PROCEDIMENTO);
			setState(97);
			match(ID);
			setState(98);
			match(ABRE_PAR);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				listaParametros();
				}
			}

			setState(102);
			match(FECHA_PAR);
			setState(103);
			match(PV);
			setState(104);
			corpoSubrotina();
			setState(105);
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
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(MiniLangParser.FUNCAO, 0); }
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode ABRE_PAR() { return getToken(MiniLangParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(MiniLangParser.FECHA_PAR, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MiniLangParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> PV() { return getTokens(MiniLangParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(MiniLangParser.PV, i);
		}
		public CorpoSubrotinaContext corpoSubrotina() {
			return getRuleContext(CorpoSubrotinaContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FUNCAO);
			setState(108);
			match(ID);
			setState(109);
			match(ABRE_PAR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(110);
				listaParametros();
				}
			}

			setState(113);
			match(FECHA_PAR);
			setState(114);
			match(DOIS_PONTOS);
			setState(115);
			tipo();
			setState(116);
			match(PV);
			setState(117);
			corpoSubrotina();
			setState(118);
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
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MiniLangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MiniLangParser.VIRGULA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			parametro();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(121);
				match(VIRGULA);
				setState(122);
				parametro();
				}
				}
				setState(127);
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
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MiniLangParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(DOIS_PONTOS);
			setState(130);
			tipo();
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
	public static class CorpoSubrotinaContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(MiniLangParser.INICIO, 0); }
		public TerminalNode FIM() { return getToken(MiniLangParser.FIM, 0); }
		public DeclaracaoVariaveisContext declaracaoVariaveis() {
			return getRuleContext(DeclaracaoVariaveisContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CorpoSubrotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoSubrotina; }
	}

	public final CorpoSubrotinaContext corpoSubrotina() throws RecognitionException {
		CorpoSubrotinaContext _localctx = new CorpoSubrotinaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_corpoSubrotina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(132);
				declaracaoVariaveis();
				}
			}

			setState(135);
			match(INICIO);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180280320L) != 0)) {
				{
				{
				setState(136);
				comando();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
	public static class ComandoContext extends ParserRuleContext {
		public ComandoIdentificadorContext comandoIdentificador() {
			return getRuleContext(ComandoIdentificadorContext.class,0);
		}
		public TerminalNode PV() { return getToken(MiniLangParser.PV, 0); }
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MiniLangParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MiniLangParser.CONTINUE, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comando);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				comandoIdentificador();
				setState(145);
				match(PV);
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				escrita();
				setState(148);
				match(PV);
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				condicional();
				setState(151);
				match(PV);
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				enquanto();
				setState(154);
				match(PV);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(BREAK);
				setState(157);
				match(PV);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(CONTINUE);
				setState(159);
				match(PV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoIdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public ContinuacaoIdentificadorContext continuacaoIdentificador() {
			return getRuleContext(ContinuacaoIdentificadorContext.class,0);
		}
		public ComandoIdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoIdentificador; }
	}

	public final ComandoIdentificadorContext comandoIdentificador() throws RecognitionException {
		ComandoIdentificadorContext _localctx = new ComandoIdentificadorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoIdentificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			continuacaoIdentificador();
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
	public static class ContinuacaoIdentificadorContext extends ParserRuleContext {
		public TerminalNode ATRIB() { return getToken(MiniLangParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ABRE_PAR() { return getToken(MiniLangParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(MiniLangParser.FECHA_PAR, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ContinuacaoIdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuacaoIdentificador; }
	}

	public final ContinuacaoIdentificadorContext continuacaoIdentificador() throws RecognitionException {
		ContinuacaoIdentificadorContext _localctx = new ContinuacaoIdentificadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continuacaoIdentificador);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATRIB:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ATRIB);
				setState(166);
				expressao();
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(ABRE_PAR);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25803358304L) != 0)) {
					{
					setState(168);
					listaArgumentos();
					}
				}

				setState(171);
				match(FECHA_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MiniLangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MiniLangParser.VIRGULA, i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expressao();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(175);
				match(VIRGULA);
				setState(176);
				expressao();
				}
				}
				setState(181);
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
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(MiniLangParser.ESCREVA, 0); }
		public TerminalNode ABRE_PAR() { return getToken(MiniLangParser.ABRE_PAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(MiniLangParser.FECHA_PAR, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ESCREVA);
			setState(183);
			match(ABRE_PAR);
			setState(184);
			expressao();
			setState(185);
			match(FECHA_PAR);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(MiniLangParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(MiniLangParser.ENTAO, 0); }
		public TerminalNode FIMSE() { return getToken(MiniLangParser.FIMSE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(MiniLangParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(SE);
			setState(188);
			expressao();
			setState(189);
			match(ENTAO);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180280320L) != 0)) {
				{
				{
				setState(190);
				comando();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(196);
				match(SENAO);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180280320L) != 0)) {
					{
					{
					setState(197);
					comando();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205);
			match(FIMSE);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode OPERADOR_RELACIONAL() { return getToken(MiniLangParser.OPERADOR_RELACIONAL, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			expressaoAritmetica();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERADOR_RELACIONAL) {
				{
				setState(208);
				match(OPERADOR_RELACIONAL);
				setState(209);
				expressaoAritmetica();
				}
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> MAIS() { return getTokens(MiniLangParser.MAIS); }
		public TerminalNode MAIS(int i) {
			return getToken(MiniLangParser.MAIS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(MiniLangParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(MiniLangParser.MENOS, i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			termo();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIS || _la==MENOS) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==MAIS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				termo();
				}
				}
				setState(219);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(MiniLangParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(MiniLangParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MiniLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MiniLangParser.DIV, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			fator();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				fator();
				}
				}
				setState(227);
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
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(MiniLangParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode ABRE_PAR() { return getToken(MiniLangParser.ABRE_PAR, 0); }
		public TerminalNode FECHA_PAR() { return getToken(MiniLangParser.FECHA_PAR, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public TerminalNode VERDADEIRO() { return getToken(MiniLangParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MiniLangParser.FALSO, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fator);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(ID);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_PAR) {
					{
					setState(230);
					match(ABRE_PAR);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25803358304L) != 0)) {
						{
						setState(231);
						listaArgumentos();
						}
					}

					setState(234);
					match(FECHA_PAR);
					}
				}

				}
				break;
			case VERDADEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(VERDADEIRO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(FALSO);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(ABRE_PAR);
				setState(240);
				expressaoAritmetica();
				setState(241);
				match(FECHA_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(MiniLangParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(MiniLangParser.FACA, 0); }
		public TerminalNode FIMENQUANTO() { return getToken(MiniLangParser.FIMENQUANTO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ENQUANTO);
			setState(246);
			expressao();
			setState(247);
			match(FACA);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17180280320L) != 0)) {
				{
				{
				setState(248);
				comando();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(FIMENQUANTO);
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
		"\u0004\u0001#\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u00017\b\u0001"+
		"\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002J\b\u0002\u000b\u0002"+
		"\f\u0002K\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004"+
		"Y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"_\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bp\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t|\b\t"+
		"\n\t\f\t\u007f\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b"+
		"\u0086\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008a\b\u000b\n\u000b"+
		"\f\u000b\u008d\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a1\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00aa\b"+
		"\u000e\u0001\u000e\u0003\u000e\u00ad\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00b2\b\u000f\n\u000f\f\u000f\u00b5\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00c0\b\u0011\n\u0011\f\u0011\u00c3"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c7\b\u0011\n\u0011\f\u0011"+
		"\u00ca\t\u0011\u0003\u0011\u00cc\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d3\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00d8\b\u0013\n\u0013\f\u0013\u00db\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e0\b\u0014\n\u0014"+
		"\f\u0014\u00e3\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00e9\b\u0015\u0001\u0015\u0003\u0015\u00ec\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00f4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00fa\b\u0016\n\u0016\f\u0016\u00fd\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0003\u0001\u0000"+
		"\u0003\u0004\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u0018\u0109\u0000"+
		".\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004G\u0001"+
		"\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000"+
		"\u0000\nZ\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000e`\u0001"+
		"\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000"+
		"\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000\u0000"+
		"\u0000\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000"+
		"\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000"+
		"\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00bb\u0001\u0000\u0000\u0000"+
		"$\u00cf\u0001\u0000\u0000\u0000&\u00d4\u0001\u0000\u0000\u0000(\u00dc"+
		"\u0001\u0000\u0000\u0000*\u00f3\u0001\u0000\u0000\u0000,\u00f5\u0001\u0000"+
		"\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0005\"\u0000\u000001\u0005\u001c"+
		"\u0000\u000012\u0003\u0002\u0001\u000023\u0005\u001f\u0000\u000034\u0005"+
		"\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u000057\u0003\u0004\u0002"+
		"\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007;\u0001\u0000"+
		"\u0000\u00008:\u0003\f\u0006\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>B\u0005\u0007\u0000\u0000"+
		"?A\u0003\u0018\f\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\b\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GI\u0005\u0002\u0000\u0000HJ\u0003\u0006\u0003\u0000IH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MN\u0003\b\u0004"+
		"\u0000NO\u0005\u001d\u0000\u0000OP\u0003\n\u0005\u0000PQ\u0005\u001c\u0000"+
		"\u0000Q\u0007\u0001\u0000\u0000\u0000RW\u0005\"\u0000\u0000ST\u0005\u001e"+
		"\u0000\u0000TV\u0005\"\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0007\u0000\u0000\u0000"+
		"[\u000b\u0001\u0000\u0000\u0000\\_\u0003\u000e\u0007\u0000]_\u0003\u0010"+
		"\b\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\r\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0013\u0000\u0000ab\u0005\"\u0000\u0000bd\u0005"+
		"\u0019\u0000\u0000ce\u0003\u0012\t\u0000dc\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u001a\u0000\u0000"+
		"gh\u0005\u001c\u0000\u0000hi\u0003\u0016\u000b\u0000ij\u0005\u001c\u0000"+
		"\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0005\u0014\u0000\u0000lm\u0005"+
		"\"\u0000\u0000mo\u0005\u0019\u0000\u0000np\u0003\u0012\t\u0000on\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0005\u001a\u0000\u0000rs\u0005\u001d\u0000\u0000st\u0003\n\u0005\u0000"+
		"tu\u0005\u001c\u0000\u0000uv\u0003\u0016\u000b\u0000vw\u0005\u001c\u0000"+
		"\u0000w\u0011\u0001\u0000\u0000\u0000x}\u0003\u0014\n\u0000yz\u0005\u001e"+
		"\u0000\u0000z|\u0003\u0014\n\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0013\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\"\u0000\u0000\u0081\u0082\u0005\u001d\u0000\u0000\u0082\u0083\u0003"+
		"\n\u0005\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0004"+
		"\u0002\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008b\u0005\u0007"+
		"\u0000\u0000\u0088\u008a\u0003\u0018\f\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\b\u0000\u0000"+
		"\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u001a\r\u0000\u0091"+
		"\u0092\u0005\u001c\u0000\u0000\u0092\u00a1\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0003 \u0010\u0000\u0094\u0095\u0005\u001c\u0000\u0000\u0095\u00a1"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0003\"\u0011\u0000\u0097\u0098\u0005"+
		"\u001c\u0000\u0000\u0098\u00a1\u0001\u0000\u0000\u0000\u0099\u009a\u0003"+
		",\u0016\u0000\u009a\u009b\u0005\u001c\u0000\u0000\u009b\u00a1\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0011\u0000\u0000\u009d\u00a1\u0005\u001c"+
		"\u0000\u0000\u009e\u009f\u0005\u0012\u0000\u0000\u009f\u00a1\u0005\u001c"+
		"\u0000\u0000\u00a0\u0090\u0001\u0000\u0000\u0000\u00a0\u0093\u0001\u0000"+
		"\u0000\u0000\u00a0\u0096\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000"+
		"\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\"\u0000"+
		"\u0000\u00a3\u00a4\u0003\u001c\u000e\u0000\u00a4\u001b\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6\u00ad\u0003$\u0012\u0000\u00a7"+
		"\u00a9\u0005\u0019\u0000\u0000\u00a8\u00aa\u0003\u001e\u000f\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u001a\u0000\u0000\u00ac"+
		"\u00a5\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ad"+
		"\u001d\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003$\u0012\u0000\u00af\u00b0"+
		"\u0005\u001e\u0000\u0000\u00b0\u00b2\u0003$\u0012\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u001f\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\t\u0000\u0000\u00b7\u00b8\u0005\u0019\u0000\u0000\u00b8\u00b9\u0003$"+
		"\u0012\u0000\u00b9\u00ba\u0005\u001a\u0000\u0000\u00ba!\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005\n\u0000\u0000\u00bc\u00bd\u0003$\u0012\u0000"+
		"\u00bd\u00c1\u0005\u000b\u0000\u0000\u00be\u00c0\u0003\u0018\f\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c8\u0005\f\u0000\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c4"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\r\u0000\u0000\u00ce#\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0003&\u0013\u0000\u00d0\u00d1\u0005\u001b"+
		"\u0000\u0000\u00d1\u00d3\u0003&\u0013\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3%\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d9\u0003(\u0014\u0000\u00d5\u00d6\u0007\u0001\u0000\u0000\u00d6"+
		"\u00d8\u0003(\u0014\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\'\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e1\u0003*\u0015\u0000\u00dd\u00de\u0007\u0002"+
		"\u0000\u0000\u00de\u00e0\u0003*\u0015\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00f4\u0005!\u0000\u0000\u00e5"+
		"\u00eb\u0005\"\u0000\u0000\u00e6\u00e8\u0005\u0019\u0000\u0000\u00e7\u00e9"+
		"\u0003\u001e\u000f\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec"+
		"\u0005\u001a\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ec\u00f4\u0001\u0000\u0000\u0000\u00ed\u00f4"+
		"\u0005\u0005\u0000\u0000\u00ee\u00f4\u0005\u0006\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0019\u0000\u0000\u00f0\u00f1\u0003&\u0013\u0000\u00f1\u00f2\u0005"+
		"\u001a\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00e5\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f4+\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u000e"+
		"\u0000\u0000\u00f6\u00f7\u0003$\u0012\u0000\u00f7\u00fb\u0005\u000f\u0000"+
		"\u0000\u00f8\u00fa\u0003\u0018\f\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0010\u0000\u0000"+
		"\u00ff-\u0001\u0000\u0000\u0000\u00196;BKW^do}\u0085\u008b\u00a0\u00a9"+
		"\u00ac\u00b3\u00c1\u00c8\u00cb\u00d2\u00d9\u00e1\u00e8\u00eb\u00f3\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}