package java8_intermediate;

import java.util.List;

public class RemoveRepetation {
	public static void main(String[] args) {
		String input = "ABABab1212";

		List<Character> charList = input.chars().mapToObj(x -> (char) x).distinct().toList();
		System.out.println("List of chars after removing duplicate characters : " + charList);

		String result = "";
		for (char c : charList) {
			result = result + c;
		}

		System.out.println("Final String : " + result);

	}
}
