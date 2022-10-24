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

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 150);
    }

}
