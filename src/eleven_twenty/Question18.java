package eleven_twenty;

public class Question18 {
	public static void main(String[] args) {
		
		String str = "Capgemini Training";
		char[] charArray = str.toCharArray();
		//System.out.println(str);
		
		// Using charArray ......
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		
		// Using charAt() method .......
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
