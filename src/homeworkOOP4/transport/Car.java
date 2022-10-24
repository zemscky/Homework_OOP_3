package homeworkOOP4.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Car  extends Transport implements Competing {

    public enum BodyType {
        SEDAN ("Седан"),
        HATCHBACK ("Хетчбэк"),
        COUPE ("Купе"),
        STATION_WAGON ("Универсал"),
        SUV ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP ("Пикап"),
        VAN ("Фургон"),
        MINIVAN ("Минивэн");

        private final String bodyType;
        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }
    }
    public Car(
            String brand,
            String model,
            float engineVolume,
            BodyType bodyType
            ) {
        super(brand, model, engineVolume);
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
