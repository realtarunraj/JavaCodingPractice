package home_nov_sixty_question;

import java.util.Scanner;

public class Question_27 {

	static int reverse(int num) {
		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print("The reverse is : " + reverse(num));
	}
}
