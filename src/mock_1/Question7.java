package mock_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
		System.out.println("In ascending Order :- " + ascending);

		// Reversing the same sorted order
		Collections.reverse(ascending);

		List<Integer> decending = new ArrayList<>();
		ascending.forEach(c -> decending.add(c));
		
		System.out.println("In decending Order :- " + decending);
	}
}
