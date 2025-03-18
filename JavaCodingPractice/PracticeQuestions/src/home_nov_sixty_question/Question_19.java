package home_nov_sixty_question;

import java.util.stream.Collectors;

public class Question_19 {
	public static void main(String[] args) {
		String str = "Capgemini training";

		System.out.println(str.toLowerCase().chars().mapToObj(x -> (char) x)
				.filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
				.collect(Collectors.groupingBy(x -> x, Collectors.counting())));
	}
}
