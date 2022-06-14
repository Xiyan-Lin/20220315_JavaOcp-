
package day10_oo3;


public class EDog implements Dog{

    @Override
    public void skill() {
        System.out.println("玩遊戲");
    }

    @Override
    public void eat() {
        System.out.println("電");
    }
    
}
