package ordenacao;

/**
 *
 * @author Bleno Vale
 */
public class QuickSort {

    private int array[];
    private int length;

    /**
     * Retorna caso o inputArray for nulo Aplica o Algoritmo quick sort caso o
     * inputArray não seja nulo.
     *
     * @param inputArray array de entrada
     */
    public void sort(int inputArray[]) {
        if (inputArray == null || inputArray.length == 0) {
            return;
        }
        this.array = inputArray;
        this.length = inputArray.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;

        //Escolhe o elemento pivor, nesse caso é o elemento do meio do Vetor.
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        //Divide em dois vetores
        while (i <= j) {

            /*
             Em cada interação identifica se o número da esquerda é maior que o pivor, e 
             também identifica se o número da direita é menor que o pivor. Caso as condiçoes
             sejam verdadeiras os números são trocados.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                // troca  a pocição dos elementos.
                exchangeNumbers(i, j);
                //move o indice para a próxima posição.
                i++;
                j--;
            }
        }

        // chama o recursivamente o método quicksort agora para cada metade do vetor
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
