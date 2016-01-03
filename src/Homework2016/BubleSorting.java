package Homework2016;

/**
 * Created by Виктор on 02.01.2016.
 */
public class BubleSorting {
    public void bubbleSort(int nums[], int temp) {

        for (int a = 1; a < nums.length - 1; a++)
            for (int b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    temp = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = temp;
                }
            }
    }
}

