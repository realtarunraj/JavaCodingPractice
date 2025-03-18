package home_nov_sixty_question;

public class Question_10 {

	static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isEven(28));
		System.out.println(isEven(29));
		System.out.println(isEven(0));
		System.out.println(isEven(-31));
	}
}
