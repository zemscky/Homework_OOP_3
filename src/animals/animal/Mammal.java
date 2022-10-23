package animals.animal;

public abstract class Mammal extends Animal {
    private final String livingEnvironment; // среда проживания
    private final int travelSpeed; // скорость перемещения

    public Mammal(
            String nickname,
            int numberOfYears,
            String livingEnvironment,
            int travelSpeed
    ) {
        super(nickname, numberOfYears);
        this.livingEnvironment = livingEnvironment;
        this.travelSpeed = travelSpeed;
    }
    public void walk () {
        System.out.printf("%s гуляет в  %s со скоростью %s\n",
                this.getNickname(),
                livingEnvironment,
                travelSpeed);
    }
}
