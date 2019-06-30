package Main;

import java.util.Arrays;

public class Sort {

    /**
     * @return recursively sorts Array of int using merge sort algorithm
     * @param arr Array of int
     * mutates input
     * */
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middleIndex = arr.length/2; // int division round down
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, middleIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr, middleIndex, arr.length));
        return merge(left, right);
    }

    /**
     * used internally by int[] mergeSort
     * @return a sorted array
     * @ int[] left, int[] right
     * */
    private static int[] merge (int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0, j = 0, x = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[x] = left[i];
                i++;
            } else {
                arr[x] = right[j];
                j++;
            }
            x++;
        }
        while (i < left.length) {
            arr[x] = left[i];
            i++;
            x++;
        }
        while (j < right.length) {
            arr[x] = right[j];
            j++;
            x++;
        }
        return arr;
    }

}
