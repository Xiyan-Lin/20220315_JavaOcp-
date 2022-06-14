package day24_invoke;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer>{
    
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 開始搖獎\n", tName);
        //Thread.sleep(random.nextInt(5000));
        for(int i=0;i<=999999999;i++);
        int num = random.nextInt(100);  // 0~99
        System.out.printf("%s 搖出 %d\n", tName, num);
        return num;
    }
    
}
