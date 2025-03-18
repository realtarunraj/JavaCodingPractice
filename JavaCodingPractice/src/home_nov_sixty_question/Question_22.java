package home_nov_sixty_question;

public class Question_22 {
	static boolean isPalindrome(int num) {

		int original = num;
		int check = 0;
		while (num > 0) {
			check = check * 10 + num % 10;
			num = num / 10;
		}

		if (check == original) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(22022));
		System.out.println(isPalindrome(763467));
	}
}
