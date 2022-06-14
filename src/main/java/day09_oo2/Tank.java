
package day09_oo2;


public class Tank implements Car, Weapon{
    private int power;
    public Tank(int power){
        this.power = power;
    }
    
    @Override
    public void move() {
        System.out.println("用履帶走");
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void shoot() {
        System.out.println("發射穿甲彈");
    }
    
}
