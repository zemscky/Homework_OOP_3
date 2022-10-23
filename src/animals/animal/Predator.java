package animals.animal;

public class Predator extends Mammal {
    private final String typeOfFood; // тип пищи

    public Predator(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            int travelSpeed,
            String typeOfFood
    ) {
        super(nickname, numberOfYears, livingEnvironment, travelSpeed);
        this.typeOfFood = typeOfFood;
    }
    public void hunt() {
        System.out.printf("%s охотится на  %s\n",
                this.getNickname(),
                this.typeOfFood);
    }
}
