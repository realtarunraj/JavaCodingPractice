package home_intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		System.out.println(list.stream().sorted().collect(Collectors.toList()));
	}
}
