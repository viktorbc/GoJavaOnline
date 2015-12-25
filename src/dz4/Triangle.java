package dz4;


    abstract class Triangle extends Figure {
        private double x = 10;
        private double y = 5;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
        public double getArea(){
            return x * y / 2;
        }


    }

