package tests_handler;

import handler.Ball;
import handler.Basket;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Tests {
    Basket basket = new Basket();
    ArrayList<Ball> testList = new ArrayList<Ball>();

    Ball firstBall = new Ball("Синий", 6);
    Ball secondBall = new Ball("Зеленый", 3);
    Ball thirdBall = new Ball("Синий", 8);
    Ball fourthBall = new Ball("Синий", 2);
    Ball fifthBall = new Ball("Красный", 4);
    Ball sixthBall = new Ball("Зеленый", 1);

    public ArrayList<Ball> GetTestData()
    {
        ArrayList<Ball> ballsList = new ArrayList<Ball>();
        ballsList.add(firstBall);
        ballsList.add(secondBall);
        ballsList.add(thirdBall);
        ballsList.add(fourthBall);
        ballsList.add(fifthBall);
        ballsList.add(sixthBall);
        return ballsList;
    }

    @Test
    public void NavyBallsTest()
    {
        testList = GetTestData();
        long expectNavyBallsCount = 3;
        Assert.assertEquals(expectNavyBallsCount, basket.NavyBallsColorCount(testList));
    }

    @Test
    public void WeightBallsTest()
    {
        testList = GetTestData();
        double expectAllBallsWeight = 24;
        Assert.assertEquals(expectAllBallsWeight, basket.BallsWeight(testList), 0.01);
    }
}
