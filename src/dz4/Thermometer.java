package dz4;
    public class Thermometer {
        static double f = 100;
        static double c = 20;
        public static void main(String[] args) {

            double celsium = (f - 32) * 8 / 10;
            double farhengeit = 8 * c / 10 + 32;
            System.out.println(farhengeit + " grad Farhengeit have equivalent " + celsium + " grad Celsium");
            System.out.println(celsium + " grad Celsium have equivalent " + farhengeit + " grad Farhengeit");

        }

}


