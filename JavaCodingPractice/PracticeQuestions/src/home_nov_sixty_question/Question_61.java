package home_nov_sixty_question;

public class Question_61 {

	static String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
	}
}
