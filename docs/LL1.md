VERIFICAÇÃO DA PROPRIEDADE LL(1)

A gramática foi estruturada para permitir análise sintática descendente
preditiva com apenas um token de lookahead.

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

Dessa forma, a gramática não possui recursão à esquerda, encontra-se
fatorada nos casos de prefixo comum e suas decisões sintáticas podem
ser realizadas utilizando um único token de lookahead, caracterizando
a gramática proposta como LL(1).

4. VERIFICAÇÃO DE CONFLITOS FIRST/FOLLOW

Nas regras com alternativas, os conjuntos de tokens que podem iniciar
cada alternativa são distintos.

Para <comando>:

FIRST(<comando_identificador>) = { identificador }
FIRST(<comando_escrita>)       = { escreva }
FIRST(<comando_condicional>)    = { se }
FIRST(<comando_enquanto>)       = { enquanto }
FIRST(break)                    = { break }
FIRST(continue)                 = { continue }
FIRST(<comando_retorno>)        = { retorne }

Portanto, não existe conflito FIRST/FIRST entre as alternativas de
<comando>.

Para <declaracao_subrotina>:

FIRST(<declaracao_procedimento>) = { procedimento }
FIRST(<declaracao_funcao>)       = { funcao }

Também não há conflito FIRST/FIRST.

Na regra:

<continuacao_identificador> ::=
      := <expressao>
    | ( [<lista_argumentos>] )

as alternativas começam pelos tokens distintos ':=' e '('.

Os elementos opcionais também podem ser determinados com um único
token de lookahead. Por exemplo:

- após '(' em uma declaração de sub-rotina, um identificador indica
  a presença de parâmetros, enquanto ')' indica lista vazia;

- após '(' em uma chamada, um token que inicia uma expressão indica
  a presença de argumentos, enquanto ')' indica lista vazia;

- após os comandos do bloco 'entao', 'senao' indica a existência do
  ramo alternativo, enquanto 'fimse' encerra o comando condicional;

- após as declarações opcionais de variáveis, 'var' inicia a seção de
  variáveis, enquanto 'procedimento', 'funcao' ou 'inicio' permitem
  seguir para a próxima parte do bloco.

Assim, nos pontos em que há alternativas, repetições ou elementos
opcionais, o token seguinte permite decidir unicamente qual produção
deve ser utilizada.