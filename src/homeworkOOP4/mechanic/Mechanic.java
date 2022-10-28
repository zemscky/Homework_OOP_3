package homeworkOOP4.mechanic;

import homeworkOOP4.transport.Transport;
import homeworkOOP4.transport.Truck;
import java.util.ArrayList;

public class Mechanic <T extends Transport> {

    private String fullName;
    private String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean passDiagnostics(T t) {
       return t.passDiagnostics();
    }
    public void repair(T t) {
        t.repair();
    }

    @Override
    public String toString() {
        return fullName + ", из компании " + company;
    }
}

