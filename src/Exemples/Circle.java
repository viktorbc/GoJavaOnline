package Exemples;

import java.lang.Math;
import dz4.Figure;

abstract class Circle extends Figure {
        private double radius;
        protected abstract double pow(double radius, int i );
        public double getRadius() {

            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        double Area = Math.pow(radius, 2) * 3.14;



        public double getArea() {
            return Area;
        }

    }

