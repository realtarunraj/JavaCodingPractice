package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstElement {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 8, 5, 2, 11, 12, 17, 19, 17, 8));

		list.stream().findFirst().ifPresent(System.out::print);
	}
}
