package teste;

import main.Numero;

/**
 *
 * @author Bleno Vale
 */
public class TesteQuickSort {

    public void quickSort(int array[], int firt, int last) {
        int index = partition(array, firt, last);
        if (firt < index - 1) {
            quickSort(array, firt, index - 1);
        }
        if (index < last) {
            quickSort(array, index, last);
        }
    }

    private int partition(int array[], int firt, int last) {
        int i = firt, j = last;
        int aux;
        int pivot = array[(firt + last) / 2];

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
