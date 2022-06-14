
package day05_oo;


public class Cheese {
    private String name; //起司名稱
    private Integer price; //起司價格
    
    //    建構子封裝
    public Cheese(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    
    //    方法封裝

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
        return "Cheese{" + "name=" + name + ", price=" + price + '}';
    }
    
}
