package Command.CalculatorNew;

import java.math.BigDecimal;

public class Multiplication implements Calculation {
    @Override
    public BigDecimal calculation(BigDecimal operandOne, BigDecimal operandTwo) {
        return operandOne.multiply(operandTwo);
    }
}
