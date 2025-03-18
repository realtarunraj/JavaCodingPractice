package home_intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 18, 2, 5, 13, 20, 23, 17, 19, 19, 23, 29);

		System.out.println(list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
	}
}
