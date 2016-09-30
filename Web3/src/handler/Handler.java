package handler;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static double[][] GetFunctionValues(double a, double b, double h)
    {
        double[][] outValues = new double[1000][2];
        int index = 0;
        double func;

        for(double i=a; i<=b; i=i+h)
        {
            outValues[index][0] = i;
            func = Math.tan(i);
            outValues[index][1] = func;
            index++;
        }

        System.out.println("Аргумент           Функция");

        for(int j=0; j<index; j++)
        {
            System.out.print("  " + outValues[j][0] + "         ");
            System.out.println(outValues[j][1]);
        }
        return outValues;
    }
}
