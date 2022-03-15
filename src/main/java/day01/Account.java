
package day01;


public class Account {
    String name;
    int balance;
    // 存款程序 (存款方法)
    // amount : 存款金額
    public void deposit(int amount){
        balance += amount;
        
    }
    
    // 印出帳戶餘額
    public void print(){
      System.out.printf("%s $%,d\n", name, balance);
        
    }
    
    //提款方法(程序)
    public void withdrawl(int amount){
        balance -= amount;
    }
    
}
