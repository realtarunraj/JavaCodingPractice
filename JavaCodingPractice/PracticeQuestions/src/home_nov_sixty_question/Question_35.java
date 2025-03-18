package home_nov_sixty_question;

import java.util.Arrays;

public class Question_35 {

	static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}

	// anagram means if both the string carries same characters
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		System.out.println(isAnagram(s1, s2));
	}
}
