
package day14_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        scores.add(100);
        scores.add(90);
        scores.add(90);
        scores.add(0,80); // 將80 放入第一個位置
        scores.add(60);
        System.out.println(scores);
        // 透過List Iterator 來輪循 scores
        ListIterator<Integer> iter = scores.listIterator();
        while (iter.hasNext()) {
            int index = iter.nextIndex();
            Integer next = iter.next();
            
            System.out.printf("%d: %d\n", index, next);
        }
        while (iter.hasPrevious()) {
            int index = iter.previous();
            Integer previous = iter.previous();
            System.out.printf("%d : %d\n", index, previous);
            
            
        }
        // JAVA 8 輪巡資料
        scores.forEach(score -> System.out.println(score));
        scores.forEach(System.out :: println);
    
    }
}
