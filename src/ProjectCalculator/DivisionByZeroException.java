package ProjectCalculator;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String someText) {
        System.out.println(someText);
    }
}