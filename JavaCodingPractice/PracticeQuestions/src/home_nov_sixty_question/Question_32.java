package home_nov_sixty_question;

public class Question_32 {

	static boolean havingCharacterOnly(String str) {
		if (str.matches("[A-Za-z]+")) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(havingCharacterOnly("agstdfyfb"));
	}
}
