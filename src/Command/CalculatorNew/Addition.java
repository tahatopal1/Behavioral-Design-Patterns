package Command.CalculatorNew;

import java.math.BigDecimal;

public class Addition implements Calculation {
    @Override
    public BigDecimal calculation(BigDecimal operandOne, BigDecimal operandTwo) {
        return operandOne.add(operandTwo);
    }
}
