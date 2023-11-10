package fiftyone_sixtyone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Question51 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("aman", "tarun", "aman", "raj", "aman", "deepak", "aman", "tarun");
		Map<String, Integer> map = new HashMap<>();

		for (String str : list) {
			if (map.containsKey(str)) {
				map.replace(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
	}
}
