package structural_design_patterns.bridge.concrete_classes;

import structural_design_patterns.bridge.function_implementation.BreatheImplementor;

public class Turtle  extends LivingThing{
    BreatheImplementor breatheImplementor;
    public Turtle(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
        this.breatheImplementor = breatheImplementor;
    }
    @Override
    public
    void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
    
}
