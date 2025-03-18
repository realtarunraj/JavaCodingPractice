package home_nov_sixty_question;

public class Question_51 {
	public static void main(String[] args) {
		int index = 5;
		String str = "Laptop";

		System.out.println(str.charAt(index));

		// Unicode Point means the ASCII value of that character ...
		System.out.println(str.codePointAt(index));
	}
}
