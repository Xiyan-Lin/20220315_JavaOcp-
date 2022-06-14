
package day06_oo;


public class Pen {
    public Pen(){
        this("88"); //放在第一行
        System.out.println("A");
    }
    public Pen(Integer price){
        System.out.println("B, price" + price);
    }
    public Pen(String color){
        this(88); //放在第一行
        System.out.println("C, color" + color);
    }
    
    //主程式
    public static void main(String[] args){
        Pen p1 = new Pen();
    }
}
