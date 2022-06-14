
package day09_oo2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Army {
    public static void main(String[] args) {
        Car car1 = new Benz(200);
        Car car2 = new Tank(5000);
        Weapon w1 = new T91();
        Weapon w2 = (Weapon)car2;
        Weapon w3 = new Tank(6000);
        
        Car[] cars = {car1, car2, (Car)w3};
        // 總共馬力多少
        int sum = Stream.of(cars)
                .mapToInt(Car::getPower)
                .sum();
        System.out.println(sum);
        Weapon[] weapons = {w1,w2,w3};
        // 統一發射武器
       Stream.of(weapons).forEach(Weapon::shoot);
             
        Object[] objects = {car1, car2, w1, w2, w3};
        // 總共馬力多少?
        sum = Stream.of(objects)
                .filter(object -> object instanceof Car)
                .map(object -> (Car)object)
                .mapToInt(Car::getPower)
                .sum();
        System.out.println(sum);
    }
}
