package Command.CalculatorNew;

import java.math.BigDecimal;

public class CalculatorNew {
    public static BigDecimal calculate(Calculation calc, BigDecimal opOne, BigDecimal opTwo){
        return calc.calculation(opOne, opTwo);
    }
}
