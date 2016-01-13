package DZException;

import java.io.IOException;
import java.util.Scanner;

import static DZException.Audiofile.openSong;
import static DZException.Audiofile.openTrack;

/**
 * Created by Виктор on 12.01.2016.
 */
public class OpenAudioFile {

    public static void main(String args[]) throws IOException, NegativeIllegalStateException {
        int[] arrSongsAlbum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(" Enter  number track song ");
        final Scanner scanner = new Scanner(System.in);
        final String song = scanner.next();
        final String numberTrack = scanner.next();
        try {
            final int trackValue = Integer.parseInt(numberTrack);
         openTrack(Integer.parseInt(""));
        }
        catch (NegativeIllegalStateException ex) {
            System.out.printf( "Track № " + ex.getTrackValue() + "  Error: - this track is not in album "  + " track should be 0 to " + arrSongsAlbum.length + " ");
            System.out.println("");
        }

        System.out.println(" Enter  name audio file ");
        try {
            openSong("");

        } catch (IOException e) {
            System.out.printf("Error: empty name file of song " + song);
            System.out.println("");
        }


    }


}
