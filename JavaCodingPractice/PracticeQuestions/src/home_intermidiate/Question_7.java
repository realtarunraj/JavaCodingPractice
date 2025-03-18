package home_intermidiate;

import java.util.stream.Collectors;

public class Question_7 {
	public static void main(String[] args) {
		String str = "Laptoplspa";
		System.out.println(str.toLowerCase().chars().mapToObj(x -> (char) x)
				.filter(x -> str.toLowerCase().indexOf(x) == str.toLowerCase().lastIndexOf(x)).distinct()
				.collect(Collectors.toList()).get(0));
	}
}
