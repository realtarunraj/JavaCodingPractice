package revision2nd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(62, 2, 56, 54, 38, 81, 56, 30, 84, 73, 94, 32, 43, 100, 16, 37, 67, 21, 23,
				32);

		System.out.println(
				list.stream() // Stream starts
				.map(x -> String.valueOf(x)) // change each to string
				.filter(x -> x.startsWith("1")) // filter accordingly
				.map(x -> Integer.valueOf(x)) // map again to integer
				.collect(Collectors.toList())); //collect as list
	}
}
