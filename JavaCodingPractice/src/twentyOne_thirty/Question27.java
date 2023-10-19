package twentyOne_thirty;

public class Question27 {
	public static void main(String[] args) {
		long num = 4579;
		long sum = 0;
		
		while(num > 0) {
			sum = sum*10 + num%10;
			num = num/10;
		}
		
		System.out.println(sum);
	}
}
