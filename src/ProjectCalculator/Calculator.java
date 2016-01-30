package ProjectCalculator;

public class Calculator {

    public void calculate() {
        double operand;
        double result;
        String typeOperation;
        boolean isWrongExit = false;
        result = CalculatorIO.inputOperand();
        // этот цикл нужен на тот случай, если пользователь первым действием выберет "=", тогда возращаем значение операнда
        do {
            typeOperation = CalculatorIO.inputOperation();
            if (typeOperation.equals("=")) {
                System.out.println("Operand = " + result);
            }
        } while (typeOperation.equals("="));
        do {
            operand = CalculatorIO.inputOperand();
            switch (typeOperation) {
                case "+":
                    result = Operations.add(result, operand);
                    break;
                case "-":
                    result = Operations.subtract(result, operand);
                    break;
                case "*":
                    result = Operations.multiply(result, operand);
                    break;
                case "/":
                    try {
                        result = Operations.divide(result, operand);
                        // ловим деление на 0, задаем условие выхода и убираем печать результата на экран
                    } catch (DivisionByZeroException ex) {
                        typeOperation = "=";
                        isWrongExit = true;
                    }
                    break;
            }
            // если операция на равна "=", тогда продолжаем ввод математических действий и операндов
            if (!typeOperation.equals("=")) {
                typeOperation = CalculatorIO.inputOperation();
            }
        } while (!typeOperation.equals("="));
        // если не было деления на 0, выводим результат на экран
        if (!isWrongExit) {
            CalculatorIO.outputData(result);
        }
    }

}