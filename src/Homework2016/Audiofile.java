package Homework2016;

/**
 * Created by Виктор on 14.01.2016.
 */

import java.util.Scanner;

/**
 * Created by Виктор on 12.01.2016.
 */
public class Audiofile {

    public static void openTrack(final int trackValue)  {

            try {
                if  (trackValue < 0) {
                    throw new NegativeIllegalStateExceptionNew(trackValue);
                }
                System.out.println("  your song number " + trackValue);
            }
            catch (NegativeIllegalStateExceptionNew e) {
                System.out.printf(" Error:  number song should be > 0 ");
                System.out.println("");
            }

            catch (NumberFormatException ex ) {
                System.out.printf(" Error: - Number song should be an integer number! ");
            }


    }
    public static void main(String args[])  {

        System.out.println(" Enter  number track song ");

        final Scanner scanner = new Scanner(System.in);
        final String numberTrack = scanner.next();
        final int trackValue = Integer.parseInt(numberTrack);

        openTrack(trackValue);



    }
}

