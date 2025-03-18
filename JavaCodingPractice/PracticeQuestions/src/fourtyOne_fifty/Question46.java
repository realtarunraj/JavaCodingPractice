package fourtyOne_fifty;

import java.util.HashMap;
import java.util.Map;

public class Question46 {
	public static void main(String[] args) {
		String text = "This is a sample string. It contains several words. This is a test string.";
		text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		
		
		String[] word = text.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for (String string : word) {
			if(map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}
			else {
				map.put(string, 1);
			}
		}
		
		map.forEach((c, i) -> System.out.println(c + " : " + i));
	}
}
