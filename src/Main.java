import org.antlr.v4.runtime.*;

public class Main {

    private static class ErroListener extends BaseErrorListener {
        private boolean possuiErro = false;

        @Override
        public void syntaxError(
                Recognizer<?, ?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String msg,
                RecognitionException e) {

            possuiErro = true;

            System.err.printf(
                "Erro sintático na linha %d, coluna %d: %s%n",
                line,
                charPositionInLine,
                msg
            );
        }

        public boolean possuiErro() {
            return possuiErro;
        }
    }

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("Uso: java Main <arquivo>");
            return;
        }

        CharStream input = CharStreams.fromFileName(args[0]);

        MiniLangLexer lexer = new MiniLangLexer(input);

        ErroListener errosLexer = new ErroListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errosLexer);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniLangParser parser = new MiniLangParser(tokens);

        ErroListener errosParser = new ErroListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errosParser);

        parser.programa();

        if (errosLexer.possuiErro() || errosParser.possuiErro()) {
            System.out.println("Programa sintaticamente inválido.");
        } else {
            System.out.println("Programa sintaticamente válido.");
        }
    }
}
