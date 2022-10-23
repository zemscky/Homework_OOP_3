package animals.animal;

public class Flightless extends Bird {
    private String movementType; // тип передвижения

    public Flightless(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            String movementType
    ) {
        super(nickname, numberOfYears, livingEnvironment);
        this.movementType = movementType;
    }

    public void walk() {
        System.out.printf("%s гуляет\n", this.getNickname());
    }
}
