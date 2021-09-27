package Command.CalculatorNew;

import java.math.BigDecimal;

public class App2 {
    public static void main(String[] args) {

        BigDecimal op1 = BigDecimal.TEN;
        BigDecimal op2 = BigDecimal.valueOf(2);

        BigDecimal addition = CalculatorNew.calculate(new Addition(), op1, op2);
        BigDecimal substracion = CalculatorNew.calculate(new Subtraction(), op1, op2);
        BigDecimal multiplication = CalculatorNew.calculate(new Multiplication(), op1, op2);
        BigDecimal division = CalculatorNew.calculate(new Divide(), op1, op2);
        BigDecimal exponention = CalculatorNew.calculate(new Exponential(), op1, op2);
        BigDecimal modular = CalculatorNew.calculate(new Modular(), op1, op2);

        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substracion);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Exponention: " + exponention);
        System.out.println("Modular: " + modular);

    }
}
