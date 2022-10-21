package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport{
    private float engineVolume;
    private String gearBox;
    private final String bodyType;
    private String regNumber;
    private final int placesCount;
    private boolean winterTires;
    private  Key key;
    private  Insurance insurance;

    public Car(
            String brand,
            String model,
            float engineVolume,
            String color,
            int manufacturingYear,
            String manufacturingCountry,
            String gearBox,
            String bodyType,
            String regNumber,
            int placesCount,
            boolean winterTires,
            Key key,
            Insurance insurance) {

        super(brand, model, manufacturingYear, manufacturingCountry, color);

        this.bodyType = ValidationUtils.validOrDefault(bodyType, "седан");
        this.placesCount = Math.max(placesCount, 1);
        setEngineVolume(engineVolume);
        setGearBox(gearBox);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
        this.key = Objects.requireNonNullElseGet(key, Key::new);
        this.insurance = Objects.requireNonNullElseGet(insurance, Insurance::new);
    }

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int manufacturingYear,
               String manufacturingCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                manufacturingYear,
                manufacturingCountry,
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true,
                new Key(),
                new Insurance()
        );
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean itRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbol = "АВЕКМНОРСТУХ";
        return allowedSymbol.contains("" + symbol);
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = ValidationUtils.validOrDefault(gearBox, "МКПП");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtils.validOrDefault(regNumber, "х000х000");

    }

    public int getPlacesCount() {
        return placesCount;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key() {
            this (false,false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final  String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            }else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            }else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null,10_000,null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now()));
            System.out.println("Нужно ехать оформлять новую страховку!");
        }
        public void checkNumber() {
            if(number.length() !=9) {
                System.out.println("Номер страховку не корректный");
            }
        }
    }

    @Override
    public String toString() {
        return "Car: " +
                " марка - " + getBrand() +
                ", модель - " + getModel() +
                ", объем двигателя - " + getEngineVolume() + " л.с." +
                ", цвет кузова - " + getColor() +
                ", год производства - " + getManufacturingYear() +
                ", страна производства - " + getManufacturingCountry() +
                ", коробка переключения передач - " + getGearBox() +
                ", регистрационный номер - " + getRegNumber() +
                ", тип кузова - " + getBodyType() +
                ", количество мест - " + getPlacesCount() +
                ", " + (isWinterTires() ? "зимняя" : "летняя") + " резина" +
                ", " + (getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ" ) +
                ", " + (getKey().isRemoteRunEngine() ? "удаленный запуск" : "обычный запуск" ) +
                ", номер страховки - " + getInsurance().getNumber() +
                ", стоимость страховки - " + getInsurance().getCost() +
                ", срок действия страховки - " + getInsurance().getExpireDate();
    }
}
