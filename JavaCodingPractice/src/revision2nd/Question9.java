package revision2nd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(46, 52, 20, 70, 21, 36, 37, 75, 59, 57, 51, 75, 37, 3, 14, 12, 90, 53, 15,
				47, 97, 1, 6, 4, 13, 57, 75, 47, 6, 70, 71, 71);

		System.out.println("Sorted List : " + list.stream().sorted().collect(Collectors.toList()));
	}
}
