package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leet2418 {

	public static String[] sortPeople(String[] names, int[] heights) {
		Map<Integer, String> mapHeight = new HashMap<>();
		for (int i = 0; i < heights.length; i++) {
			mapHeight.put(heights[i], names[i]);
		}

		Arrays.sort(heights);
		String[] answer = new String[heights.length];

		for (int i = 0; i < heights.length; i++) {
			answer[heights.length - 1 - i] = mapHeight.get(heights[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] names1 = { "Mary", "John", "Emma" };
		String[] names2 = { "Alice", "Bob", "Bob" };
		int[] height1 = { 180, 165, 170 };
		int[] height2 = { 155, 185, 150 };

		System.out.println(Arrays.toString(sortPeople(names1, height1)));
		System.out.println(Arrays.toString(sortPeople(names2, height2)));
	}
}
