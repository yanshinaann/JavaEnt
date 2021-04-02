package domain;

import java.util.HashMap;
import java.util.Map;

public class GasStation {
    String name;
    private Map<Car, FuelDispenser> stationMap = new HashMap<Car, FuelDispenser>();
    private Integer tradeMargin;

}
