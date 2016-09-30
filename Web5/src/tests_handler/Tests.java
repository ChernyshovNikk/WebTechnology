package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void ThreeElementsDeleteTest(){
        int N=7;
        int analyzeArray[] = {1,6,4,3,5,7,2};
        int expectValue = 3;
        int countCanDelete;
        countCanDelete = Handler.MakeIncreasingArray(analyzeArray,N);
        Assert.assertEquals(expectValue,countCanDelete);
    }
}
