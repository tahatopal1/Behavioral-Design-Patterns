package Command.CalculatorNew;

import java.math.BigDecimal;

public class Divide implements Calculation {
    @Override
    public BigDecimal calculation(BigDecimal operandOne, BigDecimal operandTwo) {
        return operandOne.divide(operandTwo);
    }
}
