package homeworkOOP4.driver;

import homeworkOOP4.sponsor.Sponsor;

import java.util.HashSet;
import java.util.Set;

public class DriverList {
    private final Set<Driver> drivers = new HashSet<>();

    public void add(Driver driver) {
        this.drivers.add(driver);
    }

    public Driver findByName(String name) {
        for (Driver driver : drivers) {
            if (driver.getFullName() == name) {
                return driver;
            }
        }
        return null;
    }
}
