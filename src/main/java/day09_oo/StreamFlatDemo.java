
package day09_oo;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamFlatDemo {
      public static void main(String[] args) {
        int[] scores = {100,90,80,70,60,50};
        // 扁平化串流 -> 一維陣列
        int sum = Arrays.stream(scores).sum(); // API: stream(int[] array)
          System.out.println(sum);
        sum = IntStream.of(scores).sum(); // API: of(int... values)
          System.out.println(sum);
          //---------------------------------
          int[][] twoArray = {{100,90,80},{70,60,50}};
          Stream.of(twoArray).forEach(System.out:: println);          
          Stream.of(twoArray).forEach(array -> System.err.println(Arrays.toString(array)));
          
          Stream.of(twoArray)
                  .flatMapToInt(array -> IntStream.of(array))
                  .forEach(System.out:: println);
         
          sum =  Stream.of(twoArray)
                  //.flatMapToInt(IntStream::of)
                  .flatMapToInt(array -> IntStream.of(array))
                  .sum();
          System.out.println(sum);
                  
      }
    
}
