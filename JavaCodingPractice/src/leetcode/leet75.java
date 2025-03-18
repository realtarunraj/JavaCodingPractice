package leetcode;

import java.util.Arrays;

public class leet75 {
	public static String sortColors(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int temp = 0;
				if (nums[j] < nums[i]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return Arrays.toString(nums);
	}

	public static void main(String[] args) {
		int[] nums1 = { 2, 0, 2, 1, 1, 0 };
		int[] nums2 = { 2, 0, 1 };

		System.out.println(sortColors(nums1));
		System.out.println(sortColors(nums2));
	}
}
