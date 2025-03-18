package leetcode;

public class leet1137 {

	public static int tribonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;

		while (n > 0) {
			int sum = a + b + c;
			a = b;
			b=c;
			c = sum;
			n--;
		}

		return a;
	}

	public static void main(String[] args) {
		System.out.println(tribonacci(25));
		// answer should be 1389537;

		System.out.println(tribonacci(3));
		// answer should be 2;

		System.out.println(tribonacci(4));
		// answer should be 4;
	}
}
