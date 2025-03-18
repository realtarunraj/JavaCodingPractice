package home_nov_sixty_question;

public class Question_18 {
	public static void main(String[] args) {
		String str = "Capgemini Training";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
		// with Premade method ...
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("String Builder did : " + sb.toString());
	}
}
