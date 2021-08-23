package array;

import java.util.Arrays;

public class RightRotateArray {
    private static void rotateArray(int[] arr) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        rotateArray(arr);
        System.out.println("::: Result = " + Arrays.toString(arr));
    }
}
