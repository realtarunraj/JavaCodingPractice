package home_nov_sixty_question;

public class Question_21 {
	public static void main(String[] args) {
		String str = "My name      is \n Tarun Kumar	Raj   \t";
		String[] strArray = str.trim().split("\\s+");

		System.out.println(strArray.length);
	}
}
