package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet648 {
	public static String replaceWords(List<String> dictionary, String sentence) {
		String[] derivative = sentence.split(" ");

		// Smaller word in dictonary will come in first ...
		Collections.sort(dictionary);

		// Checking for the word in sentance ...
		for (int i = 0; i < derivative.length; i++) {
			for (String str : dictionary) {
				if (derivative[i].startsWith(str)) {
					derivative[i] = str;
					break;
				}
			}
		}

		// Join the final array and make sentance again ...
		return String.join(" ", derivative);
	}

	public static void main(String[] args) {
		List<String> dictionary = new ArrayList<>(Arrays.asList("cat", "bat", "rat"));
		String sentence = "the cattle was rattled by the battery";

		System.out.println(replaceWords(dictionary, sentence));
	}
}
