
package day14_list;

import java.util.Stack;


public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names = new Stack();
        names.push("A");
        names.push("B");
        names.push("C");
        System.out.println(names);
        while(!names.isEmpty()){
            System.out.println(names.pop());
            System.out.println(names);
        }
                 
    }
    }

