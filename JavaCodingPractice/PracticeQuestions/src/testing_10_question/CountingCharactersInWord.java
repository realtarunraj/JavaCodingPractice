package testing_10_question;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharactersInWord {
	public static void main(String[] args) {

		String str = "Mississippi";
		Map<Character, Long> map = str.toLowerCase().chars().mapToObj(x -> (char) (x))
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		map.forEach((c, i) -> System.out.println(c + " -> " + i));
	}
}
