package testing_16_question;

import java.util.Scanner;

public class Qustion_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the word : ");
		String str = sc.next();
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'i') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
