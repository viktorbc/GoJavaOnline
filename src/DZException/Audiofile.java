package DZException;

import java.io.IOException;

/**
 * Created by Виктор on 12.01.2016.
 */
public class Audiofile extends File {
    public static void openSong(String song) throws IOException {

        if (song.length() == 0) {
            throw new IOException(
                    "Error: empty name file of song");
        }
    }

}

