package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet1636 {
	public static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> numberCount = new HashMap<>();
		for (int n : nums) {
			if (numberCount.containsKey(n)) {
				numberCount.replace(n, numberCount.get(n) + 1);
			} else {
				numberCount.put(n, 1);
			}
		}

		int[] object = new int[numberCount.size()];
		

		return nums;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 1, 2, 2, 2, 3 };
		int[] nums2 = { 2, 3, 1, 3, 2 };
		int[] nums3 = { -1, 1, -6, 4, 5, -6, 1, 4, 1 };
	}
}
