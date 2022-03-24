
package day04;

import java.util.Arrays;


public class MultiArrayDemo1 {
    public static void main(String[] args) {
        // 二微陣列
        int[][] scores = new int[3][3]; // 3X3二維對稱型陣列
        System.out.println(scores);
        System.out.println("scores 二維振列長度:" + scores.length);
        System.out.println(scores[0]);
        System.out.println("scores[0] 一維陣列長度:" + scores[0].length);
        System.out.println(scores[0][0]);
        scores[0][0] = 100;
        System.out.println(scores[0][0]);
        // 利用 Array.toString() 印出一維陣列內容
        // scores 是 二維陣列 score 表示一維陣列
        for(int[] score : scores){
            System.out.println(Arrays.toString(score));
        }
        
        
    }
}
