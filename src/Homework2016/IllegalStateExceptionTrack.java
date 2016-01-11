package Homework2016;

/**
 * Created by Виктор on 29.12.2015.
 */
public class  IllegalStateExceptionTrack extends Exception  {
    private int trackValue;
    public IllegalStateExceptionTrack (final int trackValue) {
        this.trackValue = trackValue;
    }
    public int getTrackValue() {
        return trackValue;
    }


}
