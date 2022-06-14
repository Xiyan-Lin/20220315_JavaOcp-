
package day09_oo;

import java.util.Arrays;
import java.util.stream.Stream;


public class StreamFlatDemo2 {
    public static void main(String[] args) {
        String[][] names = {
            {"John","Mary"},{"Jo"},{"Vincent","Anita","Howard","Joanna"}
        };
         //利用java8 求出名字平均字母數
         
         
         double avg = Arrays.stream(names) //Stream<String[]>
                 .flatMap(Stream::of) //Stream<String>
                 .mapToInt(String::length) //IntStream
                 .average()
                 .getAsDouble();
         System.out.println(avg);
        }
    }

