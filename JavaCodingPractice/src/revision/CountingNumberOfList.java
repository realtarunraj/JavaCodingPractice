package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingNumberOfList {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4, 5, 6, 77, 8, 44, 5, 55, 11, 20, 11, 76, 2, 4, 6, 2, 3, 57, 76 };
		System.out.println(Arrays.stream(arr).map(x -> x * 2).collect(TreeSet::new, TreeSet::add, TreeSet::addAll));

		List<Integer> list = Arrays.stream(arr).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}
}