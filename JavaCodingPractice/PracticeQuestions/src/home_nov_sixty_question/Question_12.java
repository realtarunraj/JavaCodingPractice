package home_nov_sixty_question;

import java.util.Arrays;

public class Question_12 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 6, 1, 0 };
		Arrays.sort(array);

		System.out.println(array[array.length - 2]);
	}
}
