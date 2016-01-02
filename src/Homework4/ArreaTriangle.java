package Homework4;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArreaTriangle extends ArreaCalculator {
    ArreaTriangle(double width, double height) {
        super(width, height);
    }

    public static void main(String[] args) {
        ArreaTriangle triangle = new ArreaTriangle(10, 20);
        double vol;
        vol = triangle.ArreaCalculatorRectangle();
        System.out.println("Площадь треугольника равна = " + vol);

    }

}
