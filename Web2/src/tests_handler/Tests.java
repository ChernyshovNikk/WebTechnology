package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void NegativeResultTest(){
        double a=10, b=1;
        boolean resultValue = Handler.CheckInclude(a,b);
        Assert.assertEquals(resultValue,false);
    }

    @Test
    public void PositiveResultTest(){
        double a=3, b=3;
        boolean resultValue = Handler.CheckInclude(a,b);
        Assert.assertEquals(resultValue,true);
    }
}
