package main;

/**
 *
 * @author Dan Jhonatan
 */
public class Numero {

    /**
     * Numeros do intervalo [ 1 a 100 ]
     *
     * @param vetor
     */
    public static void gerarNumerosAleatorios(int vetor[]) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = (int) (Math.random() * 100) + 1;
    }

    /**
     * Numeros do intervalor [ 1 a maiorValor ]
     *
     * @param vetor
     * @param maiorValor
     */
    public static void gerarNumerosAleatorios(int vetor[], int maiorValor) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = (int) (Math.random() * maiorValor) + 1;
    }

    public static void gerarNumerosCrescente(int vetor[]) {
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = i;
    }

    public static void gerarNumerosDecrescente(int vetor[]) {
        for (int i = vetor.length - 1; i >= 0; i--)
            vetor[i] = vetor.length - i;
    }

    public static int getMaiorValor(int vetor[]) {
        int maior = -999999999;

        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] > maior)
                maior = vetor[i];

        return maior;
    }

    public static void printArray(int vetor[]) {
        System.out.print("Vetor de Saída: ");
        for (int i : vetor)
            System.out.print(i + " ");
        System.out.print("\n");
    }
}
