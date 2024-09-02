package withDriveStrategy;

import withDriveStrategy.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //this is known as constructor injection:
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
