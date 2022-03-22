
package day03;


public class StringBuilderDemo {
    // String 創建快 若修改多次 浪費記憶體 (在記憶體中不可改變)
    // StringBuffer 創建慢 修改速度慢 不浪費意義體(在記憶體中可以改變)[支援多執行緒]
    // StringBuilder 同StringBuffer [不支援多執行緒]
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        // java Framework
        sb.append(" Framework");
        // Java String Framework
        sb.insert(5,"String ");
        System.out.println(sb);
    }
}
