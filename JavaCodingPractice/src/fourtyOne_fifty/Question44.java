package fourtyOne_fifty;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question44 {
	public static void main(String[] args) {
		String str = "crosssubsidize";

		Map<Character, Long> map = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.forEach((c, i) -> System.out.println(c + " : " + i));
	}
}
