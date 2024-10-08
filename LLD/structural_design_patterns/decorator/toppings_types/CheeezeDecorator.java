package structural_design_patterns.decorator.toppings_types;

import structural_design_patterns.decorator.pizza_types.Pizza;

public class CheeezeDecorator extends TopingsDecorator{
    public CheeezeDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " + With Cheeze";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
    
}
