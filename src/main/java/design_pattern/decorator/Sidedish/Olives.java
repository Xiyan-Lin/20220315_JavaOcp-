
package design_pattern.decorator.Sidedish;

import design_pattern.decorator.Food;


public class Olives extends Sidedish{
    
    public Olives(Food food) {
        super(food);
        name = "橄欖";
        price = 7;
    }
    
}
