package structural_design_patterns.decorator;

import structural_design_patterns.decorator.pizza_types.Pizza;
import structural_design_patterns.decorator.pizza_types.VegPizza;
import structural_design_patterns.decorator.toppings_types.CheeezeDecorator;
import structural_design_patterns.decorator.toppings_types.MushroomDecorator;

public class Start {
    public static void main(String[] args) {
        //Base pizza
        Pizza vegPizza = new VegPizza();
        System.out.println(vegPizza.getDescription());
        System.out.println(vegPizza.getCost());
        //Adding 1st topping
        vegPizza = new CheeezeDecorator(vegPizza);
        System.out.println(vegPizza.getDescription());
        System.out.println(vegPizza.getCost());
        //Adding 2nd topping
        vegPizza = new MushroomDecorator(vegPizza);
        System.out.println(vegPizza.getDescription());
        System.out.println(vegPizza.getCost());
    }
}
