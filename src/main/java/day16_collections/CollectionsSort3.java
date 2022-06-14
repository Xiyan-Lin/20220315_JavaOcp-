package day16_collections;

// 排序 Map 單一元素
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsSort3 {
    public static void main(String[] args) {
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("John", 18);
        unsortMap.put("Mary", 19);
        unsortMap.put("Bob", 21);
        unsortMap.put("Jim", 20);
        unsortMap.put("Helen", 22);
        
        Map<String, Integer> sortMap = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, // 定義 key
                                          Map.Entry::getValue, // 定義 value
                                          (oldValue, newValue) -> oldValue, // 將元素放入到新集合
                                          LinkedHashMap::new)); // 建立新集合(有順序性的)
        
        System.out.println(sortMap);
    }
}
