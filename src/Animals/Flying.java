package Animals;

import java.util.Objects;

public class Flying extends Birds {
    private String movementType; // тип передвижения

    public Flying(String nickname, int numberOfYears, String livingEnvironment, String movementType) {
        super(nickname, numberOfYears, livingEnvironment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = ValidationUtils.validOrDefault(movementType, "default");
    }

    public static void fly() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
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
}
