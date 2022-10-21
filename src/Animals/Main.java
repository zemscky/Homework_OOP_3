package Animals;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores(
                "Gazelle",
                3,
                "полупустыни",
                50,
                "различными травами и иными растениями"
        );Herbivores giraffe = new Herbivores(
                "Giraffe",
                3,
                "полупустыни",
                55,
                "различными травами и иными растениями"
        );Herbivores horse = new Herbivores(
                "Horse",
                10,
                "степи",
                50,
                "различными травами и иными растениями"
        );


        Predators hyena = new Predators(
                "Hyena",
                7,
                null,
                30,
                null
        );
        Predators tiger = new Predators(
                "Tiger",
                4,
                null,
                35,
                null
        );
        Predators bear = new Predators(
                "Bear",
                8,
                null,
                35,
                null
        );



        Amphibians frog = new Amphibians(
                "Frog",
                6,
                null
        );
        Amphibians alreadyFreshwater = new Amphibians(
                "Already",
                9,
                null
        );

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
    }
}
