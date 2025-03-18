package java8_intermediate;

import java.util.Scanner;

public class PrimeNumberSum {

	public static boolean primeNumber(long num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Write number of cases : ");
		int t = in.nextInt();

		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();

			long sum = 0;
			while (n > 1) {
				if (primeNumber(n)) {
					sum = sum + n;
				}
				n--;
			}

			System.out.println(sum);

		}
	}
}