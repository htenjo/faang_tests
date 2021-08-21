package array;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.compare;

public class RemovingEvenNumber {
    public static int[] removeEven(int[] arr) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        return oddNumbers.stream()
                .mapToInt(x -> x)
                .toArray();
    }

    public static void main(String[] args) {
        int[] test1_empty = {};
        int[] test2_singleOdd = {1};
        int[] test3_singleEven = {2};
        int[] test4_allOdd = {1, 3, 5, 7};
        int[] test5_allEven = {0, 2, 4, 6};
        int[] test6_mix = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println("::: test1_empty = " + (removeEven(test1_empty).length == 0));
        System.out.println("::: test2_singleOdd = " + (compare(removeEven(test2_singleOdd), new int[]{1}) == 0));
        System.out.println("::: test3_singleEven = " + (removeEven(test3_singleEven).length == 0));
        System.out.println("::: test4_allOdd = " + (compare(removeEven(test4_allOdd), new int[]{1, 3, 5, 7}) == 0));
        System.out.println("::: test5_allEven = " + (removeEven(test5_allEven).length == 0));
        System.out.println("::: test6_mix = " + (compare(removeEven(test6_mix), new int[]{1, 3, 5, 7, 9}) == 0));
    }
}
