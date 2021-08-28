package array;

import java.util.Arrays;

public class RearrangeSortedMaxMin {
    /**
     * Using extra space
     * Runtime Complexity = O(N)
     * Space Complexity = O(N)
     */
    private static void maxMin(int[] arr) {
        int[] aux = new int[arr.length];
        int high = arr.length - 1, low = 0;
        boolean flag = true;

        for (int i=0; i < arr.length; i++) {
            if (flag) {
                aux[i] = arr[high--];
            } else {
                aux[i] = arr[low++];
            }

            flag = !flag;
        }

        for (int i=0; i < arr.length; i++) {
            arr[i] = aux[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        maxMin(arr);
        System.out.println(Arrays.toString(arr));
    }
}