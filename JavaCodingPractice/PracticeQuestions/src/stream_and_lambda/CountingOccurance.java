package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingOccurance {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3));
		List<String> list2 = new ArrayList<>(
				Arrays.asList("Tarun", "Deepak", "Mugdha", "Mugdha", "Tarun", "Nirnoy", "Mugdha"));

		list1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.forEach((a, b) -> System.out.println(a + " : " + b));

		System.out.println("======================");

		list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach(((a, b) -> System.out.println(a + " : " + b)));

	}
}
