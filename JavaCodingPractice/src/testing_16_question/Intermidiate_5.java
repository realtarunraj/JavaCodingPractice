package testing_16_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermidiate_5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2,3,34,5,5,4,3,3,3));
		
		System.out.println("Simple Method : " + list.size());
		
		System.out.println(list.stream().collect(Collectors.counting()));
	}
}
