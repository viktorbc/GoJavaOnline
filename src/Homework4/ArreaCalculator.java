package Homework4;
import java.lang.Math;
/**
 * Created by Виктор on 02.01.2016.
 */
public class ArreaCalculator {
    double width;
    double height;
    double radius;
    double Pi = 3.14;


    public double ArreaCalculatorRectangle(){
        return width * height;
    }
    ArreaCalculator(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double ArreaCalculatorTriangle(){
        return width * height / 2;
    }

    public double ArreaCalculatorCircle(){

        return radius * radius * Pi;
    }
    ArreaCalculator(double radius) {
        this.radius = radius;
    }
}
