package dz41;
import java.lang.Math;

/**
 * Created by Виктор on 30.12.2015.
 */
public class Figure {
    double a, b, r;
    double  PI = 3.14;
      double ArreaRectangle() {
         return a * b;
     }
     public void setDim( double x, double y){
         a = x;
         b = y;
     }
     double ArreaTriangle() {
        return a * b / 2;
    }
    double ArreaCircle() {
        return r * r * PI;
    }
    public void setTim( double z){
        r = z;

    }
}
