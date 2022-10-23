package homeworkOOP4.driver;

import homeworkOOP4.transport.Car;
import homeworkOOP4.transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, int drivingExperience, Truck car) {
        super(fullName, "C", drivingExperience, car);
    }
}
