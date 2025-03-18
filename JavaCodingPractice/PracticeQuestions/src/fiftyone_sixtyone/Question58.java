package fiftyone_sixtyone;

import java.util.HashMap;
import java.util.Map;

public class Question58 {
	public static void main(String[] args) {
		String str = "test strsssing";
		char[] charArray = str.toCharArray();

		int max = 0;
		char charMax = '\0';

		Map<Character, Integer> map = new HashMap<>();
		for (Character c : charArray) {
			if (c.equals(' ')) {
				continue;
			} else {
				if (map.containsKey(c)) {
					map.replace(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			
			if(map.get(c) > max) {
				max = map.get(c);
				charMax = c;
			}
		}
		
		System.out.println("The character used maximum times is : " + charMax);
	}
}
