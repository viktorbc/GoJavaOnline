package ProjectCalculator;

public class CalculatorRunner {

    public static void main(String[] args) {
        CalculatorIO.showStartMessage();
        Calculator calculator = new Calculator();
        calculator.calculate();
    }

}