package array;

import java.util.Arrays;

public class SumUpToNumber {
    /**
     * BruteForce Complexity O(n^2)
     */
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }

        return arr;
    }

    /**
     * Sorting Array Complexity O(n log n)
     */
    public static int[] findSumSorted(int[] arr, int n) {
        int[] original = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == n) {
                return new int[]{arr[i], arr[j]};
            } else if (arr[i] + arr[j] < n) {
                i++;
            } else {
                j--;
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 21, 3, 14, 5, 60, 7, 6};
        int value1 = 27;

        int[] arr2 = {9, 4, 7, 2, 6};
        int value2 = 17;

        int[] arr3 = {1, 21, 3, 14, 5, 60, 7, 6};
        int value3 = 81;

        int[] arr4 = {5, 11, 4, 6};
        int value4 = 10;

        System.out.println("::: Result1 = " + (Arrays.compare(findSum(arr1, value1), new int[]{21, 6})));
        System.out.println("::: Result2 = " + (Arrays.compare(findSum(arr2, value2), new int[]{9, 4, 7, 2, 6})));
        System.out.println("::: Result3 = " + (Arrays.compare(findSum(arr3, value3), new int[]{21, 60})));
        System.out.println("::: Result4 = " + (Arrays.compare(findSum(arr4, value4), new int[]{4, 6})));

        System.out.println("::: Sort Result1 = " + (Arrays.compare(findSumSorted(arr1, value1), new int[]{6, 21})));
        System.out.println("::: Sort Result2 = " + (Arrays.compare(findSumSorted(arr2, value2), new int[]{9, 4, 7, 2, 6})));
        System.out.println("::: Sort Result3 = " + (Arrays.compare(findSumSorted(arr3, value3), new int[]{21, 60})));
        System.out.println("::: Sort Result4 = " + (Arrays.compare(findSumSorted(arr4, value4), new int[]{4, 6})));
    }
}
