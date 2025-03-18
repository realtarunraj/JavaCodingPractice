package thirtyOne_fourty;

import java.util.Arrays;
import java.util.Scanner;

public class Question36 {

	public static String stringRotation(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(0) == str2.charAt(0)) {
				break;
			} else {
				str1 = str1.substring(1) + str1.charAt(0);
			}
		}

		if(Arrays.equals(str1.chars().toArray(), str2.chars().toArray())) {
			return "Both string will satisfy the string rotation concept";
		}
		
		return "Will not statisy the stirng rotation concept.";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st String: ");
		String str1 = sc.next();

		System.out.print("Enter 2nd String: ");
		String str2 = sc.next();

		if (str1.length() != str2.length()) {
			System.out.println("Length of Strings are not equal, Therefore String Rotation concept will Fail here.");
		} else {
			System.out.println(stringRotation(str1, str2));;
		}

		sc.close();
	}
}
