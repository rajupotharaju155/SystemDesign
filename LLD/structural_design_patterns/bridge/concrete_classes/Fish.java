package structural_design_patterns.bridge.concrete_classes;

import structural_design_patterns.bridge.function_implementation.BreatheImplementor;

public class Fish extends LivingThing {
    BreatheImplementor breatheImplementor;
    public Fish(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
        this.breatheImplementor = breatheImplementor;
    }
    @Override
    public
    void breatheProcess() {
        breatheImplementor.breatheProcess(); 
    }
}
