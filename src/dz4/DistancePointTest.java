package dz4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Виктор on 02.02.2016.
 */
public class DistancePointTest {

    @Test
    public void testLength() throws Exception {
        final double x1 = 5;
        final double y1 = 20;
        final double x2 = 10;
        final double y2 = 30;
        final double result = DistancePoints.Length(int x1, int x2, int y1, int y2);
        Assert.assertEqualse(11, result);
    }


}