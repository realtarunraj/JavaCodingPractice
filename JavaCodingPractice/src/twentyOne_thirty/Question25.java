package twentyOne_thirty;

import java.util.Scanner;

public class Question25 {
	
	public static String magicNumber(int num) {
		int sum = 0;
		while(num > 0) {
			sum = sum + num%10;
			num = num/10;
		}
		
		if(sum <10) {
			if(sum == 1) {
				return "Magic Number";
			}
			else {
				return "It's not a Magic Number.";
			}
		}
		
		return magicNumber(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(magicNumber(num));
	}

}
