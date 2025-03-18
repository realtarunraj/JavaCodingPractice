package home_nov_sixty_question;

public class Question_49 {
	public static void main(String[] args) {
		try {
			int[] arr = { 5, 6, 7 };
			int check = arr[3] / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("program is continuing after catch block");
	}
}
