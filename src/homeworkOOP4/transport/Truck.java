package homeworkOOP4.transport;

import homeworkOOP4.LoadType;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    private LoadType loadType;

    public Truck(
            String brand,
            String model,
            float engineVolume,
            LoadType loadType
    ) {
        super(brand, model, engineVolume);
        this.loadType = loadType;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
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
