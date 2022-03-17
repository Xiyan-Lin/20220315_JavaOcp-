
package day02;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;
        System.out.println("陣列長度:" + scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        
        // for-loop
        for(int i =0 ; i < scores.length; i++){
            System.out.println(scores[i]);
        }
        
        // foreach (for-in) java 5.0
        for(int x : scores){
            System.out.println(x);
        }
        // Arrays.toString() 將陣列轉換為字串印出
        System.out.println(Arrays.toString(scores));// 印出陣列內容
        // 直接印出 scores
        System.out.println(scores); // 會印出hashcode
    }
}
