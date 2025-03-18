/**
 * write a program to return 2nd largest number from given array
 * i/p = [2,3,5,6,1,0]
 * o/p = 6
 */

package testing_10_question;

public class SecondLargest {
	public static void main(String[] args) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		int[] intArr = { 2, 3, 5, 6, 1, 0, 10, 99, 55, 27, 38};
		for(int i=0; i<intArr.length; i++) {
			if(intArr[i] > first) {
				int temp = first;
				first = intArr[i];
				second = temp;
			}
			else {
				if(intArr[i] > second) {
					second = intArr[i];
				}
			}
		}
		
		System.out.println("Second Largest integer in the array : " + second);
	}
}
