package homeworkOOP4.driver;

import homeworkOOP4.transport.Bus;
import homeworkOOP4.transport.Car;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
    }
}

