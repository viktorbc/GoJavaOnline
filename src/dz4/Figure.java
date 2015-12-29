package dz4;
import java.lang.Math;
    public abstract class Figure {
            double a, b, c, d;
            double r;

            double area() {
                return (0);
            }

            static class Triangle extends Figure {

                @Override
                double area() {
                    double p = (a + b + c) / 2;
                    double psqrt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    double h = (2 / a) * psqrt;
                    return 0.5 * b * h;
                }

                Triangle(int x, int y, int z) {
                    a = x;
                    b = y;
                    c = z;
                }

            }

            static class Rectangle extends Figure {

                @Override
                double area() {
                    return a * b;
                }

                Rectangle(int x, int y, int z, int j) {
                    a = x;
                    b = y;
                    c = z;
                    d = j;
                }

            }

            static class Circle extends Figure {

                @Override
                double area() {
                    return 3.14 * r * r;
                }

                Circle(int x) {
                    r = x;
                }

            }
        }
