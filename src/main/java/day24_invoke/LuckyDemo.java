
package day24_invoke;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class LuckyDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Lucky("John"));
        service.execute(new Lucky("Mary"));
        service.shutdown();
    }
 
}
