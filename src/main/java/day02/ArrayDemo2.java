package day02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 87};
        // 計算總分&平均
        // 利用for-loop 或 for-in 倫循每個元素並加總
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.printf("sum: %d\n", sum);
        double avg = sum / (double) scores.length;
        System.out.printf("avg: %.1f\n", avg);

        int sum2 = 0;
        for (int x : scores) {
            sum2 += x;
        }
        System.out.printf("sum: %d\n", sum2);
        double avg2 = sum / (double) scores.length;
        System.out.printf("avg: %.1f\n", avg2);

    }
}
