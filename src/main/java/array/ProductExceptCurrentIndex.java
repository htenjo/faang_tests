package array;

import java.util.Arrays;

public class ProductExceptCurrentIndex {
    /**
     * This use 2 loops (brute force) to calculate the product then
     * Complexity = O(n^2)
     */
    private static int[] findProduct(int[] arr) {
        int[] productArr = new int[arr.length];
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                product *= arr[j];
            }
            productArr[i] = product;
            product = 1;
        }

        return productArr;
    }

    /**
     * This function calculate products to the left and the
     * products to the right of each element having to check the
     * whole array 2 times only,so
     * Time Complexity = O(n)
     * Space Complexity = O(n) // The new array created
     * Additional Space Complexity = O(1)
     */
    private static int[] findProductWithMemory(int[] arr) {
        int[] response = new int[arr.length];
        int temp = 1;

        for (int i = 0; i < arr.length; i++) {
            response[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            response[i] *= temp;
            temp *= arr[i];
        }

        return response;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{4, 2, 1, 5, 0};

        System.out.println("::: Response BF1 = " + Arrays.compare(findProduct(test1), new int[]{24, 12, 8, 6}));
        System.out.println("::: Response BF2 = " + Arrays.compare(findProduct(test2), new int[]{0, 0, 0, 0, 40}));

        System.out.println("::: Response MEM1 = " + Arrays.compare(findProductWithMemory(test1), new int[]{24, 12, 8, 6}));
        System.out.println("::: Response MEM2 = " + Arrays.compare(findProductWithMemory(test2), new int[]{0, 0, 0, 0, 40}));
    }
}
