package java8_intermediate;

public class ReverseTheString {
	public static void main(String[] args) {
		String str = "Laptops";
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
			System.out.println(result.hashCode());
		}

		System.out.println(result);
	}
}