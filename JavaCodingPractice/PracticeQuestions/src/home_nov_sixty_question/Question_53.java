package home_nov_sixty_question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Question_53 {

	static String removeWord(String str, String key) {
		return Arrays.stream(str.split(" ")).filter(x -> !x.equals(key)).collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {
		System.out.println(removeWord("Exercises Practice Solution", "Solution")); // Output: "Exercises Practice"
		System.out.println(removeWord("Red Green Blue", "Green")); // Output: "Red Blue"
		System.out.println(removeWord("Java Number Exercises", "Java"));

	}
}
