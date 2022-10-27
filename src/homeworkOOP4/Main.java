package homeworkOOP4;

import homeworkOOP4.driver.Driver;
import homeworkOOP4.driver.DriverB;
import homeworkOOP4.driver.DriverC;
import homeworkOOP4.driver.DriverD;
import homeworkOOP4.mechanic.Mechanic;
import homeworkOOP4.sponsor.Sponsor;
import homeworkOOP4.transport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Car> ivanov = new Mechanic<Car>(
                "Иванов И.И.",
                "Форсаж");
        Mechanic<Truck> petrov = new Mechanic<Truck>(
                "Петров А.А.",
                "Молния");
        Mechanic<Bus> orlov = new Mechanic<Bus>(
                "Орлов И.А.",
                "Орел");
        Sponsor xbet = new Sponsor("1XBET", 10_000_000);
        Sponsor ligastavok = new Sponsor("Лига ставок", 5_000_000);


        Car audi = new Car(
                "Audi",
                "A8",
                3.0f,
                BodyType.SEDAN);

        audi.printType();
        audi.addDriver(new DriverB(
                "Driver A",
                5,
                audi));
        audi.addMechanic(ivanov);
        audi.addSponsor(xbet,ligastavok);

//        DriverB driverB = new DriverB(
//                "Driver A",
//                5,
//                audi);
//        System.out.println(driverB);

        Truck kamaz = new Truck(
                "KAMAZ",
                "4911-EXTREME",
                17.2f,
                LoadType.N3);

        kamaz.printType();
        kamaz.addDriver(new DriverC(
                "Driver B",
                7,
                kamaz));
        kamaz.addMechanic(petrov);
        kamaz.addSponsor(xbet,ligastavok);

//        DriverC driverC = new DriverC(
//                "Driver B",
//                7,
//                kamaz);
//        System.out.println(driverC);

        Bus peugeot = new Bus(
                "Peugeot",
                "806",
                2.0f,
                CapacityType.ESPECIALLY_SMALL);

        peugeot.printType();
        peugeot.addDriver(new DriverD(
                "Driver C",
                5,
                peugeot));
        peugeot.addMechanic(orlov);
        peugeot.addSponsor(xbet);

//        DriverD driverD = new DriverD(
//                "Driver C",
//                5,
//                peugeot);
//        System.out.println(driverD);

        List<Transport> transports = List.of(audi,kamaz,peugeot);
        for (Transport transport:transports) {
            printInfo(transport);
        }

        try {
            audi.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
        try {
            kamaz.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
        try {
            peugeot.passDiagnostics();
        }catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }

    }
    public static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю "
                + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println();
    }

}
