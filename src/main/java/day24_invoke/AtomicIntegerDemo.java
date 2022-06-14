
package day24_invoke;

import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerDemo extends Thread{
    private AtomicInteger num = new AtomicInteger();
    @Override
    public void run(){
        num.incrementAndGet(); // +1
        System.out.println(num.get()); //取值
    }
    
    public static void main(String[] args){
        AtomicIntegerDemo ai = new AtomicIntegerDemo();
        ai.start();
    }
    
}
