package home_nov_sixty_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_38 {

	static List<Integer> isMissing(int[] arr, int range) {

		List<Integer> list = new ArrayList<>();

		Arrays.sort(arr);

		int i = 0;
		int number = 1;
		while (number < range) {
			if (i < arr.length && arr[i] == number) {
				i++;
				number++;
				continue;
			} else {
				list.add(number);
				number++;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 7, 10, 50, 75 };
		System.out.println(isMissing(arr, 100));
	}
}
