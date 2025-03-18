package testing_16_question;

import java.util.stream.Stream;

public class Intermidiate_11 {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1, 3, 5);
		Stream<Integer> stream2 = Stream.of(9, 5, 3);
		
		Stream<Integer> finalStream = Stream.concat(stream1, stream2);
		
		finalStream.forEach(x -> System.out.println(x));
	}
}
