package home_nov_sixty_question;

import java.util.Map;
import java.util.stream.Collectors;

public class Question_58 {
	public static void main(String[] args) {
		char maxOccur = '\0';
		long max = 0;

		String str = "est strisssngt";
		// System.out.println(str.replaceAll("[^a-z]", ""));

		Map<Character, Long> map = str.replaceAll("[^a-z]", "").chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		char[] charArray = str.replaceAll("[^a-z]", "").toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (map.get(charArray[i]) > max) {
				max = map.get(charArray[i]);
				maxOccur = charArray[i];
			}
		}

		System.out.println(maxOccur);
	}
}
