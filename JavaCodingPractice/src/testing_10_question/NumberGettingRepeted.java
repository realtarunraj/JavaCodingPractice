package testing_10_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberGettingRepeted {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(2,3,34,5,5,4,3,3,3));
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		
		map.forEach((i, l) -> System.out.println(i + " -> " + l));
		
	}
}
