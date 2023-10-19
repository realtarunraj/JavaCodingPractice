package twentyOne_thirty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question23 {
	public static List<Integer> primeNumber(int num){
		List<Integer> primeList = new ArrayList<>();
		
		while(num > 1) {
			int count = 0;
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
			
			if(count == 0) {
				primeList.add(num);
			}
			
			num--;
		}
		
		Collections.reverse(primeList);
		return primeList;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the number till which You want prime numbers :- ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(primeNumber(num));
	}
}
