
package day22_concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// 重複性排程
public class ScheduledExecutorThreadPoolDemo2 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        /*
        Runnable command, 工作
        long initialDelay, 初始延遲
        long period, 週期延遲
        TimeUnit unit 時間單位
        */
        
        service.scheduleWithFixedDelay(new Lucky(), 2, 2, TimeUnit.SECONDS);
        

    }
}
