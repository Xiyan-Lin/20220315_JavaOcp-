
package day01;


public class AccountMain {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "A01";
        ac1.balance = 100;
        
        System.out.printf("%s $%,d\n", ac1.name, ac1.balance);
        // 存款1
        ac1.balance += 50; //ac1.balance = ac1.balance + 50;
        System.out.printf("%s $%,d\n", ac1.name, ac1.balance);
        // 存款2
        ac1.balance += 10; //ac1.balance = ac1.balance + 50;
        System.out.printf("%s $%,d\n", ac1.name, ac1.balance);
        
    }
}
