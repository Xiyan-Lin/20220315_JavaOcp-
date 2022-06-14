
package day24_invoke;

import day20_thread.Ming;
import java.util.concurrent.atomic.AtomicInteger;


class MyThread implements Runnable{
    private static AtomicInteger count = new AtomicInteger();
    @Override
    public void run(){
        int x = count.incrementAndGet(); // +1
        System.out.println(x + " "); //取值
    }
}
    public class AtomicIntegerDemo2 {
     public static void main(String[] args){
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());
        Thread[] ta = {t1,t2,t3};
        for(int x=0 ; x<3; x++){
            ta[x].start();
        }
    }
    }
/*
Which statement is true?
A. The program prints 1 2 3 and the order is unpredictable.
B. The program prints 1 2 3.
C. The program prints 1 1 1.
D. A compilation error occurs.
*/