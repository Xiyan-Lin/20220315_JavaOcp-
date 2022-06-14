package day22_concurrent;

import java.util.Date;
import java.util.Random;

class MyJob implements Runnable {
    @Override
    public void run() {
        System.out.println("上班囉!");
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(new Date());
        Runnable r2 = () -> System.out.println(new Random().nextInt(100));
        Runnable r3 = () -> {
            int sum = 0;
            for(int i = 1;i<=10;i++) {
                sum += i;
            }
            System.out.println("sum = " + sum);
        };
        MyExecutor exec = new MyExecutor();
        exec.execute(r1);
        exec.execute(r2);
        exec.execute(r3);
        exec.execute(new MyJob());
    }
}
