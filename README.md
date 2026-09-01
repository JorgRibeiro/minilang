# MiniLang

## Projeto da Segunda VA

**Faculdade:** UFAPE  
**Professor:** Sérgio Mendonça  
**Alunos:** Jorge Ribeiro e Clívisson José  
**Entrega:** 2 de setembro de 2026

O projeto contém uma gramática projetada para ser LL(1) e uma implementação
da linguagem utilizando ANTLR4.

## Características da linguagem

A MiniLang suporta:

1. Declaração de variáveis dos tipos inteiro e booleano;
2. Procedimentos e funções com e sem parâmetros;
3. Atribuição;
4. Chamada de procedimentos e funções;
5. Estrutura condicional `se / senao`;
6. Laço `enquanto`;
7. Retorno de valores;
8. `break` e `continue`;
9. Impressão utilizando `escreva`;
10. Expressões aritméticas com `+`, `-`, `*` e `/`;
11. Expressões relacionais com `==`, `!=`, `>`, `>=`, `<` e `<=`.

## Estrutura

- `MiniLang.g4`: implementação da gramática em ANTLR4;
- `docs/MiniLang.bnf`: descrição formal da gramática em BNF;
- `docs/LL1.md`: justificativa das propriedades LL(1);
- `src/Main.java`: validador sintático;
- `exemplo.txt`: programa válido completo;
- `examples/`: programas propositalmente inválidos para testes;
- `Makefile`: automatização da geração, compilação e execução.

## Requisitos

O projeto utiliza:

- Java;
- ANTLR4;
- Make.

Foi desenvolvido utilizando ANTLR 4.13.2.

## Executando

Para gerar o lexer/parser, compilar e visualizar a árvore sintática:

```bash
make test
