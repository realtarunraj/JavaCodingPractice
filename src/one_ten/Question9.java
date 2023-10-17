package one_ten;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
		String[] input = {"Capgemini","Accenture","TCS","EPAM"};
		
		for(int i=0; i<input.length-1; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i].charAt(0) > input[j].charAt(0)) {
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		String optput = Arrays.toString(input);
		System.out.println(optput);
	}
}
