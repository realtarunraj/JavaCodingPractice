package java8_intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetKeyWithGreatestValue {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("aman", "tarun", "aman", "tarun", "raj", "aman", "deepak", "tarun", "aman",
				"tarun");
		Map<String, Integer> map = new HashMap<>();

		// Creating map for the words
		for (String str : list) {
			if (map.containsKey(str)) {
				map.replace(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		System.out.println(map);

		// Getting the maximum value
		int max = 0;
		for (int value : map.values()) {
			if (value > max) {
				max = value;
			}
		}

		// we will make a final value to match the values of map.
		// final does not get updated. so we can use that variable inside any loop.
		final int value = max;

		map.forEach((s, i) -> {
			if (i == value) {
				System.out.println(s);
			}
		});
	}
}
