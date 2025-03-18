package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static int missingNumber(List<Integer> list) {
		int diff = Integer.MIN_VALUE;

		if (list.get(0) - list.get(1) == list.get(1) - list.get(2)) {
			diff = Math.abs(list.get(0) - list.get(1));
		} else {
			diff = Math.abs(list.get(1) - list.get(2));
		}

		int i = 1;
		int number = list.get(0);

		while (i < list.size()) {
			if (number + diff != list.get(i)) {
				return number + diff;
			} else {
				number = list.get(i);
			}

			i++;
		}

		return -1;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10));
		System.out.println(missingNumber(list));
	}
}
