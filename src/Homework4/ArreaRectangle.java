package Homework4;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArreaRectangle extends ArreaCalculator {
    ArreaRectangle(double width, double height) {
        super(width, height);
    }

    public static void main(String[] args) {
        ArreaRectangle rectangle = new ArreaRectangle(10, 5);
        double vol;
        vol = rectangle.ArreaCalculatorRectangle();
        System.out.println("Площадь прямоугольника равна = " + vol);

    }
}
