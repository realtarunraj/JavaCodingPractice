package fiftyone_sixtyone;

import java.util.List;
import java.util.stream.Collectors;

public class Question54 {
	public static void main(String[] args) {
		String str = "abcdefabcdeabcdaaa";
		List<String> list = str.chars().mapToObj(x -> (char) x) // intStream to charStream
				.filter(x -> !x.equals('a')) // remove 'a' from the list
				.map(x -> String.valueOf(x)) // convert chars to string type
				.collect(Collectors.toList()); // collect in list

		System.out.println(String.join("", list)); // joining all characters together
	}
}
