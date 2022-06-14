
package day21;

// 單一帳戶
// 功能: 提款，存款，查詢餘額，轉帳
public class Account {
    // 帳戶餘額
    private int balance;
    
    public Account(int balance){
        this.balance = balance;
    }
    
    // 查詢餘額
    public int getBalance(){
        return balance;
    }
    
    // 修改餘額
    private synchronized void setBalance(int new_balance){
        this.balance = new_balance;
    }
    
    //提款 withdraw
    public synchronized void withdraw(int amount){
        String name = Thread.currentThread().getName();
        System.out.printf("%s 近來提款$%,d\n", name, amount);
        // 查詢帳戶餘額
        int current_balance = getBalance();
        // 確認帳戶餘額是否足夠可以提款
        // 系統會花費一些判斷時間
        for(int i=0 ; i<999999999 ; i++);
        if(current_balance >= amount){
            System.out.printf("%s 開始提款 $%,d\n", name, amount);
            System.out.printf("%s 提款 $%,d 成功\n", name, amount);
            int new_balance = current_balance - amount; //最新帳戶餘額 = 目前帳戶餘額 - 提款金額
            setBalance(new_balance); //設定目前最新帳戶餘額
        } else {
            System.out.printf("%s 餘額不足\n", name);
            System.out.printf("%s 提款 $%,d 失敗\n", name, amount);
        }
        // 重新查詢帳戶餘額
        int last_balance = getBalance();
        System.out.printf("%s 最後帳戶餘額 $%,d\n", name, last_balance);
        
    }
    
    // 
    
}
