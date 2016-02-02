package dz4;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Виктор on 02.02.2016.
 */
public class FarhengeitToCelsiumTest {

    @Test
    public void testFahrenheitToCelsium() throws Exception {
        final double ft = 0;
        final double result = test.FahrenheitToCelsium(ft);
        Assert.assertEquals(-17.78, result);
    }

    @Test
    public void testCelsiumToFarhengeit() throws Exception {
        final double cm = 0;
        final double result = test.CelsiumToFarhengeit(cm);
        Assert.assertEquals(32, result);

    }
}