package one_ten;

import java.util.Arrays;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(2,4,0,1,56,23,4);
		
		for(int i=0; i<input.size(); i++) {
			for(int j=i; j<input.size(); j++) {
				if(input.get(i) > input.get(j)) {
					int temp = input.get(i);
					input.set(i, input.get(j));
					input.set(j, temp);
				}
			}
		}
		
		System.out.println(input);
	}
}
