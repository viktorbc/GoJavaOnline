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

        System.out.println(" Enter  number track song ");
        final Scanner scanner = new Scanner(System.in);
        final String numberTrack = scanner.next();
        final int trackValue = Integer.parseInt(numberTrack);

        try {
        openTrack(trackValue);
        } catch (NegativeIllegalStateException e) {
            e.printStackTrace();
            System.out.println(" invalid number entered ");
        }

        System.out.println(" Enter  name audio file ");
        final String song = scanner.next();

        try {
            openSong("song"); // неправельный вызов метода
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.printf("Error: empty name file of song " + song);
        System.out.println("");



    }


}
