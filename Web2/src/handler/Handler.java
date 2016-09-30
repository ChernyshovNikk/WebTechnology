package handler;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static boolean CheckInclude(double x, double y)
    {
        boolean isInclude = false;
        double[] firstValueX = {-4,4};
        double[] firstValueY = {0,5};
        double[] secondValueX = {-6,6};
        double[] secondValueY = {-3,0};

        if (x >= firstValueX[0] && x <= firstValueX[1])
        {
            if (y >= firstValueY[0] && y <= firstValueY[1])
            {
                isInclude = true;
            }
        }
        else
            if (x >= secondValueX[0] && x <= secondValueX[1])
            {
                if (y >= secondValueY[0] && y <= secondValueY[1])
                {
                    isInclude = true;
                }
            }

        return isInclude;
    }
}
