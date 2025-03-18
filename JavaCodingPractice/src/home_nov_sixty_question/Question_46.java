package home_nov_sixty_question;

import java.util.HashMap;
import java.util.Map;

public class Question_46 {
	public static void main(String[] args) {
		String text = "This is a sample string. It contains several words. This is a test string.";

		String[] strArray = text.toLowerCase().replaceAll("^[A-Za-z ]", "").split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < strArray.length; i++) {
			if (map.containsKey(strArray[i])) {
				map.put(strArray[i], map.get(strArray[i]) + 1);
			} else {
				map.put(strArray[i], 1);
			}
		}

		map.forEach((a, b) -> System.out.println(a + " : " + b));
	}
}
