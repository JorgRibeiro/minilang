grammar MiniLang;


// =========================
// PARSER
// =========================

programa
    : PROGRAMA ID PV bloco PONTO EOF
    ;

bloco
    : declaracaoVariaveis? declaracaoSubrotina* INICIO comando* FIM
    ;

declaracaoVariaveis
    : VAR declaracaoVariavel+
    ;

declaracaoVariavel
    : listaIdentificadores DOIS_PONTOS tipo PV
    ;

listaIdentificadores
    : ID (VIRGULA ID)*
    ;

tipo
    : INTEIRO
    | BOOLEANO
    ;

declaracaoSubrotina
    : declaracaoProcedimento
    | declaracaoFuncao
    ;

declaracaoProcedimento
    : PROCEDIMENTO ID ABRE_PAR listaParametros? FECHA_PAR PV
      corpoSubrotina PV
    ;

declaracaoFuncao
    : FUNCAO ID ABRE_PAR listaParametros? FECHA_PAR
      DOIS_PONTOS tipo PV
      corpoSubrotina PV
    ;

listaParametros
    : parametro(VIRGULA parametro)*
    ;

parametro
    : ID DOIS_PONTOS tipo
    ;

corpoSubrotina
    : declaracaoVariaveis? INICIO comando* FIM
    ;

comando
    : atribuicao PV
    | escrita PV
    | condicional PV
    | enquanto PV
    | BREAK PV
    | CONTINUE PV
    ;

atribuicao
    : ID ATRIB expressao
    ;

escrita
    : ESCREVA ABRE_PAR expressao FECHA_PAR
    ; 

condicional
    : SE expressao ENTAO
        comando*
        (SENAO
        comando*
        )?
        FIMSE
    ;

expressao
    : expressaoAritmetica (OPERADOR_RELACIONAL expressaoAritmetica)?
    ;

expressaoAritmetica
    : termo ((MAIS | MENOS) termo)*
    ;

termo
    : fator ((MULT | DIV) fator)*
    ;

fator
    : NUMERO
    | ID
    | VERDADEIRO
    | FALSO
    | ABRE_PAR expressaoAritmetica FECHA_PAR
    ;

enquanto
    : ENQUANTO expressao FACA
        comando*
      FIMENQUANTO
    ;


// =========================
// LEXER
// =========================

PROGRAMA    : 'programa';
VAR         : 'var';
INTEIRO     : 'inteiro';
BOOLEANO    : 'booleano';
VERDADEIRO  : 'verdadeiro';
FALSO       : 'falso';
INICIO      : 'inicio';
FIM         : 'fim';
ESCREVA     : 'escreva';
SE          : 'se';
ENTAO       : 'entao';
SENAO       : 'senao';
FIMSE       : 'fimse';
ENQUANTO    : 'enquanto';
FACA        : 'faca';
FIMENQUANTO : 'fimenquanto';
BREAK    : 'break';
CONTINUE : 'continue';
PROCEDIMENTO : 'procedimento';
FUNCAO       : 'funcao';

MAIS      : '+';
MENOS     : '-';
MULT      : '*';
DIV       : '/';
ABRE_PAR  : '(';
FECHA_PAR : ')';
OPERADOR_RELACIONAL
    : '=='
    | '!='
    | '>='
    | '<='
    | '>'
    | '<'
    ;


PV          : ';';
DOIS_PONTOS : ':';
VIRGULA     : ',';
PONTO       : '.';
ATRIB       : ':=';


NUMERO
    : [0-9]+
    ;

ID
    : [a-zA-Z] [a-zA-Z0-9_]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;