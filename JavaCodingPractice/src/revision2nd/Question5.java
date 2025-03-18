package revision2nd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(46, 52, 20, 70, 21, 36, 37, 75, 59, 57, 51, 75, 37, 3, 14, 12, 90, 53, 15,
				47, 97, 1, 6, 4, 13, 57, 75, 47, 6, 70, 71, 71);
		System.out.println("Total number of element : " + list.stream().count());
		System.out.println("Total number of distinct element : " + list.stream().distinct().count());
		System.out.println("Total number of repeated element : "
				+ list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).count());
		System.out.println("Element which are repeated : " + list.stream()
				.filter(x -> list.indexOf(x) != list.lastIndexOf(x)).distinct().collect(Collectors.toList()));
		System.out.println("Element which occered only once : " + list.stream()
				.filter(x -> list.indexOf(x) == list.lastIndexOf(x)).distinct().collect(Collectors.toList()));

	}
}
