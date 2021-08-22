package array;

public class MinimumValue {
    private static int findMinimum(int[] arr) {
        int minimum = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < minimum) {
                minimum = i;
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        int[] arr0 = new int[]{0};
        int[] arr1 = new int[]{9, 2, 3, 6};
        int[] arr2 = new int[]{9, -2, 3, 6};

        System.out.println("::: Min Value0 = " + findMinimum(arr0));
        System.out.println("::: Min Value1 = " + findMinimum(arr1));
        System.out.println("::: Min Value2 = " + findMinimum(arr2));
    }
}
