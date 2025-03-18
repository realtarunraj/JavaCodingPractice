package leetcode;

import java.util.Map;
import java.util.stream.Collectors;

public class leet409 {

	public static int longestPalindrome(String s) {
		Map<Character, Long> map = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		int count = 0;
		boolean hasOdd = false;
		for (long val : map.values()) {
			if (val % 2 == 0) {
				count += val;
			} else {
				count += val - 1;
				hasOdd = true;
			}
		}

		return hasOdd ? count + 1 : count;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccdd"));
	}
}
