package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String livingEnvironment; // среда проживания
    private double travelSpeed; // скорость перемещения

    public Mammals(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            double travelSpeed
    ) {
        super(nickname, numberOfYears);
        setLivingEnvironment(livingEnvironment);
        setTravelSpeed(travelSpeed);
    }

    public abstract void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "default");
    }

    public double getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(double travelSpeed) {
        this.travelSpeed = Math.max(travelSpeed, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.travelSpeed, travelSpeed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, travelSpeed);
    }

    @Override
    public void eat() {
        System.out.println("Травоядные животные питаются только пищей растительного вида, например, корова." +
                " Хищники питаются другими представителями животного мира, например, волки.");
    }

    @Override
    public void sleep() {
        System.out.println("Идти спать");
    }

    @Override
    public void go() {
        System.out.println("Перемещаться");
    }
}
