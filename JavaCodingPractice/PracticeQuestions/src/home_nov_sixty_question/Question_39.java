package home_nov_sixty_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_39 {

	static List<Integer> smallestLargest(int[] arr) {

		Arrays.sort(arr);

		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		list.add(arr[arr.length - 1]);

		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 8, 9, 10, 44, 79, 01, 77 };
		System.out.println(smallestLargest(arr));
	}
}
