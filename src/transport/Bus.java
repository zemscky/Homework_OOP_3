package transport;

public class Bus extends Transport{

    public Bus(
            String brand,
            String model,
            int manufacturingYear,
            String manufacturingCountry,
            String color,
            int maximalSpeed,
            String fuelType
    ) {
        super(brand, model, manufacturingYear, manufacturingCountry, color, maximalSpeed, fuelType);
    }

    @Override
    public void refill() {
        System.out.println("Refilling bus with " + this.fuelType);
    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        if (fuelType == null || "Gasoline Diesel Electricity".contains(fuelType)) {
            return "Gasoline";
        }else {
            return fuelType;
        }
    }


    @Override
    public String toString() {
        return "Bus: " +
                        " марка - " + getBrand() +
                        ", модель - " + getModel() +
                        ", год производства - " + getManufacturingYear() +
                        ", страна производства - " + getManufacturingCountry() +
                        ", цвет кузова - " + getColor()  +
                        ", максимальная скорость - " + getMaximalSpeed();

    }
}
