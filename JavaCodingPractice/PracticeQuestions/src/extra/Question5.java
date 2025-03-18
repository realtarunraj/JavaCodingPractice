package extra;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        String str = "Laptop";
        char[] charArray = str.toLowerCase().toCharArray();

        
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for(Character c : charArray) {
        	if(charCountMap.containsKey(c)) {
        		charCountMap.replace(c, charCountMap.get(c)+1);
        	}
        	else {
        		charCountMap.put(c, 1);
        	}
        }

        System.out.println(charCountMap);
        
        // To use Java-8 feature of Lambda Expression
        charCountMap.forEach((c, i) -> System.out.println("The count of char " + c + " is " + i));
    }
}
