package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 34, 678, 3));

		System.out.println(list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
	}
}