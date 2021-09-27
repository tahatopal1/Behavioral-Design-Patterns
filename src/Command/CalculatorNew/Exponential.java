package Command.CalculatorNew;

import java.math.BigDecimal;

public class Exponential implements Calculation {
    @Override
    public BigDecimal calculation(BigDecimal operandOne, BigDecimal operandTwo) {
        return operandOne.pow(operandTwo.intValue());
    }
}
