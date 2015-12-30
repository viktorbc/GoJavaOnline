package dz51;
public class Arreymaxmin {
    public static void main(String[] args) {

        int[] Arrey_mn = {10, 5, 3, 2, 6, 20, 7, 4};
        int maximum = 0, minimum = Arrey_mn[0];
        for (int i = 0; i < 8; i++) {
            if (Arrey_mn[i] < maximum) {
                maximum = maximum;
            } else {
                maximum = Arrey_mn[i];
            }

        }
        for (int i = 0; i < 8; i++) {
            if (Arrey_mn[i] > minimum) {
                minimum = minimum;
            }
            else {
                minimum = Arrey_mn[i];
            }

        }
        System.out.println("Max number " + maximum);
        System.out.println("Min number " + minimum);
    }
}


