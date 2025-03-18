package home_intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_18 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

		System.out.println(list.stream().sorted().distinct().map(x -> x * x).collect(Collectors.toList()));
	}
}
