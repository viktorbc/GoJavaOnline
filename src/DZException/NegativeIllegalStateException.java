package DZException;

/**
 * Created by Виктор on 12.01.2016.
 */
public class NegativeIllegalStateException extends Exception {
    private int trackValue;
    public NegativeIllegalStateException(final int trackValue) {
        this.trackValue = trackValue;
    }
    public int getTrackValue() {
        return trackValue;
    }
}
