package structural_design_patterns.decorator.toppings_types;

import structural_design_patterns.decorator.pizza_types.Pizza;

public class TopingsDecorator implements Pizza {
    Pizza pizza;
    TopingsDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }
    
}
