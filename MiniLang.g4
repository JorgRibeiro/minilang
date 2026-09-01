grammar MiniLang;


// =========================
// PARSER
// =========================

programa
    : PROGRAMA ID PV bloco PONTO EOF
    ;

bloco
    : declaracaoVariaveis? INICIO comando* FIM
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

comando
    : atribuicao PV
    ;

atribuicao
    : ID ATRIB expressao
    ;

expressao
    : expressaoAritmetica
    | VERDADEIRO
    | FALSO
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
    | ABRE_PAR expressaoAritmetica FECHA_PAR
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
MAIS      : '+';
MENOS     : '-';
MULT      : '*';
DIV       : '/';
ABRE_PAR  : '(';
FECHA_PAR : ')';

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