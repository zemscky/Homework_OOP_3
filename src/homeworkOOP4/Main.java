package homeworkOOP4;

import homeworkOOP4.driver.DriverB;
import homeworkOOP4.driver.DriverC;
import homeworkOOP4.driver.DriverD;
import homeworkOOP4.transport.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Audi",
                "A8",
                3.0f,
                BodyType.SEDAN);

        car.printType();

        DriverB driverB = new DriverB(
                "Driver A",
                5,
                car);
        System.out.println(driverB);

        Truck truck = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                LoadType.N3);

        truck.printType();

        DriverC driverC = new DriverC(
                "Driver B",
                7,
                truck);
        System.out.println(driverC);

        Bus bus = new Bus(
                "Peugeot",
                "806",
                2.0f,
                CapacityType.ESPECIALLY_SMALL);

        bus.printType();

        DriverD driverD = new DriverD(
                "Driver C",
                5,
                bus);
        System.out.println(driverD);
        try {
            car.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
        try {
            truck.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
        try {
            bus.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
    }

}
