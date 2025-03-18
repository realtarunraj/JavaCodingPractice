package fiftyone_sixtyone;

import java.util.List;
import java.util.stream.Collectors;

public class Question56 {
	public static void main(String[] args) {
		String str = "welcome";
		List<String> charList = str.chars().mapToObj(x -> (char)x).map(x -> String.valueOf(x)).collect(Collectors.toList());
		
		String result = "";
		for(String s : charList) {
			for(int i=0; i<2; i++) {
				result = result + s;
			}
		}
		
		System.out.println(result);
	}
}
