package structural_design_patterns.bridge.function_implementation;

public class WaterBreathe implements BreatheImplementor {
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through gills");
        System.out.println("Inhale Oxygen");
        System.out.println("Exhale CO2");
    }
}
