package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question18 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(9, 10, 3, 4, 7, 3, 4));
		
		System.out.println(list.stream().distinct().map(x -> x*x).collect(Collectors.toList()));
	}
}
