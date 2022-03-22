
package day03;


public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        s1 = s1.intern(); //將 s1 的字串放入String pool中
        System.out.println(s1 == s2);
        
    }
}
