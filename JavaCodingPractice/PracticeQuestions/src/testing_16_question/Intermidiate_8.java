package testing_16_question;

import java.util.List;
import java.util.stream.Collectors;

public class Intermidiate_8 {
	public static void main(String[] args) {
		String str = "Intermidiate";

		List<Character> repeated = str.toLowerCase().chars().mapToObj(x -> (char) x)
				.filter(x -> str.indexOf(x) != str.lastIndexOf(x)).distinct().collect(Collectors.toList());
		System.out.println(repeated);
		System.out.println(repeated.get(0));
	}
}
