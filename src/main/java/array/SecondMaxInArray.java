package array;

import java.util.Arrays;

public class SecondMaxInArray {
    /**
     * Sorting and then just finding then last-1 position
     * Complexity = O(n.lg n)
     */
    private static int findSecondMaximum(int[] arr) {
        Arrays.sort(arr);

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }

        return arr[0];
    }

    /**
     * Searching the max value and then searching the max value
     * lower than max
     * Complexity = O(n)
     */
    private static int findSecondMaximum2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 = max;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        for (int i : arr) {
            if (i > max2 && i != max) {
                max2 = i;
            }
        }

        return max2;
    }

    private static int findSecondMaximum3(int[] arr) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max2 = max;
                max = i;
            }

            if (i >= max2 && i < max) {
                max2 = i;
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{9, 2, 3, 6};
        int[] arr2 = new int[]{4, 2, 1, 5, 0};

        System.out.println("::: Result1-1 = " + findSecondMaximum(Arrays.copyOfRange(arr1, 0, arr1.length)));
        System.out.println("::: Result1-2 = " + findSecondMaximum(Arrays.copyOfRange(arr2, 0, arr2.length)));

        System.out.println("::: Result2-1 = " + findSecondMaximum2(Arrays.copyOfRange(arr1, 0, arr1.length)));
        System.out.println("::: Result2-2 = " + findSecondMaximum2(Arrays.copyOfRange(arr2, 0, arr2.length)));

        System.out.println("::: Result3-1 = " + findSecondMaximum3(Arrays.copyOfRange(arr1, 0, arr1.length)));
        System.out.println("::: Result3-2 = " + findSecondMaximum3(Arrays.copyOfRange(arr2, 0, arr2.length)));
    }
}
