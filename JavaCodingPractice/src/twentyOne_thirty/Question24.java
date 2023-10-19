package twentyOne_thirty;

import java.util.Scanner;

public class Question24 {
	
	public static String swap(int a, int b) {
		a = a+b; // 7
		b = a-b; // 3
		a = a-b; // 4
		
		return "\nValue has been swapped,\nNow ... a= " + a +" & b= " + b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		
		
		System.out.println(swap(a, b));
		
		sc.close();
	}
}
