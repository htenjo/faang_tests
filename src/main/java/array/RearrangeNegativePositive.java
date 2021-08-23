package array;

import java.util.Arrays;

public class RearrangeNegativePositive {
    /**
     * Time Complexity = O(n)
     * Space Complexity = O(n)
     */
    private static void reArrange(int[] arr) {
        int[] aux = new int[arr.length];
        int current=0;

        for (int elem : arr) {
            if (elem < 0) {
                aux[current++] = elem;
            }
        }
        for (int elem : arr) {
            if (elem >= 0) {
                aux[current++] = elem;
            }
        }

        for(int i = 0; i < aux.length; i++) {
            arr[i] = aux[i];
        }
    }

    /**
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     */
    private static void reArrangeInPlace(int[] arr) {

    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{10, -1, 20, 4, 5, -9, -6};
        reArrange(arr1);
        System.out.println("::: Result = " + (Arrays.compare(arr1, new int[]{-1, -9, -6, 10, 20, 4, 5})) + " -> " + Arrays.toString(arr1));
    }
}
