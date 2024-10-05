package behavioural_design_pattern.strategy_example;
import behavioural_design_pattern.strategy_example.strategy.DriveStrategy;

abstract class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    void drive(){
        driveStrategy.drive();
    }
    
}
