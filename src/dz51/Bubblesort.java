package dz51;

/**
 * Created by Виктор on 25.12.2015.
 */
public class Bubblesort {
    public static void main(String args[]) {
        // Инициализация массива
        int nums[] = {55, 17, 100, 8, 37,
                28, 320, 87, 65, 22};
        int a, b, t;
        System.out.print("List of number array is: ");
        for(int i = 0; i < nums.length - 1; i++)
            System.out.print(" " + nums[i]);
        System.out.println();


        for(a = 1; a < nums.length - 1; a++)
            for(b = nums.length - 1; b >= a; b--) {
                if(nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }


        System.out.print("Sorted list of number array is: ");
        for(int i = 0; i < nums.length - 1; i++)
            System.out.print(" " + nums[i]);
            System.out.println();
    }
}
