package home_intermidiate;

import java.util.Arrays;
import java.util.List;

public class Question_4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		System.out.println(list.stream().findFirst().get());
	}
}
