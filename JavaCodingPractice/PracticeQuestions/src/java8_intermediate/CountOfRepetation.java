package java8_intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * Find the Word/number got repeated by using Stream api
 * 
 * input:- 2,3,34,5,5,4,3,3,3 output:- 2-1,3-4,34-1,5-2,4-1
 *
 */

public class CountOfRepetation {
	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(2, 3, 34, 5, 5, 4, 3, 3, 3);
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(Integer i: input) {
//			if(map.containsKey(i)) {
//				map.replace(i, map.get(i)+1);
//			}
//			else {
//				map.put(i, 1);
//			}
//		}
//		
//		
//		System.out.println(map);

		input.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.forEach((a, b) -> System.out.println(a + " - " + b));
	}
}
