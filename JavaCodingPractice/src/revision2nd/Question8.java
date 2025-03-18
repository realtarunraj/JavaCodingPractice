package revision2nd;

import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
	public static void main(String[] args) {
		String str = "Mississippi";
		List<Character> charList = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

		System.out.println(charList.stream().filter(x -> charList.indexOf(x) != charList.lastIndexOf(x)).distinct()
				.findFirst().get());
	}
}
