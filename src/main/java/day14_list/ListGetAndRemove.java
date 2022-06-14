
package day14_list;

import java.util.ArrayList;
import java.util.List;


public class ListGetAndRemove {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        nums.add("0");
        nums.add("3");
        nums.add("2");
        nums.add("1");
        System.out.println(nums);
        // 取得 index = 2 的資料
        System.out.println(nums.get(2));
        
        // 移除內容 = 3 的資料
        // nums.remove("3");
        nums.remove(1);
        System.out.println(nums);
        //------------------------------------
        List<Integer> scores = new ArrayList<>();
        scores.add(0);
        scores.add(3);
        scores.add(2);
        scores.add(1);
        System.out.println(scores);
        // 取得 index = 2 的資料
        System.out.println(scores.get(2));
        // 移除內容 = 3 的資料
        // nums.remove(3); // remove(int index) => 移除index = 3 的資料
        scores.remove(Integer.valueOf(3));
        System.out.println(scores);
    }
}
