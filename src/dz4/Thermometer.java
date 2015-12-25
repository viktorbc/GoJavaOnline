package dz4;


    public class Thermometer {
        private double c;
        private double f;
        public static void main(String[] args) {

            public static double getC () {
                return c;
            }

        public void setC(double c) {
            this.c = c;
        }

        public double getF() {
            return f;
        }

        public void setF(double f) {
            this.f = f;
        }

        double celsium = (f - 32) * 8 / 10;


        double farhengeit = 8 * c / 10 + 32;


        System.out.println(celsium + " grad Celsium");
        System.out.println(farhengeit + " grad Farhengeit");
    }


}


