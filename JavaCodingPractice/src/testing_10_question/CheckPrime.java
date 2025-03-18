/**
 * Write a program to check a given number is prime or not 
 * i/p n=34 ... o/p not Prime
 */

package testing_10_question;

import java.util.Scanner;

public class CheckPrime {

	// Creating a function to check if it's prime or not
	public static String checkPrime(long num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return "Not Prime";
			}
		}
		return "Is Prime";
	}

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();

		System.out.println(checkPrime(input));
		sc.close();
	}
}
