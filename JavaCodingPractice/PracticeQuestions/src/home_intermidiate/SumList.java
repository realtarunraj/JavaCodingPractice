package home_intermidiate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumList {
	public static void main(String[] args) {
		// List of integers
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 2, 5, 13, 23, 17, 19, 19, 23, 29));

		// Calculate sum using reduce
		int sum = list.stream().reduce(0, Integer::sum); // Accumulate the sum starting with 0

		// Print the result
		System.out.println("Sum: " + sum);
	}
}
