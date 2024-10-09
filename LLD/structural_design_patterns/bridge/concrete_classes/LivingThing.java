package structural_design_patterns.bridge.concrete_classes;

import structural_design_patterns.bridge.function_implementation.BreatheImplementor;

public abstract class LivingThing {
    BreatheImplementor breatheImplementor;
    public LivingThing(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }
    abstract public void breatheProcess();
}
