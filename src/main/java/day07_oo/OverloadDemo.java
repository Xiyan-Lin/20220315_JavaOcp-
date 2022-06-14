package day07_oo;

class User {
    void print(Integer x) {
        System.out.println("Integer");
    }
    void print(double x) {
        System.out.println("double");
    }
    void print(int x) {
        System.out.println("int");
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        User user = new User();
        user.print(3.14);
        user.print(100);
        user.print(100L);
        user.print(Integer.valueOf(100));
    }
}
