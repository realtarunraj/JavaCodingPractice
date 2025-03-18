package revision;

import java.util.Arrays;

public class SortingStringArray {

	public static String[] ascendingString(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].charAt(0) > arr[j].charAt(0)) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

				// If the first letter is same ...
				else if (arr[i].charAt(0) == arr[j].charAt(0)) {
					int m = 0;
					int n = 0;

					while (arr[i].charAt(m) == arr[j].charAt(n)) {
						m++;
						n++;
					}

					if (arr[i].charAt(m) > arr[j].charAt(n)) {
						String temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}

				} else {
					continue;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] str = { "Capgemini", "Axtria", "Accenture","Cognizant", "TCS", "EPAM" };
		ascendingString(str);

		System.out.println(Arrays.toString(str));
	}
}
