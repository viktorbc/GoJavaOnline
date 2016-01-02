package Homework4;

import Homework4.Distance;

/**
 * Created by Виктор on 30.12.2015.
 */
public class Distance1 {
    public static void main(String[] args) {
        Distance space = new Distance();
        double interval;

        space.setPoint(20, 30, 100, 140);
        interval = space.Length();
        System.out.println("The distance between points" + interval);
    }
}
