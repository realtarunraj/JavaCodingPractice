package home_nov_sixty_question;

public class Question_44 {
	public static void main(String[] args) {
		int limit = 50;

		int a = 0;
		int b = 1;
		System.out.println("Fibonacci : ");

		while (a <= limit) {
			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}
	}
}

//1 1 2 3 5 8 13 21 34 