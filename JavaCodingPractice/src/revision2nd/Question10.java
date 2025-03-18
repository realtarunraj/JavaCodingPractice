package revision2nd;

import java.util.stream.Collectors;

public class Question10 {
	public static void main(String[] args) {
		String str = "Capgemini";

		System.out.println(str.toLowerCase().chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting())));

	}
}
