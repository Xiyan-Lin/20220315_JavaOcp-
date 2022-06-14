package day22_concurrent;

import java.util.Random;

public class Lotto implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
    
}
