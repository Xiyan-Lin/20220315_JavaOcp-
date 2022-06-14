
package day21;


public class Cookie {
    private boolean empty = true;
    
    public synchronized void put(int i){
        while(empty == false){
            try {
                 wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.printf("主人放第 %d 塊餅乾\n", i);
        empty = false; // 放好餅乾 盤子不是空的
        notifyAll(); //通知狗
    }
    
    public synchronized void eat(int i){
        while(empty == true){
            try {
                 wait();
            } catch (InterruptedException e) {
                return;
            }
           
        }
        System.out.printf("小狗吃第 %d 塊餅乾\n", i);
        empty = true; // 吃完了 盤子空了
        notifyAll(); //通知主人
    }
}
