package fiftyone_sixtyone;

import java.util.Scanner;

public class Question51 {
	public static void main(String[] args) {
		String str = "Capgemini";

		System.out.print("Enter the index : ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();

		if (index >= 0 && index < str.length()) {
			System.out.println("The character at passed index is : " + str.toLowerCase().charAt(index));
		} else {
			System.out.println("Passed index is invalid.");
		}

		sc.close();
	}
}
