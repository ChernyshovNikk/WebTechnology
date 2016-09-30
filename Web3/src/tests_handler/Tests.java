package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void FourElementsTest(){
        double a=1, b=8, h=2;
        double[][] expectValues = new double[1000][2];
        expectValues[0][0] = 1.0;
        expectValues[0][1] = 1.5574077246549023;
        expectValues[1][0] = 3.0;
        expectValues[1][1] = -0.1425465430742778;
        expectValues[2][0] = 5.0;
        expectValues[2][1] = -3.380515006246586;
        expectValues[3][0] = 7.0;
        expectValues[3][1] = 0.8714479827243187;
        double[][] resultValues = Handler.GetFunctionValues(a,b,h);
        Assert.assertArrayEquals(expectValues,resultValues);
    }
}
