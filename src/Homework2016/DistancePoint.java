package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class DistancePoint {
    double Length(double x1, double x2, double y1, double y2) {
        double z = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(z);
    }
}


