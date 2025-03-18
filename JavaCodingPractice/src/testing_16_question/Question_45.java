package testing_16_question;

import java.util.ArrayList;
import java.util.List;

public class Question_45 {
public static void main(String[] args) {
	int num = 34;
	
	List<Integer> factors = new ArrayList<>();
	for(int i=2; i<=num/2; i++) {
		if(num%i == 0) {
			factors.add(i);
		}
	}
	
	System.out.println(factors);
}
}
