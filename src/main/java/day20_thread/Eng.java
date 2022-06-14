
package day20_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Father implements Callable<Integer>{
    @Override
    public Integer call(){
        return 50;
    }
}

public class Eng {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(new Father());
        FutureTask<Integer> task2 = new FutureTask<>(new Father());        
        new Thread(task).start();
        new Thread(task2).start();
        
        try {
            int money = task.get();
            System.out.println(money);
            int money2 = task.get();
            System.out.println(money2);
        } catch (Exception e) {
        }
        
    }
}
