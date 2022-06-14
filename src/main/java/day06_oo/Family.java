
package day06_oo;

class Father{

    public Father() {
        System.out.println("F1");
    }
    
    Father(int age){
        this();
        System.out.println("F2, age:" + age);
    }
}

class Son extends Father{

    public Son()  {
        this(18);
        System.out.println("S1");
    }
    Son(int age){
        super();
        System.out.println("S2, age:"+ age);
    }
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
