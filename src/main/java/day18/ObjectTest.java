
package day18;

class BigData{
    private String data;

    BigData() {
         System.out.printf("建構子執行者: %s\n", Thread.currentThread().getName());
         for(int i=0 ; i<=9999; i++){
             data += String.valueOf(i);
         }
         
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.printf("finalize 方法執行者: %s\n", Thread.currentThread().getName());
        
    }
}

public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("main方法執行者: %s\n", Thread.currentThread().getName());
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("FreeMomery: %,d bytes\n",runtime.freeMemory());
        BigData bigData = new BigData();
        Thread.sleep(1000); //等待一秒鐘
        System.out.printf("FreeMomery: %,d bytes\n",runtime.freeMemory());
        bigData = null;
        System.gc();
        Thread.sleep(1000); //等待一秒鐘
        System.out.printf("FreeMomery: %,d bytes\n",runtime.freeMemory());
        
    }
}
