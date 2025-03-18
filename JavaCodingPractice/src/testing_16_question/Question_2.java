package testing_16_question;

import java.util.Arrays;

public class Question_2 {
	public static void main(String[] args) {
		int[] arr = {2,4,0,1,56,23,4};
		
		Arrays.sort(arr);
		
//		System.out.println("For Method");
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println("While Method");
		int i =0;
		
		do {
			System.out.println("Hello");
		}while(i < arr.length);
		
		// Third Largest
		if(arr.length >= 3) {
			//System.out.println(arr[arr.length-3]);
		}
	}
}
