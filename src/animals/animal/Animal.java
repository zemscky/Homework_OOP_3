package animals.animal;

import java.util.Objects;

public abstract class Animal {
    private String nickname; // кличка
    private int numberOfYears; // возраст

    public Animal(
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
        Animal animals = (Animal) o;
        return numberOfYears == animals.numberOfYears && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, numberOfYears);
    }

    public String getNickname() {
        return nickname;
    }
    public void  setNickname() {this.nickname = nickname; }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void eat(){
        System.out.printf("%s ест\n", this.nickname);
    }

    public  void sleep(){
        System.out.printf("%s спит\n", this.nickname);
    }

    public  void go() {
        System.out.printf("%s перемещается\n", this.nickname);
    }


}
