package home_nov_sixty_question;

public class Question_40 {
	public static void main(String[] args) {
		// Bubble sort is the sorting algorithm in which we matches all
		// the elements with each other and and move them accordingly
		// if its greater then the previous one ...

		int[] arr = { 2, 3, 3, 3, 65, 4, 3, 3, 2 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
