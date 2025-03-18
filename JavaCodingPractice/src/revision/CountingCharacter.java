package revision;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingCharacter {
	public static void main(String[] args) {
		String str = "Capgemini";
		Map<Character, Long> characterCount = str.toLowerCase().chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		characterCount.forEach((c, n) -> System.out.println(c + " - " + n));
	}
}
