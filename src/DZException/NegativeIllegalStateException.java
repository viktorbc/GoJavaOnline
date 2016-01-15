package DZException;

/**
 * Created by Виктор on 12.01.2016.
 */
public class NegativeIllegalStateException extends Exception {
    private int trackValue;
    public NegativeIllegalStateException() {

        this.trackValue = trackValue; //ассоциируется сам с собой
    }

    public int getTrackValue() {// метод не используется
        return trackValue;
    }

}
