package Command.CalculatorNew;

import java.math.BigDecimal;

public class Subtraction implements Calculation {
    @Override
    public BigDecimal calculation(BigDecimal operandOne, BigDecimal operandTwo) {
        return operandOne.subtract(operandTwo);
    }
}
