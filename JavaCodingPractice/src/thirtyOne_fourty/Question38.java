package thirtyOne_fourty;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question38 {
	public static void main(String[] args) {
		
		int[] oneToHundred = IntStream.rangeClosed(1, 100).toArray();
		
		// deleting 72 and 84
		int[] finalArray = Arrays.stream(oneToHundred).filter(x -> x != 72 && x != 84).toArray();
		
		
	}
}
