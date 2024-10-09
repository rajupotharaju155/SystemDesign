package structural_design_patterns.bridge;

import structural_design_patterns.bridge.concrete_classes.Dog;
import structural_design_patterns.bridge.concrete_classes.Fish;
import structural_design_patterns.bridge.concrete_classes.OakTree;
import structural_design_patterns.bridge.concrete_classes.Turtle;
import structural_design_patterns.bridge.function_implementation.LandBreathe;
import structural_design_patterns.bridge.function_implementation.TreeBreathe;
import structural_design_patterns.bridge.function_implementation.WaterBreathe;

public class Start {
    public static void main(String[] args) {
        Dog dog = new Dog(new LandBreathe()); //bridge concrete class with implementation
        dog.breatheProcess();
        System.out.println("----------");
        OakTree oakTree = new OakTree(new TreeBreathe());
        oakTree.breatheProcess();
        System.out.println("----------");
        Fish fish = new Fish(new WaterBreathe());
        fish.breatheProcess();
        System.out.println("----------");

        Turtle turtle;
        boolean isTurtleInsideWater = true;
        if(isTurtleInsideWater){
            turtle = new Turtle(new WaterBreathe()); //change functionality on runtime
            turtle.breatheProcess();
        }else{
            turtle = new Turtle(new LandBreathe());  //change functionality on runtime
            turtle.breatheProcess();
        }
        System.out.println("----------");
    }
}
