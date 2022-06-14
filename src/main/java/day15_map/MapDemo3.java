package day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class MapDemo3 {
    public static void main(String[] args) {
        String[][] fruits = {
            {"apple",  "10", "1.99"}, // 此箱有 10 個 apple 每個 1.99 元
            {"orange", "20", "2.99"},
            {"papaya", "15", "3.99"}, 
            {"melon",  "30", "3.99"},  
            {"apple",  "15", "1.99"},
            {"apple",  "20", "1.99"}, 
            {"apple",  "25", "1.99"},
            {"banana", "50", "1.99"} 
        };
        // 試問每一種水果各有幾箱?
        // 結果範例: {apple=4, watermelon=2, orange=1, banana=1}
        List<Fruit> list = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(Collectors.toList());
        System.out.println(list);
        Map<String, Long> resultMap1 = list.stream()
                .collect(groupingBy(Fruit::getName, counting()));
        System.out.println(resultMap1);
        //----------------------------------------------------------------
        Map<String, Long> resultMap2 = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(groupingBy(Fruit::getName, counting()));
        System.out.println(resultMap2);
        //----------------------------------------------------------------
        // 試問每一種水果各有多少個?
        // 每箱數量加總
        Map<String, Integer> resultMap3 = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(groupingBy(Fruit::getName, summingInt(Fruit::getCount)));
        System.out.println(resultMap3);
        //----------------------------------------------------------------
        // 根據水果價格來分組
        Map<Double, List<Fruit>> resultMap4 = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(groupingBy(Fruit::getPrice));
        System.out.println(resultMap4);
        //----------------------------------------------------------------
        // 根據水果價格來分組 II
        Map<Double, Set<String>> resultMap5 = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .collect(groupingBy(Fruit::getPrice, mapping(Fruit::getName, toSet())));
        System.out.println(resultMap5);
        //----------------------------------------------------------------
        // 請問 fruits 這個貨櫃 總共多少錢? 
        double total = Arrays.stream(fruits)
                .map(array -> new Fruit(array))
                .mapToDouble(fruit -> fruit.getCount() * fruit.getPrice())
                .sum();
        System.out.println(total);
        
        
    }
}
