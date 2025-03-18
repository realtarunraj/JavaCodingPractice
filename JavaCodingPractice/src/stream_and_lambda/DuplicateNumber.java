package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 8, 5, 2, 11, 12, 17, 19, 17, 8));
		System.out.println(
				list.stream().filter(x -> list.indexOf(x) == list.lastIndexOf(x)).collect(Collectors.toList()));
	}
}
