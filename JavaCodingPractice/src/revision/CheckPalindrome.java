package revision;

public class CheckPalindrome {
	public static boolean isPalindrome(String str) {

		// Not Case sensitive
		str = str.toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "MaDAm";
		System.out.println(isPalindrome(str));
	}
}
