package fourtyOne_fifty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question47 {
	public static void main(String[] args) {
		List<Character> list = Arrays.asList('a', 'b', 'a', 'c', 'c', 'a', 'b', 'a', 'c', 'c', 'd', 'm', 'n', 'm');

		System.out.print("Character which are duplicate in the entry are : ");
		List<Character> result = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).distinct()
				.collect(Collectors.toList());

		result.forEach(x -> System.out.print(x + " "));
	}
}
