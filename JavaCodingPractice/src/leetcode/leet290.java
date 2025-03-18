package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet290 {

	public static boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (map.get(pattern.charAt(i)).equals(arr[i])) {

				} else {
					return false;
				}
			} else {
				map.put(pattern.charAt(i), arr[i]);
			}
		}

		char[] charArray = pattern.toCharArray();
		Map<String, Character> charMap = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (charMap.containsKey(arr[i])) {
				if (charMap.get(arr[i]).equals(charArray[i])) {

				} else {
					return false;
				}
			} else {
				charMap.put(arr[i], charArray[i]);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
}
