package Java;

import java.util.Map;

public class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    Map<String, Map<String, Integer>> seatsMaterial;

    public UberVan(String license, Driver driver, Map<String, Map<String, Integer>> typeCarAccepted,
            Map<String, Map<String, Integer>> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
