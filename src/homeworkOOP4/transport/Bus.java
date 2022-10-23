package homeworkOOP4.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    public Bus(
            String brand,
            String model,
            float engineVolume
    ) {
        super(brand, model, engineVolume);
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
