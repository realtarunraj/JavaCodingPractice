package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3));

		System.out.println(list.stream().findFirst().get());
	}
}
