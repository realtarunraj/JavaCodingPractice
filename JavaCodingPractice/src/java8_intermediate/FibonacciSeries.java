package java8_intermediate;

public class FibonacciSeries {
	public static void main(String[] args) {
		int last = 30;
		
		System.out.print("Fibonaccci Upto 30 is : ");
		int a=0, b=1;
		while(a < last) {
			int sum = a+b;
			System.out.print(a + " ");
			
			a=b;
			b=sum;
		}
	}
}
