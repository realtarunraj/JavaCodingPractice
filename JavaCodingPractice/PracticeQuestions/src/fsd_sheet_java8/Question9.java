package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3));
		
		System.out.print("The list in decending Order : ");
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
	}
}
