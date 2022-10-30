package homeworkOOP4.transport;

import homeworkOOP4.driver.Driver;
import homeworkOOP4.mechanic.Mechanic;
import homeworkOOP4.sponsor.Sponsor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Transport(
            String brand,
            String model,
            float engineVolume
    ) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract boolean passDiagnostics();
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void printType();

    public List<Driver<?>> getCar() {
        return drivers;
    }
    public abstract void repair();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
