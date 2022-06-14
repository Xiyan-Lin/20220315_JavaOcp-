
package day12_equals;


public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return 7 * 13 * (price + color.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        // this 與 obj 根本就是同一個物件
        if(this == obj){
            return true;
        }
        // 判斷是否可以轉型?
        if(!(obj instanceof Ball)){
            System.out.println("不可轉型");
           return false;
        }
        
        Ball b = (Ball)obj;
        if(b.price == price && b.color.equals(color)){
            return true;
        } else {
            return false;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
    
}
