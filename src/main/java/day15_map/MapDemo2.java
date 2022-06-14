package day15_map;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MapDemo2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange","watermelon","watermelon", "apple","apple","apple","banana"};
        // 試問每一個水果有幾個
        // {banana=1, orange=1, apple=4, watermelon=2}
        Map<String, Long> resultMap = Arrays.stream(fruits)
                                .collect(groupingBy(identity(), counting()));
        System.out.println(resultMap);
                
             
        
        
        
    }
}
