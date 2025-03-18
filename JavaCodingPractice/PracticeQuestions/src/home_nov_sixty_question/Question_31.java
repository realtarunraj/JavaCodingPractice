package home_nov_sixty_question;

import java.util.stream.Collectors;

public class Question_31 {
	public static void main(String[] args) {
		String str = "Capgemini";

		System.out.println(str.toLowerCase().chars().mapToObj(x -> (char) x)
				.filter(x -> str.indexOf(x) == str.lastIndexOf(x)).collect(Collectors.toList()).get(0));
	}
}
