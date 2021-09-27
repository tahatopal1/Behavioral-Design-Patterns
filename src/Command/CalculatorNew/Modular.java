package Command.CalculatorNew;

import java.math.BigDecimal;

public class Modular implements Calculation {
    @Override
    public BigDecimal calculation(BigDecimal operandOne, BigDecimal operandTwo) {
        return operandOne.remainder(operandTwo);
    }
}
