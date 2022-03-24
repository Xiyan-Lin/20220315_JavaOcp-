
package day04;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StatisticsArray {
    public static void main(String[] args) {
        int[] scores = {90, 100, 80};
        // 最小 最大 平均 總和 個數
        Arrays.stream(scores).forEach(x -> System.out.println(x));
        //將 scores 串流化
        int sum = IntStream.of(scores).sum();
        System.out.println(sum);
        
        double avg = IntStream.of(scores).average().getAsDouble();
        System.out.println(avg);
        
        int max = IntStream.of(scores).max().getAsInt();
        System.out.println(max);
        
        IntSummaryStatistics stat = IntStream.of(scores).summaryStatistics();
        System.out.println(stat);
    }
}
