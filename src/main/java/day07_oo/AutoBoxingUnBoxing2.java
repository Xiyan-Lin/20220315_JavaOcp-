package day07_oo;

import java.util.stream.Stream;

public class AutoBoxingUnBoxing2 {
    public static void main(String[] args) {
        Integer[] scores = {100, 93, 81}; // auto-boxing
        int sum1 = Stream.of(scores).mapToInt(s -> s.intValue()).sum();
        int sum2 = Stream.of(scores).mapToInt(s -> s).sum(); // auto-unboxing
        int sum3 = Stream.of(scores).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
        String[] nums = {"100", "93", "81"};
        // 求平均 = ?
        double avg = Stream.of(nums) //stream<object>
                           .map(n -> n.toString()) // stream<string>
                           .mapToInt(n -> Integer.parseInt(n)) //Intstream
                           .average()
                           .getAsDouble();
        System.out.println(avg);
        
        double avg2 = Stream.of(nums)
                            .map(Object :: toString)
                            .mapToInt(Integer :: parseInt)
                            .average()
                            .getAsDouble();
        System.out.println(avg2);
        Object[] values = {"100" , 93, 81.5, new Integer(75)};
        double avg3 = Stream.of(values) // Stream<Object>
                            .map(Object :: toString) // stream<String>
                            .mapToDouble(Double :: parseDouble) // DoubleStream
                            .average()
                            .getAsDouble();
        System.out.println(avg3);
        double avg4 = Stream.of(values)   // Streeam<Object>
                            .map(Object :: toString) //Stream<String>
                            .map(Double::valueOf) // Stream<Double>
                            .mapToDouble(Double :: doubleValue) // DoubleStream
                            .average()
                            .getAsDouble();
        System.out.println(avg4);
        // 動動腦
        Object[] names = {"Vincent", 5566, "Jo"};
        // 請問平均名字有幾個字?
        double avg5 = Stream.of(names)
                            .map(Object :: toString) //Stream<Object>
//                          .mapToInt(n -> n.length()) //String :: length
                            .mapToInt(String :: length) // IntStream
                            .average()
                            .getAsDouble();
        System.out.println(avg5);
    }
    
}
