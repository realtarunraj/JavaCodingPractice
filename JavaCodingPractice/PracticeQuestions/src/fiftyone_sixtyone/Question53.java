package fiftyone_sixtyone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question53 {
	public static void main(String[] args) {
		String str = "Exercises Practice Solution";
		String check = "Solution";

		String[] strArr = str.trim().split(" ");

		List<String> list = new ArrayList<>(Arrays.asList(strArr));
		List<String> result = list.stream().filter(x -> !x.equals(check)).collect(Collectors.toList());

		System.out.println(String.join(" ", result));
	}
}
