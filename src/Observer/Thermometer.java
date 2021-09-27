package Observer;

import java.math.BigDecimal;

public class Thermometer extends Observable {

    private BigDecimal instantTemperature;
    private BigDecimal maximumTemperature;
    private BigDecimal minimumTemperature;

    public Thermometer(BigDecimal maximumTemperature, BigDecimal minimumTemperature) {
        this.maximumTemperature = maximumTemperature;
        this.minimumTemperature = minimumTemperature;
        instantTemperature = BigDecimal.valueOf(24);
    }

    public BigDecimal getInstantTemperature() {
        return instantTemperature;
    }

    public void setInstantTemperature(BigDecimal instantTemperature) {
        this.instantTemperature = instantTemperature;
        System.out.println("Instant temperature: " + instantTemperature);
        checkTemperature();
    }

    private void checkTemperature() {

        boolean isTooHot = instantTemperature.compareTo(maximumTemperature) > 0;
        boolean isTooCold = instantTemperature.compareTo(minimumTemperature) < 0;

        if (isTooHot || isTooCold)
            notification();

    }
}
