grammar MiniLang;


// =========================
// PARSER
// =========================

programa
    : PROGRAMA ID PV bloco PONTO EOF
    ;

bloco
    : INICIO FIM
    ;


// =========================
// LEXER
// =========================

PROGRAMA : 'programa';
INICIO   : 'inicio';
FIM      : 'fim';

PV       : ';';
PONTO    : '.';

ID
    : [a-zA-Z] [a-zA-Z0-9_]*
    ;

WS
    : [ \t\r\n]+ -> skip
    ;