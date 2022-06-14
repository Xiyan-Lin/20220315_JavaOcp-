
package design_pattern.decorator.Sidedish;

import design_pattern.decorator.Food;

public class Lettuce extends Sidedish{
    
    public Lettuce(Food food) {
        super(food);
        name = "生菜";
        price = 15;
    }
    
}
