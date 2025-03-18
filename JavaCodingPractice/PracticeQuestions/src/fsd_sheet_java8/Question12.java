package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question12 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cucumber", "Donut", "Elaichi", "Fig"));
		
		System.out.println(list.stream().filter(x -> x.length()>5).collect(Collectors.toList()));
	}
}
