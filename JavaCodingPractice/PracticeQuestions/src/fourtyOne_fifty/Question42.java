package fourtyOne_fifty;

import java.util.stream.Collectors;

public class Question42 {
	// Range for lower case 97-122
	public static void main(String[] args) {
		String str = "fret%$gtu(hdg&sgdfdf$";

		System.out.println(

				str.chars() // Stream
				.filter(x -> x > 97 && x < 122)
				.mapToObj(x -> String.valueOf((char) (x)))
				.distinct()
				.collect(Collectors.toList())

		);
	}
}
