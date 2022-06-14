
package day07_oo;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Wrapper class
        // 取 int 的最大值
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        // 取二數的最大值
        System.out.println(Integer.max(10, 15));
        // 轉換
        String chinese = "100";
        String math = "90";
        System.out.println(chinese + math);
        // Integer.parseInt(放字串) : 將字串轉數字
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(math));
    }
}
