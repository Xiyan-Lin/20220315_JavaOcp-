package day23_forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    // 門檻值
    private final int THRESHOLD  = 500000;
    // 任務數組
    private int [] array;
    // 起訖位置
    private int start;
    private int end;
    // 建構子-將任務與起訖位置注入
    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        // 1. 判斷門檻值, 若小於或等於門檻值則直接計算
        if((end - start) <= THRESHOLD) {
            int sum = 0;
            for(int i=start;i<end;i++) {
                sum += array[i];
            }
            return sum;
        }
        // 2. 任務過大, 一分為二
        int middle = (end + start)/2;
        // LOG
        System.out.printf("拆分 %d ~ %d, %d ~ %d\n", start, middle, middle, end);
        // 3. 分裂任務
        SumTask sumTask1 = new SumTask(array, start, middle);
        SumTask sumTask2 = new SumTask(array, middle, end);
        // 4. 運行任務
        invokeAll(sumTask1, sumTask2); // fork
        //sumTask1.fork();
        //sumTask2.fork();
        // 5. 獲得任務結果
        int subTask1Result = sumTask1.join();
        int subTask2Result = sumTask2.join();
        // 6. 匯總結果
        int result = subTask1Result + subTask2Result;
        // LOG
        System.out.printf("result %d + %d ==> %d\n", subTask1Result, subTask2Result, result);
         return result;
    }
    
}

public class SumTaskMain {
    public static void main(String[] args) {
        Random random = new Random();
        // 任務
        int[] array = new int[10_000_000];
        for(int i=0 ; i<array.length ; i++){
            array[i] = random.nextInt(1000000);
        }
        // 傳統解法
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for(int i=0 ; i<array.length; i++){
            sum += array[i];
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("傳統解法時間: %d 執行結果: %d\n", (endTime-startTime), sum);
        
        
        
        // ForkJoin
        // 取得電腦內和數量
        int proc = Runtime.getRuntime().availableProcessors();
        System.out.printf("CPU 可以使用的內核數量: %d\n", proc);
        startTime = System.currentTimeMillis();
        ForkJoinTask<Integer> task = new SumTask(array, 0, array.length);
        // commonPool() 動態使用內核數量
        // ForkJoinPool pool = ForkJoinPool.commonPool();
        ForkJoinPool pool = new ForkJoinPool(proc);
        System.out.printf("啟用前內核數量: %d\n", pool.getPoolSize());
        int total_result = pool.invoke(task);
        System.out.printf("啟用後內核數量: %d\n", pool.getPoolSize());
        endTime = System.currentTimeMillis();
        System.out.printf("ForJoin解法時間: %d 執行結果: %d\n", (endTime-startTime), sum);
        
    }
}
