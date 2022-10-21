package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood; // тип пищи

    public Predators(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            double travelSpeed,
            String typeOfFood
    ) {
        super(nickname, numberOfYears, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
    }

    public static void hunt() {

    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public void walk() {
        System.out.println("Идти гулять");
    }

    @Override
    public void eat() {
        System.out.println("Охотится на других представителей животного мира, например, волки.");
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
