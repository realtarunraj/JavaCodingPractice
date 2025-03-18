package fourtyOne_fifty;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Question43 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(12, 33, 45, 33, 87, 54, 96, 33, 45));
		System.out.println(list);
		System.out.println(list.stream().filter(x -> list.indexOf(x) == list.lastIndexOf(x)).collect(Collectors.toList()));
	}
}
