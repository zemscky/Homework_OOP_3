package animals.animal;

import java.util.Objects;

public class Herbivore extends Mammal {
    private final String typeOfFood; // тип пищи

    public Herbivore(String nickname,
                     int numberOfYears,
                     String livingEnvironment,
                     int travelSpeed,
                     String typeOfFood) {
        super(nickname, numberOfYears, livingEnvironment, travelSpeed);
        this.typeOfFood = typeOfFood;
    }
    private void graze() {
        System.out.printf("%s пасется на %s\n",
                this.getNickname(),
                this.typeOfFood);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore that = (Herbivore) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
