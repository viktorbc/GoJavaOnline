package dz4;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Виктор on 02.02.2016.
 */
public class FigureTest {

    @Test
    public void testArea() throws Exception {
        final double a = 3;
        final double b = 4;
        final double c = 5;
        final double result = SquareFigures.getArrea(a, b, c);
        Assert.assertEquals(6, result);
    }


}