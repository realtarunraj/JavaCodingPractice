package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet974 {
	public static int subarraysDivByK(int[] nums, int k) {
		Map<Integer, Integer> remainderCountMap = new HashMap<>();
		remainderCountMap.put(0, 1); // To handle the case where the subarray itself is divisible by k
		int sum = 0;
		int count = 0;

		for (int num : nums) {
			sum += num;
			int remainder = sum % k;

			// Handle negative remainders by converting them to positive equivalents
			if (remainder < 0) {
				remainder += k;
			}

			// If the remainder has been seen before, it means there exists a subarray
			// ending at the current index
			// which is divisible by k
			count += remainderCountMap.getOrDefault(remainder, 0);

			// Update the count of the current remainder in the map
			remainderCountMap.put(remainder, remainderCountMap.getOrDefault(remainder, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		System.out.println(subarraysDivByK(nums, k)); // Output: 7
	}
}
