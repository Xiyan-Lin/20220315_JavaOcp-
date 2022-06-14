
package day15_map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;


public class MapDemo4 {
    public static void main(String[] args) {
        // HashTable 是一種執行緒安全的集合
        // 並有一個走訪器 叫 enumeration
        Hashtable<String, Integer> people = new Hashtable<>();
        people.put("John", 18);
        people.put("Mary", 17);
        people.put("Bob", 16);
        people.put("Helen", 18);
        people.put("Jo", 17);
        people.putIfAbsent("Jo", 27); // 若 "Jo" 已存在 ，資料就不會覆寫
        
        Enumeration<Integer> enumeration = people.elements();
        while(enumeration.hasMoreElements()){
            Integer nextElement = enumeration.nextElement();
            System.out.println(nextElement);
        }
        
    }
}
