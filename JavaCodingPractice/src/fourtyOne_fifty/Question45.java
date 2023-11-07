package fourtyOne_fifty;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question45 {
	public static void main(String[] args) {
		// Find out factors of given numbers. n=34
		
		int num = 34;
		
		System.out.println(
				
				IntStream.rangeClosed(1, num).filter(x -> num%x == 0).boxed().collect(Collectors.toList())
				
				);
	}
}
