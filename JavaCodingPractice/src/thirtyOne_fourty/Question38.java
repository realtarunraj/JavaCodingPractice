package thirtyOne_fourty;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question38 {
	public static void main(String[] args) {

		int[] oneToHundred = IntStream.rangeClosed(1, 100).toArray();

		// deleting 72 and 84
		int[] finalArray = Arrays.stream(oneToHundred).filter(x -> x != 72 && x != 84).toArray();
		for (int i : finalArray) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nMissing Items : ");
		
		int count = 1;
		int i = 0;
		
		while (i < finalArray.length) {
			if (count == finalArray[i]) {
				i++;
				count++;
				continue;
			}
			else {
				System.out.print(count + " ");
				count++;
			}
		}
	}
}
