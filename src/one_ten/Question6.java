package one_ten;

import java.util.Arrays;

public class Question6 {
	public static void main(String[] args) {
		String input = "Tarun";
		
		char[] charArray = input.toCharArray();
		
		for(int i=0; i<charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length-i-1];
			charArray[charArray.length-i-1] = temp;
		}
		
		String output = new String(charArray);
		System.out.println(output);
	}
}
