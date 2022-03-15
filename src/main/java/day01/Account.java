
package day01;


public class Account {
    String name;
    int balance;
    // 存款程序 (存款方法)
    // amount : 存款金額
    public void deposit(int amount){
        if(amount <= 0){
            System.out.println("金額錯誤");
            return; //中斷方法
        }
        balance += amount;
        
    }
    
    // 印出帳戶餘額
    public void print(){
      System.out.printf("%s $%,d\n", name, balance);
        
    }
    
    //提款方法(程序)
    public void withdrawl(int amount){
        if(amount <= 0){
            System.out.println("金額錯誤");
            return; //中斷方法
        }
        if(balance >= amount && amount > 0){
            balance -= amount;
        }else {
            System.out.println("餘額不足");
        }
        
    }
    
}
