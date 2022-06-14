
package design_pattern.decorator.Sidedish;

import design_pattern.decorator.Food;


public class Steak extends Sidedish{
    
    public Steak(Food food) {
        super(food);
        name = "牛排";
        price = 100;
    }
    
}
