package array;

import java.util.Arrays;

public class ProductExceptCurrentIndex {
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

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{4, 2, 1, 5, 0};

        System.out.println("::: Response1 = " + Arrays.compare(findProduct(test1), new int[]{24, 12, 8, 6}));
        System.out.println("::: Response2 = " + Arrays.compare(findProduct(test2), new int[]{0, 0, 0, 0, 40}));
    }
}
