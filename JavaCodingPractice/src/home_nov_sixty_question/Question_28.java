package home_nov_sixty_question;

//    *
//
//   ***
//
//  *****
//
// *******
//
//*********

public class Question_28 {
	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			// print spaces ...
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}

			// for printing *
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			// Changing the line ...
			System.out.println("\n");
		}
	}
}
