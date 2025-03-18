package home_nov_sixty_question;

public class Question_36 {

	static boolean areMutualRotations(String str1, String str2) {

		String check = str1.concat(str1);
		if (check.contains(str2)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(areMutualRotations("abcde", "cdeab"));
		System.out.println(areMutualRotations("abcde", "abced"));
	}
}
