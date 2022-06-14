
package day11_func.function;

import java.util.function.Function;

/*
@FunctionalInterface
public interface Function<T, R> {

         
    R apply(T t);
*/
public class LambdaDemo1 {
    public static void main(String[] args) {
        Function<Integer,Double> area = (r)-> Math.pow(r,2) * Math.PI;
        System.out.println(area.apply(10));
    }
}
