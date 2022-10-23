package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int manufacturingYear;
    private final String manufacturingCountry;
    private String color;
    private int maximalSpeed;
    protected final String fuelType;

    public Transport(String brand,
                     String model,
                     int manufacturingYear,
                     String manufacturingCountry,
                     String color,
                     int maximalSpeed,
                     String fuelType) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.manufacturingYear = manufacturingYear >= 0 ? manufacturingYear : 2000;
        this.manufacturingCountry = ValidationUtils.validOrDefault(manufacturingCountry, "default");
        this.fuelType = checkFuelTypeOrDefault(fuelType);
        setColor(color);
        setMaximalSpeed(maximalSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOrDefault(color, "Белый");
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public void setMaximalSpeed(int maximalSpeed) {
        this.maximalSpeed = Math.max(maximalSpeed, 1);
    }

    public abstract void refill();

    protected abstract String checkFuelTypeOrDefault(String fuelType);

    @Override
    public String toString() {
        return "Transport :" +
                " марка - " + brand +
                ", модель - " + model +
                ", год производства - " + manufacturingYear +
                ", страна производства - " + manufacturingCountry +
                ", цвет - " + color +
                ", максимальная скорость - " + maximalSpeed;
    }
}



