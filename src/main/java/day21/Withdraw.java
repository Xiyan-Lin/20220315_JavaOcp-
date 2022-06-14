
package day21;

// 提款的執行序工作
public class Withdraw implements Runnable{
    private Account account; //帳戶
    private int amount; //餘額
    public Withdraw(Account account, int amount){
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void run() {
       // 執行提款程序
       account.withdraw(amount);
    }
    
}
