package handler;

import sun.security.util.Length;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Handler {
    public static int[] FindPrimaryDigits(int[] analyzeArray, int arraySize)
    {
        long minValue = 2;
        int[] primaryDigits = new int[1000];
        int index = 0;

        for(int i=0; i<arraySize; i++)
        {
            long count = 0;
            double sqrtValue = Math.sqrt(analyzeArray[i]);
            long maxValue = Math.round(sqrtValue) + 1;
            long valuesCount = maxValue - minValue;

            for (long j=minValue; j<maxValue; j++)
            {
                if (analyzeArray[i] % j == 0)
                    break;
                else
                    count++;
            }

            if ((count == valuesCount) && (analyzeArray[i] != 1))
            {
                primaryDigits[index] = i+1;
                index++;
                System.out.println(i + 1);
            }
        }
        return primaryDigits;
    }
}
