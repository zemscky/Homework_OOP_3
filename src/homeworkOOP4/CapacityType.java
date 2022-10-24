package homeworkOOP4;

public enum CapacityType {
    ESPECIALLY_SMALL ("до 10 мест"),
    SMALL ("до 25 мест"),
    AVERAGE ("40–50 мест"),
    BIG ("60–80 мест"),
    ESPECIALLY_BIG ("100–120 мест");

    private final String capacityType;
    CapacityType(String capacityType) {
        this.capacityType = capacityType;
    }

    public String getCapacityType() {
        return capacityType;
    }
}

