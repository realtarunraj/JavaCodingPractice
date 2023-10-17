package one_ten;

import java.util.Arrays;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,7,8,9,10);
		
		int index = 0;
		int length = list.size();
		int diff = list.get(index+1) - list.get(index);
		
		while(index < length) {
			if(list.get(index)+diff == list.get(index+1)) {
				index++;
				continue;
			}
			else {
				System.out.println(list.get(index)+diff);
				break;
			}
		}
	}
}
