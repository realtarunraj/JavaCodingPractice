package java8_intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrderInJava8 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,12,3,4,15,6,17,88,9,10);
		
		List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
		System.out.println("In ascending Order :- " + ascending);
		
		
		// Reverse the Ascending Order ........
		Collections.reverse(ascending);
		
		List<Integer> decending = new ArrayList<>();
		ascending.forEach(e -> decending.add(e));
		
		System.out.println("In decending Order :- " + decending);
		
	}
}
