package dz4;

    /**
     * Created by Виктор on 22.12.2015.
     */
    public abstract class Figure {
        final double PI = 3.14;
        abstract String getName();

        double getSquare() {
            return 0;
        }
        public static void main(String[] args){
            Figure figure = new Figure() {
                @Override
                String getName() {
                    return null;
                }
            };
            Figure circle = new Circle() {
                @Override
                protected double pow(double radius, int i) {
                    return 0;
                }

                @Override
                String getName() {
                    return null;
                }
            };
            circle.getSquare();

            Figure triangle = new Triangle() {
                @Override
                String getName() {
                    return null;
                }
            };
            triangle.getSquare();
            Figure rectangle = new Rectangle() {
                @Override
                String getName() {
                    return null;
                }
            };
            rectangle.getSquare();
            {
                System.out.println(figure.getName()  + " .Square -  " + figure.getSquare());
            }
        }
    }

