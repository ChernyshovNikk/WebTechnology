package handler;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static double SolveExpresiion(double x, double y)
    {
        double value;
        double upperValue = 1+Math.pow(Math.sin(x+y),2);
        double lowerValue = 2+Math.abs(x-(2*x/(1+Math.pow(x,2)*Math.pow(y,2))));
        value = (upperValue/lowerValue)+x;
        return value;
    }
}
