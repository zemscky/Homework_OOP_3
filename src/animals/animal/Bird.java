package animals.animal;

import java.util.Objects;

public class Bird extends Animal {
    private final String livingEnvironment; // среда проживания

    public Bird(
            String nickname,
            int numberOfYears,
            String livingEnvironment
    ) {
        super(nickname, numberOfYears);
        this.livingEnvironment = livingEnvironment;
    }
    public void hunt() {
        System.out.printf("%s охотится в %s\n", this.getNickname(), this.livingEnvironment);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird birds = (Bird) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
