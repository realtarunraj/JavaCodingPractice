package java8_intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberInList {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(678, 2, 3, 32);
		
		System.out.println("========== Sorted List =========");
		List<Integer> output = list.stream().filter(x -> x%2==0).collect(Collectors.toList());
		Collections.sort(output);
		System.out.println(output);
		
		System.out.println("======= Single Line Coding========");
		list.stream().filter(x -> x%2==0).forEach(System.out::println);
	}
}
