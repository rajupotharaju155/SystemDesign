package structural_design_patterns.composite_example;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    String name;
    int price;
    List<Component> composites = new ArrayList<>();

    public Composite(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void addComposite(Component c){
        composites.add(c);
    }
    public void removeComposite(Component c){
        composites.remove(c);
    }
    
    @Override
    public void showDetails() {
        System.err.println(String.format("Name: %s, Price: %d", name, price));
        for(Component composite: composites){
            composite.showDetails();
        }
    }


}
