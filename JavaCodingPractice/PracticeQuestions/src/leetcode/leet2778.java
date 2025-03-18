package leetcode;

public class leet2778 {
	public static int sumOfSquares(int[] nums) {
		int length = nums.length;

		int sum = 0;
		for (int i = 0; i < length; i++) {
			if (length % (i + 1) == 0) {
				sum = sum + nums[i] * nums[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] num1 = { 2, 7, 1, 19, 18, 3 };
		int[] num2 = { 1, 2, 3, 4 };

		System.out.println(sumOfSquares(num1));
		System.out.println(sumOfSquares(num2));
	}
}
