package home_nov_sixty_question;

import java.util.Arrays;
import java.util.List;

public class Question_7 {

	static List<Integer> sortedList(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		// list.sort((a, b) -> b - a); .... by sorted method
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 0, 1, 56, 23, 4);
		System.out.println("Ascending Order : " + sortedList(list));
	}
}
