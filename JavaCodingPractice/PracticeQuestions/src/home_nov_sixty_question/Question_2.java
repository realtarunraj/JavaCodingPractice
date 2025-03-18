package home_nov_sixty_question;

public class Question_2 {
	public static void main(String[] args) {
		int[] array = { 34, 7, 23, 89, 56, 12, 78, 91, 45, 3, 67, 24, 18, 59, 80, 10, 72, 39, 85, 14 };

		// Sorting the array ...
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Third highest form array : " + array[array.length - 3]);
	}
}
