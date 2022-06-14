
package day05_oo;

import java.util.Arrays;
import java.util.OptionalDouble;


public class BeefStore {
    public static void main(String[] args) {
        Beef beef1 = new Beef("碎牛肉", 15);
        Beef beef2 = new Beef("菲力牛排", 45);
        Beef beef3 = new Beef("莎朗牛排", 30);
        Beef beef4 = new Beef("組合牛", 10);
        Beef beef5 = new Beef("牛小排", 35);
        Beef[] beefs = {beef1,beef2,beef3,beef4,beef5};
        //請求出是"牛排"的平均價格?
        //java 7
        int sum = 0;
        int count = 0;
        for(Beef beef : beefs){
            if(beef.getName().contains("排")){
                count ++;
                sum += beef.getPrice();
            }
        }
        double avg = sum / (double)count;
        System.out.printf("牛排的平均價格: %.2f\n", avg);
        
        // java8 (1)
        double avg2 = Arrays.stream(beefs)
                .filter(beef -> beef.getName().contains("排"))
                .mapToInt(beef -> beef.getPrice())
                .average()
                .getAsDouble();
        System.out.printf("牛排的平均價格: %.2f\n", avg2);
        
        // 改良上述寫法
        OptionalDouble OptBeefAvg = Arrays.stream(beefs)
                .filter(beef -> beef.getName().contains("排"))
                .mapToInt(beef -> beef.getPrice())
                .average();
        if(OptBeefAvg.isPresent()){
            System.out.printf("牛排的平均價格: %.2f\n", avg2);
        } else{
            System.out.println("本店不提供牛排");
        }
               
        
        // 請求出是"豬排"的平均價格?
        OptionalDouble OptAvg = Arrays.stream(beefs)
                .filter(beef -> beef.getName().contains("豬"))
                .mapToInt(beef -> beef.getPrice())
                .average();
        if(OptAvg.isPresent()){
        System.out.printf("豬排的平均價格: %.2f\n", OptAvg);
    } else{
            System.out.println("本店不提供豬排");
        }
    }
}
