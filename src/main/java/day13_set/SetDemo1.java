
package day13_set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set dataSet = new HashSet();
        dataSet.add("國文"); //String
        dataSet.add(Integer.valueOf(100)); //Integer
        dataSet.add("英文");// String
        dataSet.add(100); //Integer (auto-boxing)，重複的會被剃除
        dataSet.add(70);
        dataSet.add("數學");// String
        dataSet.add(90); //Integer (auto-boxing)
        System.out.println(dataSet);
        // 走訪器 Iterator
        Iterator iter = dataSet.iterator();
        while(iter.hasNext()){
           Object next = iter.next();
           System.out.println(next);
    }
        //只想留下數值資料
        iter = dataSet.iterator();
        while (iter.hasNext()){
            Object next = iter.next();
            // 若 next 元素資料轉型為 String
            if(next instanceof String){
                iter.remove(); //移除元素
            }
        }
        System.out.println(dataSet);
    }

    
}
