package one_ten;

public class question3 {

	public static void main(String[] args) {
		String str = "Capgemini";
		int lastIndex = str.length()-1;
		
		while(lastIndex >= 0) {
			System.out.print(str.charAt(lastIndex));
			lastIndex--;
		}
	}

}
