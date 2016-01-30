package ProjectCalculator;

public class Operations {

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double divide(double operand1, double operand2) throws DivisionByZeroException {
        if (operand2 == 0) {
            throw new DivisionByZeroException ("[Error]: Division by zero is impossible");
        }
        return operand1 / operand2;
    }
}