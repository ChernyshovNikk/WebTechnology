package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void FiveSquareMatrixTest(){
        int N=5;
        double analyzeArray[] = {1,2,3,4,5};
        double expectArray[][] = {{1.0,2.0,3.0,4.0,5.0},{2.0,3.0,4.0,5.0,1.0},{3.0,4.0,5.0,1.0,2.0},{4.0,5.0,1.0,2.0,3.0},{5.0,1.0,2.0,3.0,4.0}};
        double[][] matrixArray;
        matrixArray = Handler.GetSquareMatrix(analyzeArray,N);
        Assert.assertArrayEquals(expectArray,matrixArray);
    }
}
