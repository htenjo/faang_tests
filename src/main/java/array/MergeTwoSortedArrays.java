package array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    /**
     * Complexity = O(n + m)
     */
    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i=0, j=0, current=0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[current++] = arr1[i++];
            } else {
                result[current++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[current++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[current++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};

        System.out.println("::: Result = " + Arrays.compare(mergeArrays(arr1, arr2), new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
