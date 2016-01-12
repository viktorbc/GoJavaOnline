package DZ3;

/**
 * Created by Виктор on 12.01.2016.
 */
public class IllegalStateExceptionModul3 extends Exception  {

        private int trackValue;
        public IllegalStateExceptionModul3(final int trackValue) {
            this.trackValue = trackValue;
        }
        public int getTrackValue() {
            return trackValue;
        }



}
