package one_ten;

public class Question5 {
	public static void main(String[] args) {
		
		String str = "Hello";
		char chr = 'l';
		int count = 0;
		
		
		// Using While Loop .....
		int index = 0;
		while(index < str.length()) {
			if(str.charAt(index) == chr) {
				count++;
			}
			
			index++;
		}
		
		System.out.println("occurence of " + chr + " is " + count + " using while loop.");
		
		//Using for loop .....
		
		int forCount = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == chr) {
				forCount++;
			}
		}
		
		System.out.println("occurence of " + chr + " is " + forCount + " using for loop.");
	}
}
