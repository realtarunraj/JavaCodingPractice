package revision;

public class CheckPrime {

	public static String checkPrime(int num) {
		String str = "";

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return str = " is not Prime.";
			}
		}
		return str = " is Prime.";
	}

	public static void main(String[] args) {
		int num1 = 34;
		int num2 = 31;

		System.out.println(num1 + checkPrime(num1));
		System.out.println(num2 + checkPrime(num2));
	}
}
