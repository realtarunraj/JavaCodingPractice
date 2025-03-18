package home_nov_sixty_question;

public class Question_30 {

	static boolean isVowel(char c) {
		return String.valueOf(c).matches("[AEIOUaeiou]");
	}

	public static void main(String[] args) {
		int count = 0;
		String str = "New String";
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				count++;
			}
		}

		System.out.println(count);
	}
}
