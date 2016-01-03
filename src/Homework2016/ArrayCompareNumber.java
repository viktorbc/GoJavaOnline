package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArrayCompareNumber {
    public  void arrayCompare(int[] Array_mn, int ArrayMaximum, int ArrayMinimum) {


        for (int i = 0; i < Array_mn.length - 1 ; i++) {
            if (ArrayMaximum < Array_mn[i]) {
                ArrayMaximum = Array_mn[i];
            }
            else {
                ArrayMaximum = ArrayMaximum;
            }
        }


        for (int i = 0; i < Array_mn.length - 1 ; i++) {
            if (ArrayMinimum > Array_mn[i]) {
                ArrayMinimum = Array_mn[i];
            }
            else {
                ArrayMinimum = ArrayMinimum;
            }
        }

    }
}



