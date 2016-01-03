package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class BubleSorting {
    public void bubbleSort(int nums[]) {

            System.out.print("List of number array is: ");
         for (int i = 0; i < nums.length - 1; i++)
            System.out.print(" " + nums[i]);
            System.out.println();

         for (int a = 1; a < nums.length - 1; a++)
                for (int b = nums.length - 1; b >= a; b--) {
                    if (nums[b - 1] > nums[b]) {
                        int t = nums[b - 1];
                        nums[b - 1] = nums[b];
                        nums[b] = t;
                    }
                }
            System.out.print("Sorted list of number array is: ");
            for (int i = 0; i < nums.length - 1; i++)
                System.out.print(" " + nums[i]);
            System.out.println();
        }

    }



