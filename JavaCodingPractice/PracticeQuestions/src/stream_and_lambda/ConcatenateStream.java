package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStream {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Ball", "Cat"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Dog", "Elephant", "Fish"));

		Stream<String> stream = Stream.concat(list1.stream(), list2.stream());

		List<String> concatenatedList = stream.collect(Collectors.toList());
		System.out.println(concatenatedList);
	}
}
