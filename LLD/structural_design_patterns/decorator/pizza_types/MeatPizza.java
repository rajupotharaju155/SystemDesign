package structural_design_patterns.decorator.pizza_types;

public class MeatPizza implements Pizza{

    @Override
    public String getDescription() {
        return "This is Meat Pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
    
}
