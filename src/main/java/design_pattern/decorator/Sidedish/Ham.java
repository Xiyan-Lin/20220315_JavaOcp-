
package design_pattern.decorator.Sidedish;

import design_pattern.decorator.Food;


public class Ham extends Sidedish {
    
    public Ham(Food food) {
        super(food);
        name = "火腿";
        price = 10;
    }
    
}
