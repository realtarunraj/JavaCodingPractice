package project_type;

import java.util.Scanner;

public class AtmMachine {

	public static int deposit(int saving, int depositAmount) {
		return saving + depositAmount;
	}

	public static int withdraw(int saving, int withdrawAmount) {
		return saving - withdrawAmount;
	}

	public static void main(String[] args) {
		int saving = 100000;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Welcome to the ATM ---");
			System.out.println("Your current balance is: ₹" + saving);
			System.out.println("\nPlease select an action:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int action = sc.nextInt();

			switch (action) {
			case 1: {
				System.out.print("Enter amount to withdraw: ");
				int withdrawAmount = sc.nextInt();
				if (saving > 0 && saving >= withdrawAmount) {
					saving = withdraw(saving, withdrawAmount);
					System.out.println("Transaction Successful");
					System.out.println("Updated balance: ₹" + saving);
				} else {
					System.out.println("Insufficient funds. Transaction failed.");
				}
				break;
			}
			case 2: {
				System.out.print("Enter amount to deposit: ");
				int depositAmount = sc.nextInt();
				saving = deposit(saving, depositAmount);
				System.out.println("Transaction Successful");
				System.out.println("Updated balance: ₹" + saving);
				break;
			}
			case 3: {
				System.out.println("Your current balance is: ₹" + saving);
				break;
			}
			case 4: {
				System.out.println("Thank you for using the ATM. Goodbye!");
				sc.close();
				return;
			}
			default: {
				System.out.println("Invalid choice. Please try again.");
			}
			}
		}
	}
}
