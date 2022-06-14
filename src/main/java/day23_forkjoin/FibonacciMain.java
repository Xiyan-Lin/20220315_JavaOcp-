
package day23_forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Fibonacci {
    public long fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
       
    }
}

class FibonacciTask extends RecursiveTask<Long>{

    private final int THRESHOLD = 30;
    private int n; //第n項

    public FibonacciTask(int n ) {
        this.n = n;
    }
    @Override
    protected Long compute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class FibonacciMain {
    public static void main(String[] args) {
        int n = 45;
        // 傳統遞迴求解
        Fibonacci fibonacci = new Fibonacci();
        long startTime = System.currentTimeMillis();
        long result = fibonacci.fib(n);
        long endTime = System.currentTimeMillis();
        System.out.printf("傳統遞迴求解 %d 項 = %,d "
              + "花費時間: %d ms\n"  , n, result, (endTime-startTime));
        
        // ForkJoin 遞回求解
        FibonacciTask task = new FibonacciTask(n);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        startTime = System.currentTimeMillis();
        long total = pool.invoke(task); 
        endTime = System.currentTimeMillis();
        System.out.printf("ForkJoin遞迴求解 %d 項 = %,d "
              + "花費時間: %d ms\n"  , n, result, (endTime-startTime));
        
    }
}
