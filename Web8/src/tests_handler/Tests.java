package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Tests {
    @Test
    public void ThreeDigitsOfInputArrayTest(){
        int N=4;
        int M=3;
        double analyzeArray_A[] = {1,3,4,7};
        double analyzeArray_B[] = {2,5,6};
        int expectArray[] = {2,5,6};
        int[] resultArray;
        resultArray = Handler.ArraysAssociation(analyzeArray_A,N,analyzeArray_B,M);
        Assert.assertArrayEquals(expectArray,resultArray);
    }
}
