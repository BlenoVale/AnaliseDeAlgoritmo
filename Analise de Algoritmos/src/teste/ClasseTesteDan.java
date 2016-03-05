package teste;

import main.Numero;
import ordenacao.HeapSort;

/**
 *
 * @author Dan Jhonatan
 */
public class ClasseTesteDan {

    public static void main(String[] args) {
        int vetor[] = new int[100];
        Numero.gerarNumerosAleatorios(vetor);

        Numero.printArray(vetor);

        HeapSort heap = new HeapSort();
        heap.heapSort(vetor);

        Numero.printArray(vetor);

    }

}
