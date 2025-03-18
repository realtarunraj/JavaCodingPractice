package home_nov_sixty_question;

import java.util.stream.Collectors;

public class Question_33 {
	public static void main(String[] args) {
		String str = "Capgeminicapgems";

		System.out.println(str.chars().mapToObj(x -> (char) x).filter(x -> str.indexOf(x) != str.lastIndexOf(x))
				.distinct().collect(Collectors.toList()));
	}
}
