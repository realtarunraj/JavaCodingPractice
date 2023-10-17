package eleven_twenty;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {

		System.out.print("Enter the string: - ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] charArray = str.toLowerCase().toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : charArray) {
			if (c == ' ') {
				continue;
			}
			
			else {
				if (map.containsKey(c)) {

					map.put(c, map.get(c) + 1);
				}

				else {
					map.put(c, 1);
				}
			}
		}

		System.out.println(map);

	}
}
