package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public String DataCar() {
        String strCar = "id: " + id;
        strCar += "\nLicense: " + license;
        strCar += "\nDriver: " + driver.name;
        strCar += "\nPassenger: " + passenger;
        return strCar;
    }
}
