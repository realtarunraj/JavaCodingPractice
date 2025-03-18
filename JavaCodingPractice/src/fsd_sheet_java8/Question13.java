package fsd_sheet_java8;

import java.util.StringJoiner;

public class Question13 {
	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Banana";
		
		StringJoiner sj = new StringJoiner(", ");
		sj.add(str1);
		sj.add(str2);
		
		System.out.println(sj.toString().trim());
	}
}
