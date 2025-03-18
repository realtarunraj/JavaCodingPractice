package thirtyOne_fourty;

import java.util.Scanner;

public class Question32 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");

		String str = sc.next();
		
		if(str.matches("^[a-zA-Z]+$")) {
			System.out.println("Contains only character.");
		}
		else {
			System.out.println("Contains numbers also.");
		}
		
		sc.close();
	}
}