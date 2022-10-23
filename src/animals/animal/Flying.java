package animals.animal;

public class Flying extends Bird {
    private String movementType; // тип передвижения

    public Flying(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            String movementType
    ) {
        super(nickname, numberOfYears, livingEnvironment);
        this.movementType = movementType;
    }

    public void fly() {
        System.out.printf("Птица %s летает ", this.getNickname());
    }
}
