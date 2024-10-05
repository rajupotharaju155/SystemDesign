package structural_design_patterns.flyweight_example;

public class TreeType {
    String type;
    String color;
    String texture;

    TreeType(String type, String color, String texture){
        this.type = type;
        this.color = color;
        this.texture = texture;
    }
}