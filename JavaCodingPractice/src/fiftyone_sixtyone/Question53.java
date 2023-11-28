package fiftyone_sixtyone;

public class Question53 {
	public static void main(String[] args) {
		long arr[] = new long[1000 + 1];
		
		for (int i = 2; i <= 1000; i++) {
			arr[i] = 0;
		}
		
		for (int j = 2; j <= 1000; j++) {
			if (arr[j] == 0) {
				for (int k = j * 2; k <= 1000; k += j) {
					arr[k] = 1;
				}
			}
		}
		
		for(long l : arr) {
			System.out.print(l + " ");
		}
	}
}
