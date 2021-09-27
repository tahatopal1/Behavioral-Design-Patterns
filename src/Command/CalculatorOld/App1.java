package Command.CalculatorOld;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {
        BigDecimal summary = CalculatorOld.calculation(CalculationType.ADDITION, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal substract = CalculatorOld.calculation(CalculationType.SUBTRACTION, BigDecimal.TEN, BigDecimal.ONE);

        // New operation
        BigDecimal expo = CalculatorOld.calculation(CalculationType.EXPONENTIAL, BigDecimal.TEN, BigDecimal.valueOf(2));

        // New operation
        BigDecimal mod = CalculatorOld.calculation(CalculationType.MODULAR, BigDecimal.TEN, BigDecimal.valueOf(3));

        // Changes never stop :)

        System.out.println("Sum: " + summary);
        System.out.println("Sub: " + substract);
        System.out.println("Expo: " + expo);
        System.out.println("Mod: " + mod);

    }
}
