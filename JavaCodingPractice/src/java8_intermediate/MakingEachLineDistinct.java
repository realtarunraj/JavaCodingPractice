package java8_intermediate;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MakingEachLineDistinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		sc.nextLine();
		String[] strArr = new String[loop];

		for (int i = 0; i < loop; i++) {
			strArr[i] = sc.nextLine();
		}

		for (String s : strArr) {
			String[] arr = s.trim().split(" ");
			Set<String> set = new LinkedHashSet<>();
			StringBuilder distinctLine = new StringBuilder();

			for (String word : arr) {
				if (set.add(word.toLowerCase())) { // Check for case-insensitive duplicates
					distinctLine.append(word).append(" ");
				}
			}

			System.out.println(distinctLine.toString().trim());
		}

		sc.close();
	}
}
