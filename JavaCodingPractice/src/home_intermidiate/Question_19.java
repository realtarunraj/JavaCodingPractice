package home_intermidiate;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Question_19 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		IntSummaryStatistics stats = list.stream().mapToInt(x -> (int) x).summaryStatistics();

		System.out.println("count : " + stats.getCount());
		System.out.println("sum : " + stats.getSum());
		System.out.println("min : " + stats.getMin());
		System.out.println("max : " + stats.getMax());
		System.out.println("average : " + stats.getAverage());
	}
}
