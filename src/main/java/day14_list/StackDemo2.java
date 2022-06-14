
package day14_list;

import java.util.Stack;
import java.util.stream.IntStream;


public class StackDemo2 {
    public static void main(String[] args) {
        String java = "Java";
        char[] charJ = java.toCharArray();
        Stack<Character> javas = new Stack();
        
//        for(int i=0 ; i<charJ.length ; i++){
//            javas.push(charJ[i]);
//        }
        IntStream.range(0,charJ.length).forEach(i -> javas.push(charJ[i]));
        System.out.println(javas);
        while(!javas.isEmpty()){
            System.out.println(javas.pop());
            
        }
        System.out.println();
    }
}
