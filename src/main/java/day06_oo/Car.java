
package day06_oo;


public class Car {
    private static String brandName = "BMW"; //類別變數
    private Integer price; // 餘額 //物件變數
    
    public Car(Integer price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "price=" + price + '}';
    }
    
    public static void main(String[] args){
        Car c1 = new Car(100);
        Car c2 = new Car(200);
        System.out.println(c1);
        System.out.println(c2);
        c2.brandName = "Benz"; //不建議這樣使用(but 考試會考)
        Car.brandName = "Benz"; // 正確使用方法
        System.out.println(c1.brandName); // 不建議用此呼叫
        System.out.println(c2.brandName); // 不建議用此呼叫
        System.out.println(Car.brandName); //正確呼叫方式
    }
    
    
}
