package testing_16_question;

import java.util.Scanner;

public class Question_51 {
	public static void main(String[] args) {
		String str = "Capgemini";
		
		System.out.println("Enter index : ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println(str.charAt(index));
	}
}
