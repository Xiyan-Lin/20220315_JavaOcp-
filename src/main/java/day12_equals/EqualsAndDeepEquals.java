
package day12_equals;

import java.util.Objects;


public class EqualsAndDeepEquals {
    public static void main(String[] args) {
        //Objects.equals(args,args)
        //Objects.deepEquals(args,args)
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));
        
        String[] n1 = {"A", "B", "C"};
        String[] n2 = {"A", "B", "C"};
        System.out.println(n1.equals(n2));
        System.out.println(Objects.equals(n1, n2));
        System.out.println(Objects.deepEquals(n1, n2));
    }
}
