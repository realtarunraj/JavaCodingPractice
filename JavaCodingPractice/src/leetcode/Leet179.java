package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leet179 {

    public static String largestNumber(int[] nums) {
        // Convert the numbers to Strings for comparison
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort the array with a custom comparator
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated values (a + b) and (b + a)
                String order1 = a + b;
                String order2 = b + a;
                // Descending order
                return order2.compareTo(order1);
            }
        });

        // Edge case: If the largest number is "0", the result should be "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating sorted strings
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = { 10, 2 };
        int[] nums2 = { 3, 30, 34, 5, 9 };

        System.out.println(largestNumber(nums1)); // Output: "210"
        System.out.println(largestNumber(nums2)); // Output: "9534330"
    }
}
