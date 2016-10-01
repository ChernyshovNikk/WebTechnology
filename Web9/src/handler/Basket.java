package handler;

import java.util.ArrayList;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Basket {
    public double NavyBallsColorCount(ArrayList<Ball> allBalls)
    {
        double allBallsWeight = 0;

        for (Ball currentBall : allBalls)
        {
            allBallsWeight += currentBall.GetBallWeight();
        }
        return allBallsWeight;
    }

    public int BallsWeight(ArrayList<Ball> allBalls)
    {
        int navyBallsCount = 0;
        for (Ball currentBall : allBalls)
        {
            if (currentBall.GetBallColor().compareTo("Синий") == 0)
                navyBallsCount++;
        }
        return navyBallsCount;
    }
}
