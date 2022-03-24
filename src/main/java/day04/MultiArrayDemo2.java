
package day04;

import java.util.Arrays;
import java.util.Random;


public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int [][] scores = new int[3][2]; //3 X 2
        for(int[] score : scores){
            System.out.println(Arrays.toString(score));
        }
        
        // 利用 Random 產生亂數並配置在陣列中
        Random r = new Random();
        scores[0][0] = r.nextInt(100);
        scores[0][1] = r.nextInt(100);
        scores[1][0] = r.nextInt(100);
        scores[1][1] = r.nextInt(100);
        scores[2][0] = r.nextInt(100);
        scores[2][1] = r.nextInt(100);
        for(int[] score : scores){
            System.out.println(Arrays.toString(score));
        }
        // 利用 for loop 配置
        for(int i=0; i<scores.length;i++){
            for(int k=0 ; k < scores[i].length ; k++){
                scores[i][k] = r.nextInt(100);
                System.out.printf("scores[%d][%d] = %d\n", i,k,scores[i][k]);
                
            }
        }
        
    }
}
