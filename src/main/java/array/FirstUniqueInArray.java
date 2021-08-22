package array;

public class FirstUniqueInArray {
    private static int findFirstUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{9, 2, 3, 2, 6, 6};
        int[] arr2 = new int[]{4,4,4,3};
        int[] arr3 = new int[]{4,5,1,2,0,4};
        System.out.println("::: Result 1 = " + findFirstUnique(arr1));
        System.out.println("::: Result 2 = " + findFirstUnique(arr2));
        System.out.println("::: Result 3 = " + findFirstUnique(arr3));
    }
}
