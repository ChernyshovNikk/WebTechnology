package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void FourPrimaryDigitsTest(){
        int N=9;
        int analyzeArray[] = {1,2,3,4,5,6,7,8,9};
        int[] expectArray = new int[1000];
        expectArray[0] = 2;
        expectArray[1] = 3;
        expectArray[2] = 5;
        expectArray[3] = 7;
        int[] primaryDigits = Handler.FindPrimaryDigits(analyzeArray,N);
        Assert.assertArrayEquals(expectArray,primaryDigits);
    }
}
