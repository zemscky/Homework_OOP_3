package homeworkOOP4.transport;

import homeworkOOP4.BodyType;

import java.util.concurrent.ThreadLocalRandom;

public class Car  extends Transport implements Competing {
    private BodyType bodyType;

    public Car(
            String brand,
            String model,
            float engineVolume,
            BodyType bodyType
            ) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Машина %s %s начала движение",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Машина  %s %s остановилась",
                this.getBreand(),
                this.getModel());
    }


    @Override
    public void pitStop() {
        System.out.printf("Машина %s %s совершила пит-стоп",
                this.getBreand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}
