package day07_oo;

import java.util.Arrays;

/*
Java 5.0 之後提供
AutoBoxing: 自動裝箱
AutoUnBoxing: 自動拆箱
*/
public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        // Java 5 以前
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        Integer c = Integer.valueOf(10); // new Integer(10);
        Integer d = Integer.valueOf(20); // new Integer(20);
        // 調用 intValue() 方法稱為拆箱(拆開物件取出int的內容)
        System.out.println(c.intValue() + d.intValue());
        // Java 5 以後
        Integer e = 10; // Java 編譯時期會透過 AutoBoxing: 自動裝箱機制改為 new Integer(10) 的寫法;
        Integer f = 20; // 同上... 改為 new Integer(20) 的寫法;
        // Java 編譯時期會自動幫你改為 e.intValue() + f.intValue()
        System.out.println(e + f); // AutoUnBoxing: 自動拆箱
        // int, Integer 陣列混用
        int[] nums1 = {10, Integer.valueOf(20), 30}; // auto-unboxing
        Integer[] nums2 = {10, Integer.valueOf(20), 30}; // auto-boxing
        System.out.println(nums1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
