VERIFICAÇÃO DA PROPRIEDADE LL(1)

A gramática foi estruturada para permitir análise sintática descendente
preditiva com apenas um símbolo de lookahead.

1. AUSÊNCIA DE RECURSÃO À ESQUERDA

As regras de expressões não utilizam produções recursivas à esquerda.

Por exemplo, em vez de:

<expressao_aritmetica> ::=
    <expressao_aritmetica> + <termo>

foi utilizada a forma:

<expressao_aritmetica> ::=
    <termo> {<operador_aditivo> <termo>}

Da mesma forma:

<termo> ::=
    <fator> {<operador_multiplicativo> <fator>}


2. FATORAÇÃO À ESQUERDA

A atribuição e a chamada de sub-rotina possuem o mesmo prefixo,
um identificador.

Para evitar duas produções iniciadas pelo mesmo símbolo, foi utilizada
a fatoração:

<comando_identificador> ::=
    <identificador> <continuacao_identificador>

<continuacao_identificador> ::=
      := <expressao>
    | ( [<lista_argumentos>] )

Assim, após reconhecer um identificador, apenas um símbolo de
lookahead é necessário:

:=  indica uma atribuição;
(   indica uma chamada de procedimento ou função.


3. UM SÍMBOLO DE LOOKAHEAD

As alternativas principais de <comando> podem ser diferenciadas
pelo primeiro símbolo:

identificador  -> atribuição ou chamada
escreva        -> comando de impressão
se             -> comando condicional
enquanto       -> comando de repetição
break          -> desvio break
continue       -> desvio continue
retorne        -> comando de retorno

As declarações de sub-rotinas também são distinguíveis pelo
primeiro símbolo:

procedimento   -> declaração de procedimento
funcao         -> declaração de função

Os tipos são diferenciados diretamente por:

inteiro
booleano

Portanto, as decisões sintáticas da gramática podem ser realizadas
utilizando um único símbolo de lookahead.