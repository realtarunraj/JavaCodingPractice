package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 2, 5, 4, 3, 34, 3, 3));

		System.out.println(
				list.stream().filter(x -> list.indexOf(x) == list.lastIndexOf(x)).distinct().findFirst().get());
	}
}
