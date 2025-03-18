package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// number
//sum

public class Question2 {
	public static void main(String[] args) {
		List<Integer> listNumber = new ArrayList<>(Arrays.asList(4, 5, 6, 8, 54, 28, 4, 8));
		System.out.println((int) (listNumber.stream().mapToInt(x -> (int) x).sum()));
	}
}