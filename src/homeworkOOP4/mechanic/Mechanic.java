package homeworkOOP4.mechanic;

import homeworkOOP4.transport.Transport;
import homeworkOOP4.transport.Truck;
import java.util.ArrayList;
import java.util.Objects;

public class Mechanic <T extends Transport> {

    private final String fullName;
    private final String company;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}

