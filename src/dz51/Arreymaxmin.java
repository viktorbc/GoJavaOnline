package dz51;
public class Arreymaxmin {
    public static void main(String[] args) {

        int[] Arrey_mn = {10, 5, 3, 2, 6, 20, 7, 4};
        int max = 0, min = Arrey_mn[0];
        for (int i = 0; i < 8; i++) {
            if (Arrey_mn[i] < max) {
                max = max;
            } else {
                max = Arrey_mn[i];
            }
            if (Arrey_mn[i] > min) {
                min = min;
            }
            else {
                min = Arrey_mn[i];
            }
        }


        for (int i = 0; i < 8; i++) {
            if (Arrey_mn[i] > min) {
                min = min;
            }
            else {
                min = Arrey_mn[i];
            }

        }
        System.out.println("Max number " + max);
        System.out.println("Min number " + min);
    }
}


