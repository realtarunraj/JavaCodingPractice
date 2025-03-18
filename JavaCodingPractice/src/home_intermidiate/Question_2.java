package home_intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 2, 5, 13, 23, 17, 19, 19, 23, 29);
		System.out.println(list.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList()));
	}
}
