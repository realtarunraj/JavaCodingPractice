package java8_intermediate;

import java.util.HashMap;
import java.util.Map;

public class GetKeyWithGreatestValue {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("aman", "delhi");
		map.put("tarun", "bihar");
		
		String str= "bihar";
		
		map.forEach((s1, s2) -> {
			if(s2 == str) {
				System.out.println(s1);
			}
		});
	}
}
