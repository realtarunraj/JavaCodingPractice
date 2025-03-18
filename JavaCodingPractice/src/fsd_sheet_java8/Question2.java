package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(111, 2, 34, 678, 3, 112, 66, 212, 139));

		System.out.println(
				list.stream().map(x -> String.valueOf(x)).filter(x -> x.startsWith("1")).collect(Collectors.toList()));
	}
}
