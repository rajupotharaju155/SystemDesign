package structural_design_patterns.bridge.function_implementation;

public class TreeBreathe implements BreatheImplementor {
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through leaves");
        System.out.println("Inhale CO2");
        System.out.println("Exhale Oxygen");
    }
}
