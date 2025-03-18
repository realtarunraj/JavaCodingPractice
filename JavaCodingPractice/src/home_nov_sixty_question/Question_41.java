package home_nov_sixty_question;

// Merge Sort ...

public class Question_41 {

	static void conquer(int[] arr, int startIndex, int mid, int lastIndex) {
		int[] mergedArray = new int[lastIndex - startIndex + 1];

		int index1 = startIndex;
		int index2 = mid + 1;

		int x = 0;

		while (index1 <= mid && index2 <= lastIndex) {
			if (arr[index1] < arr[index2]) {
				mergedArray[x++] = arr[index1++];
			} else {
				mergedArray[x++] = arr[index2++];
			}
		}

		while (index1 <= mid) {
			mergedArray[x++] = arr[index1++];
		}

		while (index2 <= lastIndex) {
			mergedArray[x++] = arr[index2++];
		}

		for (int i = 0, j = 0; i < mergedArray.length; i++, j++) {
			arr[startIndex + i] = mergedArray[j];
		}
	}

	static void divide(int[] arr, int startIndex, int lastIndex) {

		if (startIndex >= lastIndex) {
			return;
		}

		int mid = startIndex + (lastIndex - startIndex) / 2;

		divide(arr, startIndex, mid);
		divide(arr, mid + 1, lastIndex);

		conquer(arr, startIndex, mid, lastIndex);
	}

	public static void main(String[] args) {
		int[] array = { 7, 3, 9, 33, 5, 1, 37, 83, 26 };
		int length = array.length;
		divide(array, 0, length - 1);

		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}
}
