
package day11_func.supplier;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;
/*
@FunctionalInterface
public interface Supplier<T> {

 
    T get();
*/
public class LambdaDemo1 {
    public static void main(String[] args) {
        Supplier<Date> today = () -> new Date();
        System.out.println(today.get());
        
        // 格式化日期 yyyy-MM-dd a hh:mm:ss E
        //           年   月 日 早/晚 時:分:秒
        Supplier<String> today2 = () -> {
            String formatString = "yyyy-MM-dd a hh:mm:ss E";
            SimpleDateFormat sdf = new SimpleDateFormat(formatString);
            return sdf.format(new Date());
        };
        System.out.println(today2.get());
    }
}
