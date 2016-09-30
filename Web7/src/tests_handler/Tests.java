package tests_handler;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Tests {
    @Test
    public void ShellSortFiveElementsTest(){
        int N=5;
        double analyzeArray[] = {2,4,5,3,1};
        double expectArray[] = {1.0,2.0,3.0,4.0,5.0};
        double[] resultArray;
        resultArray = Handler.ShellSort(analyzeArray,N);
        Assert.assertArrayEquals(expectArray,resultArray,0.01);
    }
}
