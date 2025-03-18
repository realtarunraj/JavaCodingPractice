package stream_and_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthCount {
	public static boolean stringLength(String str) {
		if (str.length() > 5) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada"));
		System.out.println(list.stream().filter(x -> stringLength(x) == true).collect(Collectors.toList()));
	}
}
