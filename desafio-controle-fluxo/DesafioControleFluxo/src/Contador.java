public class Contador {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Erro: Informe exatamente dois números inteiros como parâmetros.");
            return;
        }

        try {
            int numeroInicial = Integer.parseInt(args[0]);
            int numeroFinal = Integer.parseInt(args[1]);

            if (numeroInicial >= numeroFinal) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println("Imprimindo o número " + i);
            }

            int quantidade = numeroFinal - numeroInicial + 1;
            System.out.println("Total de números impressos: " + quantidade);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Os parâmetros devem ser números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
