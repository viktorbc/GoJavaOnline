package Calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Виктор on 27.01.2016.
 */
    class CalcFrame extends JFrame {
        CalcFrame(String s) {
            super(s);
        }

        /*
         * handleEvent() - это обработчик событий, связанных с окном. Проверяя поле id, можно
         * определить какое событие произошло. В этом примере проверяется закрытие окна. Если
         * evt.id == Event.WINDOW_DESTROY, то необходимо выйти из среды JAVA с помощью
         * System.exit().
         */
        public boolean handleEvent(Event evt) {
            if (evt.id == Event.WINDOW_DESTROY) {
                System.exit(0);
                return true;
            } else
                return super.handleEvent(evt);
        }
    }

