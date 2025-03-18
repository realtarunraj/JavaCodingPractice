package home_nov_sixty_question;

public class Question_55 {

	static void conquer(String[] arr, int startIndex, int mid, int lastIndex) {
		String[] mergedArray = new String[lastIndex - startIndex + 1];

		int index1 = startIndex;
		int index2 = mid + 1;
		int x = 0;

		while (index1 <= mid && index2 <= lastIndex) {
			if (arr[index1].compareTo(arr[index2]) < 0) {
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

	static void divide(String[] str, int startIndex, int lastIndex) {

		if (startIndex >= lastIndex) {
			return;
		}

		int mid = startIndex + (lastIndex - startIndex) / 2;
		divide(str, startIndex, mid);
		divide(str, mid + 1, lastIndex);

		conquer(str, startIndex, mid, lastIndex);

	}

	public static void main(String[] args) {
		String[] colours = { "Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory" };

		divide(colours, 0, colours.length - 1);

		System.out.print("Ascending Order : ");
		for (String str : colours) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.print("Decending Order : ");
		for (int i = colours.length - 1; i >= 0; i--) {
			System.out.print(colours[i] + " ");
		}
	}
}
