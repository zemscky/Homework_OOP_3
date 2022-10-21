import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7f,
                "Желтый",
                2015,
                "Россия"
        );
        Car audi = new Car(
                "Audi",
                "A8",
                3.0f,
                "Черный",
                2020,
                "Германия"
        );
        Car bMW = new Car(
                "BMW",
                "Z8",
                3.0f,
                "Черный",
                2021,
                "Германия"
        );
        Car kia = new Car(
                "Kia",
                "Sportage",
                2.4f,
                "Красный",
                2018,
                "Южная Корея"
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6f,
                "Оранжевый",
                2016,
                "Южная Корея"
        );
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}