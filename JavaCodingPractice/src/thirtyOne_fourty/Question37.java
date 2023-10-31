package thirtyOne_fourty;

import java.util.List;
import java.util.Scanner;

public class Question37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		List<String> list = str.chars().mapToObj(x -> String.valueOf((char) x))
				.filter(x -> str.indexOf(x) == str.lastIndexOf(x)).toList();

		System.out.println("First non repeted character is : " + list.get(0));

		sc.close();
	}
}
