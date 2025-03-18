package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscendingOrder {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 0, 1, 56, 23, 4));
		list.sort(Comparator.naturalOrder());

		System.out.println(list);
	}
}
