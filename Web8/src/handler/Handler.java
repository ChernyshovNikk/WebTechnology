package handler;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Handler {
    public static int[] ArraysAssociation(double[] analyzeArray_A, int N, double[]analyzeArray_B, int M)
    {
        double[] assotiateArray = new double[N+M];
        int[] placesArray = new int[M];
        int count = 0;

        for(int i=0 ; i<N; i++)
            assotiateArray[i] = analyzeArray_A[i];

        int i = 0, j = 0;
        int index = 0;
        while (i < N && j < M)
        {
            if (analyzeArray_A[i] < analyzeArray_B[j])
            {
                assotiateArray[index] = analyzeArray_A[i];
                i++;
            }
            else
            {
                assotiateArray[index] = analyzeArray_B[j];
                placesArray[count] = index+1;
                count++;
                j++;
            }
            index++;
        }

        while (i < N)
        {
            assotiateArray[index] = analyzeArray_A[i];
            index++;
            i++;
        }

        while (j < M)
        {
            assotiateArray[index] = analyzeArray_B[j];
            index++;
            j++;
        }

        for(i=0; i<M; i++)
            System.out.print(placesArray[i] + " ");

        return placesArray;
    }
}
