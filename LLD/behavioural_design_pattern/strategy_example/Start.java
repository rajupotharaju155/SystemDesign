package behavioural_design_pattern.strategy_example;

import behavioural_design_pattern.strategy_example.strategy.NormalDriveStrategy;
import behavioural_design_pattern.strategy_example.strategy.SportsDriveStrategy;

public class Start {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle(new SportsDriveStrategy());
        Vehicle normaVehicle = new NormalVehicle(new NormalDriveStrategy());

        sportsVehicle.drive();
        normaVehicle.drive();
    }
}
