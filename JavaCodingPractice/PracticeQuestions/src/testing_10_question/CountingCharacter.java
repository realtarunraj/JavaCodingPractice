package testing_10_question;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharacter {
	public static void main(String[] args) {
		String str = "Laptop";
		Map<Character, Long> map = str.toLowerCase().chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(map);
	}
}
