
package day21;


public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
//      // 工作
        Withdraw w1 = new Withdraw(account, 5000); //提款 $5000 的工作
        Withdraw w2 = new Withdraw(account, 4000); //提款 $4000 的工作
        Withdraw w3 = new Withdraw(account, 3000); //提款 $3000 的工作
        // 執行緒 + 指定工作
        Thread t1 = new Thread(w1, "小明");
        Thread t2 = new Thread(w2, "小華");
        Thread t3 = new Thread(w3, "小英");
        // 執行
        t1.start();
        t2.start();
        t3.start();
       

    }
}
