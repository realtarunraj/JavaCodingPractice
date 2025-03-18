package leetcode;

import java.util.Arrays;

public class leet1122 {
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					int temp = arr1[count];
					arr1[count] = arr1[j];
					arr1[j] = temp;

					count++;
				}
			}
		}

		int starting = count;
		int[] remaining = Arrays.copyOfRange(arr1, starting, arr1.length);
		Arrays.sort(remaining);

		for (int i = 0; i < remaining.length; i++) {
			arr1[starting + i] = remaining[i];
		}

		return arr1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int[] arr2 = { 2, 1, 4, 3, 9, 6 };

		int[] arr3 = { 28, 6, 22, 8, 44, 17 };
		int[] arr4 = { 22, 28, 8, 6 };

		System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
		System.out.println(Arrays.toString(relativeSortArray(arr3, arr4)));
	}
}
