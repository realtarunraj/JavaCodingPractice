package fiftyone_sixtyone;

import java.util.Scanner;

public class Question61 {
	public static void main(String[] args) {
		
		System.out.println("Write the word :- ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int half = str.length()/2;
		System.out.println(str.substring(0, half));
		
		sc.close();
	}
}
