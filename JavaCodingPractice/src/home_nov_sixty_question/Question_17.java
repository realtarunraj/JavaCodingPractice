package home_nov_sixty_question;

public class Question_17 {
	public static void main(String[] args) {
		String str = "   Hello  my  World  ";

		String[] stringArray = str.trim().split("\\s+");
		System.out.println(stringArray.length);
	}
}
