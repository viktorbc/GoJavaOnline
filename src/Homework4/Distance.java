package Homework4;
import java.lang.Math;

public class Distance {

        double x1, x2, y1, y2;


    double Length(){
        double z = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(z);
    }

    public void setPoint( double x1, double x2, double y1, double y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

    }
