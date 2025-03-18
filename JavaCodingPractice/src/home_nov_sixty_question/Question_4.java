package home_nov_sixty_question;

public class Question_4 {

	static int missingNumber(int[] arr) {
		int diff1 = arr[1] - arr[0];
		int diff2 = arr[2] - arr[1];

		int diff = Math.min(diff1, diff2);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i + 1] == arr[i] + diff) {
				continue;
			} else {
				return arr[i] + diff;
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int[] b = { 2, 4, 6, 10, 12, 14, 16, 18, 20 };
		int[] c = { 1, 3, 5, 9, 11, 13, 15, 17 };

		System.out.println(missingNumber(a));
		System.out.println(missingNumber(b));
		System.out.println(missingNumber(c));
	}
}
