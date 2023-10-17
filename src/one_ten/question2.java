package one_ten;

import java.util.Arrays;

public class question2 {
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 8, 9, 5, 1, 2, 90, 17};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-3]);
	}
}
