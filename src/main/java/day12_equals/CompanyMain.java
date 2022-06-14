
package day12_equals;

import java.util.Objects;

public class CompanyMain {
    public static void main(String[] args) {
        Department it = new Department("IT", 101);
        Department sales = new Department("sales", 102);
        Employee e1 = new Employee("John", 55000, it);
        Employee e2 = new Employee("John", 55000, it);
        Employee e3 = new Employee("Mary", 48000, sales);
        
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        // Objects 是 Java7 所提供的物件工具
        System.out.println(Objects.equals(e1, e2));
        System.out.println(Objects.equals(e1, e3));
        
    }
}
