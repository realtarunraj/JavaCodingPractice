package fiftyone_sixtyone;

import java.util.Scanner;

public class Question53 {

	static void solver(int n) {

		long arr[] = new long[1000000 + 1];
		for (int i = 2; i <= 1000000; i++) {
			arr[i] = 0;
		}
		for (int j = 2; j <= 1000000; j++) {
			if (arr[j] == 0) {
				for (int k = j * 2; k <= 1000000; k += j) {
					arr[k] = 1;
				}
			}
		}

		long sum2 = 0;
		for (int f = 2; f <= 1000000; f++) {
			if (arr[f] == 0) {
				sum2 += f;
			}
			arr[f] = sum2;
		}
		System.out.println(arr[n]);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			solver(n);
		}

		in.close();
	}
}

/**
 * 
 * j =2
 * 
 */
