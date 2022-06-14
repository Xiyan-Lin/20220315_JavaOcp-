
package day21;


public class CookieMain {
    public static void main(String[] args) {
        // 餅乾資源
        Cookie cookie = new Cookie();
        // 工作
        Put put = new Put(cookie);
        Eat eat = new Eat(cookie);
        // 建立執行緒
        Thread master = new Thread(put);
        Thread dog = new Thread(eat);
        // 執行
        master.start();
        dog.start();
    }
}
