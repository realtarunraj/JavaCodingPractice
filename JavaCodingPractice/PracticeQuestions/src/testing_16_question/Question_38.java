package testing_16_question;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question_38 {
	public static void main(String[] args) {
		List<Integer> entries = IntStream.rangeClosed(1, 100).boxed().filter(i -> i != 76 && i != 84)
				.collect(Collectors.toList());

		int i = 0;
		int count = 1;
		while (i < entries.size()) {
			if (entries.get(i) == count) {
				i++;
				count++;
			} else {
				System.out.println(count);
				count++;
			}
		}
	}
}
