package eleven_twenty;

import java.util.Arrays;

public class Question12 {
	public static void main(String[] args) {
		
		int[] arr = {2,3,5,6,1,0};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length -2]);
	}
}
