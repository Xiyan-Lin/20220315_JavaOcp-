
package day13_set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo4 {
    public static void main(String[] args) {
        // 集合與泛型
        Set<Integer> dataSet = new HashSet<>();
        //dataSet.add("國文"); //String
        dataSet.add(Integer.valueOf(100)); //Integer
        //dataSet.add("英文");// String
        dataSet.add(70);
        //dataSet.add("數學");// String
        dataSet.add(90); //Integer (auto-boxing)
        System.out.println(dataSet);
        //dataSet: [100, 70, 90] 
        // 請求出總分: 
        Iterator<Integer> iter = dataSet.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);
        
        //java 8
        int sum2 = dataSet.stream().mapToInt(data -> data.intValue()).sum();// data -> data 等於 data -> data.intValue()
                                                                            //          ^auto-unboxing                                                                     
        
        System.out.println(sum2);
    }

    
}
