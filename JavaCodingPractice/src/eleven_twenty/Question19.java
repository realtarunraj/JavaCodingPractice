package eleven_twenty;

// Count the Vowel of the String

import java.util.HashMap;
import java.util.Map;

public class Question19 {
	public static void main(String[] args) {
		
		String str = "Computer Training";
		char[] charArray = str.toLowerCase().toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		
		for(char c : charArray){
			if(map.containsKey(c)) {
				map.replace(c, map.get(c)+1);
			}
		}
		
		System.out.println(map);
	}
}
