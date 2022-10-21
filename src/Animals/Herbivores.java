package Animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeOfFood; // тип пищи

    public Herbivores(String nickname,
                      int numberOfYears,
                      String livingEnvironment,
                      double travelSpeed,
                      String typeOfFood
    ) {
        super(nickname, numberOfYears, livingEnvironment, travelSpeed);
        setTypeOfFood(typeOfFood);
    }

    public static void graze() {
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public void walk() {

    }
    @Override
    public void eat() {
        System.out.println("Питаются только пищей растительного вида.");
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
