
package day05_oo;


public class Bread {
    private String name; //麵包名稱
    private Integer price; //麵包價格
    
    //封裝
    // 建構子封裝
    public Bread(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    // 方法封裝
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
        return "Bread{" + "name=" + name + ", price=" + price + '}';
    }
    
}
