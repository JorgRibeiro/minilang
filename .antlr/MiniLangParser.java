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
		FIM=8, ESCREVA=9, SE=10, ENTAO=11, SENAO=12, FIMSE=13, MAIS=14, MENOS=15, 
		MULT=16, DIV=17, ABRE_PAR=18, FECHA_PAR=19, OPERADOR_RELACIONAL=20, PV=21, 
		DOIS_PONTOS=22, VIRGULA=23, PONTO=24, ATRIB=25, NUMERO=26, ID=27, WS=28;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_declaracaoVariaveis = 2, RULE_declaracaoVariavel = 3, 
		RULE_listaIdentificadores = 4, RULE_tipo = 5, RULE_comando = 6, RULE_atribuicao = 7, 
		RULE_escrita = 8, RULE_condicional = 9, RULE_expressao = 10, RULE_expressaoAritmetica = 11, 
		RULE_termo = 12, RULE_fator = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "declaracaoVariaveis", "declaracaoVariavel", "listaIdentificadores", 
			"tipo", "comando", "atribuicao", "escrita", "condicional", "expressao", 
			"expressaoAritmetica", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'inteiro'", "'booleano'", "'verdadeiro'", 
			"'falso'", "'inicio'", "'fim'", "'escreva'", "'se'", "'entao'", "'senao'", 
			"'fimse'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", null, "';'", "':'", 
			"','", "'.'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "INTEIRO", "BOOLEANO", "VERDADEIRO", "FALSO", 
			"INICIO", "FIM", "ESCREVA", "SE", "ENTAO", "SENAO", "FIMSE", "MAIS", 
			"MENOS", "MULT", "DIV", "ABRE_PAR", "FECHA_PAR", "OPERADOR_RELACIONAL", 
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
			setState(28);
			match(PROGRAMA);
			setState(29);
			match(ID);
			setState(30);
			match(PV);
			setState(31);
			bloco();
			setState(32);
			match(PONTO);
			setState(33);
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(35);
				declaracaoVariaveis();
				}
			}

			setState(38);
			match(INICIO);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134219264L) != 0)) {
				{
				{
				setState(39);
				comando();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
			setState(47);
			match(VAR);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				declaracaoVariavel();
				}
				}
				setState(51); 
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
			setState(53);
			listaIdentificadores();
			setState(54);
			match(DOIS_PONTOS);
			setState(55);
			tipo();
			setState(56);
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
			setState(58);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(59);
				match(VIRGULA);
				setState(60);
				match(ID);
				}
				}
				setState(65);
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
			setState(66);
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode PV() { return getToken(MiniLangParser.PV, 0); }
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				atribuicao();
				setState(69);
				match(PV);
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				escrita();
				setState(72);
				match(PV);
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				condicional();
				setState(75);
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLangParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(MiniLangParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(ATRIB);
			setState(81);
			expressao();
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
		enterRule(_localctx, 16, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ESCREVA);
			setState(84);
			match(ABRE_PAR);
			setState(85);
			expressao();
			setState(86);
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
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SE);
			setState(89);
			expressao();
			setState(90);
			match(ENTAO);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134219264L) != 0)) {
				{
				{
				setState(91);
				comando();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(97);
				match(SENAO);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134219264L) != 0)) {
					{
					{
					setState(98);
					comando();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
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
		public TerminalNode VERDADEIRO() { return getToken(MiniLangParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MiniLangParser.FALSO, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAR:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				expressaoAritmetica();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERADOR_RELACIONAL) {
					{
					setState(109);
					match(OPERADOR_RELACIONAL);
					setState(110);
					expressaoAritmetica();
					}
				}

				}
				break;
			case VERDADEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(VERDADEIRO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(FALSO);
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
		enterRule(_localctx, 22, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			termo();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIS || _la==MENOS) {
				{
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==MAIS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				termo();
				}
				}
				setState(124);
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
		enterRule(_localctx, 24, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			fator();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				fator();
				}
				}
				setState(132);
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
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FECHA_PAR() { return getToken(MiniLangParser.FECHA_PAR, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(ID);
				}
				break;
			case ABRE_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(ABRE_PAR);
				setState(136);
				expressaoAritmetica();
				setState(137);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001%\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u00022\b"+
		"\u0002\u000b\u0002\f\u00023\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004>\b"+
		"\u0004\n\u0004\f\u0004A\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t]\b\t\n\t\f\t`\t\t\u0001\t\u0001\t\u0005\td"+
		"\b\t\n\t\f\tg\t\t\u0003\ti\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\np\b\n\u0001\n\u0001\n\u0003\nt\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000by\b\u000b\n\u000b\f\u000b|\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0081\b\f\n\f\f\f\u0084\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u008c\b\r\u0001\r\u0000\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0003"+
		"\u0001\u0000\u0003\u0004\u0001\u0000\u000e\u000f\u0001\u0000\u0010\u0011"+
		"\u008f\u0000\u001c\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b:\u0001"+
		"\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000"+
		"\u000eO\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012X"+
		"\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016u\u0001\u0000"+
		"\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u008b\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005\u001b\u0000"+
		"\u0000\u001e\u001f\u0005\u0015\u0000\u0000\u001f \u0003\u0002\u0001\u0000"+
		" !\u0005\u0018\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000"+
		"\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&*\u0005\u0007\u0000\u0000"+
		"\')\u0003\f\u0006\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\b\u0000\u0000.\u0003\u0001"+
		"\u0000\u0000\u0000/1\u0005\u0002\u0000\u000002\u0003\u0006\u0003\u0000"+
		"10\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0005\u0001\u0000\u0000\u000056\u0003"+
		"\b\u0004\u000067\u0005\u0016\u0000\u000078\u0003\n\u0005\u000089\u0005"+
		"\u0015\u0000\u00009\u0007\u0001\u0000\u0000\u0000:?\u0005\u001b\u0000"+
		"\u0000;<\u0005\u0017\u0000\u0000<>\u0005\u001b\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@\t\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0007\u0000\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0003\u000e"+
		"\u0007\u0000EF\u0005\u0015\u0000\u0000FN\u0001\u0000\u0000\u0000GH\u0003"+
		"\u0010\b\u0000HI\u0005\u0015\u0000\u0000IN\u0001\u0000\u0000\u0000JK\u0003"+
		"\u0012\t\u0000KL\u0005\u0015\u0000\u0000LN\u0001\u0000\u0000\u0000MD\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000"+
		"N\r\u0001\u0000\u0000\u0000OP\u0005\u001b\u0000\u0000PQ\u0005\u0019\u0000"+
		"\u0000QR\u0003\u0014\n\u0000R\u000f\u0001\u0000\u0000\u0000ST\u0005\t"+
		"\u0000\u0000TU\u0005\u0012\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u0013"+
		"\u0000\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0003"+
		"\u0014\n\u0000Z^\u0005\u000b\u0000\u0000[]\u0003\f\u0006\u0000\\[\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_h\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ae\u0005\f\u0000\u0000bd\u0003\f\u0006\u0000cb\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000ha\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0005\r\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lo\u0003\u0016\u000b"+
		"\u0000mn\u0005\u0014\u0000\u0000np\u0003\u0016\u000b\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pt\u0001\u0000\u0000\u0000qt\u0005"+
		"\u0005\u0000\u0000rt\u0005\u0006\u0000\u0000sl\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0015\u0001\u0000"+
		"\u0000\u0000uz\u0003\u0018\f\u0000vw\u0007\u0001\u0000\u0000wy\u0003\u0018"+
		"\f\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0017\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}\u0082\u0003\u001a\r\u0000~\u007f\u0007\u0002"+
		"\u0000\u0000\u007f\u0081\u0003\u001a\r\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0019\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u008c\u0005\u001a\u0000"+
		"\u0000\u0086\u008c\u0005\u001b\u0000\u0000\u0087\u0088\u0005\u0012\u0000"+
		"\u0000\u0088\u0089\u0003\u0016\u000b\u0000\u0089\u008a\u0005\u0013\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000\u0000"+
		"\u0000\u008c\u001b\u0001\u0000\u0000\u0000\r$*3?M^ehosz\u0082\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}