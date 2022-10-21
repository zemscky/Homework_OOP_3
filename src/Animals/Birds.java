package Animals;

import java.util.Objects;

public class Birds extends Animals{
    private String livingEnvironment; // среда проживания

    public Birds(String nickname, int numberOfYears, String livingEnvironment) {
        super(nickname, numberOfYears);
        setLivingEnvironment(livingEnvironment);
    }

    private static void hunt() {

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "default");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
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
