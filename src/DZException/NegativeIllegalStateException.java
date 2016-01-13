package DZException;

/**
 * Created by Виктор on 12.01.2016.
 */
public class NegativeIllegalStateException extends Exception {
    private int trackValue;
    public NegativeIllegalStateException() {
        super("invalid number entered");
        this.trackValue = trackValue;
    }

    public int getTrackValue() {
        return trackValue;
    }

}
