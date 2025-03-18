package extra;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
		String str = "Tarun Kumar Raj";
		char[] charArray = str.toLowerCase().toCharArray();
		
		
		
		System.out.println("========= Reversed String ==========");
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("\n");
		
		
		
		
		
		
		System.out.println("====== Character Counting ===========");
		
		Map<Character, Integer> map = new HashMap<>();
		for(char c: charArray) {
			if(c == ' ') {
				continue;
			}
			else {
				if(map.containsKey(c)) {
					map.replace(c, map.get(c)+1);
				}
				else {
					map.put(c, 1);
				}
			}
		}
		
		System.out.println(map);
	}

}
