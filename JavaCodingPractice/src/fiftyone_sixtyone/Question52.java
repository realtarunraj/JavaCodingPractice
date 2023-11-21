package fiftyone_sixtyone;

import java.util.List;
import java.util.stream.Collectors;

public class Question52 {
	public static void main(String[] args) {
		String str1 = "fireman";
		String str2 = "fire";
		
		List<Character> list1 = str1.chars().mapToObj(x -> (char)(x)).collect(Collectors.toList());
		List<Character> list2 = str2.chars().mapToObj(x -> (char)(x)).collect(Collectors.toList());
	}
}
