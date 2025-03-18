package revision2nd;

import java.util.Arrays;
import java.util.List;


// Sum of these numbers ...
public class Question4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(46, 52, 20, 70, 21, 36, 37, 75, 59, 57, 51, 75, 37, 3, 14, 12, 90, 53, 15,
				47, 97, 1, 6, 4, 13, 57, 75, 47, 6, 70, 71, 71);
		
		System.out.println(list.stream().findFirst().get()); // First element
		System.out.println((list.stream().mapToInt(x -> (int)x)).sum()); // Sum of Elements
	}
}
