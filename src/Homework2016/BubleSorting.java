package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class BubleSorting {
    public void bubbleSort(int arr[]) {

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

