
package day14_list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println("capacity:" + v.capacity()); 
        System.out.println("size: " + v.size()); // 實際有東西的
        for(int i=1 ; i<=10 ; i++){
            v.add(i);
        }
        System.out.println(v);
        System.out.println("capacity:" + v.capacity());
        System.out.println("size: " + v.size());
    }
}
