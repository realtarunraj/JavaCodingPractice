package testing_16_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermidiate_18 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(9, 10, 3, 4, 7, 3, 4));
		
		
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		System.out.println(list.stream().distinct().map(x -> x*x).collect(Collectors.toList()));
	}
}
