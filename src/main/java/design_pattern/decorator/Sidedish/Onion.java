
package design_pattern.decorator.Sidedish;

import design_pattern.decorator.Food;


public class Onion extends Sidedish{
    
    public Onion(Food food) {
        super(food);
        name = "洋蔥";
        price = 8;
    }
    
}
