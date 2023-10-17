package eleven_twenty;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		System.out.println("How many fibonaaci series you want");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int first = 0;
		int second = 1;

		while (n > 0) {

			int third = first + second;
			System.out.println(third);
			first = second;
			second = third;
			n--;
		}
		
		sc.close();
	}
}
