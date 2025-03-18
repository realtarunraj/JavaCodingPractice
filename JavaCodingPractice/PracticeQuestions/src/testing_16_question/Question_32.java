package testing_16_question;

public class Question_32 {
	public static void main(String[] args) {
		String str1 = "fatsrev1234";
		String str2 = "kjguiagCJabc";

		// 1st way ... compare it with right string
		if (str1.matches(str2)) {
			System.out.println("its Okk");
		} else {
			System.out.println("Not Okk");
		}

		// 2nd Way ... using regex
		if (str2.matches("[a-zA-Z]+$")) {
			System.out.println("Its Okk");
		} else {
			System.out.println("Not Okk");
		}
	}
}
