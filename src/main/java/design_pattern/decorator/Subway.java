
package design_pattern.decorator;

import design_pattern.decorator.Sidedish.Egg;
import design_pattern.decorator.Sidedish.Ham;
import design_pattern.decorator.Sidedish.Lettuce;
import design_pattern.decorator.Sidedish.Olives;
import design_pattern.decorator.Sidedish.Onion;
import design_pattern.decorator.Sidedish.Steak;
import design_pattern.decorator.Sidedish.Tomato;
import design_pattern.decorator.Sidedish.Tuna;


public class Subway {
    public static void main(String[] args) {
        Food food1 = new Bread();
        food1 = new Ham(food1);
        food1 = new Lettuce(food1);
        food1 = new Olives(food1);
        food1 = new Olives(food1);
        food1 = new Tomato(food1);
        food1 = new Tuna(food1);
        food1 = new Onion(food1);
        food1 = new Onion(food1);
        food1 = new Steak(food1);
        food1 = new Egg(food1);
        food1 = new Egg(food1);
        food1 = new Egg(food1);
        System.out.println("subway: ");
        System.out.println(food1.getName());
        System.out.println(food1.getPrice());
    }
}
