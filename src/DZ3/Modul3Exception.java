package DZ3;

import Homework2016.IllegalStateExceptionTrack;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Виктор on 12.01.2016.
 */
public class Modul3Exception {
    static void openFile(String fileName) throws IOException, IllegalStateException {

        if (fileName.length() == 0) {
            throw new IOException(
                    "empty filename");
        }
    }

    public static void main(String args[])  {
        int[] arrSongsAlbum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" Enter  number track song ");
        final Scanner scanner = new Scanner(System.in);
        final String numberTrack = scanner.next();
        try {
            final int track = Integer.parseInt(numberTrack);
            if (  track < arrSongsAlbum.length && track > -1) {
                System.out.println("  your choice track number " + track);
            }
            else {
                throw new IllegalStateExceptionModul3(track);
            }
        }

        catch (IllegalStateExceptionModul3 e) {
            System.out.printf( "Track № " + e.getTrackValue() + "  Error: - this track is not in album "  + " track should be 0 to " + arrSongsAlbum.length + " ");
            System.out.println("");
        }

        System.out.println(" Enter  name album ");
        final String fileName = scanner.next();
        try {
            openFile("");
        }
        catch (IOException e) {
            System.out.printf( "Error: empty filename " );
            System.out.println("");
        }
    }
}
