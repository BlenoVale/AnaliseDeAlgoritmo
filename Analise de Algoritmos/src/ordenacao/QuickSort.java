package ordenacao;

import java.util.Random;

/**
 *
 * @author Bleno Vale
 */
public class QuickSort {

    private int array[];
    private int length;
    Random rand = new Random();

    /**
     *
     * @param inputArray array de entrada
     */
    public void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;

        long start = System.currentTimeMillis();
        quickSort(0, length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("\n");
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        if (array == null || array.length == 0) {
            return;
        }
        if (lowerIndex >= higherIndex) {
            return;
        }
        
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[rand.nextInt(higherIndex)];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

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

//     private void quickSort(int lowerIndex, int higherIndex) {
//        int i = lowerIndex;
//        int j = higherIndex;
//
//        //Escolhe o elemento pivor, nesse caso é o elemento do meio do Vetor.
//        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
//        //Escolhe o elemento pivor, nesse caso é o elemento aleatório.
//        int pivot = array[new Random().nextInt(higherIndex)];
//
//        //Divide em dois vetores
//        while (i <= j) {
//
//            /*
//             Em cada interação identifica se o número da esquerda é maior que o pivor, e 
//             também identifica se o número da direita é menor que o pivor. Caso as condiçoes
//             sejam verdadeiras os números são trocados.
//             */
//            while (array[i] < pivot) {
//                i++;
//            }
//            while (array[j] > pivot) {
//                j--;
//            }
//
//            if (i <= j) {
//                // troca  a pocição dos elementos.
//                exchangeNumbers(i, j);
//                //move o indice para a próxima posição.
//                i++;
//                j--;
//            }
//        }
//
//        // chama o recursivamente o método quicksort agora para cada metade do vetor
//        if (lowerIndex < j) {
//            quickSort(lowerIndex, j);
//        }
//        if (i < higherIndex) {
//            quickSort(i, higherIndex);
//        }
//    }
}
