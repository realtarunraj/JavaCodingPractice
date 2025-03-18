package leetcode;

import java.util.Arrays;

public class leet1296 {
	public static boolean isPossibleDivide(int[] nums, int k) {
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11 };
		// System.out.println(isPossibleDivide(arr, 3));
		
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
