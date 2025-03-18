package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

// find total count, min, max, sum, and the average

public class ListelementStatistics {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

		// Normal Method ....
		int count = (int) list.stream().count();
		double sum = list.stream().mapToDouble(x -> (double) x).sum();
		double average = sum / count;

		System.out.println("Max is : " + list.stream().max(Integer::compareTo).get());
		System.out.println("Min is : " + list.stream().min(Integer::compareTo).get());

		System.out.println("Count is : " + count);
		System.out.println("Sum is :" + sum);
		System.out.println("Average is : " + average);

		
		// Doing By Pre-build Method
		System.out.println();
		System.out.println("============= Doing By Pre-build Method ===============");
		IntSummaryStatistics status = list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(status);

	}
}
