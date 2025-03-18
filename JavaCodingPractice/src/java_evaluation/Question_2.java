package java_evaluation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Sort using Stream API

public class Question_2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 1);

		System.out.println(list.stream().sorted().collect(Collectors.toList()));
	}
}
