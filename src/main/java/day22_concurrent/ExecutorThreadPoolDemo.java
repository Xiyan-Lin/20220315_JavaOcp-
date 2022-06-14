package day22_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorThreadPoolDemo {
    public static void main(String[] args) throws Exception {
        // 建立執行服務 newCachedThreadPool
        // ExecutorService service = Executors.newCachedThreadPool();
        // 建立執行服務 newFixedThreadPool
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 執行指派任務
        service.submit(new Lotto());
        service.submit(new Lotto());
        service.submit(new Lotto());
        System.out.println("Thread active count: " + Thread.activeCount());
        Thread.sleep(3000);
        service.submit(new Lotto());
        System.out.println("Thread active count: " + Thread.activeCount());
        Thread.sleep(5000);
        service.submit(new Lotto());
        System.out.println("Thread active count: " + Thread.activeCount());
        Thread.sleep(1000);
        Future future = service.submit(new Lotto());
        System.out.println("future.get() = " + future.get());
        System.out.println("Thread active count: " + Thread.activeCount());
        Thread.sleep(2000);
        Future future2 = service.submit(new Number());
        System.out.println("future2.get() = " + future2.get());
        // 關閉
        service.shutdown();
    }
}
