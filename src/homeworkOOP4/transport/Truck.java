package homeworkOOP4.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    public Truck(
            String brand,
            String model,
            float engineVolume
    ) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовая машина %s %s начала движение",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Грузовая машина %s %s остановилась",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовая машина %s %s совершила пит-стоп",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 250);
    }
}
