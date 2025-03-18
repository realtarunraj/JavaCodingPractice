package home_nov_sixty_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_48 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 3, 3, 65, 4, 3, 3, 2);

		System.out.println(list.stream().distinct().collect(Collectors.toList()));
	}
}
