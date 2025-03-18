package home_nov_sixty_question;

import java.util.Map;
import java.util.stream.Collectors;

public class Question_5 {
	static Long occurence(String str, char c) {
		Map<Character, Long> map = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		if (map.containsKey(c)) {
			return map.get(c);
		}
		return (long) 0;
	}

	public static void main(String[] args) {
		System.out.println(occurence("Hello", 'l'));
	}
}
