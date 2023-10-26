package thirtyOne_fourty;

import java.util.Scanner;

public class Question31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char charStr = str.charAt(i);
			int count = 0;
			
			for (int j = 0; j < str.length(); j++) {
				if (i == j) {
					continue;
				}
				else if(charStr == str.charAt(j)) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.println("First non repeated character is : "+ charStr);
				break;
			}

			sc.close();
		}
	}
}

//aman
