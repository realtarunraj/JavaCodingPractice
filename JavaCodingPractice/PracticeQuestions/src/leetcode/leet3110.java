package leetcode;

public class leet3110 {
	public static int scoreOfString(String s) {
		int sum = 0;
		for(int i=0; i<s.length()-1; i++) {
			sum = sum + Math.abs(s.charAt(i) - s.charAt(i+1));
		}
		
		return sum;
	}
	
	
	// Math.abs(n)

	public static void main(String[] args) {
		System.out.println(scoreOfString("zaz"));
	}
}
