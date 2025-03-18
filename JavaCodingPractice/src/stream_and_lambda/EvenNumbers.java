package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 8, 5, 7, 11, 12, 17, 19, 23, 26));
		List<Integer> evenNumber = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		
		System.out.println(evenNumber);
	}
}
