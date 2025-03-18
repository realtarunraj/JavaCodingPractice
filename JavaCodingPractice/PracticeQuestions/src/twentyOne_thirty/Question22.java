package twentyOne_thirty;

import java.util.Scanner;

public class Question22 {
	public static void main(String[] args) {
		System.out.print("write a number :- ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		long num1 = num;

		long check = 0;
		do {
			check = (check * 10) + (num % 10);
			num = num / 10;
		} while (num > 0);
		
		
		if (check == num1) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		sc.close();
	}
}
