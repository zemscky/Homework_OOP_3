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

    public void printType() {
        if (loadType == null) {
            System.out.println("Данных по грузоподъемности нет");
        } else {
            String from = loadType.getFrom() == null ? "" : "от " + loadType.getFrom();
            String to = loadType.getTo() == null ? "" : "до " + loadType.getTo();
            System.out.printf("У грузовой машины %s %s грузоподъемность от %s до %s\n",
                    this.getBreand(),this.getModel(),this.loadType.getFrom(),this.loadType.getTo());
        }
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
