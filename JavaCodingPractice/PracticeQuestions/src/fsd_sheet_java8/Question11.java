package fsd_sheet_java8;

import java.util.stream.Stream;

public class Question11 {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("Apple", "Banana", "Cucumber");
		Stream<String> stream2 = Stream.of("Donut", "Elaichi", "Fig");
		
		Stream<String> result = Stream.concat(stream1, stream2);
		result.forEach(x -> System.out.println(x));
	}
}
