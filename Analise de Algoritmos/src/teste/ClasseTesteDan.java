package teste;

import main.Numero;
import ordenacao.Ordenacao;

/**
 *
 * @author Dan Jhonatan
 */
public class ClasseTesteDan {

    public static void main(String[] args) {
        int vetor[] = new int[100];
        Numero.gerarNumerosAleatorios(vetor, 10000);

        Ordenacao ord = new Ordenacao();
        int maior = Numero.getMaiorValor(vetor);
        System.out.println("maior = " + maior);
        ord.countingSort(vetor, maior);

        printArray(vetor);
    }

    private static void printArray(int input[]) {
        System.out.print("Vetor de Saída: ");
        for (int i : input)
            System.out.print(i + " ");

        System.out.print("\n\n");
    }
}
