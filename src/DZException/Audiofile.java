package DZException;

import DZException.NegativeIllegalStateException;

import java.io.IOException;

/**
 * Created by Виктор on 12.01.2016.
 */
public class Audiofile extends File {

    public static void openTrack(final int trackValue)throws NegativeIllegalStateException {

        if (trackValue < 0)
            throw new NegativeIllegalStateException();
    }

    public static void openSong(String song) throws Exception {

        if (song.length() == 0) {
            throw new IOException(
                    "Error: empty name file of song");
        }
    }

}

