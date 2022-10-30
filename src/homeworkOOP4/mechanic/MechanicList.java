package homeworkOOP4.mechanic;

import java.util.HashSet;
import java.util.Set;

public class MechanicList {
    private final Set<Mechanic> mechanics = new HashSet<>();

    public void add(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }

    public Mechanic findByName(String name) {
        for (Mechanic mechanic : mechanics) {
            if (mechanic.getFullName() == name) {
                return mechanic;
            }
        }
        return null;
    }
}
