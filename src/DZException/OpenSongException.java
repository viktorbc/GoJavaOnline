package DZException;

import java.io.IOException;
import java.util.Scanner;
import static DZException.Audiofile.openSong;

/**
 * Created by Виктор on 12.01.2016.
 */
public class OpenSongException {
    public static void main(String args[]) throws IOException {

        System.out.println(" Enter  name audio file ");
        final Scanner scanner = new Scanner(System.in);
        final String song = scanner.next();

        try {
            openSong("");
        } catch (IOException e) {
            System.out.printf("Error: empty name file of song " + song);
            System.out.println("");
        }
    }
}
