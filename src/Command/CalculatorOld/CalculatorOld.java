package Command.CalculatorOld;

import java.math.BigDecimal;

public class CalculatorOld {

    public static BigDecimal calculation(CalculationType calculationType, BigDecimal operandOne, BigDecimal operandTwo){

        BigDecimal result = BigDecimal.ZERO;

        if (CalculationType.ADDITION.equals(calculationType))
            result = operandOne.add(operandTwo);
        else if (CalculationType.SUBTRACTION.equals(calculationType))
            result = operandOne.subtract(operandTwo);
        else if (CalculationType.MULTIPLICATION.equals(calculationType))
            result = operandOne.multiply(operandTwo);
        else if (CalculationType.DIVIDE.equals(calculationType))
            result = operandOne.divide(operandTwo);
        // Here we need a new condition block for new operation
        else if (CalculationType.EXPONENTIAL.equals(calculationType))
            result = operandOne.pow(operandTwo.intValue());
        // Another one
        else if (CalculationType.MODULAR.equals(calculationType))
            result = operandOne.remainder(operandTwo);

        return result;

    }

}
