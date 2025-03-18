/**
 * 
 * Write a program to sort a given list of integers in ascending order i/p
 * list={2,4,0,1,56,23,4} o/p list={0,1,2,4,4,23,56}
 *
 */

package testing_10_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingDecending {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 0, 1, 56, 23, 4));

		System.out.println("************ Using Java - 8 *************");
		// Sorting the list
		Collections.sort(list);
		System.out.println("Ascending Order : " + list);
		// Reverse the sorted list
		Collections.reverse(list);
		System.out.println("Decending Order : " + list);

		System.out.println("\n");

		System.out.println("************ Using Sorting *************");

		// Ascending order by normal sorting
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 0, 1, 56, 23, 4));
		for (int i = 0; i < list1.size() - 1; i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				if (list1.get(i) > list1.get(j)) {
					int temp = list1.get(i);
					list1.set(i, list1.get(j));
					list1.set(j, temp);
				}
			}
		}

		System.out.println("Ascending Order : " + list1);

		// Decending order by reversing the sorted list
		Collections.reverse(list1);
		System.out.println("Decending Order : " + list1);

	}
}
