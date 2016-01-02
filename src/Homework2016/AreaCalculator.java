package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class AreaCalculator {
    public double arreaCalculatorRectangle(double width, double height){
        return width * height;
    }

    public double arreaCalculatorTriangle(double width, double height){
        return width * height / 2;
    }

    public double arreaCalculatorCircle(double radius){

        return (Math.pow(radius, 2) * Math.PI);
    }

}
