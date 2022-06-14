package day16_collections;

// 排序 Map 單一元素
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsSort4 {
    public static void main(String[] args) {
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("John", 18);
        unsortMap.put("Mary", 19);
        unsortMap.put("Bob", 21);
        unsortMap.put("Jim", 20);
        unsortMap.put("Helen", 22);
        
        // 根據數值排序
        Map<String, Integer> sortMap = new LinkedHashMap();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(e -> sortMap.put(e.getKey(), e.getValue()));
        
        // 根據兩數值相加排序
        Map<String, Integer> sortMap2 = new LinkedHashMap();
        unsortMap.entrySet().stream()
              //.sorted(Map.Entry.comparingByValue((a,b) -> (a.intValue()/10 + a.intValue()%10)-(b.intValue()/10+b.intValue()%10)))
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(a -> a/10+a%10)))
                .forEachOrdered(e -> sortMap.put(e.getKey(), e.getValue()));
        
        System.out.println(sortMap);
    }
}
