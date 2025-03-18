package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 8, 5, 7, 11, 12, 17, 19, 23, 26));

		System.out.println(list.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList()));

	}
}
