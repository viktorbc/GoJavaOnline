package dz51;

/**
 * Created by Виктор on 04.01.2016.
 */
public class ArrCompare {
    public static void main(String[] args){
       int arr[] = {-5, 5, -30, 10, 4, -50, 8, 20, - 10};
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


        System.out.println(" Max number " + maxNumber);

        System.out.println(" Min number " + minNumber);

        System.out.println();
    }
}
