package day15_map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        // <String, Integer> 指的是 key/value 的資料型別
        Map<String, Integer> people = new LinkedHashMap<>();
        people.put("John", 18); // key(String)/value(Integer) 姓名/年齡 
        people.put("Mary", 17);
        people.put("Bob", 16);
        people.put("Helen", 18);
        people.put("Jo", 17);
        System.out.println(people);
        // 取出某人的年齡
        Integer ageOfPerson = people.get("Bob");
        System.out.println(ageOfPerson);
        // 取出所有的人名
        Set<String> names = people.keySet();
        System.out.println(names);
        // 取出所有年齡
        Collection<Integer> values = people.values();
        System.out.println(values);
        // 每個年齡層有幾個人 ?
        // {16=1, 17=2, 18=2} <- Map 的資料呈現
        // java7 
        // 先把總共有幾種年齡層找出
        Set<Integer> allOfAge = new LinkedHashSet<>(values);
        System.out.println("allOfAge: " + allOfAge);
        // resultMap 存放統計資料
        Map<Integer, Integer> resultMap = new LinkedHashMap<>();
        for(int age : allOfAge){
            int count = 0;
            for(int value : values){ // values 所有年齡的集合
                if( age == value){
                    count++;
                }
            }
            resultMap.put(age, count);
        }
        System.out.println(resultMap);
        // Java 8
        // values 所有年齡的集合 {18,17,16,18,17}
        // 每一個元素都叫做 : Function.identity()
        // collect : 收集
        // Collectors.groupingBy : 分組
        Map<Integer, Long> resultMap2 = values.stream()
                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resultMap2);
    }
}
