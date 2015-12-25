package dz4;



    abstract class Circle extends Figure {
        private double radius;
        protected abstract double pow(double radius, int i );
        public double getRadius() {

            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        double Area = Math.pow(radius, 2) * PI;



        public double getArea() {
            return Area;
        }

    }

