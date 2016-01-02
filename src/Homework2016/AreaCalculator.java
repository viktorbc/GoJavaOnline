package Homework2016;

import static java.lang.Math.PI;

/**
 * Created by Виктор on 02.01.2016.
 */
public class AreaCalculator {
    public double ArreaCalculatorRectangle(double width, double height){
        return width * height;
    }

    public double ArreaCalculatorTriangle(double width, double height){
        return width * height / 2;
    }

    public double ArreaCalculatorCircle(double radius){

        return radius * radius * PI;
    }

}
