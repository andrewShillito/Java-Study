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

    /**
     * non-mutative as strings are immutable
     * @return new sorted string
     * @params unsorted input String
     * */
    public static String mergeSort(String str) {
        if (str.length() <= 1) {
            return str;
        }
        int middleIndex = str.length()/2;
        String left = mergeSort(str.substring(0, middleIndex));
        String right = mergeSort(str.substring(middleIndex));
        return merge(left, right);
    }

    /**
     * used internally by String mergeSort
     * @return sorted string that combines two input strings
     * @params left/right strings to merge
     * */
    private static String merge(String left, String right) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < left.length() && j < right.length()) {
            if (left.charAt(i) < right.charAt(j)) {
                sb.append(left.charAt(i));
                i++;
            } else {
                sb.append(right.charAt(j));
                j++;
            }
        }
        while (i < left.length()) {
            sb.append(left.charAt(i));
            i++;
        }
        while (j < right.length()) {
            sb.append(right.charAt(j));
            j++;
        }
        return sb.toString();
    }

    /**
     * merge sort applied to an array of Strings
     * @return sorted array of Strings
     * @params String[] arr
     * */
    public static String[] mergeSort(String[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int middleIndex = arr.length/2;
        String[] left = mergeSort(Arrays.copyOfRange(arr, 0, middleIndex));
        String[] right = mergeSort(Arrays.copyOfRange(arr, middleIndex, arr.length));
        return merge(left, right);
    }

    /**
     * used internally by String[] mergeSort
     * @return a sorted array of Strings
     * @params left/right arrays of Strings
     * */
    private static String[] merge(String[] left, String[] right) {
        int resultLength = left.length + right.length;
        String[] result = new String[resultLength];

        int i = 0, j = 0, x = 0;
        while (i < left.length && j < right.length) {

            // handle empty strings
            if (left[i].length() == 0) {
                // take left side
                // if right is "" also this will still work
                result[x] = left[i];
                i++;
            } else if (right[j].length() == 0) {
                result[x] = right[j];
                j++;

            //handle non-empty strings
            } else {
                // loop through characters within the strings
                for (int c = 0; c < left[i].length(); c++) {
                    if (c == right[j].length()) {
                        // right is shorter and until index c left/right are identical
                        // right comes first alphabetically
                        result[x] = right[j];
                        j++;
                        break;
                    } else if (left[i].charAt(c) < right[j].charAt(c)) {
                        result[x] = left[i];
                        i++;
                        break;
                    } else {
                        result[x] = right[j];
                        j++;
                        break;
                    }
                }
            }
            x++;
        }
        // one Array is exhausted - add rest of whichever side still has values
        while (i < left.length) {
            result[x] = left[i];
            i++;
            x++;
        }
        while (j < right.length) {
            result[x] = right[j];
            j++;
            x++;
        }
        return result;
    }
}
