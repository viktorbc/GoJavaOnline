package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArrayCompareNumber {
    public void arrayCompareNumberMax(int arr[]) {
        int maxNumber = arr[0], minNumber = arr[0];
        for (int i = 0; i < arr.length - 1 ; i++) {
            if( maxNumber < arr[i])
                maxNumber = arr[i];
            if ( minNumber > arr[i]) {
                minNumber = arr[i];
            }
            else {
                minNumber = minNumber;
            }
        }

    }
}




