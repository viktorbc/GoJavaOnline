package dz51;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArrayCompareNumber {
    public static void main(String[] args) {

        int[] Array_mn = {10, 5, 3, 2, 6, 20, 7, 4};
        int ArrayMaximum = Array_mn[0];
        for (int i = 0; i < Array_mn.length - 1 ; i++) {
            if (ArrayMaximum < Array_mn[i]) {
                ArrayMaximum = Array_mn[i];
            }
            else {
                ArrayMaximum = ArrayMaximum;
            }
        }
        System.out.println("Maximum number " + ArrayMaximum);
        int ArrayMinimum = Array_mn[0];
        for (int i = 0; i < Array_mn.length - 1 ; i++) {
            if (ArrayMinimum > Array_mn[i]) {
                ArrayMinimum = Array_mn[i];
            }
            else {
                ArrayMinimum = ArrayMinimum;
            }
        }
        System.out.println("Minimum number " + ArrayMinimum);
    }
}



