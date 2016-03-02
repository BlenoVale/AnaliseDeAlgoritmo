package ordenacao;

/**
 *
 * @author BlenoVale
 */
public class BucketSort {

    public int[] sort(int[] inputArray) {

        int maxValue = maxValue(inputArray);
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            Bucket[inputArray[i]]++;
        }

        int currentIndex = 0; 
        for (int i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_sequence[currentIndex++] = i;
            }
        }

        return sorted_sequence;
    }

    private int maxValue(int[] sequence) {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > maxValue) {
                maxValue = sequence[i];
            }
        }
        return maxValue;
    }

}
