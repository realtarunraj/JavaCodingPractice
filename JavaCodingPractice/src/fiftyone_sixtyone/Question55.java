package fiftyone_sixtyone;

public class Question55 {

	public static String printSingleLine(int n) {
		int i = 1;
		StringBuilder str = new StringBuilder();

		while (i <= n) {
			str.append(i).append(" ");
			i++;
		}
		return str.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(printSingleLine(5));
		
		
	}
}
