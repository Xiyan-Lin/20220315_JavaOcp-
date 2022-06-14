
package day20_thread;

interface Box {
    void putMoney(int money);
}

class Mather extends Thread{
    private Box box;
    public Mather(Box box){
        System.out.println("媽媽拿到box");
        this.box = box;
    }
    @Override
    public void run(){
        System.out.println("媽媽在box裡放50元");
        box.putMoney(50);
    }
}
public class Ming extends Thread{
     private int money = 100;
     private Box box = (money) -> System.out.println("小明現在總共有(含box裡) $" + (this.money + money));
     @Override
     public void run(){
         System.out.println("小名請媽媽給50元 並將box給媽媽");         
         Mather mather = new Mather(box);
         mather.start();
    }
     public static void main(String[] args) {
         System.out.println("小明想要拿零用錢");
         Ming ming = new Ming();
         ming.start();
    }
}
