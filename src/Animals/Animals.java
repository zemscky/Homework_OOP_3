package Animals;

import java.util.Objects;

public abstract class Animals {
    private final String nickname; // кличка
    private int numberOfYears; // возраст

    public Animals(
            String nickname,
            int numberOfYears
    ) {
        this.nickname = ValidationUtils.validOrDefault(nickname, "default");
        this.numberOfYears = numberOfYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return numberOfYears == animals.numberOfYears && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, numberOfYears);
    }

    public String getNickname() {
        return nickname;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = Math.max(numberOfYears, 1);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();


}
