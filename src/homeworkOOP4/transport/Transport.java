package homeworkOOP4.transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    public Transport(
            String brand,
            String model,
            float engineVolume
    ) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public String getBreand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }
}
