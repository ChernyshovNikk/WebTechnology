package handler;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static double[] ShellSort(double[] analyzeArray, int arraySize)
    {
        double temporaryValue;

        for(int i=0; i<arraySize-1; i++)
        {
            if (analyzeArray[i] > analyzeArray[i+1])
            {
                temporaryValue = analyzeArray[i];
                analyzeArray[i] = analyzeArray[i+1];
                analyzeArray[i+1] = temporaryValue;
                if (i-1 >= 0)
                    i = i-2;
            }
        }

        for(int i=0; i<arraySize; i++)
            System.out.print(analyzeArray[i]+" ");

        return analyzeArray;
    }
}
