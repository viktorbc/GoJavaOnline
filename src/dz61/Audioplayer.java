package dz61;

        import Exemples.NegativeAge;

        import java.lang.*;
        import java.util.Scanner;
        import java.lang.String;

/**
 * Created by Виктор on 29.12.2015.
 */
public class Audioplayer {
    public static void main(String args[]) throws java.lang.IllegalStateException {

        int[] arrSongsAlbum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" Enter  number track song ");
        final Scanner scanner = new Scanner(System.in);
        final String numberTrack = scanner.next();
        try {
            final int track = Integer.parseInt(numberTrack);
            if (  track < arrSongsAlbum.length && track > -1) {
                System.out.println("  your choice track number " + track);
            } else {
                throw new IllegalStateExceptionTrack(track);
            }
        }

        catch (IllegalStateExceptionTrack e) {
            System.out.printf( "Track № " + e.getTrackValue() + "  Error: - this track is not in album "  + " track should be 0 to " + arrSongsAlbum.length + " ");
        }


    }


}
