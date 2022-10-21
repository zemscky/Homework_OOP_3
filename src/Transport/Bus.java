package Transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int manufacturingYear, String manufacturingCountry, String color, int maximalSpeed) {
        super(brand, model, manufacturingYear, manufacturingCountry, color, maximalSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Еду на заправку");
        System.out.println("Заправляю автобус бензином");
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
