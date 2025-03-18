package home_nov_sixty_question;

public class Question_25 {

	static String isMagicNumber(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		if (sum < 10) {
			if (sum == 1) {
				return "Magic Number";
			} else {
				return "Not a magic number";
			}
		}

		return isMagicNumber(sum);
	}

	public static void main(String[] args) {
		// we keep doing sum of digits till it not become single digit
		System.out.println(isMagicNumber(2457));
		System.out.println(isMagicNumber(964));
		System.out.println(isMagicNumber(100));
	}
}
