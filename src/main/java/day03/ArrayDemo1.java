
package day03;
import static day03.Util.getAvg;
import static day03.Util.getCV;
import static day03.Util.getSD;

public class ArrayDemo1 {
    public static void main(String[] args) {
        double[] heights = {150,165,170,180};
        double[] weights = {55,65,77,85};  
        //  求 heights 平均
        double heightAvg = getAvg(heights);
        // 求 weights 平均
        double weightAvg = getAvg(weights);
        System.out.printf("身高平均: %.1f 體重平均: %.1f\n", heightAvg,weightAvg);
        // 求 heights 標準差
        double heightSD = getSD(heights);
        // 求 weights 標準差
        double weightSD = getSD(weights);
        System.out.printf("身高標準差:%.1f 體重標準差:%.1f\n", heightSD, weightSD);
        // 求 heights 變異係數
        double heightCV = getCV(heights);
        // 求 weights 變異係數
        double weightCV = getCV(weights);
        System.out.printf("身高變異係數: %.1f 體重變異係數: %.1f\n", heightCV, weightCV);
        
    }
    
    }

