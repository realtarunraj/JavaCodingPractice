package fourtyOne_fifty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question48 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,3,3,65,4,3,3,2);
		
		System.out.println("=========== By simple Method ========");
		
		List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println("New list with no duplicate element : " + result);
		
		
		
		System.out.println();
		
		
		
		System.out.println("============ By Concat Method ========");
		// By this method the order is not preserved, But You will get the same element as of earlier.
		// This method is not recommended, Go for earlier one That is easier and Upto the Mark.
		
		List<Integer> integerIsDuplicate = list.stream().filter(x -> list.indexOf(x) == list.lastIndexOf(x)).distinct().collect(Collectors.toList());
		List<Integer> integerIsNotDuplicate = list.stream().filter(x -> list.indexOf(x) != list.lastIndexOf(x)).distinct().collect(Collectors.toList());
		
		List<Integer> finalListWithNoDuplicate = Stream.concat(integerIsDuplicate.stream(), integerIsNotDuplicate.stream()).collect(Collectors.toList());
		System.out.println("New list with no duplicate element : " + finalListWithNoDuplicate);
		
	}
}
