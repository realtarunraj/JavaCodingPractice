package home_nov_sixty_question;

public class Question_11 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;

		int lastNumber = 30;
		System.out.print("Fibonaaci Series : ");
		while (n2 <= lastNumber) {
			System.out.print(n2 + " ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}
}
