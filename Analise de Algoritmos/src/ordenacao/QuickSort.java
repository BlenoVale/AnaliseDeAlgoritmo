package ordenacao;

import java.util.Random;

/**
 *
 * @author Bleno Vale
 */
public class QuickSort {

    Random rand = new Random();

    /**
     *
     * @param inputArray array de entrada
     */
    public void sort(int inputArray[]) {

        long inicio = System.currentTimeMillis();
        quickSort(inputArray, 0, inputArray.length - 1);
        long fim = System.currentTimeMillis();
        System.out.println("tempo>> " + (fim - inicio));

    }

    private void quickSort(int array[], int firt, int last) {
        int index = partition(array, firt, last);
        if (firt < index - 1) {  
            quickSort(array, firt, index - 1);
        }
        if (index < last) {
            quickSort(array, index, last);
        }
    }

    private int partition(int array[], int first, int last) {
        int i = first;
        int j = last;
        int aux;

//        int pivot = array[(firt + last) / 2];
        int indice = rand.nextInt(last - first) + first;
        int pivot = array[indice];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        return i;
    }
}
