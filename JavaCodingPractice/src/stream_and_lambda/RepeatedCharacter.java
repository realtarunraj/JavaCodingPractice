package stream_and_lambda;

import java.util.stream.Collectors;

public class RepeatedCharacter {
	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";
		System.out.println(
				input.toLowerCase()
				.chars()
				.mapToObj(x -> (char) x)
				.filter(x -> input.indexOf(x) != input.lastIndexOf(x))
				.distinct()
				.filter(x -> x !=' ')
				.collect(Collectors.toList())
				);
	}
}
