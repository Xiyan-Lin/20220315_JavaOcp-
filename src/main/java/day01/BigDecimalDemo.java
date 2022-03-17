
package day01;

import java.math.BigDecimal;


public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.1 == 0.2);//true
        System.out.println(0.1 + 0.1 + 0.1 == 0.3); //false
        System.out.println(0.1 + 0.1);
        System.out.println(0.1 + 0.1 + 0.1);
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.1");
        System.out.println(a.add(b).add(c).doubleValue());
        System.out.println(a.add(b).add(c).doubleValue() == 0.3);
        
    }
}
