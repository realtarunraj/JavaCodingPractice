package leetcode;

public class leet2000 {
	
	public static String reversePrefix(String word, char ch) {
		int position = -1;
		
		char[] arr = word.toCharArray();
		position = word.indexOf(ch);
		
		if(position == -1) {
			return word;
		}
		
		for(int i=0, j=position; i<j; i++, j--) {
			char temp= arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
		}
		
		return String.valueOf(arr);
    }
	
	public static void main(String[] args) {
		
		System.out.println(reversePrefix("abcdefd", 'd'));
	}
}
