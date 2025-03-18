package twentyOne_thirty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question30 {
	public static void main(String[] args) {

		System.out.println("Enter a String :- ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		string = string.toLowerCase();
		System.out.println(string);

		Map<Character, Integer> map = new HashMap<>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);

		// Mapping all the vowels

		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				map.replace(string.charAt(i), map.get(string.charAt(i)) + 1);
			}
		}

		System.out.print("The number of Vowels in the string are :- ");
		int sum = 0;

		// Here we're getting the sum by iterating all the values from the map
		for (Integer c : map.values()) {
			sum = sum + c;
		}

		System.out.println(sum);
	}
}
