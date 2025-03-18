package testing_10_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada"));

		System.out.println(list.stream().collect(Collectors.joining(", ")));
	}
}