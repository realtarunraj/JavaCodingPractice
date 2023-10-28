package thirtyOne_fourty;

import java.util.Scanner;

public class Question34 {
	public static void main(String[] args) {

		System.out.print("Write any word : ");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(
				str.chars()
				.mapToObj(x -> String.valueOf((char)x))
				.filter(x -> str.indexOf(x) == str.lastIndexOf(x))
				.toList()
				);
		
		sc.close();
	}
}
