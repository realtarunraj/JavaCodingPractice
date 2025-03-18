package home_intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_10 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 17, 19, 19, 23, 11, 2, 5, 13, 23, 29);

		System.out.println(list.stream().sorted((a, b) -> b - a).collect(Collectors.toList()));

	}
}
