
package day13_set;

import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetDemo {
    public static void main(String[] args) {            
    SortedSet<Integer> scores = new TreeSet<>();
    scores.add(5);
    scores.add(6);
    scores.add(2);
    scores.add(1);
    scores.add(8);
    scores.add(9);
    scores.add(3);
    System.out.println(scores);
    
}
}
