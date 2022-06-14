
package day22_concurrent;

import java.util.concurrent.CyclicBarrier;


public class CarCyclicBarrierDemo {
    public static void main(String[] args) {
        int parties = 3;
        Runnable lunch = () -> System.out.printf("%s 吃午飯\n", Thread.currentThread().getName());
        CyclicBarrier cb = new CyclicBarrier(parties, lunch);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
    }
}
