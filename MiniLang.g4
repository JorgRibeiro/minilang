grammar MiniLang;


// =========================
// PARSER
// =========================

programa
    : PROGRAMA ID PV bloco PONTO EOF
    ;

bloco
    : declaracaoVariaveis? INICIO FIM
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


// =========================
// LEXER
// =========================

PROGRAMA : 'programa';
VAR      : 'var';
INTEIRO  : 'inteiro';
BOOLEANO : 'booleano';
INICIO   : 'inicio';
FIM      : 'fim';

PV          : ';';
DOIS_PONTOS : ':';
VIRGULA     : ',';
PONTO       : '.';

ID
    : [a-zA-Z] [a-zA-Z0-9_]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;