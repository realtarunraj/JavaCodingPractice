package extra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 11, 23, 4, 67, 67, 89, 89, 89);

       
        Map<Integer, Long> countMap = numbers.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        
        countMap.forEach((number, count) -> System.out.println(number + "-" + count));
    }
}
