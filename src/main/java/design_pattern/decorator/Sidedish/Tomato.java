
package design_pattern.decorator.Sidedish;

import design_pattern.decorator.Food;


public class Tomato extends Sidedish{
    
    public Tomato(Food food) {
        super(food);
        name = "番茄";
        price = 12;
    }
    
}
