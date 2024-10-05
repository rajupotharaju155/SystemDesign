package behavioural_design_pattern.strategy_example;

import behavioural_design_pattern.strategy_example.strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
