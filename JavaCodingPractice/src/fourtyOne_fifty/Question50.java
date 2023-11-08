package fourtyOne_fifty;

import java.util.Scanner;

// Let the string be "pneumonoultramicroscopicsilicovolcanoconiosis"
public class Question50 {
	public static void main(String[] args) {
		String str = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		System.out.print("Enter the index : ");
		
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		System.out.print("Character at given index is : " + str.charAt(index));
		
		sc.close();
	}
}
