package leetcode;

public class leet367 {
	public static boolean isPerfectSquare(int num) {

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (num / i == i) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
		System.out.println(isPerfectSquare(17));
	}
}
