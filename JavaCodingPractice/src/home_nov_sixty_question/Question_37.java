package home_nov_sixty_question;

import java.util.stream.Collectors;

public class Question_37 {
	public static void main(String[] args) {
		String str = "sfsfsrtyebfhgttwjshydfttraspl";
		System.out.println("First Non repeted character : " + str.chars().mapToObj(x -> (char) x)
				.filter(x -> str.indexOf(x) == str.lastIndexOf(x)).collect(Collectors.toList()).get(0));

	}
}
