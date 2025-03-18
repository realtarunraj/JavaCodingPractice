package testing_16_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2,4,0,1,56,23,4));
		// Using New ArrayList because ArrayList is mutable.
		
		List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
		System.out.println((ascending));
	}
}
