
package day09_oo2;


public class Benz implements Car{
    private int power;
    public Benz(int power){
        this.power = power;
    }

    @Override
    public void move() {
        System.out.println("用車輪走");
    }
    

    @Override
    public int getPower() {
        return power; }
    
}
