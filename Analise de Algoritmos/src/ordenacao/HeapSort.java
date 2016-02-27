package ordenacao;

/**
 *
 * @author Dan Jhonatan
 */
public class HeapSort {

    public void heapSort(int vetor[]) {

        buildMaxHeap(vetor);

        int n = vetor.length;

        for (int i = vetor.length - 1; i > 0; i--) {
            swap(vetor, i, 0);
            maxHeapify(vetor, 0, --n);
        }
    }

    private void buildMaxHeap(int vetor[]) {
        for (int i = vetor.length / 2 - 1; i >= 0; i--)
            maxHeapify(vetor, i, vetor.length);

    }

    private void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor) {

        int max = 2 * pos + 1, right = max + 1;
        if (max < tamanhoDoVetor) {

            if (right < tamanhoDoVetor && vetor[max] < vetor[right])
                max = right;

            if (vetor[max] > vetor[pos]) {
                swap(vetor, max, pos);
                maxHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public void swap(int vetor[], int j, int aposJ) {
        int aux = vetor[j];
        vetor[j] = vetor[aposJ];
        vetor[aposJ] = aux;
    }
}
