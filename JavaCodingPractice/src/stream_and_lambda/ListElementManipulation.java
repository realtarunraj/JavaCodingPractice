package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListElementManipulation {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(9, 10, 3, 4, 7, 3, 4));
		System.out.println(list.stream().map(x -> x * x).sorted().distinct().collect(Collectors.toList()));

	}
}