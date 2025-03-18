package fiftyone_sixtyone;

public class Question60 {
	
	public static String makeOutWord(String out, String word) {
		int half = out.length()/2;
		return out.substring(0, half) + word + out.substring(half, out.length());	
	}
	
	public static void main(String[] args) {
		
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));
	}
}
