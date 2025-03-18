package testing_16_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermidiate_17 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada"));
		
		String str = list.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")).trim();
		
		System.out.println(str);
	}
}
