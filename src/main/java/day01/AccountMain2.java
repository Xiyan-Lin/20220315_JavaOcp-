
package day01;


public class AccountMain2 {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "A01";
        //ac1.balance = 100;
        ac1.deposit(100);
        ac1.print();
        ac1.deposit(200);
        ac1.print();
        ac1.deposit(300);
        ac1.print();
    }
}
