package java_evaluation;

// Comparing the Array ..

public class Question_1 {

	static boolean checkElement(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 1 };

		System.out.println(checkElement(arr1, arr2));

	}
}
