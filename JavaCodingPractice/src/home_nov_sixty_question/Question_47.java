package home_nov_sixty_question;

import java.util.stream.Collectors;

public class Question_47 {
	public static void main(String[] args) {
		char[] charArray = { 'a', 'b', 'a', 'c' };

		// Transforming array to string ...
		String str = new String(charArray);

		System.out.println(str.chars().mapToObj(x -> (char) x).filter(x -> str.indexOf(x) != str.lastIndexOf(x))
				.distinct().collect(Collectors.toList()));
	}
}
