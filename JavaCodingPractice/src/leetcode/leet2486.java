package leetcode;

public class leet2486 {

	public static int appendCharacters(String s, String t) {
		int sLength = s.length();
		int tLength = t.length();
		int i = 0;
		int j = 0;

		while (i < sLength && j < tLength) {
			if (s.charAt(i) == t.charAt(j)) {
				j++;
			}
			i++;
		}

		return tLength - j;
	}

	public static void main(String[] args) {
		String s = "coaching", t = "coding";
		System.out.println(appendCharacters(s, t));
	}
}
