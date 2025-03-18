package home_nov_sixty_question;

//*
//*
//*
//****
public class Question_26 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			if (i != 3) {
				System.out.println("*");
			}
			if (i == 3) {
				for (int j = 0; j < 4; j++) {
					System.out.print("*");
				}
			}
		}
	}
}
