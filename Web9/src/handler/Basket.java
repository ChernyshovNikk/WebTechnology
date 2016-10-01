package handler;

import java.util.ArrayList;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Basket {
    public double BallsWeight(ArrayList<Ball> allBalls)
    {
        double allBallsWeight = 0;

        for (Ball currentBall : allBalls)
        {
            allBallsWeight += currentBall.GetBallWeight();
        }
        return allBallsWeight;
    }

    public long NavyBallsColorCount(ArrayList<Ball> allBalls)
    {
        long navyBallsCount = 0;
        for (Ball currentBall : allBalls)
        {
            if (currentBall.GetBallColor().compareTo("Синий") == 0)
                navyBallsCount++;
        }
        return navyBallsCount;
    }
}
