
package day05_oo;


public class Beef {
    private String name;
    private Integer price;

    public Beef(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    // 印出物件字串訊息

    @Override
    public String toString() {
        return "Beef{" + "name=" + name + ", price=" + price + '}';
    }
    
}
