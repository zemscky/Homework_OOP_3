package Transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int manufacturingYear;
    private final String manufacturingCountry;
    private String color;
    private int maximalSpeed;

    public Transport(String brand, String model, int manufacturingYear, String manufacturingCountry) {
        this(
                brand,
                model,
                manufacturingYear,
                manufacturingCountry,
                "Белый"
        );
    }

    public Transport(String brand, String model, int manufacturingYear, String manufacturingCountry, String color) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        this.manufacturingYear = manufacturingYear >= 0 ? manufacturingYear : 2000;
        this.manufacturingCountry = ValidationUtils.validOrDefault(manufacturingCountry, "default");
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
        this.maximalSpeed = Math.max(maximalSpeed, 0);
    }
}



