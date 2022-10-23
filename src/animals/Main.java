package animals;

import animals.animal.*;

public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore(
                "Gazelle",
                3,
                "полупустыни",
                20,
                "различными травами и иными растениями"
        );
        Herbivore giraffe = new Herbivore(
                "Giraffe",
                3,
                "полупустыни",
                15,
                "различными травами и иными растениями"
        );
        Herbivore horse = new Herbivore(
                "Horse",
                10,
                "степи",
                18,
                "различными травами и иными растениями"
        );
        gazelle.eat();
        gazelle.go();
        gazelle.sleep();
        gazelle.walk();

        Predator hyena = new Predator(
                "Hyena",
                7,
                null,
                20,
                null
        );
        Predator tiger = new Predator(
                "Tiger",
                4,
                null,
                25,
                null
        );
        Predator bear = new Predator(
                "Bear",
                8,
                null,
                15,
                null
        );
        hyena.eat();
        hyena.go();
        hyena.sleep();
        hyena.walk();
        hyena.hunt();

        Amphibian frog = new Amphibian(
                "Frog",
                6,
                null
        );
        Amphibian alreadyFreshwater = new Amphibian(
                "Already",
                9,
                null
        );
        frog.eat();
        frog.go();
        frog.sleep();
        frog.hunt();

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

        peacock.eat();
        peacock.go();
        peacock.sleep();
        peacock.walk();

        Flying gull = new Flying(
                "Gull",
                5,
                null,
                null
        );
        Flying albatross = new Flying(
                "Albatross",
                3,
                null,
                null
        );
        Flying falcon = new Flying(
                "Falcon",
                7,
                null,
                null
        );
        gull.eat();
        gull.go();
        gull.sleep();
        gull.fly();
    }
}
