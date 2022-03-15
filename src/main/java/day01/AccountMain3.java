
package day01;


public class AccountMain3 {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "John";
        ac1.balance = 100;
        ac1.deposit(100);
        ac1.print();
        //提款
        ac1.withdrawl(1000);
        ac1.print();
    }
}
