
package day11_lambda;

import day11_func.consumer.*;
import java.util.function.Predicate;

/*
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
*/

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 判斷分數是否及格?
        Predicate<Integer> isPass = (Integer score) -> {
            if(score >= 60){
                return true;
            } else{
                return false;
            }
        };
        
        Predicate<Integer> isPass2 = (score) -> score >= 60;
        
        System.out.println(isPass.test(75));
        System.out.println(isPass2.test(75));
     
    }
}
