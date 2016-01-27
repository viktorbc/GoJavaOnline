package Calculator;

import javax.swing.*;
import java.awt.*;
/*
 * Реализация простого калькулятора
 */
public class Calculator extends JPanel {
    TextField txtDisp;
    public final int OP_NONE = 0;
    public final int OP_ADD = 1;
    public final int OP_SUB = 2;
    public final int OP_MUL = 3;
    public final int OP_DIV = 4;
    public final int OP_NEG = 5;
    public final int OP_SQRT = 6;
    public final int OP_EQ = 7;
    public final int OP_C = 8;
    public final int OP_AC = 9;
    public final int OP_PCT = 14;
    public final int DECSEP = -1;

    long U;
    double V;
    String msDecimal;
    int mnOp = OP_NONE;
    boolean mbNewNumber = true;
    boolean mbDecimal = false;
    double mdReg = 0.0;
    boolean mbConstant = false;
    double mdConstant = 0.0;
    int mnConstantOp = OP_NONE;
    boolean mbPercent = false;
    double mdFirst = 0.0;

    /*
     * В методе init() происходит первичная инициализация панели ( описываются кнопки
     * калькулятора, устанавливается цвет)
     */
    public void init() {
        Calculator btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
        Calculator btnDecSep, btnNeg, btnSqrt, btnPlus, btnMinus;
        Calculator btnTimes, btnDiv, btnEqual, btnClear, btnAllClear;
        Calculator btnPercent;

        setLayout(null); // Отключение компоновщика JAVA,
        // т. е. расположение кнопок будет производиться
        // самим разработчиком с помощью методов add() и
        // reshape()

        // Установка шрифта
        setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 16));

        setBackground(new Color(0x772244));

        // Формирование кнопок калькулятора

        btn0 = new Calculator.CalcButton("0", OP_NONE, 0);
        add(btn0);
        btn0.setBounds(8, 176, 96, 24);

        btn1 = new Calculator.CalcButton("1", OP_NONE, 1);
        add(btn1);
        btn1.setBounds(8, 144, 40, 24);

        btn2 = new Calculator.CalcButton("2", OP_NONE, 2);
        add(btn2);
        btn2.setBounds(64, 144, 40, 24);

        btn3 = new Calculator.CalcButton("3", OP_NONE, 3);
        add(btn3);
        btn3.setBounds(120, 144, 40, 24);

        btn4 = new Calculator.CalcButton("4", OP_NONE, 4);
        add(btn4);
        btn4.setBounds(8, 112, 40, 24);

        btn5 = new Calculator.CalcButton("5", OP_NONE, 5);
        add(btn5);
        btn5.setBounds(64, 112, 40, 24);

        btn6 = new Calculator.CalcButton("6", OP_NONE, 6);
        add(btn6);
        btn6.setBounds(120, 112, 40, 24);

        btn7 = new Calculator.CalcButton("7", OP_NONE, 7);
        add(btn7);
        btn7.setBounds(8, 80, 40, 24);

        btn8 = new Calculator.CalcButton("8", OP_NONE, 8);
        add(btn8);
        btn8.setBounds(64, 80, 40, 24);

        btn9 = new Calculator.CalcButton("9", OP_NONE, 9);
        add(btn9);
        btn9.setBounds(120, 80, 40, 24);

        btnDecSep = new Calculator.CalcButton(".", OP_NONE, DECSEP);
        add(btnDecSep);
        btnDecSep.setBounds(120, 176, 40, 24);

        btnNeg = new Calculator.CalcButton("+/-", OP_NEG, 0);
        add(btnNeg);
        btnNeg.setBounds(8, 48, 40, 24);

        btnSqrt = new Calculator.CalcButton("Sqrt", OP_SQRT, 0);
        add(btnSqrt);
        btnSqrt.setBounds(64, 48, 40, 24);

        btnPlus = new Calculator.CalcButton("+", OP_ADD, 0);
        add(btnPlus);
        btnPlus.setBounds(176, 144, 40, 56);

        btnMinus = new Calculator.CalcButton("-", OP_SUB, 0);
        add(btnMinus);
        btnMinus.setBounds(176, 80, 40, 56);

        btnTimes = new Calculator.CalcButton("в", OP_MUL, 0);
        add(btnTimes);
        btnTimes.setBounds(232, 80, 40, 24);

        btnDiv = new Calculator.CalcButton("В", OP_DIV, 0);
        add(btnDiv);
        btnDiv.setBounds(232, 112, 40, 24);

        btnEqual = new Calculator.CalcButton("=", OP_EQ, 0);
        add(btnEqual);
        btnEqual.setBounds(232, 144, 40, 56);

        btnClear = new Calculator.CalcButton("C", OP_C, 0);
        add(btnClear);
        btnClear.setBounds(232, 48, 40, 24);

        btnAllClear = new Calculator.CalcButton("AC", OP_AC, 0);
        add(btnAllClear);
        btnAllClear.setBounds(176, 48, 40, 24);

        btnPercent = new Calculator.CalcButton("%", OP_PCT, 0);
        add(btnPercent);
        btnPercent.setBounds(120, 48, 40, 24);

        txtDisp = new TextField("0", 80);
        txtDisp.setEditable(false);
        add(txtDisp);
        txtDisp.setBounds(4, 8, 268, 31);

        // Вывод на табло калькулятора десятичной точки

        String sOneTenth = (new Double(0.1)).toString();
        msDecimal = sOneTenth.substring(sOneTenth.length() - 2).substring(0, 1);
    }

    // Формирование из цифр числа
    public void append(int nValue) {
        String sDigit;

        if (nValue == DECSEP) if (!mbDecimal) // Проверка на наличие десятых долей
        {
            if (mbNewNumber) {
                txtDisp.setText("0");
                mbNewNumber = false;
            }
            mbDecimal = true;
            sDigit = msDecimal;
        } else
            return;
        else
            sDigit = (new Integer(nValue)).toString();
        if (mbNewNumber) {
            txtDisp.setText(sDigit);
            if (nValue != 0) mbNewNumber = false;
        } else

            txtDisp.setText(txtDisp.getText() + sDigit);
        repaint();
    }

    // В методе doOp() определяеся какое действие предстоит выполнить над

    // над введенными числами. И выполняются вычисления.
    public void doOp(int nNewOp) {
        double dDisp;

        dDisp = (new Double(txtDisp.getText())).doubleValue();
        if (mbPercent) if (nNewOp != OP_ADD && nNewOp != OP_SUB) mbPercent = false;
        if (!mbPercent) switch (nNewOp) {
            case OP_ADD:
            case OP_SUB:
            case OP_MUL:
            case OP_DIV:
                if (mbNewNumber) {
                    if (nNewOp == mnOp && !mbConstant) {
                        mbConstant = true;
                        mdConstant = dDisp;
                        mnConstantOp = nNewOp;
                    } else
                        mbConstant = false;
                } else
                    mbConstant = false;
            case OP_EQ:
            case OP_PCT:
                if (!mbNewNumber || isEqOp(nNewOp)) {
                    if (mbConstant) {
                        mdReg = mdConstant;
                        mnOp = mnConstantOp;
                    }
                    mbPercent = nNewOp == OP_PCT;
                    if (mbPercent) mdFirst = mdReg;
                    switch (mnOp) {
                        case OP_ADD:
                            mdReg = mdReg + dDisp;
                            break;
                        case OP_SUB:
                            mdReg = mdReg - dDisp;
                            break;
                        case OP_MUL:
                            mdReg = mdReg * dDisp;
                            break;
                        case OP_DIV:
                            mdReg = mdReg / dDisp;
                            break;
                        case OP_EQ:
                        case OP_PCT:
                        case OP_NONE:
                            mdReg = dDisp;
                            break;
                    }
                    if (mbPercent) mdReg /= 100;
                    U = ((new Double(mdReg)).longValue());
                    V = mdReg % 1;
                    if (V == 0) txtDisp.setText((new Long(U)).toString());
                    else
                        txtDisp.setText((new Double(mdReg)).toString());
                }
                mnOp = nNewOp; // Определение нажатой не числовой
                mbNewNumber = true; // кнопки закончено. Восстановливаются
                mbDecimal = false; // параметры для ввода цифр
                break;
        }
        switch (nNewOp) {
            case OP_ADD:
                if (mbPercent) {
                    mdReg = mdFirst + mdReg;
                    txtDisp.setText((new Double(mdReg)).toString());
                    mbPercent = false;
                }
                break;
            case OP_SUB:
                if (mbPercent) {
                    mdReg = mdFirst - mdReg;
                    txtDisp.setText((new Double(mdReg)).toString());
                    mbPercent = false;
                }
                break;
            case OP_NEG:
                dDisp = -dDisp;
                U = ((new Double(dDisp)).longValue());
                V = dDisp % 1;
                if (V == 0) txtDisp.setText((new Long(U)).toString());
                else
                    txtDisp.setText((new Double(dDisp)).toString());
                if (isEqOp(mnOp)) {
                    mdReg = dDisp;
                }
                break;
            case OP_SQRT:
                dDisp = Math.sqrt(dDisp);
                U = ((new Double(dDisp)).longValue());
                V = dDisp % 1;
                if (V == 0) txtDisp.setText((new Long(U)).toString());
                else
                    txtDisp.setText((new Double(dDisp)).toString());
                if (isEqOp(mnOp)) {
                    mdReg = dDisp;
                }
                mbNewNumber = true;
                mbDecimal = false;
                break;
            case OP_C:
                dDisp = 0.0;
                txtDisp.setText("0");
                if (isEqOp(mnOp)) {
                    mdReg = dDisp;
                }
                mbNewNumber = true;
                mbDecimal = false;
                break;
            case OP_AC:
                txtDisp.setText("0");
                mnOp = OP_NONE;
                mbNewNumber = true;
                mbDecimal = false;
                mdReg = 0.0;
                mbConstant = false;
                break;

        }
    }

    // isEqOP -- это вспомогательная функция для алгебраических вычислений
    private boolean isEqOp(int nOp) {
        return nOp == OP_EQ || nOp == OP_PCT;
    }

    public static void main(String args[]) // Организация окна
    {
        Calculator.CalcFrame frm = new Calculator.CalcFrame("Calculator");
        Calculator pnl = new Calculator();
        pnl.init();
        frm.add("Center", pnl);
        frm.pack();
        frm.setSize(286, 240);
        frm.setVisible(true);
    }

}
