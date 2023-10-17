package mock_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        String str = "Capgemini";

        
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        
        System.out.println(charCountMap);
    }
}
