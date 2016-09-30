package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void IntValueTest(){
        double a=7, b=3;
        double resultValue = Handler.SolveExpresiion(a,b);
        double delta = 0.01;
        Assert.assertEquals(7.14,resultValue,delta);
    }
}
