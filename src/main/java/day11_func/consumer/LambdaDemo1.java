
package day11_func.consumer;

import java.util.function.Consumer;


/*
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
*/

public class LambdaDemo1 {
    public static void main(String[] args) {
        Consumer<String> print = (t) -> System.out.println(t);
        print.accept("Hello");
        
        Consumer<String> print2 = System.out::println;
        print2.accept("Hello2");
        
        Consumer<String> print3 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };
        print3.accept("HEllo3");
    }
}
