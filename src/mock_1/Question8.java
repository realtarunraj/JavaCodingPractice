package mock_1;

public class Question8 {
	public static void main(String[] args) {

		String str = "Hello Welcome To Java";

		System.out.println("=== 1st Method = For-Loop ===");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + str);
		}

		System.out.println("=== 2nd Method= while loop ===");
		int n = 1;
		while (n <= 10) {
			System.out.println(n + " " + str);
			n++;
		}

		System.out.println("=== 3rd Method= do-while loop ===");
		int count = 1;
		do {
			System.out.println(count + " " + str);
			count++;
		} while (count <= 10);
	}
}