package homeworkOOP4;

import homeworkOOP4.driver.DriverB;
import homeworkOOP4.driver.DriverC;
import homeworkOOP4.driver.DriverD;
import homeworkOOP4.transport.Bus;
import homeworkOOP4.transport.Car;
import homeworkOOP4.transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Audi",
                "A8",
                3.0f,
                Car.BodyType.SEDAN);

        DriverB driverB = new DriverB(
                "Driver A",
                5,
                car);
        System.out.println(driverB);

        Truck truck = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                Truck.LoadType.N3);

        DriverC driverC = new DriverC(
                "Driver B",
                7,
                truck);
        System.out.println(driverC);

        Bus bus = new Bus(
                "Peugeot",
                "806",
                2.0f);

        DriverD driverD = new DriverD(
                "Driver C",
                5,
                bus);
        System.out.println(driverD);
    }
}
