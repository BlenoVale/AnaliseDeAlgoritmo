package main;

/**
 *
 * @author Dan Jhonatan
 */
public class Numero {

    /**
     * Maior valor = 1000
     *
     * @param vetor
     */
    public static void gerarNumerosAleatorios(int vetor[]) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = (int) (Math.random() * 1000);
    }

    public static void gerarNumerosAleatorios(int vetor[], int maiorValor) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = (int) (Math.random() * maiorValor);
    }

    public static void gerarNumerosCrescente(int vetor[]) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = i;
    }

    public static void gerarNumerosDecrescente(int vetor[]) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = vetor.length - i;
    }

    public static int getMaiorValor(int vetor[]) {
        int maior = -999999999;

        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] > maior)
                maior = vetor[i];

        return maior;
    }
}
