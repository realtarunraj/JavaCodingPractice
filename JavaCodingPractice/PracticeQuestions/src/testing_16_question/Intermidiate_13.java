package testing_16_question;

import java.util.StringJoiner;

public class Intermidiate_13 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(", ");
		
		sj.add("Apple");
		sj.add("Banana");
		sj.add("Cucumber");
		
		sj.toString().trim();
		
		System.out.println(sj);
	}
}
