package Animals;

import java.util.Objects;

public class Flightless extends Birds{
    private String movementType; // тип передвижения

    public Flightless(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            String movementType
    ) {
        super(nickname, numberOfYears, livingEnvironment);
        setMovementType(movementType);
    }

    public static void  walk() {

    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = ValidationUtils.validOrDefault(movementType, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public void eat() {
        System.out.println("Питаться семенами, орехами, фруктами, овощами, насекомыми");

    }

    @Override
    public void sleep() {
        System.out.println("Идти спать");
    }

    @Override
    public void go() {
        System.out.println("Перемещаться");
    }
    Flightless peacock = new Flightless(
            "Peacock",
            10,
            null,
            null
    );Flightless penguin = new Flightless(
            "Penguin",
            5,
            null,
            null
    );Flightless dodo = new Flightless(
            "Dodo",
            3,
            null,
            null
    );
}
