package java8_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 76, 43, 22, 12, 89, 65, 73, 65, 73, 22, 33 };

		int largest = arr[0];
		int second_largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			}

			else {
				if (arr[i] > second_largest) {
					second_largest = arr[i];
				}
			}
		}

		// System.out.println(second_largest);

		List<IntStream> distinctAscending = Arrays.asList(Arrays.stream(arr));
		System.out.println(distinctAscending);

	}
}
