package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArrayCompareNumber {
    public void arrayCompareNumberMax(int arr[]) {
        int maxNumber = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i + 1] < arr[i]) {
                arr[i] = arr[i + 1] + arr[i];
                arr[i + 1] = arr[i] - arr[i + 1];
                arr[i] = arr[i] - arr[i + 1];
                maxNumber = arr[i + 1];
            }
            else {
                maxNumber = arr[i];
            }
        }
    }
    public void arrayCompareNumberMin(int arr[]) {
        int minNumber = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i] < arr[i + 1]) {
                arr[i + 1] = arr[i + 1] + arr[i];
                arr[i] = arr [i + 1] - arr[i];
                arr[i + 1] = arr[i + 1] - arr[i];
                minNumber = arr[i + 1];
            }
            else {
                minNumber = arr[i];
            }
        }
    }

}




