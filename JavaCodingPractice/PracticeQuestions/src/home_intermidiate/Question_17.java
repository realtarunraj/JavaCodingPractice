package home_intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_17 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		System.out.print(list.stream().collect(Collectors.joining(", ")));
	}
}
