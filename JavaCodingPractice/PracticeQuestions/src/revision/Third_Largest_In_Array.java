package revision;

public class Third_Largest_In_Array {
	public static void main(String[] args) {
		int[] arr = {2,4,0,1,56,23,4};
		
		int first_Max = Integer.MIN_VALUE;
		int second_Max = Integer.MIN_VALUE;
		int third_Max = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > first_Max) {
				third_Max = second_Max;
				second_Max = first_Max;
				first_Max = num;
			}else if(num > second_Max) {
				third_Max = second_Max;
				second_Max = num;
			} else {
				third_Max = num;
			}
		}
		
		System.out.println(third_Max);
	}
}
