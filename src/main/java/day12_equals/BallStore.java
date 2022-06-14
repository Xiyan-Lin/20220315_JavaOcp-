
package day12_equals;


public class BallStore {
    public static void main(String[] args) {
        Ball b1 = new Ball("Black", 100);
        Ball b2 = new Ball("Black", 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals("我要搭火車"));
        System.out.println("+++++++++++++++++++++++++++++++++");
        Ball b3 = new Ball("Red", 200);
        Ball b4 = b3;
        System.out.println(b3.equals(b4));
    }
 
}
