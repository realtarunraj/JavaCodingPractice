package thirtyOne_fourty;

import java.util.Arrays;
import java.util.Scanner;

public class Question35 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		boolean result = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());

		System.out.println(result);
		
		sc.close();
	}
}
