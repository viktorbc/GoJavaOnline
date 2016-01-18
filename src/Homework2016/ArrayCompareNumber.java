package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class ArrayCompareNumber {
       public static void arrayCompareNumber(int arr[]) {
           int maxNumber = arr[0], minNumber = arr[0];
           for (int i = 0; i <= arr.length - 1; i++) {
               if (maxNumber < arr[i]) {
                   maxNumber = arr[i];
                   System.out.println(" Max number " + maxNumber + "   " + arr[i]);
               }
               if (minNumber > arr[i]) {
                   minNumber = arr[i];
               }
           }
           System.out.println(" Max number " + maxNumber);

           System.out.println(" Min number " + minNumber);

           System.out.println();
       }

    public static void main(String[] args) {
        int[] tempArray = {1, 2, 3, -10, 0, -20, -50, 25};
        arrayCompareNumber(tempArray);
    }
}





