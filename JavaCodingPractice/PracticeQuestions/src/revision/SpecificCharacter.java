package revision;

public class SpecificCharacter {
	public static int specificCharacter(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("The count of given character is : " + specificCharacter(str, 'l'));
	}
}
