package home_nov_sixty_question;

public class Question_9 {
	public static void main(String[] args) {
		String[] s = { "Capgemini", "Accenture", "TCS", "EPAM" };
		// Arrays.sort(s);

		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareToIgnoreCase(s[j]) < 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}

		System.out.println(s[3]);
	}
}
