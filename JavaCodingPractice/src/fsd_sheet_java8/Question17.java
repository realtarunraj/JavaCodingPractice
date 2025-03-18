package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question17 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada"));
		
		System.out.println(list.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")).trim());
	}
}
