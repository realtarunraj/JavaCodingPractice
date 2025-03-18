package fsd_sheet_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

		// Count
		long count = list.stream().count();
		System.out.println(count);

		// Sum
		double sum = list.stream().mapToLong(x -> (long) (x)).sum();
		System.out.println(sum);

		// Min
		System.out.println(list.stream().min((a, b) -> a.compareTo(b)).get());

		// Max
		System.out.println(list.stream().max((a, b) -> a.compareTo(b)).get());

		// Average
		System.out.println(sum/count);
	}
}
