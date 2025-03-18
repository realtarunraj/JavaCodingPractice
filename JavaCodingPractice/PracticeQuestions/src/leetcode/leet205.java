package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leet205 {

	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i)) == t.charAt(i)) {
				} else {
					return false;
				}
			} else {
				map.put(s.charAt(i), t.charAt(i));
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		System.out.println(isIsomorphic(s, t));
	}
}
