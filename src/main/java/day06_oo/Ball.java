
package day06_oo;


public class Ball {
    private String colour;
    private Integer price;

    public Ball(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }
    public Ball(int price) {
        System.out.println("A");
    }
    public Ball(){
        System.out.println("B");
    }
    public Ball(String colour){
        System.out.println("C");
    }
    public Ball(String color,Integer price){
        System.out.println("D");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" + "colour=" + colour + ", price=" + price + '}';
    }
    
}
