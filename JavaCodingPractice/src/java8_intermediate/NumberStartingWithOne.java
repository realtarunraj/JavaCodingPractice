package java8_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 11, 34, 678, 3, 15);
		
		List<Integer> listOfNumberStartingWithOne = list.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(listOfNumberStartingWithOne);
	}
}
