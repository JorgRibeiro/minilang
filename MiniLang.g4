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
    | escrita PV
    ;

atribuicao
    : ID ATRIB expressao
    ;

escrita
    : ESCREVA ABRE_PAR expressao FECHA_PAR
    ; 

expressao
    : expressaoAritmetica (OPERADOR_RELACIONAL expressaoAritmetica)?
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
ESCREVA     : 'escreva';

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