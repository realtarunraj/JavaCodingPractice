package one_ten;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println(n + " is a prime number.");
		}
		else {
			System.out.println(n + " is not prime number.");
		}
		sc.close();
	}
}
