package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet350 {
	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> common = new ArrayList<>();

		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				common.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		int[] answer = new int[common.size()];
		for (int i = 0; i < common.size(); i++) {
			answer[i] = common.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		int[] nums3 = { 4, 9, 5 };
		int[] nums4 = { 9, 4, 9, 8, 4 };

		System.out.println(Arrays.toString(intersect(nums1, nums2)));
		System.out.println(Arrays.toString(intersect(nums3, nums4)));
	}
}
