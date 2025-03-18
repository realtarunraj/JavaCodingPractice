package home_nov_sixty_question;

public class Question_57 {
	public static void main(String[] args) {
		String str = "Reverse words in a given string";
		String[] strArray = str.split(" ");

		for (int i = strArray.length - 1; i > 0; i--) {
			System.out.print(strArray[i] + " ");
		}

		System.out.println(strArray[0]);
	}
}
