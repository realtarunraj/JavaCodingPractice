package leetcode;

import java.util.Arrays;

public class leet66 {

	public static int[] plusOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		
		// If all number is 9, then increase the size of Array .....
		int[] newArray = new int[n+1];
		newArray[0] = 1;
		
		return newArray;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 3, 2, 1 };
		int[] arr3 = { 9 };

		System.out.println(Arrays.toString(plusOne(arr1)));
		System.out.println(Arrays.toString(plusOne(arr2)));
		System.out.println(Arrays.toString(plusOne(arr3)));
	}
}
