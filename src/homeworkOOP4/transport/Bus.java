package homeworkOOP4.transport;

import homeworkOOP4.CapacityType;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    private  CapacityType capacityType;
    public Bus(
            String brand,
            String model,
            float engineVolume,
            CapacityType capacityType
    ) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начал движение",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автобус %s %s остановился",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил пит-стоп",
                this.getBreand(),
                this.getModel());
    }

    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных по грузоподъемности нет");
        } else {
            System.out.printf("У автобуса %s %s вместимость от %s до %s\n",
                    this.getBreand(),this.getModel(),this.capacityType.getFrom(),this.capacityType.getTo());
        }
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 150);
    }

}
