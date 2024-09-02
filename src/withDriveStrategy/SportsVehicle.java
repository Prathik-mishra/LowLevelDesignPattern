package withDriveStrategy;

import withDriveStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
