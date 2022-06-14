
package day22_concurrent;

import java.util.Random;
import java.util.concurrent.Callable;


public class Number implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
    
}
