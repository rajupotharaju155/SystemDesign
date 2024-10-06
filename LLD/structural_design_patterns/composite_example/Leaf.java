package structural_design_patterns.composite_example;

public class Leaf  implements Component{
    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails(){
        System.err.println(String.format("Name: %s, Price: %d", name, price));
    }
}
