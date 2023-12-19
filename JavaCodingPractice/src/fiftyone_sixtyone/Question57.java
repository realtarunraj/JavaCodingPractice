package fiftyone_sixtyone;

public class Question57 {
	public static void main(String[] args) {
		String str = "Reverse words in a given string";
		String[] strArr = str.trim().split(" ");
		
		String reverse =  "";
		
		for(int i=strArr.length-1; i>=0; i--) {
			reverse = reverse + " " + strArr[i];
		}
		
		System.out.println(reverse.trim());
	}
}
