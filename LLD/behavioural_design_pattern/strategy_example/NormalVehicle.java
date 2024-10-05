package behavioural_design_pattern.strategy_example;

import behavioural_design_pattern.strategy_example.strategy.DriveStrategy;

public class NormalVehicle extends Vehicle {
    NormalVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
