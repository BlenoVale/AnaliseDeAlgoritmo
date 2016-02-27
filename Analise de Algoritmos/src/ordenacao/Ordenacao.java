package ordenacao;

import ordenacao.HeapSort;

/**
 * Classe facade
 *
 * @author Dan Jhonatan
 */
public class Ordenacao {

    private HeapSort heap = new HeapSort();

    // Qualquer outro mehtodo interno que nao seja algoritmo de ordenacaoh deve ser private
    public void quickSort() {
    }

    public void heapsort(int vetor[]) {
        heap.heapSort(vetor);
    }

    public void countingSort() {
    }

    public void radixSort() {
    }

    public void bucketSort() {
    }
}
