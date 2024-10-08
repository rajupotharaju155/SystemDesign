package structural_design_patterns.decorator.toppings_types;

import structural_design_patterns.decorator.pizza_types.Pizza;

public class MushroomDecorator extends TopingsDecorator{
    public MushroomDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + With Mushroom";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
