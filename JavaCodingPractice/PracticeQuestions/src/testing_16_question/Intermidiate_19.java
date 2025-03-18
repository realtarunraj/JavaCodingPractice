package testing_16_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermidiate_19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
		
		// Total Count
		long count = list.stream().collect(Collectors.counting());
		System.out.println(count);
		
		// Min
		System.out.println(list.stream().min((a, b) -> a.compareTo(b)).get());
		
		// Max
		System.out.println(list.stream().max((a, b) -> a.compareTo(b)).get());
		
		// Sum
		double sum = list.stream().mapToInt(x -> (int)x).sum();
		System.out.println(sum);
		
		// Average
		double avg = sum/count;
		System.out.println(avg);
	}
}
