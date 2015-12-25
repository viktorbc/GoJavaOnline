package dz4;


public class Distance {
    public static void main(String[] args) {
        double x1 = 5, x2 = 10;
        double y1 = 15, y2 = 25;
        double z = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double distance = Math.sqrt(z);
        System.out.println("The distance between points" + distance);
    }
}