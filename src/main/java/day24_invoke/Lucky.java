
package day24_invoke;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;


public class Lucky implements Runnable{

    private String tName;
    private static final ReentrantLock lock = new ReentrantLock();
    public Lucky(String tName){
        this.tName = tName;
    }
    @Override
    public void run() {
        try {
            lock.lock(); //嘗試鎖定
            Random random = new Random();
            for(int i=1 ; i<=5 ; i++){
                Thread.sleep(random.nextInt(3000));
                int num = random.nextInt(100);
                System.out.printf("%s 得到第 %d 組號碼: %d 時間: %s\n", tName,i, num, new Date());
            }
        } catch (Exception e) {
        }finally {
            lock.unlock(); //釋放(要放在finally中)
        }
    }
    
}
