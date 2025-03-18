package leetcode;

public class leet633 {
	public static boolean judgeSquareSum(int c) {
		if (c < 0) {
			return false;
		}

		int first = 0;
		int second = (int) (Math.sqrt(c));

		while (first <= second) {
			long sum = (long) first * first + (long) second * second;
			if (sum == c) {
				return true;
			} else if (sum < c) {
				first++;
			} else {
				second--;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(judgeSquareSum(5));
		System.out.println(judgeSquareSum(2147483600));
	}
}
