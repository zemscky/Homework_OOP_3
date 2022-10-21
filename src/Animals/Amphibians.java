package Animals;

import java.util.Objects;

public class Amphibians extends Animals{
    private String livingEnvironment; // среда проживания

    public Amphibians(String nickname, int numberOfYears, String livingEnvironment) {
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
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Охотится на мух, комаров, улиток, жуков и пауков.");
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
