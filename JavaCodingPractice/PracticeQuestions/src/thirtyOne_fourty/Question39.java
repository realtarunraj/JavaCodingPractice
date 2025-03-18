package thirtyOne_fourty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question39 {
	public static void main(String[] args) {
		System.out.print("Enter the inputs seperated by Spaces : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] inputArray = str.split(" ");
		
		List<Integer> list = new ArrayList<>();
		for(String c : inputArray) {
			list.add(Integer.parseInt(c));
		}
		
		Collections.sort(list);
		
		System.out.println("Smallest Entry : " + list.get(0) + " & Largest Entry : " + list.get(list.size()-1));
		
		sc.close();
	}
}