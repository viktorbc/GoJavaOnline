package Calculator;

import java.awt.*;

/**
 * Created by Виктор on 27.01.2016.
 */
 class CalcButton extends Button {
    int mnOp;
    int mnValue;

    CalcButton(String sText, int nOp, int nValue) {
        super(sText);
        mnOp = nOp;
        mnValue = nValue;
    }

    public boolean action(Event evt, Object arg) {
        Calculator par = (Calculator) getParent();

        if (mnOp == par.OP_NONE) // Если ввденный символ цифра
            par.append(mnValue);
        else
            par.doOp(mnOp); // если не цифра
        return true;
    }
}
