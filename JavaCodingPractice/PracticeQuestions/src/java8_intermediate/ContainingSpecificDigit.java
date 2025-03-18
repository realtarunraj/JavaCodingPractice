package java8_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Fetch the count of total values which contain 4 in them:
 * [405,123,222,409,104,345]
 * 
 */

public class ContainingSpecificDigit {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(405, 123, 222, 409, 104, 345);

		List<Integer> listString = list.stream().filter(c -> String.valueOf(c).contains("4"))
				.collect(Collectors.toList());

		System.out.println(listString);
		System.out.println("Items contains 4 is equals to " + listString.size());
	}
}
