package eleven_twenty;

public class Question18 {
	public static void main(String[] args) {
		
		String str = "Military Training";
		char[] charArray = str.toCharArray();
		//System.out.println(str);
		
		
		//1st Method :- Using charArray .............
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		
		
		//2nd Method :- Using charAt() method .......
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
