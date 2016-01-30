package ProjectCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Андрей Шевченко on 28.01.2016.
 */
public class CalculatorIO {

    public static void showStartMessage() {
        System.out.println("Hello! This is S P A R T A A A A A ! ! !");
    }

    public static double inputOperand() {
        boolean isRightInput = false;
        double operand = 0;
        do {
            try {
                System.out.print("Enter new operand(Use coma as decimal separator) => ");
                Scanner scanner = new Scanner(System.in);
                operand = scanner.nextDouble();
                isRightInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("[Error]: The data entered is not a number, please re-enter");
            }
        } while (!isRightInput);
        return operand;
    }

    public static String inputOperation() {
        boolean isRightInput = false;
        String[] possibleOperations = {"+", "-", "*", "/", "="};
        String typeOperation;
        do {
            System.out.print("Specify operation. Use symbols (");
            for (int i = 0; i < possibleOperations.length; i++) {
                System.out.print(" \"" + possibleOperations[i] + "\"");
            }
            System.out.print(" ) => ");
            Scanner scanner = new Scanner(System.in);
            typeOperation = scanner.next();
            for (int i = 0; i < possibleOperations.length; i++) {
                if (typeOperation.equals(possibleOperations[i])) {
                    isRightInput = true;
                }
            }
            if (!isRightInput) {
                System.out.println("[Error]: The wrong type of operation, please re-enter");
            }
        } while (!isRightInput);
        return typeOperation;
    }

    public static void outputData(double result) {
        System.out.println("Result is: " + result);
    }

}