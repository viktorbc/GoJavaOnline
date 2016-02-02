package dz4;

/**
 * Created by Виктор on 02.01.2016.
 */
public class DistancePoint {

    private int x1;
    private int x2;
    private int y1;
    private int y2;


    double length(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((x2 - x1),2));
    }

    public static void main(String[] args) {

       DistancePoint distancePoint = new DistancePoint();
       double point = distancePoint.length(5, 10, 20, 30);
       System.out.println(point);

    }


}


