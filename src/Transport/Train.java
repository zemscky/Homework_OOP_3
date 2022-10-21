package Transport;

public class Train extends Transport{
    private double tripPrice; // цена
    private int travelTime; // время поездки
    private String departureStationName; // Название станции отбытия
    private String endingStation; // Конечная остановка
    private int numberOfWagons; // кол-во вагонов

    public Train(String brand,
                 String model,
                 int manufacturingYear,
                 String manufacturingCountry,
                 String color,
                 double tripPrice,
                 int travelTime,
                 String departureStationName,
                 String endingStation,
                 int numberOfWagons,
                 int maximalSpeed
    ) {

        super(brand, model, manufacturingYear, manufacturingCountry, color, maximalSpeed);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setDepartureStationName(departureStationName);
        setEndingStation(endingStation);
        setNumberOfWagons(numberOfWagons);
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = Math.max(tripPrice, 0);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 0);
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = ValidationUtils.validOrDefault(departureStationName, "Информация не указана");
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = ValidationUtils.validOrDefault(endingStation, "Информация не указана");;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.max(numberOfWagons, 1);
    }

    @Override
    public String toString() {
        return "Train: " +
                "Цена поездки - " + tripPrice + " рублей " +
                ", время поездки - " + travelTime +
                ", станция отбытия - " + departureStationName +
                ", конечная станция - " + endingStation +
                ", количество вагонов - " + numberOfWagons
                ;
    }
}
