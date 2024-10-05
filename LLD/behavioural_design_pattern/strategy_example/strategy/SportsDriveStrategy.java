package behavioural_design_pattern.strategy_example.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive Strategy");
        
    }
}
