package Observer;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        BigDecimal min = BigDecimal.valueOf(23);
        BigDecimal max = BigDecimal.valueOf(28);

        Thermometer thermometer = new Thermometer(max, min);

        Parent mom = new Parent("Mom");
        Parent dad = new Parent("Dad");

        thermometer.add(mom);
        thermometer.add(dad);

        for (int i = thermometer.getInstantTemperature().intValue(); i <= 30; i++)
            thermometer.setInstantTemperature(BigDecimal.valueOf(i));

        for (int i = thermometer.getInstantTemperature().intValue(); i >= 22; i--)
            thermometer.setInstantTemperature(BigDecimal.valueOf(i));

    }
}
