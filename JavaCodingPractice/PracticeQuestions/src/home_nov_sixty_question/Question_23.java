package home_nov_sixty_question;

import java.util.ArrayList;
import java.util.List;

public class Question_23 {
	static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 2; i <= 30; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		
		list.forEach(x -> System.out.println(x));
	}
}
