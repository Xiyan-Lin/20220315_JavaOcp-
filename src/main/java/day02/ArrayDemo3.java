
package day02;

import java.util.Arrays;


public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {40,90,100,50,35,80,60};
        System.out.println(Arrays.toString(scores));
        // 求最大值 & 最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i < scores.length;i++){
            if(max <= scores[i]){
                max = scores[i];
            }
            if(min >= scores[i]){
                min = scores[i];
            }
        }
        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
    }
}
