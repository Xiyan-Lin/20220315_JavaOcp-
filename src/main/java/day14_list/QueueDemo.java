
package day14_list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.offer("A");
        names.offer("B");
        names.offer("C");
        System.out.println(names + "size:" + names.size());
        
        while(!names.isEmpty()){ 
            System.out.println(names.poll());
            System.out.println(names + "size:" + names.size());
            
        }
        
    }
}
