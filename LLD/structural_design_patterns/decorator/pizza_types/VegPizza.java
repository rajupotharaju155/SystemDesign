package structural_design_patterns.decorator.pizza_types;

public class VegPizza implements Pizza {

    @Override
    public String getDescription() {
       return "This is Veg Pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
    
}
