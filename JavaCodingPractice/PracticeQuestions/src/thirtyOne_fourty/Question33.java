package thirtyOne_fourty;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question33 {
	public static void main(String[] args) {

		System.out.print("Write any word : ");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] charArray = str.toLowerCase().toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();

		for (Character c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.replace(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		System.out.println("The repeated character is : ");
		charMap.forEach((c, i) -> {
			if (i > 1) {
				System.out.println(c);
			}
		});

		System.out.println("====== Stream ==========");

		System.out.println(

				str.chars().mapToObj(x -> String.valueOf((char) x)).filter(x -> str.indexOf(x) != str.lastIndexOf(x))
						.distinct().collect(Collectors.toList()));

		sc.close();
	}
}
