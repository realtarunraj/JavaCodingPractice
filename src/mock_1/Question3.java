package mock_1;

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

public class Question3 {
	public static void main(String[] args) {

		Calculator addition = (a, b) -> a + b;
		Calculator subtraction = (a, b) -> a - b;
		Calculator multiplication = (a, b) -> a * b;

		// Using the functional interface
		int result1 = addition.calculate(5, 3);
		int result2 = subtraction.calculate(10, 7);
		int result3 = multiplication.calculate(4, 6);

		System.out.println("Addition: " + result1);
		System.out.println("Subtraction: " + result2);
		System.out.println("Multiplication: " + result3);
	}
}
