package home_intermidiate;

import java.util.stream.Collectors;

public class Question_8 {
	public static void main(String[] args) {
		String str = "Laptopt";
		System.out.println(str.chars().mapToObj(x -> (char) x).filter(x -> str.indexOf(x) != str.lastIndexOf(x))
				.distinct().collect(Collectors.toList()).get(0));
	}
}
