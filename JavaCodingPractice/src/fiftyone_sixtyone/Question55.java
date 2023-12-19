package fiftyone_sixtyone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question55 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo",
				"Ivory");

		list.sort(Comparator.comparingInt(String::length));
		System.out.println("List in Ascending Order : " + list);

		Collections.reverse(list);
		System.out.println("List in Decending Order : " + list);
	}
}
