package fourtyOne_fifty;

public class Question49 {
	public static void main(String[] args) {
		try {
			// Perform some operations that may throw exceptions
			int[] numbers = { 1, 2, 3 };
			int result = numbers[4] / 0; // This will throw an ArrayIndexOutOfBoundsException and ArithmeticException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught a generic Exception: " + e.getMessage());
		}
		System.out.println("Program continues after the catch blocks.");
	}
}